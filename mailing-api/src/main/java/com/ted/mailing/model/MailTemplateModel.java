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

package com.ted.mailing.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.ContainerModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.TrashedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the MailTemplate service. Represents a row in the &quot;Mail_MailTemplate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.ted.mailing.model.impl.MailTemplateModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.ted.mailing.model.impl.MailTemplateImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MailTemplate
 * @generated
 */
@ProviderType
public interface MailTemplateModel
	extends BaseModel<MailTemplate>, ContainerModel, GroupedModel, ShardedModel,
			StagedAuditedModel, TrashedModel, WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a mail template model instance should use the {@link MailTemplate} interface instead.
	 */

	/**
	 * Returns the primary key of this mail template.
	 *
	 * @return the primary key of this mail template
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this mail template.
	 *
	 * @param primaryKey the primary key of this mail template
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this mail template.
	 *
	 * @return the uuid of this mail template
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this mail template.
	 *
	 * @param uuid the uuid of this mail template
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the template ID of this mail template.
	 *
	 * @return the template ID of this mail template
	 */
	public long getTemplateId();

	/**
	 * Sets the template ID of this mail template.
	 *
	 * @param templateId the template ID of this mail template
	 */
	public void setTemplateId(long templateId);

	/**
	 * Returns the group ID of this mail template.
	 *
	 * @return the group ID of this mail template
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this mail template.
	 *
	 * @param groupId the group ID of this mail template
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this mail template.
	 *
	 * @return the company ID of this mail template
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this mail template.
	 *
	 * @param companyId the company ID of this mail template
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this mail template.
	 *
	 * @return the user ID of this mail template
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this mail template.
	 *
	 * @param userId the user ID of this mail template
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this mail template.
	 *
	 * @return the user uuid of this mail template
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this mail template.
	 *
	 * @param userUuid the user uuid of this mail template
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this mail template.
	 *
	 * @return the user name of this mail template
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this mail template.
	 *
	 * @param userName the user name of this mail template
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this mail template.
	 *
	 * @return the create date of this mail template
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this mail template.
	 *
	 * @param createDate the create date of this mail template
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this mail template.
	 *
	 * @return the modified date of this mail template
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this mail template.
	 *
	 * @param modifiedDate the modified date of this mail template
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the subject of this mail template.
	 *
	 * @return the subject of this mail template
	 */
	@AutoEscape
	public String getSubject();

	/**
	 * Sets the subject of this mail template.
	 *
	 * @param subject the subject of this mail template
	 */
	public void setSubject(String subject);

	/**
	 * Returns the body of this mail template.
	 *
	 * @return the body of this mail template
	 */
	@AutoEscape
	public String getBody();

	/**
	 * Sets the body of this mail template.
	 *
	 * @param body the body of this mail template
	 */
	public void setBody(String body);

	/**
	 * Returns the status of this mail template.
	 *
	 * @return the status of this mail template
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this mail template.
	 *
	 * @param status the status of this mail template
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this mail template.
	 *
	 * @return the status by user ID of this mail template
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this mail template.
	 *
	 * @param statusByUserId the status by user ID of this mail template
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this mail template.
	 *
	 * @return the status by user uuid of this mail template
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this mail template.
	 *
	 * @param statusByUserUuid the status by user uuid of this mail template
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this mail template.
	 *
	 * @return the status by user name of this mail template
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this mail template.
	 *
	 * @param statusByUserName the status by user name of this mail template
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this mail template.
	 *
	 * @return the status date of this mail template
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this mail template.
	 *
	 * @param statusDate the status date of this mail template
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the trash entry created when this mail template was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this mail template.
	 *
	 * @return the trash entry created when this mail template was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws PortalException;

	/**
	 * Returns the class primary key of the trash entry for this mail template.
	 *
	 * @return the class primary key of the trash entry for this mail template
	 */
	@Override
	public long getTrashEntryClassPK();

	/**
	 * Returns the trash handler for this mail template.
	 *
	 * @return the trash handler for this mail template
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler();

	/**
	 * Returns <code>true</code> if this mail template is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this mail template is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash();

	/**
	 * Returns <code>true</code> if the parent of this mail template is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this mail template is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrashContainer();

	@Override
	public boolean isInTrashExplicitly();

	@Override
	public boolean isInTrashImplicitly();

	/**
	 * Returns <code>true</code> if this mail template is approved.
	 *
	 * @return <code>true</code> if this mail template is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this mail template is denied.
	 *
	 * @return <code>true</code> if this mail template is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this mail template is a draft.
	 *
	 * @return <code>true</code> if this mail template is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this mail template is expired.
	 *
	 * @return <code>true</code> if this mail template is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this mail template is inactive.
	 *
	 * @return <code>true</code> if this mail template is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this mail template is incomplete.
	 *
	 * @return <code>true</code> if this mail template is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this mail template is pending.
	 *
	 * @return <code>true</code> if this mail template is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this mail template is scheduled.
	 *
	 * @return <code>true</code> if this mail template is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	/**
	 * Returns the container model ID of this mail template.
	 *
	 * @return the container model ID of this mail template
	 */
	@Override
	public long getContainerModelId();

	/**
	 * Sets the container model ID of this mail template.
	 *
	 * @param containerModelId the container model ID of this mail template
	 */
	@Override
	public void setContainerModelId(long containerModelId);

	/**
	 * Returns the container name of this mail template.
	 *
	 * @return the container name of this mail template
	 */
	@Override
	public String getContainerModelName();

	/**
	 * Returns the parent container model ID of this mail template.
	 *
	 * @return the parent container model ID of this mail template
	 */
	@Override
	public long getParentContainerModelId();

	/**
	 * Sets the parent container model ID of this mail template.
	 *
	 * @param parentContainerModelId the parent container model ID of this mail template
	 */
	@Override
	public void setParentContainerModelId(long parentContainerModelId);

}