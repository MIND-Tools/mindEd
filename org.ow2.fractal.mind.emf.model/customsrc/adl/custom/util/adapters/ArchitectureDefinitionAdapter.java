package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import adl.AdlDefinition;
import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.ReferencesList;
import adl.SubComponentDefinition;
import adl.custom.util.AbstractReferencesTreatment;
import adl.helpers.ArchitectureDefinitionHelper;


public class ArchitectureDefinitionAdapter extends AbstractReferencesTreatment {
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if(notification.getNewValue() instanceof AdlDefinition && notification.getOldValue()==null)
		{
			ArchitectureDefinitionHelper helper = getParentComponentHelper((EObject)notification.getNotifier());
			if(helper==null) return;
			System.out.println("ArchitectureDefinitionAdapter - Composant : " + helper.getObject().getName());
			helper.merge(helper.getDefinitionCallsList());
   		}
		if(notification.getNotifier() instanceof ReferencesList && notification.getNewValue()==null && notification.getEventType()==Notification.SET && notification.getOldValue() instanceof ArchitectureDefinition)
		{
			ArchitectureDefinitionHelper helper = getParentComponentHelper((EObject)notification.getOldValue());
			if(((ReferencesList)notification.getNotifier()).getReferences().size()>0)
			{
				System.out.println("ArchitectureDefinitionAdapter - Composant : " + helper.getObject().getName());			
				helper.refreshMerge();
			}
		}
/*		if(notification.getNotifier() instanceof ArchitectureDefinition && notification.getFeatureID(ArchitectureDefinition.class)==AdlPackage.ARCHITECTURE_DEFINITION__REFERENCES_LIST && notification.getEventType()==Notification.SET)
		{
			System.out.println("Adapter Archi - Composant : " + ((ArchitectureDefinition)notification.getNotifier()).getName() + ", référence : list");
			ArchitectureDefinitionHelper helper = getParentComponentHelper((EObject)notification.getNotifier());
			helper.refreshMerge();
		} */ 

	}

	private void newReferenceListTreatment(EObject referenceList)
	{
		ArchitectureDefinitionHelper helper = getParentComponentHelper(referenceList);
		if(helper==null) return;
		System.out.println("ArchitectureDefinitionAdapter - Composant : " + helper.getObject().getName());
		helper.merge(helper.getDefinitionCallsList());
	}
	
	private static class SingletonHolder {
		private static ArchitectureDefinitionAdapter instance = new ArchitectureDefinitionAdapter();
	}

	public static ArchitectureDefinitionAdapter getInstance() {
		return SingletonHolder.instance;
	}

}
