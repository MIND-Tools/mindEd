package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.ParentCreationEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.ChildrenCreationEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.ComponentLayout;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.PrimitiveBodyCompartmentEditPart;

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
	
	
	@Override
	public void createDefaultEditPolicies(){
		super.createDefaultEditPolicies();
		// Extended layout features
		realEditPart.installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new FixedChildrenLayoutEditPolicy());
		// Extended creation features
		realEditPart.installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new ParentCreationEditPolicy());
		setCreationMode(CREATION_MODE_PARENT);
		// No drag and drop
		realEditPart.removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
	}
	
	
	@Override
	public void setLayoutManager(IFigure figure) {
		figure.setLayoutManager(getLayoutManager());
	}
	
	
	/**
	 * Implements a ConstrainedToolbarLayout
	 * @return
	 */
	@Override
	public LayoutManager getLayoutManager() {
		if (layoutManager == null) {
			layoutManager = new ConstrainedToolbarLayout();
		}
		return layoutManager;
	}

}
