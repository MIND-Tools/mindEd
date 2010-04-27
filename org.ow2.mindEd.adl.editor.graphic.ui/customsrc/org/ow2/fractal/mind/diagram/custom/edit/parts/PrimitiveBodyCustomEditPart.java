package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import adl.diagram.edit.parts.PrimitiveBodyEditPart;

public class PrimitiveBodyCustomEditPart extends PrimitiveBodyEditPart {

	public PrimitiveBodyCustomEditPart(View view) {
		super(view);
	}
	
	
	
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(genericEditPart.addChildVisual(childEditPart, index))
			return;
		super.addChildVisual(childEditPart, index);
	}
	

}
