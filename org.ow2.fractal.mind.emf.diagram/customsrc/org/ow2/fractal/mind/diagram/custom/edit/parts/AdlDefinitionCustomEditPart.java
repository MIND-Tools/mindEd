package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;

import adl.diagram.edit.parts.AdlDefinitionEditPart;

/**
 * AdlDefinitionEditPart is the canvas, the background.
 * @extends AdlDefinitionEditPart
 * @author maroto
 *
 */
public class AdlDefinitionCustomEditPart extends AdlDefinitionEditPart {

	public AdlDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	/**
	 * Implements custom edit policies
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new AdlDefinitionCustomCanonicalEditPolicy());
	}
	

}