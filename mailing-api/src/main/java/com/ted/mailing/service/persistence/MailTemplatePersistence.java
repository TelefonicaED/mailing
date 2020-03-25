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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.ted.mailing.exception.NoSuchTemplateException;
import com.ted.mailing.model.MailTemplate;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mail template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MailTemplateUtil
 * @generated
 */
@ProviderType
public interface MailTemplatePersistence extends BasePersistence<MailTemplate> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MailTemplateUtil} to access the mail template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the mail templates where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mail templates
	 */
	public java.util.List<MailTemplate> findByUuid(String uuid);

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
	public java.util.List<MailTemplate> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<MailTemplate> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

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
	public java.util.List<MailTemplate> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mail template in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public MailTemplate findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
				orderByComparator)
		throws NoSuchTemplateException;

	/**
	 * Returns the first mail template in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public MailTemplate fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

	/**
	 * Returns the last mail template in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public MailTemplate findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
				orderByComparator)
		throws NoSuchTemplateException;

	/**
	 * Returns the last mail template in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public MailTemplate fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

	/**
	 * Returns the mail templates before and after the current mail template in the ordered set where uuid = &#63;.
	 *
	 * @param templateId the primary key of the current mail template
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mail template
	 * @throws NoSuchTemplateException if a mail template with the primary key could not be found
	 */
	public MailTemplate[] findByUuid_PrevAndNext(
			long templateId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
				orderByComparator)
		throws NoSuchTemplateException;

	/**
	 * Removes all the mail templates where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of mail templates where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mail templates
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the mail template where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTemplateException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public MailTemplate findByUUID_G(String uuid, long groupId)
		throws NoSuchTemplateException;

	/**
	 * Returns the mail template where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public MailTemplate fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the mail template where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public MailTemplate fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the mail template where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mail template that was removed
	 */
	public MailTemplate removeByUUID_G(String uuid, long groupId)
		throws NoSuchTemplateException;

	/**
	 * Returns the number of mail templates where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mail templates
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the mail templates where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mail templates
	 */
	public java.util.List<MailTemplate> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<MailTemplate> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<MailTemplate> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

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
	public java.util.List<MailTemplate> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mail template in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public MailTemplate findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
				orderByComparator)
		throws NoSuchTemplateException;

	/**
	 * Returns the first mail template in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public MailTemplate fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

	/**
	 * Returns the last mail template in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public MailTemplate findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
				orderByComparator)
		throws NoSuchTemplateException;

	/**
	 * Returns the last mail template in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public MailTemplate fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

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
	public MailTemplate[] findByUuid_C_PrevAndNext(
			long templateId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
				orderByComparator)
		throws NoSuchTemplateException;

	/**
	 * Removes all the mail templates where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of mail templates where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mail templates
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the mail templates where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching mail templates
	 */
	public java.util.List<MailTemplate> findByGroupId(long groupId);

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
	public java.util.List<MailTemplate> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<MailTemplate> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

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
	public java.util.List<MailTemplate> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mail template in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public MailTemplate findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
				orderByComparator)
		throws NoSuchTemplateException;

	/**
	 * Returns the first mail template in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public MailTemplate fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

	/**
	 * Returns the last mail template in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public MailTemplate findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
				orderByComparator)
		throws NoSuchTemplateException;

	/**
	 * Returns the last mail template in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public MailTemplate fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

	/**
	 * Returns the mail templates before and after the current mail template in the ordered set where groupId = &#63;.
	 *
	 * @param templateId the primary key of the current mail template
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mail template
	 * @throws NoSuchTemplateException if a mail template with the primary key could not be found
	 */
	public MailTemplate[] findByGroupId_PrevAndNext(
			long templateId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
				orderByComparator)
		throws NoSuchTemplateException;

	/**
	 * Returns all the mail templates that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching mail templates that the user has permission to view
	 */
	public java.util.List<MailTemplate> filterFindByGroupId(long groupId);

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
	public java.util.List<MailTemplate> filterFindByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<MailTemplate> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

	/**
	 * Returns the mail templates before and after the current mail template in the ordered set of mail templates that the user has permission to view where groupId = &#63;.
	 *
	 * @param templateId the primary key of the current mail template
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mail template
	 * @throws NoSuchTemplateException if a mail template with the primary key could not be found
	 */
	public MailTemplate[] filterFindByGroupId_PrevAndNext(
			long templateId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
				orderByComparator)
		throws NoSuchTemplateException;

	/**
	 * Removes all the mail templates where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of mail templates where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching mail templates
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns the number of mail templates that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching mail templates that the user has permission to view
	 */
	public int filterCountByGroupId(long groupId);

	/**
	 * Returns all the mail templates where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching mail templates
	 */
	public java.util.List<MailTemplate> findByCompanyId(long companyId);

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
	public java.util.List<MailTemplate> findByCompanyId(
		long companyId, int start, int end);

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
	public java.util.List<MailTemplate> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

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
	public java.util.List<MailTemplate> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mail template in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public MailTemplate findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
				orderByComparator)
		throws NoSuchTemplateException;

	/**
	 * Returns the first mail template in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public MailTemplate fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

	/**
	 * Returns the last mail template in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template
	 * @throws NoSuchTemplateException if a matching mail template could not be found
	 */
	public MailTemplate findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
				orderByComparator)
		throws NoSuchTemplateException;

	/**
	 * Returns the last mail template in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mail template, or <code>null</code> if a matching mail template could not be found
	 */
	public MailTemplate fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

	/**
	 * Returns the mail templates before and after the current mail template in the ordered set where companyId = &#63;.
	 *
	 * @param templateId the primary key of the current mail template
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mail template
	 * @throws NoSuchTemplateException if a mail template with the primary key could not be found
	 */
	public MailTemplate[] findByCompanyId_PrevAndNext(
			long templateId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
				orderByComparator)
		throws NoSuchTemplateException;

	/**
	 * Removes all the mail templates where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of mail templates where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching mail templates
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Caches the mail template in the entity cache if it is enabled.
	 *
	 * @param mailTemplate the mail template
	 */
	public void cacheResult(MailTemplate mailTemplate);

	/**
	 * Caches the mail templates in the entity cache if it is enabled.
	 *
	 * @param mailTemplates the mail templates
	 */
	public void cacheResult(java.util.List<MailTemplate> mailTemplates);

	/**
	 * Creates a new mail template with the primary key. Does not add the mail template to the database.
	 *
	 * @param templateId the primary key for the new mail template
	 * @return the new mail template
	 */
	public MailTemplate create(long templateId);

	/**
	 * Removes the mail template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param templateId the primary key of the mail template
	 * @return the mail template that was removed
	 * @throws NoSuchTemplateException if a mail template with the primary key could not be found
	 */
	public MailTemplate remove(long templateId) throws NoSuchTemplateException;

	public MailTemplate updateImpl(MailTemplate mailTemplate);

	/**
	 * Returns the mail template with the primary key or throws a <code>NoSuchTemplateException</code> if it could not be found.
	 *
	 * @param templateId the primary key of the mail template
	 * @return the mail template
	 * @throws NoSuchTemplateException if a mail template with the primary key could not be found
	 */
	public MailTemplate findByPrimaryKey(long templateId)
		throws NoSuchTemplateException;

	/**
	 * Returns the mail template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param templateId the primary key of the mail template
	 * @return the mail template, or <code>null</code> if a mail template with the primary key could not be found
	 */
	public MailTemplate fetchByPrimaryKey(long templateId);

	/**
	 * Returns all the mail templates.
	 *
	 * @return the mail templates
	 */
	public java.util.List<MailTemplate> findAll();

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
	public java.util.List<MailTemplate> findAll(int start, int end);

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
	public java.util.List<MailTemplate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator);

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
	public java.util.List<MailTemplate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MailTemplate>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mail templates from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mail templates.
	 *
	 * @return the number of mail templates
	 */
	public int countAll();

}