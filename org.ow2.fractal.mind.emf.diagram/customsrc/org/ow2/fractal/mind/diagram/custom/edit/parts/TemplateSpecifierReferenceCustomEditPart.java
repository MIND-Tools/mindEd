package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import adl.diagram.edit.parts.TemplateSpecifierReferenceEditPart;

public class TemplateSpecifierReferenceCustomEditPart extends
		TemplateSpecifierReferenceEditPart {

	public TemplateSpecifierReferenceCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	public NodeFigure createNodePlate() {
		NodeFigure fig = genericEditPart.createNodePlate();
		if (fig == null)
			fig = super.createNodePlate();
		return fig;
	}

}
