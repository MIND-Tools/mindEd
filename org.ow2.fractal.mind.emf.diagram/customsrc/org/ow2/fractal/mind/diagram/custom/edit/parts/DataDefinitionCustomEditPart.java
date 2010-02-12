package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;

import adl.diagram.edit.parts.DataDefinitionEditPart;

public class DataDefinitionCustomEditPart extends DataDefinitionEditPart {

	public DataDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	public void activate() {
		super.activate();
		if (ComponentHelper.isMerged(this)) 
				ComponentHelper.handleMergedElement(this);
	}

}
