package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;

import adl.diagram.edit.parts.ImplementationDefinitionEditPart;

/**
 * This is an implementation of the methods defined in a data definition. Stands for the keyword "source"
 * @children FileC, InlineCCode
 * @author maroto
 *
 */
public class ImplementationDefinitionCustomEditPart extends
		ImplementationDefinitionEditPart {

	public ImplementationDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	public void activate() {
		super.activate();
		if (ComponentHelper.isMerged(this)) 
			// If the component is merged, handle custom behaviour
			ComponentHelper.handleMergedElement(this);
	}

}
