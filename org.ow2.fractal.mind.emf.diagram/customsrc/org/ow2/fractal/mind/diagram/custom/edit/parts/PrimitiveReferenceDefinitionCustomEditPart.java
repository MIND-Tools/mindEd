package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.OpenDefinitionEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.PrimitiveSingleReferenceDefinitionCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;

import adl.diagram.edit.parts.PrimitiveReferenceDefinition2EditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionReferenceName2EditPart;
import adl.diagram.part.MindVisualIDRegistry;

public class PrimitiveReferenceDefinitionCustomEditPart extends
		PrimitiveReferenceDefinition2EditPart {

	public PrimitiveReferenceDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			// no spacing
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	@Override
	protected void refreshBounds() {
		int width = -1;
		
		EditPart pane = getPane();
		int nbChildren = 0;
		if (pane != null) {
			nbChildren = pane.getChildren().size();
		}
		
		int height = IFractalSize.TITLE_HEIGHT;
		if (nbChildren > 0) {
			height += nbChildren*IFractalSize.ARGUMENT_HEIGHT + 6;
		}
		
		Dimension size = new Dimension(width, height);
		Point loc = new Point(0, 0);
		((GraphicalEditPart) getParent()).setLayoutConstraint(
			this,
			getFigure(),
			new Rectangle(loc, size));
		
		getParent().refresh();
	}
	
	public EditPart getPane() {
		return getChildBySemanticHint(MindVisualIDRegistry
				.getType(PrimitiveReferenceAreaCustomEditPart.VISUAL_ID));
	}
	
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new FixedChildrenLayoutEditPolicy();
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindSubCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PrimitiveSingleReferenceDefinitionCustomItemSemanticEditPolicy());
		removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
				new OpenDefinitionEditPolicy());
	}
	
	
	@Override
	public EditPolicy getPrimaryDragEditPolicy() {
		return new NonResizableEditPolicy();
	}
	
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PrimitiveReferenceDefinitionReferenceName2EditPart) {
			((PrimitiveReferenceDefinitionReferenceName2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getLabel());
			childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
			return true;
		}
		if (childEditPart instanceof PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart) {
			IFigure pane = getPrimaryShape().getArea();
			setupContentPane(pane);
			pane
					.add(((PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart) childEditPart)
							.getFigure());
			childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
			return true;
		}
		return false;
	}
	

}
