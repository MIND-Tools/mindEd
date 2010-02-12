package adl.custom.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

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
import adl.ComponentReference;
import adl.ComponentTypeDefinition;
import adl.CompositeAnonymousSubComponent;
import adl.CompositeComponentDefinition;
import adl.CompositeReferenceDefinition;
import adl.CompositeSubComponent;
import adl.Element;
import adl.ImportDefinition;
import adl.MergedObject;
import adl.PrimitiveAnonymousSubComponent;
import adl.PrimitiveComponentDefinition;
import adl.PrimitiveSubComponent;
import adl.SubComponentDefinition;
import adl.TemplateDefinition;
import adl.TemplateSpecifier;
import adl.TemplateSubComponent;
import adl.custom.impl.TemplateSubComponentCustomImpl;
import adl.helpers.ArchitectureDefinitionHelper;

public class AdlMergeUtil extends AbstractMergeUtil{
private static BufferUtil buffer= new BufferUtil();
private HashMap<String,String> mergedDefinitionsHistory = new HashMap<String,String>();
private HashMap<String, ArchitectureDefinition> templates = new HashMap<String, ArchitectureDefinition>();

	public AdlMergeUtil(EObject object) {
		eObjectsMergeHistoryMapping.clear();
		referencesToResolve.clear();
		definitionLoader = DefinitionLoaderUtil.INSTANCE;
	}

	public void merge(ArchitectureDefinition definition,
			ArrayList<String> refList, boolean useBuffer)
	{	
		System.out.println("=======> Merge demand " + definition.getName() + "... <========");
			if(refList==null || refList.isEmpty())
				{
					try
					{
						cleanMerge(definition);
						updateSubComponentReferences(definition);
						System.out.println("=========> Exiting merge. <==========");
						return;
					}
					finally{}
				} 
			if(definition instanceof SubComponentDefinition)
				{
					System.out.println("	SubComponent with merging state = " + merging);
					useBuffer=false;
					//if(merging)return;
				}
			if(useBuffer && !merging) { 
				try
				{
					System.out.println("	Start merging with [BUFFER]...");
					merging = true;
					System.out.println("	[BUFFER]Loading buffer from definition...");
					buffer.createBuffer(definition);
					System.out.println("	[BUFFER]Load complete...");
					fullMerge(buffer.getDefinition(),refList);
					System.out.println("	[BUFFER] Updating definition from buffer");
					buffer.updateDefinitionFromBuffer(definition);
					System.out.println("	[BUFFER] Update complete");
					System.out.println("	[SUCCESS] Merge finished without error !");
				}
				catch (Exception e) {
					System.out.println("	[ERROR] Merge finished with errors !\n" + e.getMessage() + "\n");				
				}
				finally
				{
					merging = false;
					System.out.println("=========> Exiting merge. <==========");
				}
			}
			else
			{
				try
				{
					System.out.println("		Start merging without buffer...");
					cleanMerge(definition);
					fullMerge(definition,refList);
					System.out.println("		[SUCCESS] Merge finished without error !");
				}
				catch (Exception e) {
					System.out.println("	[ERROR] Merge finished with errors !\n" + e.getMessage() + "\n");				
				}
				finally
				{
					System.out.println("		Exiting merge.");
				}
			}
	}
	
	
	private void fullMerge(ArchitectureDefinition definition,
			ArrayList<String> refList) 
	{
		ArrayList<String> importsList = new ArrayList<String>();
		ArchitectureDefinition definitionToMerge = null;
		ArchitectureDefinition mergedDefinition = null;
		String definitionCall = "";
		String mergedDefinitionCall = "";
		eObjectsMergeHistoryMapping.clear();

		importsList = recoverImports(definition);
		Iterator<String> iterator = refList.iterator();
		
		while (iterator.hasNext()) {
			mergedDefinitionCall = iterator.next();
			System.out.println("				=== Starting merge for reference : " + mergedDefinitionCall + "===");
			mergedDefinition = prepareDefinitionForMerge(definitionToMerge,
					mergedDefinitionCall,importsList);
			templates = getTemplates(definition,mergedDefinitionCall);
			executeMerge(definitionToMerge, mergedDefinition,false);

			definitionLoader.unloadDefinition(definitionCall);
			definitionCall = mergedDefinitionCall;
			definitionToMerge = mergedDefinition;
			System.out.println("				=== Merge done for " + mergedDefinitionCall + "===");
		}
		templates = getTemplates(definition,definitionCall);
		if(canMerge(definition, definitionToMerge))
			executeMerge(definitionToMerge, definition,false);
		definitionLoader.unloadDefinition(definitionCall);
	}

	private HashMap<String,ArchitectureDefinition> getTemplates(ArchitectureDefinition definition,
			String definitionCall) {
		templates.clear();
		HashMap<String,ArchitectureDefinition> result = new HashMap<String,ArchitectureDefinition>();
		ComponentReference reference =getComponentReferenceByName(definition, definitionCall); 
		if(reference==null)return result;
		CompositeReferenceDefinition compositeReference = (CompositeReferenceDefinition) reference;
		for(TemplateDefinition template : compositeReference.getTemplatesList())
		{
			ArchitectureDefinition templateDefinition = definitionLoader.loadDefinition(template.getTemplateValue(), recoverImports(definition));
			if(templateDefinition!=null)
			{
				result.put(template.getTemplateName(),templateDefinition);
				definitionLoader.unloadDefinition(template.getTemplateValue());
			}
		}
		return result;
	}
	
	private ComponentReference getComponentReferenceByName(ArchitectureDefinition definition,String definitionCall)
	{
		if(definition==null || definitionCall==null)return null;

		if(definition instanceof CompositeComponentDefinition)
		{
			if(!(definition instanceof SubComponentDefinition))
			{
				CompositeComponentDefinition component = (CompositeComponentDefinition)definition;
				if(component.getReferencesList()==null)return null;
				for(ComponentReference reference : component.getReferencesList().getReferences())
				{
					if(reference.getReferenceName().equals(definitionCall))
					{
						return reference;
					}
				}
			}
			else
			{
				CompositeAnonymousSubComponent component = (CompositeAnonymousSubComponent)definition;
				if(component.getReferenceDefinition().getReferenceName().equals(definitionCall))
				{
					return component.getReferenceDefinition();
				}
			}
		}	
		return null;
	}

	public EObject getBufferMappedObject(EObject object)
	{
		return eObjectsMergeHistoryMapping.get(object);
	}
	
	public void executeMerge(ArchitectureDefinition definitionToMerge,ArchitectureDefinition mergedComponent,boolean duplicate) {
		if (definitionToMerge != null && mergedComponent != null) {
			System.out.println("				Merging " + definitionToMerge.getName() + " into " + mergedComponent.getName());
			mergedDefinitionsHistory.put(mergedComponent.getName(), definitionToMerge.getName());
			if(checkIfCircleReferences(mergedComponent.getName(),definitionToMerge.getName()))
			{
				throw new IllegalArgumentException("				Cannot calculate Merge - circular reference : "+definitionToMerge.getName() + " for component " + mergedComponent.getName());
			}
			mergeElements(definitionToMerge, mergedComponent);
			resolveReferences();
			resolveImports(definitionToMerge,mergedComponent);
			updateSubComponentReferences(mergedComponent);
		}
	}

	private boolean checkIfCircleReferences(String mergedDef, String defToMerge) {
		return false;
	}

	private void resolveImports(ArchitectureDefinition source,
			ArchitectureDefinition target) {
		
		EObject targetContainer = target.eContainer();
		if (source.eContainer() instanceof AdlDefinition) {
			AdlDefinition sourceDefinition = (AdlDefinition)source.eContainer();			
			while(!(targetContainer instanceof AdlDefinition) && targetContainer!=null)
			{
				targetContainer = targetContainer.eContainer();
			}
			if(targetContainer!=null)
			{
				AdlDefinition targetDefinition = (AdlDefinition)targetContainer;
				cleanImportsFromMerges(targetDefinition);
				Iterator<ImportDefinition> importList = sourceDefinition.getImports().iterator();
				ArrayList<ImportDefinition> importsToAdd = new ArrayList<ImportDefinition>();
				while(importList.hasNext())
				{
					ImportDefinition eImport = importList.next();
					if(!importAlreadyExisting(eImport,targetDefinition))
					{
						ImportDefinition newImport = AdlFactory.eINSTANCE.createImportDefinition();
						newImport.setImportName(eImport.getImportName());
						newImport.setMerged(true);
						importsToAdd.add(newImport);
					}
				}
				targetDefinition.getImports().addAll(importsToAdd);
			}
		}
	}

	protected void mergeElements(EObject objectToMerge, EObject mergedObject) {

		for(EStructuralFeature feature : objectToMerge.eClass().getEAllContainments())
		{
			if(mergedObject.eClass().getEAllContainments().contains(feature))
				checkReference(objectToMerge.eGet(feature), mergedObject.eGet(feature));
		} 
	}

	@SuppressWarnings("unchecked")
	private void checkReference(Object sourceObject, Object targetObject) {

		if (sourceObject instanceof EList<?>) {
			EList<EObject> contentList = (EList<EObject>) sourceObject;
			EList<EObject> contentReceivingList = (EList<EObject>) targetObject;
			checkReferenceList(contentList, contentReceivingList);
		}

		if (sourceObject instanceof MergedObject) {
			MergedObject content = (MergedObject) sourceObject;
			MergedObject contentReceiving = (MergedObject) targetObject;
			if(haveSameName(content, contentReceiving) && contentReceiving.isMerged()==false)
			{
				contentReceiving.setMerged(true);
				contentReceiving.setOverride(true);
			}
			else if(contentReceiving.isMerged()!=true) copyFeatures(content, contentReceiving);
			eObjectsMergeHistoryMapping.put(content, contentReceiving);

		}
	}

	private void checkReferenceList(EList<EObject> contentList,
			EList<EObject> contentReceivingList) {
		for (EObject sourceObject : contentList) {
			boolean doMerge=true;
			if (sourceObject instanceof TemplateSubComponent)
			{
				doMerge=false;
				TemplateSubComponent templateSubComponent = (TemplateSubComponent)sourceObject;
				doMerge = resolveTemplate(templateSubComponent,contentReceivingList);
			}
			if(sourceObject instanceof MergedObject && doMerge)
			{
				EObject targetObject = findObjectWithSameNameInList(sourceObject,
						contentReceivingList,true);
				if (targetObject == null) {
					targetObject = createEObject(sourceObject
							.eClass());
					copyFeatures(sourceObject, targetObject);
					contentReceivingList.add(targetObject);
					eObjectsMergeHistoryMapping.put(sourceObject, targetObject);
				}
				else 
				{
					((MergedObject)targetObject).setOverride(true);
					((MergedObject)targetObject).setMerged(true);
				}
			}
		}
	}
	
	private boolean resolveTemplate(
			TemplateSubComponent templateSubComponent, EList<EObject> contentReceivingList) {

		if(templateSubComponent.getTemplateReference()!=null)
		{
			String templateName = templateSubComponent.getTemplateReference().getName();
			MergedObject tmpObject = (MergedObject) findObjectWithSameNameInList(templateSubComponent, contentReceivingList,false);
			
			if(tmpObject!=null)
			{
				if(!tmpObject.isMerged())
				{
					tmpObject.setMerged(true);
					tmpObject.setOverride(true);
				}
				return false;
			}
			else if(templates.containsKey(templateName))
			{
				ArchitectureDefinition templateObjectCreation = null;
				if(templates.get(templateName) instanceof CompositeComponentDefinition)
				{
					templateObjectCreation = adlFactory.createCompositeAnonymousSubComponent();
				}
				else if(templates.get(templateName) instanceof PrimitiveComponentDefinition)
				{
					templateObjectCreation = adlFactory.createPrimitiveAnonymousSubComponent();							
				}
				if(templateObjectCreation!=null)
				{
					templateObjectCreation.setName(templateSubComponent.getName());
					mergeElements(templates.get(templateName), templateObjectCreation);
					contentReceivingList.add(templateObjectCreation);
					((MergedObject)templateObjectCreation).setMerged(true);
					return false;
				} 
			}
		}
		return true;
	}

	private void copyFeatures(EObject sourceObject, EObject targetObject) {
	
		for (EAttribute attribute : sourceObject.eClass().getEAllAttributes()) {
				if ((!targetObject.eIsSet(attribute) || targetObject.eGet(attribute) == null) 
						&& sourceObject.eGet(attribute) != null && !AdlPackage.eINSTANCE.getMergedObject().getEAllAttributes().contains(attribute)) {
					targetObject.eSet(attribute, sourceObject.eGet(attribute));
				} 
		}
		for (EReference reference : sourceObject.eClass().getEAllContainments()) {
			if (targetObject.eGet(reference) == null || !targetObject.eIsSet(reference)) {
				if (sourceObject.eGet(reference) != null && sourceObject.eIsSet(reference)) 
				{
					if(!(sourceObject.eGet(reference) instanceof EList<?>))
					{
						EObject newObject = createEObject(((EObject) sourceObject.eGet(reference))
									.eClass());
						targetObject.eSet(reference, newObject);
					}
				}
			}
			checkReference(sourceObject.eGet(reference), targetObject
					.eGet(reference));
		}
		for (EReference reference : sourceObject.eClass().getEAllReferences()) {
			if (!reference.isContainer() && !reference.isContainment() ) {
				if (!targetObject.eIsSet(reference)
						&& sourceObject.eIsSet(reference)) {
					referencesToResolve.put(sourceObject, targetObject);
				}
			}
		}
		if(targetObject instanceof MergedObject)
		{
			((MergedObject) targetObject).setMerged(true);
		}
	
	}

	// This function prepares a definition by loading it from his name and
	// calculating all its mains definition references
	private ArchitectureDefinition prepareDefinitionForMerge(
			ArchitectureDefinition definitionToMergeWith, String definitionCall,ArrayList<String> importsList) {
		// Try to load definition, return null if fails
		ArchitectureDefinition mergedDefinition = null;
		 mergedDefinition = definitionLoader
				.loadDefinition(definitionCall,importsList);
		if (mergedDefinition == null)
			return null;

		// Before calculating full merge, check if loaded definition is
		// compatible
		if (definitionToMergeWith != null
				&& !canMerge(mergedDefinition, definitionToMergeWith)) {
			return null;
		}
		// If main definition has references, resolves merges.
		ArrayList<String> referencesList = getReferencesList(mergedDefinition);
		if (referencesList != null && referencesList.size() > 0) {
			fullMerge(mergedDefinition, referencesList);
		}
		return mergedDefinition;
	}


	private ArrayList<String> recoverImports(
			ArchitectureDefinition definition) {
		ArrayList<String> importsList = new ArrayList<String>();
		EObject tmpAdlDefinition = definition;
		while(tmpAdlDefinition!=null && !(tmpAdlDefinition instanceof AdlDefinition))
		{
			tmpAdlDefinition=tmpAdlDefinition.eContainer();
		}
		if(tmpAdlDefinition!=null )
		{
			AdlDefinition adlDefinition = (AdlDefinition) tmpAdlDefinition;
			for(ImportDefinition currentImport : adlDefinition.getImports())
				{
					if(!currentImport.isMerged())importsList.add(currentImport.getImportName());
				}
		}
		return importsList;
	}

	protected boolean canMerge(ArchitectureDefinition mergedComponent,
			ArchitectureDefinition componentToMerge) {

		int componentType = findComponentType(mergedComponent);
		int componentToMergeType = findComponentType(componentToMerge);
		switch (componentToMergeType) {
		case AdlPackage.COMPOSITE_COMPONENT_DEFINITION:
			if (componentType == AdlPackage.COMPOSITE_SUB_COMPONENT
					|| componentType == AdlPackage.COMPOSITE_COMPONENT_DEFINITION
					|| componentType == AdlPackage.COMPOSITE_ANONYMOUS_SUB_COMPONENT) {
				return true;
			}
			break;
		case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION:
			if (componentType == AdlPackage.PRIMITIVE_SUB_COMPONENT
					|| componentType == AdlPackage.PRIMITIVE_COMPONENT_DEFINITION
					|| componentType == AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT) {
				return true;
			}
			break;
		case AdlPackage.COMPONENT_TYPE_DEFINITION:
			return true;
		}
		return false;
	}

	public int findComponentType(EObject component) {
		if (component instanceof CompositeAnonymousSubComponent) {
			return AdlPackage.COMPOSITE_SUB_COMPONENT;
		}
		if (component instanceof PrimitiveAnonymousSubComponent) {
			return AdlPackage.PRIMITIVE_SUB_COMPONENT;
		}
		if (component instanceof TemplateSubComponent) {
			return AdlPackage.TEMPLATE_SUB_COMPONENT;
		}
		if (component instanceof ComponentTypeDefinition) {
			return AdlPackage.COMPONENT_TYPE_DEFINITION;
		}		
		if (component instanceof PrimitiveComponentDefinition) {
			return AdlPackage.PRIMITIVE_COMPONENT_DEFINITION;
		}
		if (component instanceof CompositeComponentDefinition) {
			return AdlPackage.COMPOSITE_COMPONENT_DEFINITION;
		}
		return -1;
	}

	public boolean isValidDefinitionForMerge(
			ArchitectureDefinition MainComponent, String DefinitionCallToCheck) {
		if (DefinitionCallToCheck == null || DefinitionCallToCheck == "")
			return false;
		ArrayList<String> importsList = new ArrayList<String>();
		importsList = recoverImports(MainComponent);
		ArchitectureDefinition DefinitionToCheck = definitionLoader
				.loadDefinition(DefinitionCallToCheck,importsList);
		if (DefinitionToCheck == null
				|| !canMerge(MainComponent, DefinitionToCheck)) {
			definitionLoader.unloadDefinition(DefinitionCallToCheck);
			return false;
		}
		definitionLoader.unloadDefinition(DefinitionCallToCheck);
		return true;
	}

public void updateSubComponentReferences(ArchitectureDefinition definition)
{
	System.out.println("*** Updating subcomponents of definition " + definition.getName() + " ***");
	Iterator<Element> treeIterator =  definition.getElements().iterator();
	while(treeIterator.hasNext())
	{
		EObject current = treeIterator.next();
		if(current instanceof SubComponentDefinition && current!=definition && !(current instanceof TemplateSubComponent))
		{
			EStructuralFeature feature=null;
			ComponentReference reference = null;
			for(EStructuralFeature tmpFeature : current.eClass().getEAllContainments())
			{
				if(ComponentReference.class.isAssignableFrom(tmpFeature.getEType().getInstanceClass()))
					{
						feature = tmpFeature;
						reference = (ComponentReference)current.eGet(feature);
					}
			}
			if(reference!=null && reference.getReferenceName()!="" && !reference.getReferenceName().equals(adlPackage.getComponentReference_ReferenceName().getDefaultValueLiteral()))
			{
				ArrayList<String> references = new ArrayList<String>();
				references.add(reference.getReferenceName());
				System.out.println("    SubComponent found : " + ((ArchitectureDefinition)current).getName());
				fullMerge((ArchitectureDefinition)current, references);
				System.out.println("    Finished updating " + ((ArchitectureDefinition)current).getName());
			}
			updateSubComponentReferences((ArchitectureDefinition) current);
		}
		else if(current instanceof TemplateSubComponent)
		{
			TemplateSubComponentCustomImpl templateComponent = (TemplateSubComponentCustomImpl)current;
			TemplateSpecifier templateSpecifier = templateComponent.getTemplateReference();
			System.out.println("				Template SubComponent found : " + templateComponent.getName());
			if(templateSpecifier!=null)
			{
				if(!templateSpecifier.getName().equals(adlPackage.getTemplateSpecifier_Name().getDefaultValueLiteral()) && !templateSpecifier.getComponentTypeName().equals(adlPackage.getTemplateSpecifier_ComponentTypeName().getDefaultValueLiteral()))
				{ 
					System.out.println("				-> Associated with template specifier " + templateSpecifier.getName() + " and type component " + templateSpecifier.getComponentTypeName());
					ArrayList<String> references = new ArrayList<String>();
					references.add(templateSpecifier.getComponentTypeName());
					ArchitectureDefinitionHelper helper = templateComponent.getHelper();
					templateComponent.setActiveDefinitionCallsList(references);
					helper.merge(references);
				}
				else System.out.println("				!! Template specifier not defined");
			}
			else System.out.println("				!! Template specifier not defined");
		}
	}
	System.out.println("*** Finished update of definition " + definition.getName() + " ***");
}

public void updateDefinitionFromBuffer(ArchitectureDefinition definition)
{
	if(definition!=null)buffer.updateDefinitionFromBuffer(definition);
}


}
