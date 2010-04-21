package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.NoDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;

public class MindItemEditPart extends MindEditPart {

	public MindItemEditPart(GraphicalEditPart editPart, int vID) {
		super(editPart,vID, TYPE_ITEM);
	}
	
	public MindItemEditPart(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}
	
	
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// No drag and drop
		realEditPart.removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
		realEditPart.installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new NoDragDropEditPolicy());
		// Extended creation features
		realEditPart.installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindSubCreationEditPolicy());
		
	}
	
	public GraphicalEditPart getCompartment() {
		List<EditPart> children = realEditPart.getChildren();
		
		for (EditPart child : children) {
			if (getMindEditPartFor(child) instanceof MindCompartmentEditPart)
				return (GraphicalEditPart)child;
		}
		return null;
	}
	
	/**
	 * Default layout is OK but we don't want the spacing
	 */
	public IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			//no spacing anymore
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}


	public boolean addChildVisual(EditPart childEditPart, int index) {
		return false;
	}


	public boolean addFixedChild(EditPart childEditPart) {
		return false;
	}


	public DragTracker getDragTracker(EditPart ep) {
		return null;
	}
	
	public void refresh() {
		super.refresh();
		refreshBounds();
	}
	
	public NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(15,15);
		return result;
	}

	public Boolean refreshBounds() {
//		
//		int width = -1;
//		int height = IFractalSize.TITLE_HEIGHT;
//		Dimension size = new Dimension(width, height);
//		int x = ((Integer) realEditPart.getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
//		int y = ((Integer) realEditPart.getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
//		Point loc = new Point(x, y);
//		
//		realEditPart.getFigure().setBounds(new Rectangle(loc,size));
//		((GraphicalEditPart) realEditPart.getParent()).setLayoutConstraint(
//				realEditPart,
//				realEditPart.getFigure(),
//				new Rectangle(loc,size)
//				);
//		return true;
		
		return false;
	}
	
	public void setLayoutManager(IFigure figure) {}

	public LayoutEditPolicy createLayoutEditPolicy() {
		return null;
	}
	
}
