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
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermissionFactory;
import com.liferay.portal.kernel.service.ServiceContext;
import com.ted.mailing.constants.MailingConstants;
import com.ted.mailing.model.MailTemplate;
import com.ted.mailing.service.base.MailTemplateServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

/**
 * The implementation of the mail template remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.ted.mailing.service.MailTemplateService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MailTemplateServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=mail",
		"json.web.service.context.path=MailTemplate"
	},
	service = AopService.class
)
public class MailTemplateServiceImpl extends MailTemplateServiceBaseImpl {

	private static volatile PortletResourcePermission portletResourcePermission =
        PortletResourcePermissionFactory.getInstance(
            MailTemplateServiceImpl.class, "portletResourcePermission",
            MailingConstants.RESOURCE_NAME);
	
	@Reference(
		target = "(model.class.name=com.ted.mailing.model.MailTemplate)"
	)
	private ModelResourcePermission<MailTemplate> templateModelResourcePermission;
	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.ted.mailing.service.MailTemplateServiceUtil</code> to access the mail template remote service.
	 */
	
	@Override
	public MailTemplate addMailTemplate(String subject, String body, ServiceContext serviceContext) throws PortalException {
		portletResourcePermission.check(
				getPermissionChecker(), serviceContext.getScopeGroupId(), ActionKeys.ADD_ENTRY);
	
		return mailTemplateLocalService.addMailTemplate(getUserId(), subject, body, serviceContext);
	}
	
	@Override
	public MailTemplate deleteMailTemplate(long templateId) throws PortalException {
		MailTemplate mailTemplate = mailTemplatePersistence.findByPrimaryKey(templateId);
		
		templateModelResourcePermission.check(getPermissionChecker(), mailTemplate, ActionKeys.DELETE);
		
		return mailTemplateLocalService.deleteMailTemplate(templateId);
	}
	
	@Override
	public List<MailTemplate> getMailTemplates(long groupId){
		return mailTemplatePersistence.filterFindByGroupId(groupId);
	}
	
	@Override
	public List<MailTemplate> getMailTemplates(long groupId, int start, int end){
		return mailTemplatePersistence.filterFindByGroupId(groupId, start, end);
	}
	
	@Override
	public int getMailTemplatesCount(long groupId){
		return mailTemplatePersistence.filterCountByGroupId(groupId);
	}
	
}