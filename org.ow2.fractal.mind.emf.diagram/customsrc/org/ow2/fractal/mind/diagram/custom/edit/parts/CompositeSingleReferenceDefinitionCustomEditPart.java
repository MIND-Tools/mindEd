package org.ow2.fractal.mind.diagram.custom.edit.parts;

import java.util.List;

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
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeSingleReferenceDefinitionCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSuperCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.NoDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.OpenDefinitionEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;
import org.ow2.fractal.mind.diagram.custom.providers.NoDragTracker;

import adl.diagram.edit.parts.CompositeReferenceDefinition2EditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionReferenceName2EditPart;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * This is a single reference, meaning it is contained in a sub component
 * @author maroto
 *
 */
public class CompositeSingleReferenceDefinitionCustomEditPart extends
		CompositeReferenceDefinition2EditPart {

	
	public CompositeSingleReferenceDefinitionCustomEditPart(View view) {
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
	public void refresh() {
		super.refresh();
		refreshBounds();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected void refreshBounds() {
		
		int width = -1;
		if (getParent() instanceof TemplateDefinitionAreaCustomEditPart) {
			width = ((GraphicalEditPart) getParent()).getFigure().getBounds().width - 10;
		}
		
		// The height depends on the number of children in the area of the reference
		// Get the area
		EditPart pane = getPrimaryChildEditPart();
		int nbChildren = 0;
		if (pane != null) {
			nbChildren = pane.getChildren().size();
		}
		
		int height = IFractalSize.TITLE_HEIGHT;
		if (nbChildren > 0) {
			if (pane instanceof GraphicalEditPart)
				ComponentHelper.layoutAllChildren(((GraphicalEditPart)pane).getFigure());
			List<GraphicalEditPart> children = pane.getChildren();
			for (GraphicalEditPart child : children) {
				int childHeight = child.getFigure().getBounds().height;
				if (childHeight == 0)
					childHeight = IFractalSize.TITLE_HEIGHT;
				height += childHeight;
			}
			height += 10;
		}
		
		// Now set the constraint
		Dimension size = new Dimension(width, height);
		Point loc = new Point(0, 0);
		((GraphicalEditPart) getParent()).setLayoutConstraint(
			this,
			getFigure(),
			new Rectangle(loc, size));
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
				new CompositeSingleReferenceDefinitionCustomItemSemanticEditPolicy());
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
	@Override
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(MindVisualIDRegistry
				.getType(CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID));
	}
	
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CompositeReferenceDefinitionReferenceName2EditPart) {
			((CompositeReferenceDefinitionReferenceName2EditPart) childEditPart)
				.setLabel(getPrimaryShape().getFigureLabelReferenceDefinition());
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


}
