package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSuperCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;

public class MindCompartmentEditPart extends MindEditPart {

	/**
	 * Remember the layout manager
	 */
	protected LayoutManager layoutManager; 
	
	public MindCompartmentEditPart(GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_COMPARTMENT);
	}
	
	public MindCompartmentEditPart(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}
	
	

}
