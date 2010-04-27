package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.parts.ArgumentDefinitionEditPart;

/**
 * These are the arguments defined in references
 * @children ArgumentDefinitionName
 * @author maroto
 *
 */
public class ArgumentDefinitionCustomEditPart extends
		ArgumentDefinitionEditPart {

	public ArgumentDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	
	@Override
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy glep = genericEditPart.createLayoutEditPolicy();
		if (glep == null)
			glep = super.createLayoutEditPolicy();
		return glep;
	}
	

}
