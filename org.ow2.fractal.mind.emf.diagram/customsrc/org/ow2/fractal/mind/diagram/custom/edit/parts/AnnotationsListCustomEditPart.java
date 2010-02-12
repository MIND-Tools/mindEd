/**
 * Not used yet - annotations disabled
 */

//package org.ow2.fractal.mind.diagram.custom.edit.parts;
//
//import org.eclipse.draw2d.IFigure;
//import org.eclipse.draw2d.geometry.Rectangle;
//import org.eclipse.gef.EditPart;
//import org.eclipse.gef.EditPolicy;
//import org.eclipse.gef.GraphicalEditPart;
//import org.eclipse.gef.editpolicies.LayoutEditPolicy;
//import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
//import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
//import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
//import org.eclipse.gmf.runtime.notation.View;
//import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
//import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
//import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
//import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;
//
//import adl.diagram.edit.parts.AnnotationsListEditPart;
//
///**
// * This EditPart stands for the list of annotations. 
// * <p>
// * Implements the following features : disable spacing, custom edit policies,
// * size depends on the number of children
// * @children AnnotationsListAreaCustomEditPart
// * @author maroto
// *
// */
//public class AnnotationsListCustomEditPart extends AnnotationsListEditPart {
//
//	public AnnotationsListCustomEditPart(View view) {
//		super(view);
//	}
//	
//	@Override
//	protected IFigure setupContentPane(IFigure nodeShape) {
//		if (nodeShape.getLayoutManager() == null) {
//			// No spacing
//			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
//			nodeShape.setLayoutManager(layout);
//		}
//		return nodeShape; // use nodeShape itself as contentPane
//	}
//	
//	@Override
//	public void createDefaultEditPolicies() {
//		super.createDefaultEditPolicies();
//		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
//		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
//				new MindCreationEditPolicy());
////		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
////				new AnnotationsListCustomItemSemanticEditPolicy());
//		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
//				new NonResizableEditPolicy());
//	}
//	
//	protected LayoutEditPolicy createLayoutEditPolicy() {
//		return new FixedChildrenLayoutEditPolicy();
//	}
//		
//	@Override
//	public void refreshBounds() {	
//		EditPart pane = getPrimaryChildEditPart();
//		int nbChildren = 0;
//		if (pane != null) {
//			nbChildren = pane.getChildren().size();
//		}
//		
//		int height = IFractalSize.TITLE_HEIGHT;
//		if (nbChildren > 0) {
//			height += nbChildren*IFractalSize.ARGUMENT_HEIGHT + 3;
//		}
//		
//		((GraphicalEditPart) getParent()).setLayoutConstraint(
//				this,
//				getFigure(),
//				new Rectangle(-1,-1,-1, height)
//				);
//	}
//	
//	@Override
//	public void activate() {
//		super.activate();
//		if (ComponentHelper.isMerged(this)) 
//				ComponentHelper.handleMergedElement(this);
//	}
//
//}
