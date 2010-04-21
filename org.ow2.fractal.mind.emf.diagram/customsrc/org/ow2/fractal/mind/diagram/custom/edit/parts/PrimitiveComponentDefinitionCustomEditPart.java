package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionEditPart;

/**
 * Extends PrimitiveComponentDefinitionEditPart to implement custom behavior
 * - recognize child's custom edit part
 * - disable spacing
 * - set child's default size
 * - implement interface's custom behavior
 * - change the binding's container in case of drag & drop
 * @author maroto
 *
 */
public class PrimitiveComponentDefinitionCustomEditPart extends
		PrimitiveComponentDefinitionEditPart {

	public PrimitiveComponentDefinitionCustomEditPart(View view) {
		super(view);
	}
	
}
