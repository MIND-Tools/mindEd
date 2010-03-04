package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeSubComponentCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeSubComponentCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;

import adl.diagram.edit.policies.MindBaseItemSemanticEditPolicy;

public class MindComponentEditPart extends MindEditPart {

	GraphicalEditPart realEditPart;
	
	public MindComponentEditPart (GraphicalEditPart editPart) {
		if (editPart == null) throw new NullPointerException();
		realEditPart = editPart;
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
	
	
	protected CanonicalEditPolicy getCanonicalEditPolicy() {
		return null;
	}
	
	protected MindBaseItemSemanticEditPolicy getItemSemanticEditPolicy() {
		return null;
	}
}
