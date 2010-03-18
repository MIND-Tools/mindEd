package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.NoDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;

public class MindListEditPart extends MindEditPart {

	/**
	 * This is the layout used for this edit part's compartment
	 */
	ConstrainedFlowLayout areaLayoutManager = new ConstrainedFlowLayout(true);
	
	public MindListEditPart(GraphicalEditPart editPart, int vID) {
		super(editPart,vID, TYPE_LIST);
	}
	
	public MindListEditPart(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}
	
	
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Extended creation features
		realEditPart.installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindSubCreationEditPolicy());
		// No drag and drop allowed
		realEditPart.installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new NoDragDropEditPolicy());
		realEditPart.installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new NoDragDropEditPolicy());
	}
	
	
	public LayoutEditPolicy createLayoutEditPolicy() {
		// Does not allow children to be moved
		return new FixedChildrenLayoutEditPolicy();
	}

	
	@Override
	public IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(areaLayoutManager);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	public void refresh() {
		refreshBounds();
	}
	
	
	@Override
	public Boolean refreshBounds() {
		// The height depends on the children inside the area of this ReferencesList
//		int width = ((Integer) realEditPart.getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int width = -1;
		int height = -1;
		
		// Get the area and its layout manager
//		GraphicalEditPart pane = getCompartment();
//		LayoutManager areaLayout = null;
//		if (pane != null)
//			areaLayout = getMindEditPartFor(pane).getLayoutManager();
//		if (areaLayout != null && areaLayout instanceof ConstrainedFlowLayout) {
//			// The manager should be a ConstrainedFlowLayout
//			// It keeps the total height used so we can use it here
//			layoutAllChildren(pane.getFigure());
//			height = ((ConstrainedFlowLayout)areaLayout).getTotalHeight() +
//					IFractalSize.TITLE_HEIGHT + 6;
//		}
		
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
		((GraphicalEditPart) realEditPart.getParent()).setLayoutConstraint(
			realEditPart,
			realEditPart.getFigure(),
			new Rectangle(loc, size));
		
		return true;
	}
	
	
	
}
