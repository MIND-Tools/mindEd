package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import adl.AdlPackage;
import adl.ComponentReference;
import adl.SubComponentDefinition;
import adl.custom.MindObject;
import adl.custom.util.AbstractReferencesTreatment;
import adl.helpers.ArchitectureDefinitionHelper;

public class SubComponentAdapter extends AbstractReferencesTreatment {
	boolean working = false;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if (!working) {
			int type = notification.getEventType();
			int featureID = notification.getFeatureID(ComponentReference.class);

			try {
				if (notification.getNewValue() instanceof ComponentReference && notification.getOldValue() == null
						&& ((EObject) notification.getNotifier()) instanceof SubComponentDefinition) {
					ComponentReference reference = (ComponentReference) notification.getNewValue();
					if (((EObject) notification.getNotifier()).eContainer() == null) return;
					references.clear();
					references.add(reference);
					if (reference.getReferenceName() == AdlPackage.eINSTANCE.getComponentReference_ReferenceName()
							.getDefaultValueLiteral()) return;
					working = true;
					newReferenceListTreatment(reference);
				}
				if (type == Notification.SET && notification.getNotifier() instanceof ComponentReference) {
					ComponentReference reference = (ComponentReference) notification.getNotifier();
					if (reference.eContainer().eContainer() == null) return;
					references.clear();
					references.add(reference);
					if (reference.eContainer() instanceof SubComponentDefinition
							&& featureID == AdlPackage.COMPONENT_REFERENCE__REFERENCE_NAME) {
						if (featureID == AdlPackage.COMPONENT_REFERENCE__REFERENCE_NAME) {
							newReferenceListTreatment(reference);
						}
					}
				}
			}
			finally {
				working = false;
			}
		}
	}

	/**
	 * <b>Method</b> <i>newReferenceListTreatment</i>
	 * <p>
	 * This method launches a merge for parent component with its associated references.
	 * 
	 * @param reference
	 * 
	 * @author proustr
	 */
	private void newReferenceListTreatment(EObject reference) {
		ArchitectureDefinitionHelper helper = getParentComponentHelper(reference);
		if (helper == null) return;
		System.out.println("SubComponentAdapter - Component : " + helper.getObject().getName());
		helper.merge(references);
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
		private static SubComponentAdapter instance = new SubComponentAdapter();
	}

	public static SubComponentAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
