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

package com.ted.mailing.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.ted.mailing.model.MailTemplate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MailTemplate in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MailTemplateCacheModel
	implements CacheModel<MailTemplate>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MailTemplateCacheModel)) {
			return false;
		}

		MailTemplateCacheModel mailTemplateCacheModel =
			(MailTemplateCacheModel)obj;

		if (templateId == mailTemplateCacheModel.templateId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, templateId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", templateId=");
		sb.append(templateId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", subject=");
		sb.append(subject);
		sb.append(", body=");
		sb.append(body);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MailTemplate toEntityModel() {
		MailTemplateImpl mailTemplateImpl = new MailTemplateImpl();

		if (uuid == null) {
			mailTemplateImpl.setUuid("");
		}
		else {
			mailTemplateImpl.setUuid(uuid);
		}

		mailTemplateImpl.setTemplateId(templateId);
		mailTemplateImpl.setGroupId(groupId);
		mailTemplateImpl.setCompanyId(companyId);
		mailTemplateImpl.setUserId(userId);

		if (userName == null) {
			mailTemplateImpl.setUserName("");
		}
		else {
			mailTemplateImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			mailTemplateImpl.setCreateDate(null);
		}
		else {
			mailTemplateImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			mailTemplateImpl.setModifiedDate(null);
		}
		else {
			mailTemplateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (subject == null) {
			mailTemplateImpl.setSubject("");
		}
		else {
			mailTemplateImpl.setSubject(subject);
		}

		if (body == null) {
			mailTemplateImpl.setBody("");
		}
		else {
			mailTemplateImpl.setBody(body);
		}

		mailTemplateImpl.setStatus(status);
		mailTemplateImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			mailTemplateImpl.setStatusByUserName("");
		}
		else {
			mailTemplateImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			mailTemplateImpl.setStatusDate(null);
		}
		else {
			mailTemplateImpl.setStatusDate(new Date(statusDate));
		}

		mailTemplateImpl.resetOriginalValues();

		return mailTemplateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		templateId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		subject = objectInput.readUTF();
		body = objectInput.readUTF();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(templateId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (subject == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subject);
		}

		if (body == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(body);
		}

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long templateId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String subject;
	public String body;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}