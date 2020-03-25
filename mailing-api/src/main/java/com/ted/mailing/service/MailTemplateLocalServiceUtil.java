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
 * Provides the local service utility for MailTemplate. This utility wraps
 * <code>com.ted.mailing.service.impl.MailTemplateLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MailTemplateLocalService
 * @generated
 */
public class MailTemplateLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.ted.mailing.service.impl.MailTemplateLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.ted.mailing.model.MailTemplate addMailTemplate(
			long userId, String subject, String body,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addMailTemplate(
			userId, subject, body, serviceContext);
	}

	/**
	 * Adds the mail template to the database. Also notifies the appropriate model listeners.
	 *
	 * @param mailTemplate the mail template
	 * @return the mail template that was added
	 */
	public static com.ted.mailing.model.MailTemplate addMailTemplate(
		com.ted.mailing.model.MailTemplate mailTemplate) {

		return getService().addMailTemplate(mailTemplate);
	}

	public static void addTemplateResources(
			long templateId, boolean addGroupPermissions,
			boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().addTemplateResources(
			templateId, addGroupPermissions, addGuestPermissions);
	}

	public static void addTemplateResources(
			com.ted.mailing.model.MailTemplate template,
			boolean addGroupPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().addTemplateResources(
			template, addGroupPermissions, addGuestPermissions);
	}

	public static void addTemplateResources(
			com.ted.mailing.model.MailTemplate template,
			com.liferay.portal.kernel.service.permission.ModelPermissions
				modelPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().addTemplateResources(template, modelPermissions);
	}

	/**
	 * Creates a new mail template with the primary key. Does not add the mail template to the database.
	 *
	 * @param templateId the primary key for the new mail template
	 * @return the new mail template
	 */
	public static com.ted.mailing.model.MailTemplate createMailTemplate(
		long templateId) {

		return getService().createMailTemplate(templateId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the mail template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param templateId the primary key of the mail template
	 * @return the mail template that was removed
	 * @throws PortalException if a mail template with the primary key could not be found
	 */
	public static com.ted.mailing.model.MailTemplate deleteMailTemplate(
			long templateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteMailTemplate(templateId);
	}

	/**
	 * Deletes the mail template from the database. Also notifies the appropriate model listeners.
	 *
	 * @param mailTemplate the mail template
	 * @return the mail template that was removed
	 */
	public static com.ted.mailing.model.MailTemplate deleteMailTemplate(
		com.ted.mailing.model.MailTemplate mailTemplate) {

		return getService().deleteMailTemplate(mailTemplate);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static void deleteTemplate(
			com.ted.mailing.model.MailTemplate template)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteTemplate(template);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ted.mailing.model.impl.MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ted.mailing.model.impl.MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.ted.mailing.model.MailTemplate fetchMailTemplate(
		long templateId) {

		return getService().fetchMailTemplate(templateId);
	}

	/**
	 * Returns the mail template matching the UUID and group.
	 *
	 * @param uuid the mail template's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public static com.ted.mailing.model.MailTemplate
		fetchMailTemplateByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchMailTemplateByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the mail template with the primary key.
	 *
	 * @param templateId the primary key of the mail template
	 * @return the mail template
	 * @throws PortalException if a mail template with the primary key could not be found
	 */
	public static com.ted.mailing.model.MailTemplate getMailTemplate(
			long templateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getMailTemplate(templateId);
	}

	/**
	 * Returns the mail template matching the UUID and group.
	 *
	 * @param uuid the mail template's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mail template
	 * @throws PortalException if a matching mail template could not be found
	 */
	public static com.ted.mailing.model.MailTemplate
			getMailTemplateByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getMailTemplateByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the mail templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ted.mailing.model.impl.MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @return the range of mail templates
	 */
	public static java.util.List<com.ted.mailing.model.MailTemplate>
		getMailTemplates(int start, int end) {

		return getService().getMailTemplates(start, end);
	}

	/**
	 * Returns all the mail templates matching the UUID and company.
	 *
	 * @param uuid the UUID of the mail templates
	 * @param companyId the primary key of the company
	 * @return the matching mail templates, or an empty list if no matches were found
	 */
	public static java.util.List<com.ted.mailing.model.MailTemplate>
		getMailTemplatesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getMailTemplatesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of mail templates matching the UUID and company.
	 *
	 * @param uuid the UUID of the mail templates
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching mail templates, or an empty list if no matches were found
	 */
	public static java.util.List<com.ted.mailing.model.MailTemplate>
		getMailTemplatesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.ted.mailing.model.MailTemplate> orderByComparator) {

		return getService().getMailTemplatesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of mail templates.
	 *
	 * @return the number of mail templates
	 */
	public static int getMailTemplatesCount() {
		return getService().getMailTemplatesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static com.ted.mailing.model.MailTemplate moveTemplateToTrash(
			long userId, long templateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().moveTemplateToTrash(userId, templateId);
	}

	public static void restoreTemplateFromTrash(long userId, long templateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().restoreTemplateFromTrash(userId, templateId);
	}

	public static com.ted.mailing.model.MailTemplate updateMailTemplate(
			long templateId, String subject, String body,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateMailTemplate(
			templateId, subject, body, serviceContext);
	}

	/**
	 * Updates the mail template in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param mailTemplate the mail template
	 * @return the mail template that was updated
	 */
	public static com.ted.mailing.model.MailTemplate updateMailTemplate(
		com.ted.mailing.model.MailTemplate mailTemplate) {

		return getService().updateMailTemplate(mailTemplate);
	}

	public static com.ted.mailing.model.MailTemplate updateStatus(
			long userId, long templateId, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateStatus(userId, templateId, status);
	}

	public static MailTemplateLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<MailTemplateLocalService, MailTemplateLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(MailTemplateLocalService.class);

		ServiceTracker<MailTemplateLocalService, MailTemplateLocalService>
			serviceTracker =
				new ServiceTracker
					<MailTemplateLocalService, MailTemplateLocalService>(
						bundle.getBundleContext(),
						MailTemplateLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}