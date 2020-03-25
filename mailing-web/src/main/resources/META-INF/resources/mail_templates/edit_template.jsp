<%@page import="com.ted.mailing.model.MailTemplate"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@ include file="/mail_templates/init.jsp" %>


<portlet:actionURL name="/mail_templates/edit_template" var="editTemplateURL">
	<portlet:param name="mvcRenderCommandName" value="/mail_templates/edit_template" />
</portlet:actionURL>

<aui:form action="${editTemplateURL }" method="post" name="fm" >
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="${cmd }"/>
	<aui:input name="redirect" type="hidden" value="{redirect}" />
	<aui:input name="templateId" type="hidden" value="${templateId }" />

	<aui:model-context bean="${template }" model="<%= MailTemplate.class %>" />


	<aui:input name="subject" />
	
	<aui:input name="body" />


	<aui:button-row>
		<aui:button type="submit" />

		<aui:button href="${redirect}" type="cancel" />
	</aui:button-row>
</aui:form>
