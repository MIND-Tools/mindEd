package org.ow2.fractal.mind.diagram.custom.edit.parts;


import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import adl.diagram.edit.parts.CompositeReferencesListEditPart;

/**
 * 
 * @author maroto
 *
 */
public class CompositeReferencesListCustomEditPart extends
		CompositeReferencesListEditPart {
	
	public CompositeReferencesListCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (genericEditPart.removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}

}
