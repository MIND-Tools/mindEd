package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import adl.diagram.edit.parts.FormalArgumentEditPart;

/**
 * This is an argument contained in a FormalArgumentsList
 * @author maroto
 *
 */
public class FormalArgumentCustomEditPart extends FormalArgumentEditPart {

	public FormalArgumentCustomEditPart(View view) {
		super(view);
	}
	
	
	@Override
	protected NodeFigure createNodePlate() {
		NodeFigure result = genericEditPart.createNodePlate();
		if (result == null)
			result = super.createNodePlate();
		return result;
	}
	
	
	

}
