package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferenceDefinitionCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSuperCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.OpenDefinitionEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;

import adl.diagram.edit.parts.CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionReferenceNameEditPart;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * Extends CompositeReferenceDefinitionEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * - Grid layout data<p>
 * This is a reference contained in a CompositeReferencesList
 * @author maroto
 *
 */
public class CompositeReferenceDefinitionCustomEditPart extends
		CompositeReferenceDefinitionEditPart {

	public CompositeReferenceDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			// No spacing
			ConstrainedFlowLayout layout = new ConstrainedFlowLayout(true);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	@Override
	protected void refreshBounds() {
		// The height depends on the children inside the area of this ReferencesList
		int width = -1;
		int height = -1;
		
		// Get the area and its layout manager
		CompositeReferenceAreaCustomEditPart pane = getPane();
		LayoutManager areaLayout = null;
		if (pane != null)
			areaLayout = pane.getLayoutManager();
		if (areaLayout != null && areaLayout instanceof ConstrainedFlowLayout) {
			// The manager should be a ConstrainedFlowLayout
			// It keeps the total height used so we can use it here
			areaLayout.layout(pane.getContentPane());
			height = ((ConstrainedFlowLayout)areaLayout).getTotalHeight() +
					IFractalSize.TITLE_HEIGHT;
			if (pane.getChildren().size() > 0) height += 12;
		}
		
		// Now set the constraint
		Dimension size = new Dimension(width, height);
		Point loc = new Point(0, 0);
		((GraphicalEditPart) getParent()).setLayoutConstraint(
			this,
			getFigure(),
			new Rectangle(loc, size));
		
		getParent().refresh();
	}
	
	/**
	 * Get the area of the reference, which contains the children
	 * @return the CompositeReferenceAreaCustomEditPart or null
	 */
	public CompositeReferenceAreaCustomEditPart getPane() {
		EditPart pane = getChildBySemanticHint(MindVisualIDRegistry
				.getType(CompositeReferenceAreaCustomEditPart.VISUAL_ID));
		if (pane instanceof CompositeReferenceAreaCustomEditPart)
			return (CompositeReferenceAreaCustomEditPart) pane;
		return null;
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Extended layout features
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				createLayoutEditPolicy());
		// Extended creation features
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindSuperCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeReferenceDefinitionCustomItemSemanticEditPolicy());
		// Extended drag and drop features
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
		// To open the referenced component on double clic
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
				new OpenDefinitionEditPolicy());
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		// This edit policy does not allow children to be dragged
		return new FixedChildrenLayoutEditPolicy();
	}
	

	@Override
	public void activate() {
		super.activate();
		if (ComponentHelper.isMerged(this)) 
			// If the component is merged handle custom behaviour
			ComponentHelper.handleMergedElement(this);
		refreshBounds();
	}
	
	
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CompositeReferenceDefinitionReferenceNameEditPart) {
			((CompositeReferenceDefinitionReferenceNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getLabel());
			// To open the referenced component on double clic
			childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
			return true;
		}
		if (childEditPart instanceof CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart) {
			IFigure pane = getPrimaryShape().getArea();
			setupContentPane(pane);
			pane.add(((CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart) childEditPart)
							.getFigure());
			// To open the referenced component on double clic
			childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
			return true;
		}
		return false;
	}
	
	@Override
	protected void addChild(EditPart childEditPart, int index) {
		super.addChild(childEditPart, index);
		// Should implement a listener instead
		// and use handleChildAdded
		getParent().refresh();
	}
	
	@Override
	protected void removeChild(EditPart childEditPart) {
		super.removeChild(childEditPart);
		// Should implement a listener instead
		// and use handleChildRemoved
		getParent().refresh();
	}
	
	@Override
	public void refresh() {
		super.refresh();
		getParent().refresh();
	}

}
