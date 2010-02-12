package org.ow2.fractal.mind.xtext.quickfix;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.xtext.ui.core.editor.quickfix.AbstractDeclarativeQuickfixProvider;
import org.eclipse.xtext.ui.core.editor.quickfix.Fix;
import org.eclipse.xtext.validation.IssueContext;
import org.ow2.fractal.mind.xtext.validation.FractalJavaValidator;

import adl.ArchitectureDefinition;
import adl.FormalArgument;
import adl.ImportDefinition;
import adl.InterfaceDefinition;
import adl.TemplateSpecifier;

/**
 * Provides quick fix for mind adl textual editor
 * 
 * @author Rémi Mélisson
 * 
 */
public class FractalQuickfixProvider extends AbstractDeclarativeQuickfixProvider {
		
	/**
	 * fix unknown import : delete it
	 * 
	 * @param importDefinition
	 * @param issueContext
	 */
	
	@Fix(code = FractalJavaValidator.UNKNOWN_IMPORT, label = "Remove unknown import.", description = "Remove this unavailable package.")
	public void fixImport(ImportDefinition importDefinition, IssueContext issueContext) {
		EcoreUtil.delete(importDefinition);
		return;
	}
	
	
	/**
	 * fix unknown template specifier type: delete it
	 * 
	 * @param importDefinition
	 * @param issueContext
	 */
	@Fix(code = FractalJavaValidator.UNKNOWN_TEMPLATE_SPECIFIER_TYPE, label = "Remove unknown template specifier type.", description = "Remove this unavailable template specifier.")
	public void fixTemplateSpecifierType(TemplateSpecifier templateSpecifier, IssueContext issueContext) {
		EcoreUtil.delete(templateSpecifier);
		return;
	}
	
	/**
	 * fix duplicate component name
	 * 
	 * @param adl
	 * @param issueContext
	 */
	@Fix(code = FractalJavaValidator.DUPLICATE_COMPONENT_NAME , label="Rename component", description = "Change this name in order to make it unique.")
	public void fixDuplicateName(ArchitectureDefinition adl, IssueContext issueContext){
		adl.setName(adl.getName() + "1");		
		return;
	}
	
	/**
	 * fix duplicate template specifier name
	 * 
	 * @param adl
	 * @param issueContext
	 */
	@Fix(code = FractalJavaValidator.DUPLICATE_TEMPLATE_SPECIFIER_NAME , label="Rename template specifier", description = "Change this name in order to make it unique.")
	public void fixDuplicateTemplateSpecifierName(TemplateSpecifier templateSpecifier, IssueContext issueContext){
		templateSpecifier.setName(templateSpecifier.getName() + "1");
		return;
	}
	
	/**
	 * fix duplicate formal argument name
	 * 
	 * @param adl
	 * @param issueContext
	 */
	@Fix(code = FractalJavaValidator.DUPLICATE_FORMAL_ARGUMENT_NAME, label="Rename formal argument", description = "Change this name in order to make it unique.")
	public void fixDuplicateFormalArgumentName(FormalArgument formalArgument, IssueContext issueContext){
		formalArgument.setName(formalArgument.getName() + "1");
		return;
	}
	
	/**
	 * fix duplicate interface name
	 * 
	 * @param adl
	 * @param issueContext
	 */
	@Fix(code = FractalJavaValidator.DUPLICATE_INTERFACE_NAME, label="Rename interface", description = "Change this name in order to make it unique.")
	public void fixDuplicateInterfaceName(InterfaceDefinition interfaceDefinition, IssueContext issueContext){
		interfaceDefinition.setName(interfaceDefinition.getName() + "1");
		return;
	}
}
