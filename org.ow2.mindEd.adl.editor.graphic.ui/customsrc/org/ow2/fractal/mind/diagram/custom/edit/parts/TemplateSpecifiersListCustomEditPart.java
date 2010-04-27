package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import adl.diagram.edit.parts.TemplateSpecifiersListEditPart;

/**
 * Extends TemplateSpecifiersListEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * @author maroto
 *
 */
public class TemplateSpecifiersListCustomEditPart extends
		TemplateSpecifiersListEditPart {

	public TemplateSpecifiersListCustomEditPart(View view) {
		super(view);
	}
	
	
	@Override
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (genericEditPart.removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}
}
