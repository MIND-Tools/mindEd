package adl.custom.adapters;

import org.eclipse.emf.common.notify.Notification;

import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.ReferencesList;
import adl.custom.MindObject;
import adl.custom.helpers.ArchitectureDefinitionHelper;
import adl.custom.util.AbstractReferencesTreatment;

public class ArchitectureDefinitionAdapter extends AbstractReferencesTreatment {
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	
	
	@Override
	public void notifyChanged(Notification notification) {
		if(
				(
						notification.getNotifier() instanceof ArchitectureDefinition 
						&& notification.getNewValue() instanceof ReferencesList
				)
				||
				notification.getNotifier() instanceof ComponentReference 
				
		)
		{
			ArchitectureDefinitionHelper helper = ((MindObject) notification.getNotifier()).getHelper().getParentComponentHelper();
			if(helper!=null && helper.getObject().getReferencesList()!=null)AdlDefinitionAdapter.addManyQueuedMerge(helper.getObject().getReferencesList().getReferences());
		}
		super.notifyChanged(notification);
	}

	/**
	 * <b>Class</b> <i>SingletonHolder</i>
	 * <p>
	 * Static access to class
	 * 
	 * @author proustr
	 * @model kind="custom implementation"
	 */
	private static class SingletonHolder {
		private static ArchitectureDefinitionAdapter instance = new ArchitectureDefinitionAdapter();
	}

	public static ArchitectureDefinitionAdapter getInstance() {
		return SingletonHolder.instance;
	}

}
