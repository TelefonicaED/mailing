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

package com.ted.mailing.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.ted.mailing.model.MailTemplate;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the mail template service. This utility wraps <code>com.ted.mailing.service.persistence.impl.MailTemplatePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MailTemplatePersistence
 * @generated
 */
public class MailTemplateUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(MailTemplate mailTemplate) {
		getPersistence().clearCache(mailTemplate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, MailTemplate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MailTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MailTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MailTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MailTemplate update(MailTemplate mailTemplate) {
		return getPersistence().update(mailTemplate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MailTemplate update(
		MailTemplate mailTemplate, ServiceContext serviceContext) {

		return getPersistence().update(mailTemplate, serviceContext);
	}

	/**
	 * Returns all the mail templates where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mail templates
	 */
	public static List<MailTemplate> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the mail templates where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @return the range of matching mail templates
	 */
	public static List<MailTemplate> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the mail templates where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mail templates
	 */
	public static List<MailTemplate> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mail templates where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mail templates
	 */
	public static List<MailTemplate> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MailTemplate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mail template in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public static MailTemplate findByUuid_First(
			String uuid, OrderByComparator<MailTemplate> orderByComparator)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first mail template in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public static MailTemplate fetchByUuid_First(
		String uuid, OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last mail template in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public static MailTemplate findByUuid_Last(
			String uuid, OrderByComparator<MailTemplate> orderByComparator)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last mail template in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public static MailTemplate fetchByUuid_Last(
		String uuid, OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the mail templates before and after the current mail template in the ordered set where uuid = &#63;.
	 *
	 * @param templateId the primary key of the current mail template
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mail template
	 * @throws NoSuchTemplateException if a mail template with the primary key could not be found
	 */
	public static MailTemplate[] findByUuid_PrevAndNext(
			long templateId, String uuid,
			OrderByComparator<MailTemplate> orderByComparator)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByUuid_PrevAndNext(
			templateId, uuid, orderByComparator);
	}

	/**
	 * Removes all the mail templates where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of mail templates where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mail templates
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the mail template where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTemplateException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public static MailTemplate findByUUID_G(String uuid, long groupId)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the mail template where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public static MailTemplate fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the mail template where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public static MailTemplate fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the mail template where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mail template that was removed
	 */
	public static MailTemplate removeByUUID_G(String uuid, long groupId)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of mail templates where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mail templates
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the mail templates where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mail templates
	 */
	public static List<MailTemplate> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the mail templates where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @return the range of matching mail templates
	 */
	public static List<MailTemplate> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the mail templates where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mail templates
	 */
	public static List<MailTemplate> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mail templates where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mail templates
	 */
	public static List<MailTemplate> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MailTemplate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mail template in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public static MailTemplate findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MailTemplate> orderByComparator)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first mail template in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public static MailTemplate fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last mail template in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public static MailTemplate findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MailTemplate> orderByComparator)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last mail template in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public static MailTemplate fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the mail templates before and after the current mail template in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param templateId the primary key of the current mail template
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mail template
	 * @throws NoSuchTemplateException if a mail template with the primary key could not be found
	 */
	public static MailTemplate[] findByUuid_C_PrevAndNext(
			long templateId, String uuid, long companyId,
			OrderByComparator<MailTemplate> orderByComparator)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByUuid_C_PrevAndNext(
			templateId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the mail templates where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of mail templates where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mail templates
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the mail templates where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching mail templates
	 */
	public static List<MailTemplate> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the mail templates where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @return the range of matching mail templates
	 */
	public static List<MailTemplate> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the mail templates where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mail templates
	 */
	public static List<MailTemplate> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mail templates where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mail templates
	 */
	public static List<MailTemplate> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<MailTemplate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mail template in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public static MailTemplate findByGroupId_First(
			long groupId, OrderByComparator<MailTemplate> orderByComparator)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first mail template in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public static MailTemplate fetchByGroupId_First(
		long groupId, OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last mail template in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public static MailTemplate findByGroupId_Last(
			long groupId, OrderByComparator<MailTemplate> orderByComparator)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last mail template in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public static MailTemplate fetchByGroupId_Last(
		long groupId, OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the mail templates before and after the current mail template in the ordered set where groupId = &#63;.
	 *
	 * @param templateId the primary key of the current mail template
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mail template
	 * @throws NoSuchTemplateException if a mail template with the primary key could not be found
	 */
	public static MailTemplate[] findByGroupId_PrevAndNext(
			long templateId, long groupId,
			OrderByComparator<MailTemplate> orderByComparator)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByGroupId_PrevAndNext(
			templateId, groupId, orderByComparator);
	}

	/**
	 * Returns all the mail templates that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching mail templates that the user has permission to view
	 */
	public static List<MailTemplate> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	 * Returns a range of all the mail templates that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @return the range of matching mail templates that the user has permission to view
	 */
	public static List<MailTemplate> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the mail templates that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mail templates that the user has permission to view
	 */
	public static List<MailTemplate> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the mail templates before and after the current mail template in the ordered set of mail templates that the user has permission to view where groupId = &#63;.
	 *
	 * @param templateId the primary key of the current mail template
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mail template
	 * @throws NoSuchTemplateException if a mail template with the primary key could not be found
	 */
	public static MailTemplate[] filterFindByGroupId_PrevAndNext(
			long templateId, long groupId,
			OrderByComparator<MailTemplate> orderByComparator)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			templateId, groupId, orderByComparator);
	}

	/**
	 * Removes all the mail templates where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of mail templates where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching mail templates
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of mail templates that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching mail templates that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Returns all the mail templates where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching mail templates
	 */
	public static List<MailTemplate> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the mail templates where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @return the range of matching mail templates
	 */
	public static List<MailTemplate> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the mail templates where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mail templates
	 */
	public static List<MailTemplate> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mail templates where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mail templates
	 */
	public static List<MailTemplate> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<MailTemplate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mail template in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public static MailTemplate findByCompanyId_First(
			long companyId, OrderByComparator<MailTemplate> orderByComparator)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first mail template in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public static MailTemplate fetchByCompanyId_First(
		long companyId, OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last mail template in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public static MailTemplate findByCompanyId_Last(
			long companyId, OrderByComparator<MailTemplate> orderByComparator)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last mail template in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public static MailTemplate fetchByCompanyId_Last(
		long companyId, OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the mail templates before and after the current mail template in the ordered set where companyId = &#63;.
	 *
	 * @param templateId the primary key of the current mail template
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mail template
	 * @throws NoSuchTemplateException if a mail template with the primary key could not be found
	 */
	public static MailTemplate[] findByCompanyId_PrevAndNext(
			long templateId, long companyId,
			OrderByComparator<MailTemplate> orderByComparator)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByCompanyId_PrevAndNext(
			templateId, companyId, orderByComparator);
	}

	/**
	 * Removes all the mail templates where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of mail templates where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching mail templates
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Caches the mail template in the entity cache if it is enabled.
	 *
	 * @param mailTemplate the mail template
	 */
	public static void cacheResult(MailTemplate mailTemplate) {
		getPersistence().cacheResult(mailTemplate);
	}

	/**
	 * Caches the mail templates in the entity cache if it is enabled.
	 *
	 * @param mailTemplates the mail templates
	 */
	public static void cacheResult(List<MailTemplate> mailTemplates) {
		getPersistence().cacheResult(mailTemplates);
	}

	/**
	 * Creates a new mail template with the primary key. Does not add the mail template to the database.
	 *
	 * @param templateId the primary key for the new mail template
	 * @return the new mail template
	 */
	public static MailTemplate create(long templateId) {
		return getPersistence().create(templateId);
	}

	/**
	 * Removes the mail template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param templateId the primary key of the mail template
	 * @return the mail template that was removed
	 * @throws NoSuchTemplateException if a mail template with the primary key could not be found
	 */
	public static MailTemplate remove(long templateId)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().remove(templateId);
	}

	public static MailTemplate updateImpl(MailTemplate mailTemplate) {
		return getPersistence().updateImpl(mailTemplate);
	}

	/**
	 * Returns the mail template with the primary key or throws a <code>NoSuchTemplateException</code> if it could not be found.
	 *
	 * @param templateId the primary key of the mail template
	 * @return the mail template
	 * @throws NoSuchTemplateException if a mail template with the primary key could not be found
	 */
	public static MailTemplate findByPrimaryKey(long templateId)
		throws com.ted.mailing.exception.NoSuchTemplateException {

		return getPersistence().findByPrimaryKey(templateId);
	}

	/**
	 * Returns the mail template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param templateId the primary key of the mail template
	 * @return the mail template, or <code>null</code> if a mail template with the primary key could not be found
	 */
	public static MailTemplate fetchByPrimaryKey(long templateId) {
		return getPersistence().fetchByPrimaryKey(templateId);
	}

	/**
	 * Returns all the mail templates.
	 *
	 * @return the mail templates
	 */
	public static List<MailTemplate> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mail templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @return the range of mail templates
	 */
	public static List<MailTemplate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mail templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mail templates
	 */
	public static List<MailTemplate> findAll(
		int start, int end, OrderByComparator<MailTemplate> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mail templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MailTemplateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mail templates
	 * @param end the upper bound of the range of mail templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mail templates
	 */
	public static List<MailTemplate> findAll(
		int start, int end, OrderByComparator<MailTemplate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mail templates from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mail templates.
	 *
	 * @return the number of mail templates
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MailTemplatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<MailTemplatePersistence, MailTemplatePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(MailTemplatePersistence.class);

		ServiceTracker<MailTemplatePersistence, MailTemplatePersistence>
			serviceTracker =
				new ServiceTracker
					<MailTemplatePersistence, MailTemplatePersistence>(
						bundle.getBundleContext(),
						MailTemplatePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}