package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindGenericEditPartFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.CompositeSubComponentEditPart;

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
	

	
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (genericEditPart.removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}
	

	@Override
	protected void addChild(EditPart child, int index) {
		super.addChild(child, index);
		refresh();
	}
	
	
	
}
