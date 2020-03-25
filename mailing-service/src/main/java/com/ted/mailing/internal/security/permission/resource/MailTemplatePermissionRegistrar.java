package com.ted.mailing.internal.security.permission.resource;

import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionFactory;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.WorkflowedModelPermissionLogic;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.util.BaseMapBuilder.UnsafeFunction;
import com.liferay.portal.kernel.util.HashMapDictionary;
import com.liferay.portal.kernel.workflow.permission.WorkflowPermission;
import com.ted.mailing.constants.MailingConstants;
import com.ted.mailing.model.MailTemplate;
import com.ted.mailing.service.MailTemplateLocalService;

import java.util.Dictionary;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true)
public class MailTemplatePermissionRegistrar {
	@Activate
	protected void activate(BundleContext bundleContext) {
		Dictionary<String, Object> properties = new HashMapDictionary<>();

		properties.put("model.class.name", MailTemplate.class.getName());

		_serviceRegistration = bundleContext.registerService(
	            ModelResourcePermission.class,
	            ModelResourcePermissionFactory.create(
	                MailTemplate.class, MailTemplate::getTemplateId,
	                _templateLocalService::getMailTemplate, _portletResourcePermission,
	                (modelResourcePermission, consumer) -> {
	                    consumer.accept(	
	                        new WorkflowedModelPermissionLogic<>(
	                            workflowPermission, modelResourcePermission,
	                            groupLocalService, MailTemplate::getTemplateId));
	                }),
	            properties);
	}

	@Deactivate
	protected void deactivate() {
		_serviceRegistration.unregister();
	}


	@Reference
	private MailTemplateLocalService _templateLocalService;

	@Reference(target = "(resource.name=" + MailingConstants.RESOURCE_NAME + ")")
	private PortletResourcePermission _portletResourcePermission;

	private ServiceRegistration<ModelResourcePermission> _serviceRegistration;

	@Reference
	private StagingPermission _stagingPermission;
	
	@Reference
	private WorkflowPermission workflowPermission;
	
	@Reference
	private GroupLocalService groupLocalService;
}
