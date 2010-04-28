package org.ow2.mindEd.adl.custom.adapters;

import org.eclipse.emf.common.notify.Notification;

import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.ReferencesList;
import org.ow2.mindEd.adl.custom.MindObject;
import org.ow2.mindEd.adl.custom.helpers.ArchitectureDefinitionHelper;
import org.ow2.mindEd.adl.custom.util.AbstractReferencesTreatment;


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
