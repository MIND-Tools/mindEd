package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSuperCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.OpenDefinitionEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;

public class MindReferenceEditPart extends MindEditPart {

	
	/**
	 * This is the layout used for this edit part's compartment
	 */
	ConstrainedFlowLayout areaLayoutManager = new ConstrainedFlowLayout(true);
	
	
	public MindReferenceEditPart (GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_REFERENCE);
	}
	
	public MindReferenceEditPart(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}
	

	@Override
	public void createDefaultEditPolicies() {
		// Extended layout features
		realEditPart.installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new FixedChildrenLayoutEditPolicy());
		// Extended creation features
		realEditPart.installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindSuperCreationEditPolicy());
		realEditPart.installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				getCustomItemSemanticEditPolicy());
		// Extended drag and drop features
		realEditPart.installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
		// To open the referenced component on double clic
		realEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
				new OpenDefinitionEditPolicy());
		
	}
	
	
	@Override
	public IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(areaLayoutManager);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	
	@Override
	public Boolean refreshBounds() {
		// The height depends on the children inside the area of this ReferencesList
		int width = -1;
		int height = -1;
		
		if (areaLayoutManager != null && areaLayoutManager instanceof ConstrainedFlowLayout) {
			// The manager should be a ConstrainedFlowLayout
			// It keeps the total height used so we can use it here
			height = areaLayoutManager.getTotalHeight() +
					IFractalSize.TITLE_HEIGHT;
			if (getCompartment().getChildren().size() > 0) height += 12;
		}
		
		// Now set the constraint
		Dimension size = new Dimension(width, height);
		Point loc = new Point(0, 0);
		((GraphicalEditPart)realEditPart.getParent()).setLayoutConstraint(
			realEditPart,
			realEditPart.getFigure(),
			new Rectangle(loc, size));
		
		realEditPart.getParent().refresh();
		
		return true;
	}
	
}
