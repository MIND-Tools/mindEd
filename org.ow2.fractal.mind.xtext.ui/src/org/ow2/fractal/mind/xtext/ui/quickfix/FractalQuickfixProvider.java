package org.ow2.fractal.mind.xtext.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.ow2.fractal.mind.xtext.validation.FractalJavaValidator;

import adl.ArgumentDefinition;
import adl.ComponentReference;
import adl.FormalArgument;
import adl.ImportDefinition;
import adl.InterfaceDefinition;
import adl.TemplateSpecifier;

public class FractalQuickfixProvider extends DefaultQuickfixProvider {

	/*
	 * Renaming quickfixes
	 */
	
	@Fix(FractalJavaValidator.DUPLICATE_INTERFACE_NAME)
	public void renameInterface(final Issue issue,
			IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Rename",
				"Rename this interface", null,
				new ISemanticModification() {
					public void apply(EObject element,
							IModificationContext context) throws Exception {

						if (element instanceof InterfaceDefinition) {
							InterfaceDefinition interfaceDefinition = (InterfaceDefinition) element;
							String name = interfaceDefinition.getName();
							
							interfaceDefinition.setName(rename(name));
						}

					}
				});
	}
	
	@Fix(FractalJavaValidator.DUPLICATE_FORMAL_ARGUMENT_NAME)
	public void renameArgument(final Issue issue, 
			IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Rename",
				"Rename this duplicate argument.", null,
				new ISemanticModification() {

					@Override
					public void apply(EObject element,
							IModificationContext context) throws Exception {
						
						if (element instanceof FormalArgument) {
							FormalArgument formalDefinition = (FormalArgument) element;
							String newName = rename(formalDefinition.getName());
							
							formalDefinition.setName(newName);
						}
					}
				});
	}
	
	@Fix(FractalJavaValidator.DUPLICATE_TEMPLATE_SPECIFIER_NAME)
	public void renameTemplateSpecifierName(final Issue issue, 
			IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Rename",
				"Rename duplicate template specifier name.", null,
				new ISemanticModification() {

					@Override
					public void apply(EObject element,
							IModificationContext context) throws Exception {
						
						if (element instanceof TemplateSpecifier) {
							TemplateSpecifier templateSpecifier= (TemplateSpecifier) element;
							String newName = rename(templateSpecifier.getName());
							
							templateSpecifier.setName(newName);
						}
					}
				});
	}
	
	/**
	 * Rename, for example : 
	 * 		toto -> toto1
	 * 		toto1 -> toto2
	 * @param name to refactor
	 * @return
	 */
	public static String rename(String name){
		
		String newName;
		
		if (Character.isDigit(name
				.charAt(name.length()-1))) {
			newName = name.substring(0, name.length() - 1);
			int nbr = Integer.parseInt(((name.substring(name.length()-1)))) + 1;
			newName = newName + nbr ;
			
		} else {
			newName = name + 1;
		}
		
		return newName;
	}
	
	/*
	 * Unknown element quickfixes 
	 */

	@Fix(FractalJavaValidator.UNKNOWN_IMPORT)
	public void fixUnkownImport(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove unknown import",
				"Remove this unavailable package.", null,
				new ISemanticModification() {

					@Override
					public void apply(EObject element,
							IModificationContext context) throws Exception {
						if (element instanceof ImportDefinition)
							EcoreUtil.delete(element);
					}
				});
	}
	
	@Fix(FractalJavaValidator.UNKNOWN_TEMPLATE_SPECIFIER_TYPE)
	public void fixUnknownTemplateSpecifierType(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove",
				"Remove unknown template specifier type", null,
				new ISemanticModification() {

					@Override
					public void apply(EObject element,
							IModificationContext context) throws Exception {
						if (element instanceof TemplateSpecifier)
							EcoreUtil.delete(element);
					}
				});
	}	
	
//TODO complete when ModelToProjectUtil facilities will be available
/*
	@Fix(FractalJavaValidator.UNKNOWN_INTERFACE)
	public void createInterface(final Issue issue,
			IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Create interface " + issue.getData()[0],
				"Create a new interface definition file " + issue.getData()[0]
						+ " in package " + issue.getData()[1] + ".", null,
				new IModification() {

					@Override
					public void apply(IModificationContext context)
							throws Exception {

						// ModelToProjectUtil.INSTANCE.

					}
				});
	}
*/
	
	
	@Fix("ADL-3")
	public void removeTemplateParameter(final Issue issue, IssueResolutionAcceptor acceptor) {
		
			final int offset = issue.getOffset();
			final int length = issue.getLength();
			
			acceptor.accept(issue, "Mon quick fix xtext pour erreur mindc Invalid Template Parameter",
				"corriger erreur mindc en enlevant le parametre de template",null,
				new ISemanticModification() {
					@Override
					public void apply(EObject adlDefinition,
							IModificationContext context) throws Exception {
					
					CompositeNode astRoot = NodeUtil.getRootNode(adlDefinition);
					
					AbstractNode astNode = NodeUtil.findLeafNodeAtOffset(astRoot, offset);
					EObject eObject = NodeUtil.getNearestSemanticObject(astNode);
					
					if (eObject != null && eObject instanceof ComponentReference) {
						ComponentReference reference = (ComponentReference) eObject;
						reference.unsetTemplatesList();
						//reference.setReferenceName("fixed");
					}

				}
			});
			

			acceptor.accept(issue, "Replace text",
					"replace text",null,
					new IModification() {
				
					@Override
					public void apply(IModificationContext context) throws Exception {
						
						IXtextDocument document = context.getXtextDocument();
						document.replace(offset, length, "fixed text");					}
				});

	}

}
