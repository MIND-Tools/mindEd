package adl.custom.util;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.ow2.fractal.mind.ide.ModelToProjectUtil;

import adl.AdlDefinition;
import adl.AdlFactory;
import adl.AdlPackage;
import adl.ArchitectureDefinition;


public class DefinitionLoaderUtil {
	protected ComposedAdapterFactory adapterFactory;
	protected static AdlPackage adlPackage = AdlPackage.eINSTANCE;
	protected static AdlFactory adlFactory = adlPackage.getAdlFactory();
	private static ResourceSet rs= new ResourceSetImpl();
	public static DefinitionLoaderUtil INSTANCE = new DefinitionLoaderUtil();

	private HashMap<String,URI> loadedDefinitions = new HashMap<String,URI>();
	
	public DefinitionLoaderUtil() {
	}

	public ArchitectureDefinition loadDefinition(String definitionCall, ArrayList<String> importsList) 
	{
		System.out.println("\n			>>>>>> Loading request : " + definitionCall + " <<<<<<<");
		definitionCall = definitionCall.trim();
		if(definitionCall==null || definitionCall=="") return null;
		String definitionCallName;
		ArchitectureDefinition definition = null;
		definitionCallName = definitionCall;

		for (Resource resource : rs.getResources())
		{
			definition = getResourceDefinition(resource);
			if(definition!=null)
			{
				if(definitionCallName.equalsIgnoreCase(definition.getName()))
					{
						System.out.println("			[SUCCESS] Definition " + definition.getName() + " already loaded");
						return definition;
					}
			}
		}
		definition = null;
		URI resourceURI = getResourcePath(definitionCall, importsList);
		if (resourceURI != null) {
			addLoadedDefinition(definitionCall, resourceURI);
		}
		Resource resource = null;
		if(resourceURI!=null)
		{
			try
			{
				resource=rs.getResource(resourceURI, true);

			}
			catch(Exception exception)
			{
				System.err.format("			[ERROR] Impossible to find resource " + resourceURI.path() + ". Please, check imports.\n\n");
				unloadDefinition(definitionCall);
				exception = null;
				return null;
			}
			finally{}
			definition = getResourceDefinition(resource);
			if(definition!=null)System.out.println("			>>>>>> [SUCCESS] Load successfully done : " + definition.getName() + " <<<<<<<\n");
		}
		return definition;
	}
	
	public void unloadDefinition (String definitionCall)
	{
		System.out.println("			>>>>>> Unloading request : " + definitionCall + " <<<<<<<");
		if(definitionCall!=null && definitionCall!="")
		{
			URI resourceURI = getLoadedDefinitionURI(definitionCall);
			for(Resource res : rs.getResources())  
			{
				if(res.getURI() == resourceURI)
				{
					res.getErrors().clear();
					rs.getResources().remove(res);
					removeLoadedDefinition(definitionCall);
					System.out.println("			>>>>>> [SUCCESS] Resource " + definitionCall + " successfully unloaded <<<<<<<");
					return;
				}
			}
		}
		System.out.println("			>>>>>> [ERROR] Resource to unload not found : " + definitionCall + " <<<<<<<");
	}
	
	public URI getResourcePath(String definitionCall, ArrayList<String> importsList) 
	{
		URI resourceURI = ModelToProjectUtil.INSTANCE.resolveAdl(definitionCall, importsList);
		return resourceURI;
	}

	public URI getLoadedDefinitionURI (String definitionName) {
		return (URI) loadedDefinitions.get(definitionName); 		
	}
	
	private void addLoadedDefinition (String definitionName, URI definitionURI) {
		 loadedDefinitions.put(definitionName, definitionURI);
	}
	
	private void removeLoadedDefinition (String definitionName) {
		loadedDefinitions.remove(definitionName);
	}

	private ArchitectureDefinition getResourceDefinition(Resource resource) {
		for(EObject object : resource.getContents())
		{
			if(object instanceof AdlDefinition)
			{
				AdlDefinition adldefinition = (AdlDefinition)object;
				return adldefinition.getArchitecturedefinition();
			}
		}
		return null;
	}
}
