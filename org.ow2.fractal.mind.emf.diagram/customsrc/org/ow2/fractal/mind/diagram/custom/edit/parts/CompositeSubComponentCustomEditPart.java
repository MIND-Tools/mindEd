package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import adl.diagram.edit.parts.CompositeSubComponentEditPart;

/**
 * Extends CompositeSubComponentEditPart to implement custom behavior
 * - recognize child's custom edit part
 * - disable spacing
 * - set child's default size
 * - implement interface's custom behavior
 * - change the binding's container in case of drag & drop
 * @author maroto
 *
 */
public class CompositeSubComponentCustomEditPart extends
	CompositeSubComponentEditPart {

	

	public CompositeSubComponentCustomEditPart(View view) {
		super(view);
	}
	

	@Override
	protected void addChild(EditPart child, int index) {
		super.addChild(child, index);
		refresh();
	}
	
	
	
}
