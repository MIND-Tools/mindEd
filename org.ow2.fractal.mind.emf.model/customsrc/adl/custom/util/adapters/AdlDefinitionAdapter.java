package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import adl.AdlDefinition;
import adl.AdlPackage;
import adl.ImportDefinition;
import adl.MergedObject;
import adl.custom.util.AbstractReferencesTreatment;
import adl.helpers.ArchitectureDefinitionHelper;

public class AdlDefinitionAdapter extends AbstractReferencesTreatment{

	@Override
	public void notifyChanged(Notification notification) {
		if(notification.getNewValue() instanceof ImportDefinition && (notification.getEventType()==Notification.SET || notification.getEventType()==Notification.ADD))
		{
			MergedObject object = (MergedObject)notification.getNewValue();
			if(!object.isMerged())
			{
				launchMerge((EObject)notification.getNotifier());
			}
		}
		else if(notification.getEventType()==Notification.REMOVE && notification.getOldValue() instanceof ImportDefinition)
		{
			MergedObject object = (MergedObject)notification.getOldValue();
			if(!object.isMerged())
			{
				launchMerge((EObject)notification.getNotifier());
			}
		}
		
		super.notifyChanged(notification);
	}
	private void launchMerge(EObject notifier) {
		while(!(notifier instanceof AdlDefinition) && notifier!=null)
		{
			notifier=notifier.eContainer();
		}
		if(notifier!=null)
		{
			AdlDefinition definition = (AdlDefinition)notifier;
			if(definition.getArchitecturedefinition()==null)return;
			ArchitectureDefinitionHelper helper = getParentComponentHelper(definition.getArchitecturedefinition());
			if(helper!=null && !helper.isMerging())
				{
					System.out.println("AdlDefinitionAdapter : Component " + definition.getArchitecturedefinition().getName());
					helper.merge(helper.getDefinitionCallsList());
				}
		}
	}
	private static class SingletonHolder {
		private static AdlDefinitionAdapter instance = new AdlDefinitionAdapter();
	}

	public static AdlDefinitionAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
