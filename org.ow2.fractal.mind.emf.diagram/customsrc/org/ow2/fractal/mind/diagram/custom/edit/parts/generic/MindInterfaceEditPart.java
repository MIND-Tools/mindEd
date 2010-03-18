package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.ow2.fractal.mind.diagram.custom.providers.BorderItemDragTracker;

public class MindInterfaceEditPart extends MindEditPart {
	
	public MindInterfaceEditPart(GraphicalEditPart editPart, int vID) {
		super(editPart,vID, TYPE_INTERFACE);
	}
	
	public MindInterfaceEditPart(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}

	
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Extended creation features
		realEditPart.installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				getCustomItemSemanticEditPolicy());	
	}

	@Override
	public DragTracker getDragTracker(EditPart ep) {
		return new BorderItemDragTracker(ep);
	}
	
	
	
}
