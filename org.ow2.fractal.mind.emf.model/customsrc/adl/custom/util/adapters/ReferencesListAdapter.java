package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import adl.AdlPackage;
import adl.ComponentReference;
import adl.ReferencesList;
import adl.custom.util.AbstractReferencesTreatment;
import adl.helpers.ArchitectureDefinitionHelper;

public class ReferencesListAdapter extends AbstractReferencesTreatment {
	
    public void notifyChanged(Notification notification) {
    	super.notifyChanged(notification);
    	int type = notification.getEventType();
    	if( ((EObject)notification.getNotifier()).eResource() != null)
    	{
	    	if(notification.getNotifier() instanceof ComponentReference && type==Notification.SET && !(notification.getOldValue()==null && notification.getNewStringValue()==""))
	    	{
    			ArchitectureDefinitionHelper helper = getParentComponentHelper((EObject)notification.getNotifier());
    			if(helper==null) return;
    			System.out.println("ReferencesListAdapter - Component : " + helper.getObject().getName());
    			helper.refreshMerge();
	    	}
	    	else if(notification.getNotifier() instanceof ReferencesList && (type==Notification.REMOVE || type==Notification.SET))
	    	{
	    		if(notification.getFeatureID(ReferencesList.class) == AdlPackage.REFERENCES_LIST__REFERENCES)
	    		{
	    			ArchitectureDefinitionHelper helper = getParentComponentHelper((EObject)notification.getNotifier());
	    			if(helper==null) return;
	    			System.out.println("ReferencesListAdapter - Component : " + helper.getObject().getName());
	    			helper.refreshMerge();
	    		}
	    	}
    	} 
    }
  
    private static class SingletonHolder {
		private static ReferencesListAdapter instance = new ReferencesListAdapter();
	}
    
    public static ReferencesListAdapter getInstance(){
    	return SingletonHolder.instance;
    }
}
