package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.NoDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.OpenDefinitionEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.PrimitiveSingleReferenceDefinitionCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;
import org.ow2.fractal.mind.diagram.custom.providers.NoDragTracker;

import adl.diagram.edit.parts.PrimitiveReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionReferenceNameEditPart;
import adl.diagram.part.MindVisualIDRegistry;

public class PrimitiveSingleReferenceDefinitionCustomEditPart extends
		PrimitiveReferenceDefinitionEditPart {

	public PrimitiveSingleReferenceDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			// No spacing
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	@Override
	protected void refreshBounds() {
		int width = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		
		EditPart pane = getPrimaryChildEditPart();
		int nbChildren = 0;
		if (pane != null) {
			nbChildren = pane.getChildren().size();
		}
		
		int height = IFractalSize.TITLE_HEIGHT;
		if (nbChildren > 0) {
			height += nbChildren*IFractalSize.DEFAULT_LABEL_HEIGHT + 3;
		}
		
		Dimension size = new Dimension(width, height);
		Point loc = new Point(0, 0);
		((GraphicalEditPart) getParent()).setLayoutConstraint(
			this,
			getFigure(),
			new Rectangle(loc, size));
	}
	

	@Override
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(MindVisualIDRegistry
				.getType(PrimitiveReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID));
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PrimitiveSingleReferenceDefinitionCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new NoDragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
				new OpenDefinitionEditPolicy());
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		return new NoDragTracker(this);
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new FixedChildrenLayoutEditPolicy();
	}
	
	@Override
	public EditPolicy getPrimaryDragEditPolicy() {
		return new CustomDragDropEditPolicy();
	}
	
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PrimitiveReferenceDefinitionReferenceNameEditPart) {
			((PrimitiveReferenceDefinitionReferenceNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLabelReferenceDefinition());
			childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
			return true;
		}
		if (childEditPart instanceof PrimitiveReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart) {
			IFigure pane = getPrimaryShape().getFigureReferenceDefinitionArea();
			setupContentPane(pane);
			pane
					.add(((PrimitiveReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart) childEditPart)
							.getFigure());
			childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
			return true;
		}
		return false;
	}

}
