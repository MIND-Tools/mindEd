package org.ow2.fractal.mind.xtext.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
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
									.charAt(name.length() - 1))) {
								// name = name.substring(0, name.length()-2) +
								// (Character.valueOf((name.charAt(name.length()-1))));
								name = name + 1;
							} else
								name = name + "1";
							interfaceDefinition.setName(name);
						}

					}
				});
	}

}
