package org.ow2.fractal.mind.diagram.custom.edit.parts;


import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferencesListCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.NoDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;
import org.ow2.fractal.mind.diagram.custom.providers.NoDragTracker;

import adl.diagram.edit.parts.CompositeReferencesListEditPart;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * Extends CompositeReferencesListEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * @author maroto
 *
 */
public class CompositeReferencesListCustomEditPart extends
		CompositeReferencesListEditPart {
	
	public CompositeReferencesListCustomEditPart(View view) {
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
	
	public void refresh() {
		super.refresh();
		refreshBounds();
	}
	
	@Override
	protected void refreshBounds() {
		// The height depends on the children inside the area of this ReferencesList
		int width = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int height = -1;
		
		// Get the area and its layout manager
		CompositeReferencesListAreaCustomEditPart pane = getPane();
		LayoutManager areaLayout = null;
		if (pane != null)
			areaLayout = pane.getLayoutManager();
		if (areaLayout != null && areaLayout instanceof ConstrainedFlowLayout) {
			// The manager should be a ConstrainedFlowLayout
			// It keeps the total height used so we can use it here
			areaLayout.layout(pane.getContentPane());
			height = ((ConstrainedFlowLayout)areaLayout).getTotalHeight() +
					IFractalSize.TITLE_HEIGHT + 6;
		}
		
		// Now set the constraint
		Dimension size = new Dimension(width, height);
		Point loc = new Point(0, 0);
		((GraphicalEditPart) getParent()).setLayoutConstraint(
			this,
			getFigure(),
			new Rectangle(loc, size));
	}
	
	/**
	 * Returns the area of this edit part, which contains the children
	 * @return CompositeReferencesListAreaCustomEditPart
	 */
	public CompositeReferencesListAreaCustomEditPart getPane() {
		EditPart pane = getChildBySemanticHint(MindVisualIDRegistry
				.getType(CompositeReferencesListAreaCustomEditPart.VISUAL_ID));
		if (pane instanceof CompositeReferencesListAreaCustomEditPart)
			return (CompositeReferencesListAreaCustomEditPart) pane;
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
				new MindSubCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeReferencesListCustomItemSemanticEditPolicy());
		// No drag and drop allowed
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new NoDragDropEditPolicy());
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new NoDragDropEditPolicy());
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		// Does not allow children to be moved
		return new FixedChildrenLayoutEditPolicy();
	}
	
	public DragTracker getDragTracker(Request request) {
		// Do not allow drag and drop
		return new NoDragTracker(this);
	}
	
	@Override
	public void activate() {
		super.activate();
		if (ComponentHelper.isMerged(this)) 
			// If the component is merged handle custom behaviour
			ComponentHelper.handleMergedElement(this);
		refreshBounds();
	}

}
