package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPartFactory;
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
	
	protected MindEditPart genericEditPart = MindEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	
	/**
	 * Custom constraint for the custom layout
	 */
	public void refreshBounds() {
		if (genericEditPart.refreshBounds() == false)
			super.refreshBounds();
	}

	/**
	 * Implements custom policies
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		return genericEditPart.setupContentPane(nodeShape);
	}

	@Override
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy glep = genericEditPart.createLayoutEditPolicy();
		if (glep == null)
			glep = super.createLayoutEditPolicy();
		return glep;
	}
	
	@Override
	public void activate() {
		super.activate();
		genericEditPart.activate();
	}
	
}
