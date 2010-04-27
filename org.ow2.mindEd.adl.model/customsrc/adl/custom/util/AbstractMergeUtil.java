package adl.custom.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import adl.AdlDefinition;
import adl.AdlFactory;
import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.BindingDefinition;
import adl.ComponentReference;
import adl.ImportDefinition;
import adl.MergedObject;
import adl.SubComponentDefinition;

public abstract class AbstractMergeUtil extends AbstractReferencesTreatment {
	protected HashMap<EObject, EObject> eObjectsMergeHistoryMapping = new HashMap<EObject, EObject>();
	protected HashMap<EObject, EObject> referencesToResolve = new HashMap<EObject, EObject>();
	protected DefinitionLoaderUtil definitionLoader;
	protected AdlPackage adlPackage = AdlPackage.eINSTANCE;
	protected AdlFactory adlFactory = adlPackage.getAdlFactory();
	protected static boolean merging = false;

	protected EObject findObjectWithSameNameInList(EObject referenceObject,
			EList<EObject> listToCheck, boolean checkeClass) {
		for (EObject targetObject : listToCheck) {
			if (targetObject.eClass() == referenceObject.eClass() || !checkeClass)
				if (haveSameName(referenceObject, targetObject))
					if(!eObjectsMergeHistoryMapping.containsValue(targetObject))
					return targetObject;
		}
		return null;
	}

	protected boolean importAlreadyExisting(ImportDefinition sourceImport, AdlDefinition target) {
		for(ImportDefinition targetImport : target.getImports())
		{
			if(targetImport.getImportName().equals(sourceImport.getImportName()))
			{
				return true;
			}
		}
		return false;
	}
	
	protected boolean haveSameName(EObject object1, EObject object2) {
		String sourceObjectName = getAttributeName(object1);
		String targetObjectName = getAttributeName(object2);
		if(sourceObjectName!=null && targetObjectName!=null)
		{
			if (sourceObjectName.equalsIgnoreCase(targetObjectName) && sourceObjectName!=null) {
				return true;
			}
		}
		return false;
	}

	protected EObject createEObject(EClass eclass)
	{
		EObject result = AdlFactory.eINSTANCE.create(eclass);
		for(EStructuralFeature feature : result.eClass().getEAllStructuralFeatures())
		{
			result.eUnset(feature);
		}
		return result;
	}

	public void cleanMerge(EObject buffer)
	{
		if(buffer.eContainer() instanceof AdlDefinition)
			{
				cleanImportsFromMerges((AdlDefinition)buffer.eContainer());
				System.out.println("	Cleaning : " + ((ArchitectureDefinition)buffer).getName());
			}
		else
			System.out.println("	Cleaning : " + buffer.eClass().getName());
		TreeIterator<EObject> tree = buffer.eAllContents();
		while(tree.hasNext())
		{
			EObject current=tree.next();
			if(current instanceof MergedObject)
			{
				MergedObject object = (MergedObject)current;
				if(object.isOverride())
				{
					setOverrideParents(object);
				}
			}
			
		}
		deleteNonOverrideItems(buffer);
		System.out.println("	Finished cleaning : " + buffer.eClass().getName());
	}

	@SuppressWarnings("unchecked")
	private void deleteNonOverrideItems(EObject buffer) {
		TreeIterator<EObject> tree = buffer.eAllContents();
		EObject current = null;
		boolean remove=false;
		while(tree.hasNext())
		{
			current=tree.next();
			remove=false;
			if(current instanceof MergedObject)
			{
				MergedObject object = (MergedObject)current;
				if(object.isMerged())
				{
					if(!object.isOverride() && !(object instanceof ComponentReference))
					{
						remove=true;
						break;
					}
					else
					{
						object.setOverride(false);
						object.setMerged(false);
					}
				}
			}
		}
		if(remove)
		{
			EObject parent = current.eContainer();
			EStructuralFeature feature = current.eContainingFeature();
			Object content = parent.eGet(feature);
			if(content instanceof EList<?>)
			{
				EList<EObject> contentList = (EList<EObject>) content;
				contentList.remove(current);
			}
			else parent.eSet(current.eContainingFeature(), null);
			deleteNonOverrideItems(buffer);
		}
	}

	private void setOverrideParents(EObject object) {
		while(object!=null)
		{
			if(object instanceof MergedObject)
			{
				MergedObject current = (MergedObject)object;
				if(current.isMerged())current.setOverride(true);
			}
			object=object.eContainer();
		}
	}

	protected void cleanImportsFromMerges(AdlDefinition targetDefinition) {
		Iterator<ImportDefinition> importDefinition = targetDefinition.getImports().iterator();
		while(importDefinition.hasNext())
		{
			ImportDefinition currentImport = importDefinition.next();
			if(currentImport.isMerged())importDefinition.remove();
		}
	}
// ALGO DE CLEANMERGE PRECEDENT !!!!
/*	public void cleanMerge(EObject buffer,boolean fullClean)
	{
		if(buffer.eContainer() instanceof AdlDefinition)cleanImportsFromMerges((AdlDefinition)buffer.eContainer());
		System.out.println("cleaning : " + buffer.eClass().getName());
		for(EStructuralFeature feature : buffer.eClass().getEAllContainments())
		{
			findOverrideItems(buffer.eGet(feature),fullClean);
		} 
	}
	
	@SuppressWarnings("unchecked")
	private boolean findOverrideItems(Object object,boolean fullClean) {
		if (object instanceof EList<?>) {
			EList<EObject> objectList = (EList<EObject>) object;
			Iterator<EObject> iterator = objectList.iterator();
			boolean hasOverrideSubItems = false;
			while(iterator.hasNext()) {
				EObject subObject = iterator.next();
				if (subObject instanceof MergedObject) {
					if(((MergedObject) subObject).isMerged())
					{
						if(!findOverrideItems(subObject,fullClean))
						{
							iterator.remove();
						}
						else
						{
							((MergedObject)subObject).setOverride(false);
							((MergedObject)subObject).setMerged(false);
							hasOverrideSubItems = hasOverrideSubItems || true;
						}
					}
					else
						findOverrideItems(subObject,fullClean);
				}
			}
			return hasOverrideSubItems;
		}
		if (object instanceof MergedObject) {
			MergedObject tmpObject = (MergedObject)object;
			if(tmpObject.isMerged())
			{
				if(!checkIfOverride(tmpObject,fullClean))
				{
					EStructuralFeature containingFeature = tmpObject.eContainingFeature();
					if(!(tmpObject.eContainer().eGet(containingFeature) instanceof EList))
						tmpObject.eContainer().eSet(containingFeature, null);
					return false;
				}
				else return true;
			}
			else if(fullClean) cleanMerge(tmpObject,fullClean);
		}
		return false;
	}

	private boolean checkIfOverride(MergedObject object, boolean fullClean)
	{
		boolean overrideChild = false;
		for(EStructuralFeature feature : object.eClass().getEAllContainments())
		{
			if(findOverrideItems(object.eGet(feature),fullClean))overrideChild=true;
		}
		return (object.isOverride() || overrideChild);
	}*/
	
	protected void resolveReferences() {
		Set<EObject> key = referencesToResolve.keySet();
		Iterator<EObject> iterator = key.iterator();
		while (iterator.hasNext()) {
			EObject sourceObject = (EObject) iterator.next();
			EObject targetObject = referencesToResolve.get(sourceObject);
			for (EReference reference : sourceObject.eClass()
					.getEAllReferences()) {
				if (!reference.isContainer() && !reference.isContainment() && !AdlPackage.eINSTANCE.getMergedObject().getEAllStructuralFeatures().contains(reference)) {
					EObject referenceToAdd = eObjectsMergeHistoryMapping
							.get(sourceObject.eGet(reference));
					targetObject.eSet(reference, referenceToAdd);
				}
				
			}
		}
		referencesToResolve.clear();
	}
	


	protected String getAttributeName(EObject object) {
		for (EAttribute attribute : object.eClass().getEAllAttributes()) {
			if (attribute.getName().toLowerCase().contains("name")) {
				return (String) object.eGet(attribute);
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<String> getReferencesList(ArchitectureDefinition definition) {
		ArrayList<String> result = new ArrayList<String>();

		if (definition == null)
			return null;
		EStructuralFeature feature=null;
		if(definition instanceof SubComponentDefinition)
		{
			feature = adlPackage.getSubComponentDefinition_ReferenceDefinition();
			ComponentReference reference = (ComponentReference) definition.eGet(feature);
			if (reference == null)	return null;
			result.add(reference.getReferenceName());
		}
		else
		{
			feature = adlPackage.getArchitectureDefinition_ReferencesList();
			EObject referenceList = (EObject) definition.eGet(feature);
			if (referenceList == null)return null;
			feature = adlPackage.getReferencesList_References();
			EList<ComponentReference> references = (EList<ComponentReference>) referenceList.eGet(feature);
			if (references == null)	return null;
			for (ComponentReference reference : references) {
				result.add(reference.getReferenceName());
			}
		}
		return result;
	}

	protected EStructuralFeature getFeatureContainingName(EObject objectToMerge,
			String featureName) {
		for (EStructuralFeature feature : objectToMerge.eClass()
				.getEAllStructuralFeatures()) {
			if (feature.getName().toLowerCase().contains(featureName.toLowerCase())) {
				return feature;
			}
		}
		return null;

	}


	public static boolean isMerging() {
		return merging;
	}

	public static void setMerging(boolean merging) {
		AdlMergeUtil.merging = merging;
	}
}
