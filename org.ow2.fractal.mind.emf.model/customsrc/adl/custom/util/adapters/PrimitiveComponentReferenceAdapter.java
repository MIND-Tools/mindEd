package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import adl.AdlPackage;
import adl.ComponentReference;
import adl.custom.impl.PrimitiveComponentDefinitionCustomImpl;
import adl.custom.impl.PrimitiveReferenceDefinitionCustomImpl;
import adl.helpers.ComponentReferenceHelper;

public class PrimitiveComponentReferenceAdapter extends EContentAdapter {

	ComponentReferenceHelper helper;

	
    /* (non-Javadoc)
     * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
     */
    public void notifyChanged(Notification notification) {
    	super.notifyChanged(notification);
    }
    
    private static class SingletonHolder {
		private static PrimitiveComponentReferenceAdapter instance = new PrimitiveComponentReferenceAdapter();
	}
    
    public static PrimitiveComponentReferenceAdapter getInstance(){
    	return SingletonHolder.instance;
    }
}

