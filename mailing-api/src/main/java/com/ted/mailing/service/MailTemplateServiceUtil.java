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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for MailTemplate. This utility wraps
 * <code>com.ted.mailing.service.impl.MailTemplateServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see MailTemplateService
 * @generated
 */
public class MailTemplateServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.ted.mailing.service.impl.MailTemplateServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.ted.mailing.model.MailTemplate addMailTemplate(
			String subject, String body,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addMailTemplate(subject, body, serviceContext);
	}

	public static com.ted.mailing.model.MailTemplate deleteMailTemplate(
			long templateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteMailTemplate(templateId);
	}

	public static java.util.List<com.ted.mailing.model.MailTemplate>
		getMailTemplates(long groupId) {

		return getService().getMailTemplates(groupId);
	}

	public static java.util.List<com.ted.mailing.model.MailTemplate>
		getMailTemplates(long groupId, int start, int end) {

		return getService().getMailTemplates(groupId, start, end);
	}

	public static int getMailTemplatesCount(long groupId) {
		return getService().getMailTemplatesCount(groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static MailTemplateService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MailTemplateService, MailTemplateService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(MailTemplateService.class);

		ServiceTracker<MailTemplateService, MailTemplateService>
			serviceTracker =
				new ServiceTracker<MailTemplateService, MailTemplateService>(
					bundle.getBundleContext(), MailTemplateService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}