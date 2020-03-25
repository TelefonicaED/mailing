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

package com.ted.mailing.uad.anonymizer;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.user.associated.data.anonymizer.DynamicQueryUADAnonymizer;

import com.ted.mailing.model.MailTemplate;
import com.ted.mailing.service.MailTemplateLocalService;
import com.ted.mailing.uad.constants.MailUADConstants;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the mail template UAD anonymizer.
 *
 * <p>
 * This implementation exists only as a container for the default methods
 * generated by ServiceBuilder. All custom service methods should be put in
 * {@link MailTemplateUADAnonymizer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BaseMailTemplateUADAnonymizer
	extends DynamicQueryUADAnonymizer<MailTemplate> {

	@Override
	public void autoAnonymize(
			MailTemplate mailTemplate, long userId, User anonymousUser)
		throws PortalException {

		if (mailTemplate.getUserId() == userId) {
			mailTemplate.setUserId(anonymousUser.getUserId());
			mailTemplate.setUserName(anonymousUser.getFullName());
		}

		if (mailTemplate.getStatusByUserId() == userId) {
			mailTemplate.setStatusByUserId(anonymousUser.getUserId());
			mailTemplate.setStatusByUserName(anonymousUser.getFullName());
		}

		mailTemplateLocalService.updateMailTemplate(mailTemplate);
	}

	@Override
	public void delete(MailTemplate mailTemplate) throws PortalException {
		mailTemplateLocalService.deleteTemplate(mailTemplate);
	}

	@Override
	public Class<MailTemplate> getTypeClass() {
		return MailTemplate.class;
	}

	@Override
	protected ActionableDynamicQuery doGetActionableDynamicQuery() {
		return mailTemplateLocalService.getActionableDynamicQuery();
	}

	@Override
	protected String[] doGetUserIdFieldNames() {
		return MailUADConstants.USER_ID_FIELD_NAMES_MAIL_TEMPLATE;
	}

	@Reference
	protected MailTemplateLocalService mailTemplateLocalService;

}