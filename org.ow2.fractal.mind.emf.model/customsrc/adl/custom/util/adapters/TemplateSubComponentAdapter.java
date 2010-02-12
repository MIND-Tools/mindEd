package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;

import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.CompositeComponentDefinition;
import adl.TemplateSpecifier;
import adl.TemplateSubComponent;
import adl.custom.MindObject;
import adl.custom.impl.CompositeComponentDefinitionCustomImpl;
import adl.custom.impl.TemplateSubComponentCustomImpl;
import adl.custom.util.AbstractReferencesTreatment;
import adl.helpers.ArchitectureDefinitionHelper;

public class TemplateSubComponentAdapter extends AbstractReferencesTreatment {

	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if (references == null) references = new BasicEList<ComponentReference>();
		if (notification.getNotifier() instanceof TemplateSubComponent
				&& notification.getFeatureID(TemplateSubComponent.class) == AdlPackage.TEMPLATE_SUB_COMPONENT__TEMPLATE_REFERENCE
				&& notification.getEventType() == Notification.SET) {
			references.clear();
			TemplateSubComponentCustomImpl component = (TemplateSubComponentCustomImpl) notification.getNotifier();
			if (component.isMerged()) return;// check
			ArchitectureDefinitionHelper helper = component.getHelper();

			ArchitectureDefinition mainComponent = getMainComponent(component);
			if (mainComponent == null) return;
			if (component.getReferenceDefinition() != null) {
				setTemplateReference(component, component.getReferenceDefinition().getReferenceName());
			}
			if (component.getTemplateReference() != null && component.getTemplateReference().getName() != null) {
				references = getAssociatedTypeComponent(mainComponent, component.getTemplateReference().getName());
				component.setActiveDefinitionCallsList(references);
				System.out.println("TemplateSubComponentAdapter - Composant : " + helper.getObject().getName());
				helper.merge(references);
			}
		}
		if (notification.getNotifier() instanceof ComponentReference
				&& notification.getFeatureID(ComponentReference.class) == AdlPackage.COMPONENT_REFERENCE__REFERENCE_NAME) {
			EObject object = (EObject) notification.getNotifier();
			while (object.eClass().getClassifierID() != AdlPackage.TEMPLATE_SUB_COMPONENT && object != null) {
				object = object.eContainer();
			}
			if (object == null) {
				return;
			}
			TemplateSubComponentCustomImpl tsc = (TemplateSubComponentCustomImpl) object;
			if (tsc.isMerged()) return;// check
			setTemplateReference(tsc, (String) notification.getNewValue());
			if (tsc.getTemplateReference() == null) {
				references.clear();
				references.add((ComponentReference) notification.getNotifier());
				tsc.setActiveDefinitionCallsList(references);
				tsc.getHelper().merge(references);
			}
		}
		if (notification.getNotifier() instanceof TemplateSubComponent
				&& notification.getFeatureID(TemplateSubComponent.class) == AdlPackage.TEMPLATE_SUB_COMPONENT__REFERENCE_DEFINITION) {
			TemplateSubComponentCustomImpl tsc = (TemplateSubComponentCustomImpl) notification.getNotifier();
			if (tsc.isMerged()) return;// check
			ComponentReference reference = (ComponentReference) notification.getNewValue();
			if (notification.getNewValue() == null) setTemplateReference(tsc, null);
			else
				setTemplateReference(tsc, reference.getReferenceName());

			if (tsc.getTemplateReference() == null) {
				references.clear();
				references.add(reference);
				tsc.setActiveDefinitionCallsList(references);
				tsc.getHelper().merge(references);
			}
		}
	}

	private void setTemplateReference(TemplateSubComponentCustomImpl tsc, String referenceName) {
		TemplateSpecifier newTemplateSpecifier = (TemplateSpecifier) AdlPackage.eINSTANCE
				.getTemplateSubComponent_TemplateReference().getDefaultValue();
		if (referenceName != null) {
			CompositeComponentDefinition parent = (CompositeComponentDefinition) getMainComponent(tsc);
			if (parent != null && parent.getTemplateSpecifiersList() != null) {
				for (TemplateSpecifier templateSpecifier : parent.getTemplateSpecifiersList().getTemplateSpecifiers()) {
					if (templateSpecifier.getName().equals(referenceName)) {
						newTemplateSpecifier = templateSpecifier;
					}
				}
			}
		}
		if (tsc.getTemplateReference() != newTemplateSpecifier) tsc.setTemplateReference(newTemplateSpecifier);
	}

	/**
	 * <b>Class</b> <i>SingletonHolder</i>
	 * <p>
	 * Provides static access to class
	 * 
	 * @author proustr
	 * @model kind="custom implementation"
	 */
	private static class SingletonHolder {
		private static TemplateSubComponentAdapter instance = new TemplateSubComponentAdapter();
	}

	public static TemplateSubComponentAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
