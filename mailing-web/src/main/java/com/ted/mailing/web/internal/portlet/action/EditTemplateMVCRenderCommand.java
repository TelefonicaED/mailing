package com.ted.mailing.web.internal.portlet.action;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.ted.mailing.model.MailTemplate;
import com.ted.mailing.service.MailTemplateService;
import com.ted.mailing.web.internal.constants.MailingPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	property = {
		"javax.portlet.name=" + MailingPortletKeys.MAIL_TEMPLATE_ADMIN,
		"mvc.command.name=/mail_templates/edit_template"
	},
	service = MVCRenderCommand.class
)
public class EditTemplateMVCRenderCommand implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long templateId = ParamUtil.getLong(renderRequest, "templateId");
		String cmd = Constants.ADD;
		MailTemplate mailTemplate = null;
		if(templateId > 0) {
			cmd = Constants.UPDATE;
			//mailTemplate = mailTemplateService.getMailTemplate(templateId);
		}
		
		renderRequest.setAttribute("cmd", cmd);
		renderRequest.setAttribute("templateId", templateId);
		renderRequest.setAttribute("template", mailTemplate);
		
		return "/mail_templates/edit_template.jsp";
	}

	@Reference(unbind = "-")
	protected void setMailTemplateService(MailTemplateService mailTemplateService) {
		this.mailTemplateService = mailTemplateService;
	}
	
	private MailTemplateService mailTemplateService;
}
