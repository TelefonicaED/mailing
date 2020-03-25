package com.ted.mailing.web.internal.portlet.action;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
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
		"mvc.command.name=/", "mvc.command.name=/mail_templates/view"
	},
	service = MVCRenderCommand.class
)
public class MailTemplateAdminViewMVCRenderCommand implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("mvcRenderCommandName", "/mail_templates/view");
		
		SearchContainer<MailTemplate> searchContainer = new SearchContainer<MailTemplate>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 
				SearchContainer.DEFAULT_DELTA, iteratorURL, null, "no-templates");
		
		searchContainer.setResults(mailTemplateService.getMailTemplates(themeDisplay.getScopeGroupId(), searchContainer.getStart(), searchContainer.getEnd()));
		searchContainer.setTotal(mailTemplateService.getMailTemplatesCount(themeDisplay.getScopeGroupId()));
		
		PortletURL newTemplateURL = renderResponse.createRenderURL();
		newTemplateURL.setParameter("mvcRenderCommandName", "/mail_templates/edit_template");
		
		renderRequest.setAttribute("searchContainer", searchContainer);
		renderRequest.setAttribute("newTemplateURL", newTemplateURL);
		
		return "/mail_templates/view.jsp";
	}

	@Reference(unbind = "-")
	protected void setMailTemplateService(MailTemplateService mailTemplateService) {
		this.mailTemplateService = mailTemplateService;
	}
	
	private MailTemplateService mailTemplateService;
	
}
