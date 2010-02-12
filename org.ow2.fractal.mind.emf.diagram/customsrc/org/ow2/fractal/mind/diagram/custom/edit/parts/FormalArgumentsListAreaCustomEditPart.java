package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FormalArgumentsListAreaCustomCanonicalEditPolicy;

import adl.diagram.edit.parts.FormalArgumentsListCompartmentFormalArgumentsListEditPart;

/**
 * This is the area of a FormalArgumentsList, containing the formal arguments.
 * @children FormalArgument
 * @author maroto
 *
 */
public class FormalArgumentsListAreaCustomEditPart extends
		FormalArgumentsListCompartmentFormalArgumentsListEditPart {

	public FormalArgumentsListAreaCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new FormalArgumentsListAreaCustomCanonicalEditPolicy());
	}
	
	@Override
	protected void addChild(EditPart childEditPart, int index) {
		super.addChild(childEditPart, index);
		// A listener should be implemented on the parent instead
		getParent().refresh();
	}
	
	@Override
	protected void removeChild(EditPart childEditPart) {
		super.removeChild(childEditPart);
		// A listener should be implemented on the parent instead
		getParent().refresh();
	}
	
}
