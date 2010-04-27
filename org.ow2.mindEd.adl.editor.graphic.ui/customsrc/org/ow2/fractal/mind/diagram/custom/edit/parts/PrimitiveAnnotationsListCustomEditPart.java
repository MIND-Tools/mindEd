

package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import adl.diagram.edit.parts.PrimitiveAnnotationsListEditPart;

/**
 * This EditPart stands for the list of annotations. 
 * <p>
 * Implements the following features : disable spacing, custom edit policies,
 * size depends on the number of children
 * @children AnnotationsListAreaCustomEditPart
 * @author maroto
 *
 */
public class PrimitiveAnnotationsListCustomEditPart extends PrimitiveAnnotationsListEditPart {

	public PrimitiveAnnotationsListCustomEditPart(View view) {
		super(view);
	}
	
	
	
	@Override
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (genericEditPart.removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}

}
