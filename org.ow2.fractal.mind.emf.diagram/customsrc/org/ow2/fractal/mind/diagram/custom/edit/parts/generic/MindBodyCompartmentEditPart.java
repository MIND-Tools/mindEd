package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomXYLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.CustomFreeFormLayoutEx;
import org.ow2.fractal.mind.diagram.custom.providers.CustomDragEditPartsTracker;

public class MindBodyCompartmentEditPart extends MindCompartmentEditPart {

	public MindBodyCompartmentEditPart(GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_COMPARTMENT_BODY);
	}

	public MindBodyCompartmentEditPart(GraphicalEditPart editPart, int vID,
			int mindType) {
		super(editPart, vID, mindType);
	}
	
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Extended creation features
		realEditPart.installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new MindSubCreationEditPolicy());
		// Customized drag and drop features
		realEditPart.installEditPolicy(
				EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
		// Extended layout features
		realEditPart.installEditPolicy(
				EditPolicy.LAYOUT_ROLE, 
				new CustomXYLayoutEditPolicy());
	}
	
	/**
	 * Call this to implement our custom drag tracker which gives us extended drag and drop features
	 * @param ep
	 * @return
	 */
	public DragTracker getDragTracker(Request request) {
		return new CustomDragEditPartsTracker(realEditPart);
	}
	
	/**
	 * Returns the layout manager to be used by this shape compartment. This
	 * implementation returns a {@link CustomFreeformLayoutEx} instance.
	 * 
	 * @return a layout manager.
	 */
	public LayoutManager getLayoutManager() {
		// Extended layout features
		return new CustomFreeFormLayoutEx();
	}

}
