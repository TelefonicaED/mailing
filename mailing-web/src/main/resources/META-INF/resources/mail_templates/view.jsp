<%@ include file="/mail_templates/init.jsp" %>


<aui:button href="${newTemplateURL}" type="button" value="new"/>

<liferay-ui:search-container
	id="templates"
	searchContainer="${searchContainer}"
	var="templateSearchContainer"
>
	<liferay-ui:search-container-row
		className="com.ted.mailing.model.MailTemplate"
		modelVar="template"
	>

		<liferay-ui:search-container-column-text
			cssClass="important table-cell-content"
			name="subject"
			value="subject"
		/>
		
		<liferay-ui:search-container-column-jsp
			path="/mail_templates/actions.jsp"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator
		displayStyle="${displayStyle}"
		markupView="lexicon"
	/>
</liferay-ui:search-container>