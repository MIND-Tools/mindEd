package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.AttributeDefinitionEditPart;

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
	
	

	
	@Override
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy glep = genericEditPart.createLayoutEditPolicy();
		if (glep == null)
			glep = super.createLayoutEditPolicy();
		return glep;
	}
	
	
}
