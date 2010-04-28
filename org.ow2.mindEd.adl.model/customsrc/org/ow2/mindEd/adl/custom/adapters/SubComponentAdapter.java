package org.ow2.mindEd.adl.custom.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.custom.util.AbstractReferencesTreatment;

public class SubComponentAdapter extends AbstractReferencesTreatment {

	public void notifyChanged(Notification notification) {
		if(notification.getNotifier() instanceof ComponentReference)
		{
			AdlDefinitionAdapter.addQueuedMerge((ComponentReference) notification.getNotifier());
		}
		super.notifyChanged(notification);
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
