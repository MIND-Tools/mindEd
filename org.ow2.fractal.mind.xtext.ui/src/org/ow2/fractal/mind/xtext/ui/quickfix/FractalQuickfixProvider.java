package org.ow2.fractal.mind.xtext.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.ow2.fractal.mind.xtext.validation.FractalJavaValidator;

import adl.InterfaceDefinition;

public class FractalQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(FractalJavaValidator.DUPLICATE_INTERFACE_NAME)
	public void capitalizeName(final Issue issue,
			IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Rename interface",
				"Change this name in order to make it unique.", null,
				new ISemanticModification() {
					public void apply(EObject element,
							IModificationContext context) throws Exception {

						if (element instanceof InterfaceDefinition) {
							InterfaceDefinition interfaceDefinition = (InterfaceDefinition) element;
							String name = interfaceDefinition.getName();
							if (Character.isDigit(name
									.charAt(name.length()-1))) {
								name = name.substring(0, name.length() - 1);
								int nbr = (Character.valueOf((name.charAt(name
										.length()-1)))+1);
								name= name + nbr;
							} else
								name = name + 1;
							interfaceDefinition.setName(name);
						}

					}
				});
	}

	@Fix(FractalJavaValidator.UNKNOWN_IMPORT)
	public void fixImport(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove unknown import",
				"Remove this unavailable package.", null,
				new ISemanticModification() {

					@Override
					public void apply(EObject element,
							IModificationContext context) throws Exception {
						// TODO Auto-generated method stub
					}
				});
	}

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

						// TODO create interface
						// ModelToProjectUtil.INSTANCE.

					}
				});
	}
}
