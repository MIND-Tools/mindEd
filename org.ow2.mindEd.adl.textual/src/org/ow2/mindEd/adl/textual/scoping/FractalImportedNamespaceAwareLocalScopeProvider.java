package org.ow2.mindEd.adl.textual.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;
import org.ow2.mindEd.adl.textual.fractal.BindingDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeSuperType;
import org.ow2.mindEd.adl.textual.fractal.CompositeSuperTypeDefinition;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperType;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperTypeDefinition;
import org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition;
import org.ow2.mindEd.adl.textual.fractal.TypeDefinition;

import com.google.inject.Inject;

public class FractalImportedNamespaceAwareLocalScopeProvider extends
ImportedNamespaceAwareLocalScopeProvider {

	/*
	 * SSZ:
	 * 
	 * This code is used to override the standard 'package' definition behavior,
	 * as in Mind we use "composite org.some.package.CompDef { ... }"
	 * "inlined" declarations instead of separate keywords.
	 * 
	 * As Xtext includes its own resolution mechanism for URI-based content,
	 * we use the solution described here:
	 * 
	 * http://www.eclipse.org/forums/index.php?t=rview&goto=894828#msg_894828
	 */

	@Inject IQualifiedNameConverter qualifiedNameConverter;

	//@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(
			EObject context, boolean ignoreCase) {

		List<ImportNormalizer> result = new ArrayList<ImportNormalizer>();
		result.addAll(super.internalGetImportedNamespaceResolvers(context, ignoreCase));
		
		if ((context instanceof ArchitectureDefinition) && (((ArchitectureDefinition) context).getName() != null)) {
			// Consider non-qualified names of a qualified-name ArchitectureDefinition (CompositeDefinition, Primitive, Type...)
			// as resolvable in the same package (host.definition.package.*)

			// The check for null is in the case of anonymous definitions (for sub-components)
			// see http://mind.ow2.org/mindc/mindc-user-guide.html#adl-anonym for more info
			
			// Named definition
			result.add(createImportedNamespaceResolver(
					qualifiedNameConverter.toString(
							getQualifiedNameProvider().getFullyQualifiedName(context).skipLast(1)) 
							+ ".*",
							ignoreCase));
		} else if (context instanceof BindingDefinition) {
			// Inherited subcomponents resolution: include parents scope to the local scope
			EObject container = context;
			while (!(container instanceof CompositeDefinition))
				container = container.eContainer();

			EList<EObject> superTypes = resolveCompositeDefinitionSuperTypes((CompositeDefinition) container);
			for (EObject currentSuperType : superTypes) {
				result.add(createImportedNamespaceResolver(
						qualifiedNameConverter.toString(
								getQualifiedNameProvider().getFullyQualifiedName(currentSuperType)) 
								+ ".*",
								ignoreCase));
				//System.out.println("[FractalImportedNamespaceAwareLocalScopeProvider] Qualified name converter: " + qualifiedNameConverter.toString(getQualifiedNameProvider().getFullyQualifiedName(currentSuperType)) + ".*");
			}
		}

		return result;

	}

	private EList<EObject> resolveCompositeDefinitionSuperTypes(CompositeDefinition archDef) {
		EList<EObject> superTypes = new BasicEList<EObject>();

		// Build the list of superTypes
		EList<CompositeSuperType> refinedSuperTypes = ((CompositeDefinition) archDef).getSuperTypes();
		for (CompositeSuperType currentSuperType : refinedSuperTypes) {
			CompositeSuperTypeDefinition targetArchDef = currentSuperType.getTargetArchDef();
			if (targetArchDef instanceof CompositeDefinition) {
				superTypes.add((CompositeDefinition) targetArchDef);
				// A composite can inherit of another composite, meaning more possible sub-components
				// that we need to resolve: go recursive !
				superTypes.addAll(resolveCompositeDefinitionSuperTypes((CompositeDefinition) targetArchDef));
			} else if (targetArchDef instanceof TypeDefinition)
				superTypes.add((TypeDefinition) targetArchDef);
			// else error
		}

		return superTypes;
	}

}
