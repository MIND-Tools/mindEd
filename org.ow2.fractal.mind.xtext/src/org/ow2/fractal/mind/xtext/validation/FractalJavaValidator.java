package org.ow2.fractal.mind.xtext.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;
import org.ow2.fractal.mind.ide.MindModelManager;
import org.ow2.fractal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.xtext.util.FractalUtil;

import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.Element;
import adl.FormalArgument;
import adl.ImportDefinition;
import adl.InterfaceDefinition;
import adl.TemplateSpecifier;

import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;

/**
 * Provides validation for mind adl textual editor
 * 
 * @author Damien Fournier
 * @contributor Rémi Mélisson
 * 
 */

public class FractalJavaValidator extends AbstractFractalJavaValidator {

	// Reference on the project model
	private MindModelManager mindModel = MindModelManager.getMindModelManager();

	
	/**
	 * Register Mind Adl Package
	 * 
	 * @see org.ow2.fractal.mind.xtext.validation.AbstractFractalJavaValidator#getEPackages()
	 */

	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = (List<EPackage>) super.getEPackages();
		result.add(AdlPackage.eINSTANCE);
		return result;
	}

	
	/**
	 * Check for duplicate component names
	 * 
	 * @param definition
	 */

	@Check
	public void duplicateNames(ArchitectureDefinition definition) {

		// Keep reference for current Architecture Definition
		ArchitectureDefinition sourceDefinition = definition;

		// Name of current Architecture Definition
		String definitionName = definition.getName();

		if (definition.eContainer() instanceof ArchitectureDefinition) {

			// Retrieve container
			definition = (ArchitectureDefinition) definition.eContainer();

			// Get sub elements
			for (Element element : definition.getElements()) {

				// Check found Architecture Definition names
				if (element instanceof ArchitectureDefinition) {
					ArchitectureDefinition elt = (ArchitectureDefinition) element;
					if ((elt.getName().equals(definitionName))
							&& (elt != sourceDefinition))
						error("Duplicate component names : " + definitionName,
								AdlPackage.ARCHITECTURE_DEFINITION__NAME);

				}
			}
		}
	}

	/**
	 * Check for packages definition which not exist
	 * 
	 * @param import definition to be test
	 */

	@Check
	public void existImport(ImportDefinition importDefinition) {

		// first we create a list of packages and components names (fully qualified)
		ArrayList<String> fullList = new ArrayList<String>();

		Map<String, List<MindPackage>> packages = mindModel.getMindModel()
				.getAllPackages();

		Collection<? extends MindAdl> c = mindModel.getMindModel()
				.getAllComponents();

		for (MindAdl mindAdl : c) {
			fullList.add(mindAdl.getQualifiedName());
		}

		fullList.addAll(packages.keySet());

		// Verify if importDefinition name is contained into this list
		
		String name = FractalUtil.getImportPackageName(importDefinition);

		if (!fullList.contains(name))
			warning("Package '" + name + "' does not exist",
					AdlPackage.IMPORT_DEFINITION);
	}

	
	/**
	 * Check for unique template specifier name. 
	 * 
	 * @param Template specifier to be test
	 * 
	 */

	@Check
	public void checkTemplateSpecifierName(
			TemplateSpecifier templateSpecifier) {

		// a local set for stock names
		Multiset<String> multiset = new TreeMultiset<String>();

		// container of the named element
		EObject eContainer = (EObject) templateSpecifier.eContainer();

		String name;
		for (EObject e : eContainer.eContents()) {
			name = ((TemplateSpecifier) e).getName();
			multiset.add(name);
		}

		// number of element with the given name into the container
		int n = multiset.count(templateSpecifier.getName());

		if (n > 1) {
			error("Duplicate template specifier name.",
					AdlPackage.TEMPLATE_SPECIFIER__NAME);
		}

	}

	
	/**
	 * Check for unique formal argument name.
	 * 
	 * @param Formal argument to be test
	 * 
	 */

	@Check
	public void duplicateFormalArgumentName(FormalArgument formalArgument) {

		// a local set for stock names
		Multiset<String> multiset = new TreeMultiset<String>();

		// container of the named element
		EObject eContainer = (EObject) formalArgument.eContainer();

		String name;
		for (EObject e : eContainer.eContents()) {
			name = ((FormalArgument) e).getName();
			multiset.add(name);
		}

		// number of element with the given name into the container
		int n = multiset.count(formalArgument.getName());

		if (n > 1) {
			error("Duplicate formal argument name.",
					AdlPackage.FORMAL_ARGUMENT__NAME);
		}
	}
	
	
	/**
	 * Check for unique interface name.
	 * 
	 * @param Role to be test
	 * 
	 */
	
	@Check
	public void duplicateInterfaceName(InterfaceDefinition interfaceDefinition) {
		// a local set for stock names
		Multiset<String> multiset = new TreeMultiset<String>();

		// container of the named element
		EObject eContainer = (EObject) interfaceDefinition.eContainer();

		String name;
		for (EObject e : eContainer.eContents()) {
			// we assert that we iterate over an interface definition  
			if (e instanceof InterfaceDefinition){
				name = ((InterfaceDefinition) e).getName();
				multiset.add(name);
			}
		}

		// number of element with the given name into the container 
		int n = multiset.count(interfaceDefinition.getName());

		if (n > 1) {
			error("Duplicate interface name.",
					AdlPackage.INTERFACE_DEFINITION__NAME);
		}
	}
	
	/**
	 * Check if the interface signature exist
	 * 
	 * @param interfaceDefinition
	 */
	@Check
	public void existingInterfaceSignature(InterfaceDefinition interfaceDefinition){
		
		//ModelToProjectUtil m2p = ModelToProjectUtil.INSTANCE;
		
		// Get the idl files using mind path
				
		// assert signature is available
				
		// warning if not
		
		return;
	}	
	
	/**
	 * Check if component type of template specifier exists
	 * 
	 * @param TemplateSpecifier 
	 */
	@Check
	public void existingTemplateSpecifierComponentType(TemplateSpecifier templateSpecifier){
		ArrayList<String> list = new ArrayList<String>();
		String type = templateSpecifier.getReference().getNameFQN();
		
		Collection<? extends MindAdl> c = mindModel.getMindModel().getAllComponents();
				
		for (MindAdl mindAdl : c) {
			//if (mindAdl.getKind().equals(ComponentKind.TYPE)){
				list.add(mindAdl.getQualifiedName());
			//}			
		}
		
		if (!list.contains(type)){
			error("Unknown template specifier type", AdlPackage.TEMPLATE_SPECIFIER__REFERENCE);
		}
	}
	
	
}
