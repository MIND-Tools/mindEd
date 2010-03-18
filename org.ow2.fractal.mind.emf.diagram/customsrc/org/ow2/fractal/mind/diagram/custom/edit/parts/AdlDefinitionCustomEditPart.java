package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPartFactory;
import adl.diagram.edit.parts.AdlDefinitionEditPart;

/**
 * AdlDefinitionEditPart is the canvas, the background.
 * @extends AdlDefinitionEditPart
 * @author maroto
 *
 */
public class AdlDefinitionCustomEditPart extends AdlDefinitionEditPart {

	protected MindEditPart genericEditPart = MindEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	public AdlDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	

}
