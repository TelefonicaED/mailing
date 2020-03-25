package com.ted.mailing.internal.security.permission;

import com.liferay.portal.kernel.security.permission.PermissionUpdateHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.ted.mailing.model.MailTemplate;
import com.ted.mailing.service.MailTemplateLocalService;

import java.util.Date;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	property = "model.class.name=com.ted.mailing.model.MailTemplate",
	service = PermissionUpdateHandler.class
)
public class MailTemplatePermissionUpdateHandler implements PermissionUpdateHandler{

	@Override
	public void updatedPermission(String primKey) {
		MailTemplate mailTemplate = _mailTemplateLocalService.fetchMailTemplate(GetterUtil.getLong(primKey));

		if (mailTemplate == null) {
			return;
		}

		mailTemplate.setModifiedDate(new Date());

		_mailTemplateLocalService.updateMailTemplate(mailTemplate);
	}

	@Reference(unbind = "-")
	protected void setMailTemplateLocalService(
		MailTemplateLocalService mailTemplateLocalService) {

		_mailTemplateLocalService = mailTemplateLocalService;
	}

	private MailTemplateLocalService _mailTemplateLocalService;
}
