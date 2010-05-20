package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.UndefinedSubComponentEditPart;

public class UndefinedSubComponentCustomEditPart extends
		UndefinedSubComponentEditPart {

	public UndefinedSubComponentCustomEditPart(View view) {
		super(view);
	}
	

	
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (genericEditPart.removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}
}
