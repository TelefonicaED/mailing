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

package com.ted.mailing.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MailTemplateService}.
 *
 * @author Brian Wing Shun Chan
 * @see MailTemplateService
 * @generated
 */
public class MailTemplateServiceWrapper
	implements MailTemplateService, ServiceWrapper<MailTemplateService> {

	public MailTemplateServiceWrapper(MailTemplateService mailTemplateService) {
		_mailTemplateService = mailTemplateService;
	}

	@Override
	public com.ted.mailing.model.MailTemplate addMailTemplate(
			String subject, String body,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _mailTemplateService.addMailTemplate(
			subject, body, serviceContext);
	}

	@Override
	public com.ted.mailing.model.MailTemplate deleteMailTemplate(
			long templateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _mailTemplateService.deleteMailTemplate(templateId);
	}

	@Override
	public java.util.List<com.ted.mailing.model.MailTemplate> getMailTemplates(
		long groupId) {

		return _mailTemplateService.getMailTemplates(groupId);
	}

	@Override
	public java.util.List<com.ted.mailing.model.MailTemplate> getMailTemplates(
		long groupId, int start, int end) {

		return _mailTemplateService.getMailTemplates(groupId, start, end);
	}

	@Override
	public int getMailTemplatesCount(long groupId) {
		return _mailTemplateService.getMailTemplatesCount(groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _mailTemplateService.getOSGiServiceIdentifier();
	}

	@Override
	public MailTemplateService getWrappedService() {
		return _mailTemplateService;
	}

	@Override
	public void setWrappedService(MailTemplateService mailTemplateService) {
		_mailTemplateService = mailTemplateService;
	}

	private MailTemplateService _mailTemplateService;

}