package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import adl.diagram.edit.parts.CompositeBodyEditPart;

public class CompositeBodyCustomEditPart extends CompositeBodyEditPart {

	@Override
	public void setLayoutConstraint(EditPart child, IFigure childFigure,
			Object constraint) {
		if ((genericEditPart.setLayoutConstraint(child,childFigure,constraint)) == false)
		super.setLayoutConstraint(child, childFigure, constraint);
	}

	public CompositeBodyCustomEditPart(View view) {
		super(view);
	}
	
	
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (genericEditPart.removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}
	
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(genericEditPart.addChildVisual(childEditPart, index))
			return;
		super.addChildVisual(childEditPart, index);
	}

}
