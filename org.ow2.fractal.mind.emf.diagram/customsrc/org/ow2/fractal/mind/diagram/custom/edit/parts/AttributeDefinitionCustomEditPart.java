package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AttributeDefinitionCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.NoDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.figures.AttributeDefinitionCustomFigure;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;

import adl.diagram.edit.parts.AttributeDefinitionEditPart;

/**
 * Stands for the attributes defined in components
 * @author mao
 *
 */

public class AttributeDefinitionCustomEditPart extends
		AttributeDefinitionEditPart {
	

	public AttributeDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	/**
	 * Custom constraint for the custom layout
	 */
	public void refreshBounds() {
		((GraphicalEditPart) getParent()).setLayoutConstraint(
		this,
		getFigure(),
		new Rectangle(-1,-1,-1,AttributeDefinitionCustomFigure.ATTRIBUTE_HEIGHT)
		);
	}

	/**
	 * Implements custom policies
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// No drag and drop
		removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new NoDragDropEditPolicy());
		// Extended creation features
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AttributeDefinitionCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		
	}

	@Override
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new FixedChildrenLayoutEditPolicy();
		return lep;
	}
	
	@Override
	public void activate() {
		super.activate();
		if (ComponentHelper.isMerged(this)) 
				ComponentHelper.handleMergedElement(this);
	}
	
}
