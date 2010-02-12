package adl.custom.util.adapters;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;

import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.CompositeComponentDefinition;
import adl.TemplateSubComponent;
import adl.custom.impl.CompositeComponentDefinitionCustomImpl;
import adl.custom.impl.TemplateSubComponentCustomImpl;
import adl.custom.util.AbstractReferencesTreatment;
import adl.helpers.ArchitectureDefinitionHelper;



public class TemplateSubComponentAdapter extends AbstractReferencesTreatment{


	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if(notification.getFeatureID(TemplateSubComponent.class)==AdlPackage.TEMPLATE_SUB_COMPONENT__TEMPLATE_REFERENCE && notification.getEventType()==Notification.SET)
		{
			if(references==null)references = new ArrayList<String>();
			else references.clear();
			TemplateSubComponentCustomImpl component = (TemplateSubComponentCustomImpl) notification.getNotifier();
			ArchitectureDefinitionHelper helper = component.getHelper();

			CompositeComponentDefinitionCustomImpl mainComponent = getMainComponent(component);
			if(mainComponent==null)return;
			if(component.getTemplateReference()!=null && component.getTemplateReference().getName()!="")
			{
				references = getAssociatedTypeComponent(mainComponent,component.getTemplateReference().getName());				
			}
			component.setActiveDefinitionCallsList(references);
			System.out.println("TemplateSubComponentAdapter - Composant : " + helper.getObject().getName());			
			helper.merge(references); 
		}
	}
	
	private static class SingletonHolder {
		private static TemplateSubComponentAdapter instance = new TemplateSubComponentAdapter();
	}

	public static TemplateSubComponentAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
