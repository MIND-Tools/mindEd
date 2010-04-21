package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import adl.diagram.edit.parts.TypeReferencesListEditPart;

/**
 * Extends TypeReferencesListEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * @author maroto
 *
 */

public class TypeReferencesListCustomEditPart extends
		TypeReferencesListEditPart {

	public TypeReferencesListCustomEditPart(View view) {
		super(view);
	}
	
}
