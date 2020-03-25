package com.ted.mailing.internal.trash;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.trash.BaseTrashHandler;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.ted.mailing.model.MailTemplate;
import com.ted.mailing.service.MailTemplateLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	property = "model.class.name=com.ted.mailing.model.MailTemplate",
	service = TrashHandler.class
)
public class MailTemplateTrashHandler extends BaseTrashHandler {

	@Override
	public void deleteTrashEntry(long classPK) throws PortalException {
		mailTemplateLocalService.deleteMailTemplate(classPK);
	}

	@Override
	public String getClassName() {
		return MailTemplate.class.getName();
	}

	@Override
	public void restoreTrashEntry(long userId, long classPK) throws PortalException {
		mailTemplateLocalService.restoreTemplateFromTrash(userId, classPK);
	}

	@Override
	protected boolean hasPermission(PermissionChecker permissionChecker, long classPK, String actionId)
			throws PortalException {
		return templateModelResourcePermission.contains(permissionChecker, mailTemplateLocalService.getMailTemplate(classPK), actionId);
	}
	
	@Reference(unbind = "-")
	protected void setMailTemplateLocalService(
		MailTemplateLocalService mailTemplateLocalService) {

		this.mailTemplateLocalService = mailTemplateLocalService;
	}
	
	@Reference(
		target = "(model.class.name=com.ted.mailing.model.MailTemplate)"
	)
	private ModelResourcePermission<MailTemplate>
		templateModelResourcePermission;
	
	private MailTemplateLocalService mailTemplateLocalService;
	

}
