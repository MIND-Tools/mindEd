package org.ow2.mindEd.adl.textual.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.validation.Check;
import org.ow2.mindEd.adl.textual.fractal.AdlDefinition;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeElement;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveElement;
import org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition;
import org.ow2.mindEd.adl.textual.fractal.TypeDefinition;
import org.ow2.mindEd.adl.textual.fractal.impl.AdlDefinitionImpl;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;

import com.google.inject.Inject;


public class FractalJavaValidator extends AbstractFractalJavaValidator {

	// Quick fix codes
	public static final String UNKNOWN_IMPORT = "org.ow2.fractal.mind.xtext.validation.unknown_import";
	public static final String UNKNOWN_TEMPLATE_SPECIFIER_TYPE = "org.ow2.fractal.mind.xtext.validation.unknown_template_specifier_type";
	public static final String DUPLICATE_DEFINITION_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_definition_name";
	public static final String DUPLICATE_FORMAL_ARGUMENT_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_formal_argument_name";
	public static final String DUPLICATE_TEMPLATE_SPECIFIER_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_template_specifier_name";
	public static final String DUPLICATE_INTERFACE_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_interface_name";
	public static final String UNKNOWN_INTERFACE = "org.ow2.fractal.mind.xtext.validation.unknown_interface";
	public static final String UNKNOWN_SOURCE_FILE = "org.ow2.fractal.mind.xtext.validation.unknown_source";

	public final static String WRONG_NAME = "org.ow2.mindEd.adl.editor.textual.validation.wrong_name";
	public final static String NOT_IN_SRC_PATH = "org.ow2.mindEd.adl.editor.textual.validation.not_in_src_path";

	@Inject
	IContainer.Manager containerManager;

	@Inject
	ResourceDescriptionsProvider resourceDescriptionsProvider;

	@Check
	public void checkAdlSimpleName(ArchitectureDefinition archDef) {

		// Protect method
		if (archDef instanceof SubComponentDefinition)
			return;

		String simpleName = archDef.getName();

		// anonymous component
		if (simpleName == null)
			return;

		String expectedName = FractalJavaValidator.getExpectedComponentName(archDef); 

		if (expectedName == null) {
			warning("definition not in source path",
					FractalPackage.Literals.TYPE_REFERENCE__NAME,
					FractalPackage.ARCHITECTURE_DEFINITION,
					FractalJavaValidator.NOT_IN_SRC_PATH);
			return;
		} else if (! simpleName.equals(expectedName)) {
			warning("definition should be named : " + expectedName,
					FractalPackage.Literals.TYPE_REFERENCE__NAME,
					FractalPackage.ARCHITECTURE_DEFINITION,
					FractalJavaValidator.WRONG_NAME);
			return;
		}

	}	

	// Utils
	public static String getExpectedComponentName(ArchitectureDefinition archDef){

		if (!(archDef.eContainer() instanceof AdlDefinition))
			return null;

		AdlDefinitionImpl adlFile = (AdlDefinitionImpl) archDef.eContainer();
		URI uri = adlFile.eDirectResource().getURI();

		String expectedName = null;

		// TODO: Clean this ; to do this, we must disable Xtext's parsing/handling of the files that AREN'T in our path entries !
		try {
			expectedName = ModelToProjectUtil.INSTANCE.getCurrentFQN(uri);
		} catch (IllegalArgumentException e) {
			expectedName = null;  
		}
		return expectedName;
	}

	/**
	 * Behavior inspired by 
	 * http://www.eclipse.org/forums/index.php/mv/msg/261440/754503/#msg_754503
	 * and
	 * http://www.eclipse.org/forums/index.php/mv/msg/267004/766678/
	 * 
	 * TODO: FIXME !!!!! DOESNT WORK WELL
	 * RE-DO THE SAME AS THE SECOND LINK !
	 */
	@Check
	public void checkDefinitionNameIsUnique(ArchitectureDefinition archDef) {
		
		//System.out.println("[SSZ Dirty Debug] FractalJavaValidator#checkDefinitionNameIsUnique - Base archDef: " + archDef.getName());
		
		IResourceDescriptions resourceDescriptions = resourceDescriptionsProvider.getResourceDescriptions(archDef.eResource());
		IResourceDescription resourceDescription = resourceDescriptions.getResourceDescription(archDef.eResource().getURI());
		for (IContainer c : containerManager.getVisibleContainers(resourceDescription, resourceDescriptions)) {
			for (IEObjectDescription od : c.getExportedObjectsByType(FractalPackage.Literals.ARCHITECTURE_DEFINITION)) {
				//System.out.println("[SSZ Dirty Debug] FractalJavaValidator#checkDefinitionNameIsUnique - Current EODesc QN: " + od.getQualifiedName());
				if (od.getQualifiedName().toString().equals(archDef.getName())) {
					if (!od.getEObjectURI().trimFragment().equals(archDef.eResource().getURI()))
						error("duplicate definition in file " + od.getEObjectURI().trimFragment().toPlatformString(true), FractalPackage.Literals.TYPE_REFERENCE__NAME, FractalJavaValidator.DUPLICATE_DEFINITION_NAME);
				}
			}
		}
	}

	@Check
	public void checkSubComponentNameIsUnique(SubComponentDefinition subCompDef) {
		CompositeDefinition parentCompositeDef = (CompositeDefinition) subCompDef.eContainer();

		// TODO: handle super types and inheritance !
		EList<CompositeElement> elements = parentCompositeDef.getElements();
		for(CompositeElement element: elements) {
			if ((element != subCompDef) && (element instanceof SubComponentDefinition))
				if (subCompDef.getName().equals(((SubComponentDefinition) element).getName())) {
					error("Sub-component names have to be unique",
							FractalPackage.Literals.SUB_COMPONENT_DEFINITION__NAME);
					return;
				}
		}
	}

	@Check
	public void checkHostedInterfaceIsUnique(HostedInterfaceDefinition itfDef) {

		EObject container = itfDef.eContainer();

		if (container instanceof PrimitiveDefinition)
			checkHostedInterfaceIsUniqueInPrimitive((PrimitiveDefinition) container, itfDef);
		else if (container instanceof CompositeDefinition)
			checkHostedInterfaceIsUniqueInComposite((CompositeDefinition) container, itfDef);
		else if (container instanceof TypeDefinition)
			checkHostedInterfaceIsUniqueInType((TypeDefinition) container, itfDef);
		// else... nothing
	}

	private void checkHostedInterfaceIsUniqueInPrimitive(PrimitiveDefinition compDef, HostedInterfaceDefinition itfDef) {
		// TODO: handle super types and inheritance !
		EList<PrimitiveElement> elements = compDef.getElements();
		for(PrimitiveElement element: elements) {
			if ((element != itfDef) && (element instanceof HostedInterfaceDefinition))
				if (itfDef.getName().equals(((HostedInterfaceDefinition) element).getName())) {
					error("Interface names have to be unique",
							FractalPackage.Literals.HOSTED_INTERFACE_DEFINITION__NAME);
					return;
				}
		}
	}

	private void checkHostedInterfaceIsUniqueInComposite(CompositeDefinition compDef, HostedInterfaceDefinition itfDef) {
		// TODO: handle super types and inheritance !
		EList<CompositeElement> elements = compDef.getElements();
		for(CompositeElement element: elements) {
			if ((element != itfDef) && (element instanceof HostedInterfaceDefinition))
				if (itfDef.getName().equals(((HostedInterfaceDefinition) element).getName())) {
					error("Interface names have to be unique",
							FractalPackage.Literals.HOSTED_INTERFACE_DEFINITION__NAME);
					return;
				}
		}
	}

	private void checkHostedInterfaceIsUniqueInType(TypeDefinition compDef, HostedInterfaceDefinition itfDef) {
		// TODO: handle super types and inheritance !
		EList<HostedInterfaceDefinition> elements = compDef.getElements();
		for(HostedInterfaceDefinition element: elements) {
			if (element != itfDef)
				if (itfDef.getName().equals(element.getName())) {
					error("Interface names have to be unique",
							FractalPackage.Literals.HOSTED_INTERFACE_DEFINITION__NAME);
					return;
				}
		}
	}

	/**
	 * Check Cycles in definition references
	 */
	@Check
	public void checkCyclesInDefinitionReferences(SubComponentDefinition subCompDef) {
		// Get the parent
		EObject container = subCompDef.eContainer();
		while (!(container instanceof CompositeDefinition))
			container = container.eContainer();
		if (subCompDef.getType() instanceof CompositeDefinition) {
			if (((CompositeDefinition) subCompDef.getType()).equals((CompositeDefinition) container))
				error("Cycle in definition references", FractalPackage.Literals.SUB_COMPONENT_DEFINITION__TYPE);
		}

	}

}
