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
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSuperCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.OpenDefinitionEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;
import org.ow2.fractal.mind.diagram.custom.providers.NoDragTracker;
import org.ow2.fractal.mind.emf.diagram.custom.listeners.MindLayoutListener;

public class MindReferenceEditPart extends MindEditPart {
	
	public MindReferenceEditPart (GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_REFERENCE);
	}
	
	public MindReferenceEditPart(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}
	
	
	@Override
	public DragTracker getDragTracker(Request request) {
		// No drag and drop allowed
		return new NoDragTracker(realEditPart);
	}
	

	@Override
	public void createDefaultEditPolicies() {
		// Extended layout features
		realEditPart.installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new FixedChildrenLayoutEditPolicy());
		// Extended creation features
		realEditPart.installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindSuperCreationEditPolicy());
		// Extended drag and drop features
		realEditPart.installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
		// To open the referenced component on double clic
		realEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
				new OpenDefinitionEditPolicy());
		
	}
	
	
	public NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100,15);
		return result;
	}
	
	
	@Override
	public IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			nodeShape.setLayoutManager(layout);
			nodeShape.addLayoutListener(new MindLayoutListener(realEditPart));
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	
	@Override
	public boolean refreshBounds() {
		// The height depends on the children inside the area of this ReferencesList
//		int width = -1;
//		
//		List<EditPart> children = realEditPart.getChildren();
//		int nbChildren = children.size();
//		
//		int height = IFractalSize.TITLE_HEIGHT + 20 * nbChildren;
//		
//		// Now set the constraint
//		Dimension size = new Dimension(width, height);
//		
//		int x = ((Integer) realEditPart.getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
//		int y = ((Integer) realEditPart.getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
//		Point loc = new Point(x, y);
//		
//		((GraphicalEditPart)realEditPart.getParent()).setLayoutConstraint(
//			realEditPart,
//			realEditPart.getFigure(),
//			new Rectangle(loc, size));
//		
//		realEditPart.getParent().refresh();
//		
//		return true;

		return false;
	}
	
	@Override
	public boolean addFixedChild(EditPart childEditPart) {
		// To open the referenced definition on double clic
		childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
		return false;
	}
	
}
