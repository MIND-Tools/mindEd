package org.ow2.fractal.mind.diagram.custom.edit.parts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
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
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferenceDefinitionCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeSingleReferenceDefinitionCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSuperCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.NoDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.OpenDefinitionEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;
import org.ow2.fractal.mind.diagram.custom.providers.NoDragTracker;

import adl.diagram.edit.parts.CompositeReferenceDefinition3EditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionReferenceName3EditPart;
import adl.diagram.part.MindVisualIDRegistry;

public class TemplateReferenceDefinitionCustomEditPart extends
			CompositeReferenceDefinition3EditPart {

	public TemplateReferenceDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			// No spacing
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout(false);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	@Override
	protected void refreshBounds() {
		// The height depends on the children inside the area of this ReferencesList
		int width = -1;
		EditPart parent = getParent();
		if (parent instanceof GraphicalEditPart) {
			Rectangle bounds = ((GraphicalEditPart)parent).getFigure().getBounds();
			width = bounds.width - 10;
		}
		int height = -1;
		
		// Get the area and its layout manager
		TemplateReferenceAreaCustomEditPart pane = getPane();
		LayoutManager areaLayout = null;
		if (pane != null)
			areaLayout = pane.getLayoutManager();
		if (areaLayout != null && areaLayout instanceof ConstrainedFlowLayout) {
			// The manager should be a ConstrainedFlowLayout
			// It keeps the total height used so we can use it here
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
		// To open the referenced definition on double clic
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
				new OpenDefinitionEditPolicy());
		// No drag and drop allowed
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new NoDragDropEditPolicy());
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		// No drag and drop allowed
		return new NoDragTracker(this);
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		// Does not allow children to be moved
		return new FixedChildrenLayoutEditPolicy();
	}
	
	/**
	 * Returns the area : CompositeSingleReferenceDefinitionAreaCustomEditPart
	 */
	public TemplateReferenceAreaCustomEditPart getPane() {
		EditPart pane = getChildBySemanticHint(MindVisualIDRegistry
				.getType(TemplateReferenceAreaCustomEditPart.VISUAL_ID));
		if (pane instanceof TemplateReferenceAreaCustomEditPart)
			return (TemplateReferenceAreaCustomEditPart) pane;
		return null;
	}
	
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CompositeReferenceDefinitionReferenceName3EditPart) {
			((CompositeReferenceDefinitionReferenceName3EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLabelReferenceDefinition());
			// To open the referenced definition on double clic
			childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
			return true;
		}
		if (childEditPart instanceof CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart) {
			IFigure pane = getPrimaryShape().getFigureReferenceDefinitionArea();
			setupContentPane(pane);
			pane.add(((CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart) childEditPart)
							.getFigure());
			// To open the referenced definition on double clic
			childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
			return true;
		}
		return super.addFixedChild(childEditPart);
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
	
	@Override
	public void activate() {
		super.activate();
		if (ComponentHelper.isMerged(this)) 
			// If the component is merged handle custom behaviour
			ComponentHelper.handleMergedElement(this);
		refreshBounds();
	}
}
