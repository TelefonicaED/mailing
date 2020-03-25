/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ted.mailing.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.permission.ModelPermissions;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.ted.mailing.model.MailTemplate;
import com.ted.mailing.service.base.MailTemplateLocalServiceBaseImpl;

import java.util.Date;
import com.liferay.trash.exception.RestoreEntryException;
import com.liferay.trash.exception.TrashEntryException;
import com.liferay.trash.model.TrashEntry;
import com.liferay.trash.service.TrashEntryLocalService;
import com.liferay.trash.service.TrashVersionLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * The implementation of the mail template local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.ted.mailing.service.MailTemplateLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MailTemplateLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.ted.mailing.model.MailTemplate",
	service = AopService.class
)
public class MailTemplateLocalServiceImpl
	extends MailTemplateLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.ted.mailing.service.MailTemplateLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.ted.mailing.service.MailTemplateLocalServiceUtil</code>.
	 */
	@Override
	public MailTemplate addMailTemplate(long userId, String subject, String body, ServiceContext serviceContext) throws PortalException {
		User user = userLocalService.getUser(userId);
		long groupId = serviceContext.getScopeGroupId();
		
		long templateId = counterLocalService.increment(MailTemplate.class.getName());
		
		MailTemplate template = mailTemplatePersistence.create(templateId);
		
		template.setUuid(serviceContext.getUuid());
		template.setGroupId(groupId);
		template.setCompanyId(user.getCompanyId());
		template.setUserId(userId);
		template.setUserName(user.getFullName());
		template.setSubject(subject);
		template.setBody(body);
		
		template = mailTemplatePersistence.update(template);
		
		if (serviceContext.isAddGroupPermissions() ||
			serviceContext.isAddGuestPermissions()) {

			addTemplateResources(
					template, serviceContext.isAddGroupPermissions(),
				serviceContext.isAddGuestPermissions());
		}
		else {
			addTemplateResources(template, serviceContext.getModelPermissions());
		}
		
		return template;
	}
	
	@Override
	public void addTemplateResources(
			long templateId, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws PortalException {

		MailTemplate template = mailTemplatePersistence.findByPrimaryKey(
			templateId);

		addTemplateResources(
			template, addGroupPermissions, addGuestPermissions);
	}
	
	@Override
	public void addTemplateResources(
			MailTemplate template, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws PortalException {

		resourceLocalService.addResources(
				template.getCompanyId(), template.getGroupId(),
				template.getUserId(), MailTemplate.class.getName(),
				template.getTemplateId(), false, addGroupPermissions,
			addGuestPermissions);
	}
	
	@Override
	public void addTemplateResources(
			MailTemplate template, ModelPermissions modelPermissions)
		throws PortalException {

		resourceLocalService.addModelResources(
				template.getCompanyId(), template.getGroupId(),
				template.getUserId(), MailTemplate.class.getName(),
				template.getTemplateId(), modelPermissions);
	}
	
	@Override
	@SystemEvent(
		action = SystemEventConstants.ACTION_SKIP,
		type = SystemEventConstants.TYPE_DELETE
	)
	public void deleteTemplate(
			MailTemplate template)
		throws PortalException {
		
		// Resources

		resourceLocalService.deleteResource(
				template.getCompanyId(), MailTemplate.class.getName(),
			ResourceConstants.SCOPE_INDIVIDUAL, template.getTemplateId());

		// Trash

		if (template.isInTrashExplicitly()) {
			trashEntryLocalService.deleteEntry(
					MailTemplate.class.getName(), template.getTemplateId());
		}
		else {
			trashVersionLocalService.deleteTrashVersion(
					MailTemplate.class.getName(), template.getTemplateId());
		}

		// Template

		mailTemplatePersistence.remove(template);
	}

	@Override
	public MailTemplate moveTemplateToTrash(long userId, long templateId)
		throws PortalException {

		// Template

		MailTemplate template = mailTemplatePersistence.findByPrimaryKey(
				templateId);

		if (template.isInTrash()) {
			throw new TrashEntryException();
		}

		template = updateStatus(userId, templateId, WorkflowConstants.STATUS_IN_TRASH);

		// Trash

		trashEntryLocalService.addTrashEntry(
			userId, template.getGroupId(), MailTemplate.class.getName(),
			templateId, template.getUuid(), null,
			WorkflowConstants.STATUS_APPROVED, null, null);

		return template;
	}

	@Override
	public void restoreTemplateFromTrash(long userId, long templateId)
		throws PortalException {

		// Template

		MailTemplate template = mailTemplatePersistence.findByPrimaryKey(templateId);

		if (!template.isInTrash()) {
			throw new RestoreEntryException(
				RestoreEntryException.INVALID_STATUS);
		}

		TrashEntry trashEntry = trashEntryLocalService.getEntry(MailTemplate.class.getName(), templateId);

		template = updateStatus(userId, templateId, WorkflowConstants.STATUS_APPROVED);

		// Trash

		trashEntryLocalService.deleteEntry(trashEntry.getEntryId());
	}
	
	@Override
	public MailTemplate updateMailTemplate(long templateId, String subject, String body,
			ServiceContext serviceContext) throws PortalException {
		MailTemplate template = mailTemplatePersistence.findByPrimaryKey(templateId);
		
		template.setSubject(subject);
		template.setBody(body);
		
		template = mailTemplatePersistence.update(template);
		
		return template;
	}
	
	@Override
	public MailTemplate updateStatus(long userId, long templateId, int status) throws PortalException {

		// Template

		User user = userLocalService.getUser(userId);

		MailTemplate template = mailTemplatePersistence.findByPrimaryKey(
				templateId);

		template.setStatus(status);
		template.setStatusByUserId(user.getUserId());
		template.setStatusByUserName(user.getFullName());
		template.setStatusDate(new Date());

		return mailTemplatePersistence.update(template);
	}

	
	@Reference
	private TrashEntryLocalService trashEntryLocalService;

	@Reference
	private TrashVersionLocalService trashVersionLocalService;
}