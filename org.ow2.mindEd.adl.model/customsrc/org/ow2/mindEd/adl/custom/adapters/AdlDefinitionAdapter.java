package org.ow2.mindEd.adl.custom.adapters;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.custom.helpers.ArchitectureDefinitionHelper;
import org.ow2.mindEd.adl.custom.util.AbstractReferencesTreatment;


public class AdlDefinitionAdapter extends AbstractReferencesTreatment {
	private static ArrayList<ComponentReference> queuedReferences = new ArrayList<ComponentReference>(); 
	private static ArrayList<AdlDefinition> queuedDefinitions = new ArrayList<AdlDefinition>(); 
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	
	@Override
	public void notifyChanged(Notification notification) {
		if((notification.getNotifier() instanceof ComponentReference || notification.getNotifier() instanceof AdlDefinition) && !queuedReferences.isEmpty())
			{
				calculateAdlToResolve();
			}
		super.notifyChanged(notification);
	}

	
	private void calculateAdlToResolve() {
		while(!queuedReferences.isEmpty())
		{
			ComponentReference currentReference = queuedReferences.get(0);
			EObject object = EcoreUtil.getRootContainer(currentReference);
			if(object instanceof AdlDefinition)
			{
				AdlDefinition adlDefinition = (AdlDefinition) object;
				if(!queuedDefinitions.contains(adlDefinition))
				{
					queuedDefinitions.add(adlDefinition);
					resolveQueuedMerges(adlDefinition);
					queuedDefinitions.remove(adlDefinition);
				}
			}
			queuedReferences.remove(currentReference);
		}
		queuedReferences.clear();
	}


	public static void addQueuedMerge(ComponentReference reference) {
		if(!queuedReferences.contains(reference))
		{
			queuedReferences.add(reference);
		}
	}
	
	public static void addManyQueuedMerge(Collection<ComponentReference> referenceList) {
		for(ComponentReference reference : referenceList)
		{
			if(!queuedReferences.contains(reference))
			{
				queuedReferences.add(reference);
			}
		}
	}
	
	private void resolveQueuedMerges(AdlDefinition currentDefinition) {
		if(currentDefinition.getArchitecturedefinition()!=null)
		{
			ArchitectureDefinitionHelper helper = (ArchitectureDefinitionHelper) currentDefinition.getArchitecturedefinition().getHelper();
			if(helper!=null)
			{
				helper.refreshMerge();
			}
		}
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
		private static AdlDefinitionAdapter instance = new AdlDefinitionAdapter();
	}

	public static AdlDefinitionAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
