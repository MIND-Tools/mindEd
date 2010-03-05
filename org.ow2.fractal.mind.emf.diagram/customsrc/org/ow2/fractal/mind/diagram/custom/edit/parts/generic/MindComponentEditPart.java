package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.ow2.fractal.mind.diagram.custom.edit.policies.*;

public class MindComponentEditPart extends MindEditPart {
	
	public MindComponentEditPart (GraphicalEditPart editPart, int vID) {
		if (editPart == null) throw new NullPointerException();
		realEditPart = editPart;
		visualID = vID;
	}
	
	@Override
	public void createDefaultEditPolicies(){
		
		if (getCanonicalEditPolicy() != null)
			realEditPart.installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
					getCanonicalEditPolicy());
		
		if (getItemSemanticEditPolicy() != null)
			realEditPart.installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
					getItemSemanticEditPolicy());
		
		realEditPart.installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		
		realEditPart.installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
	};
	
	
	
	

}
