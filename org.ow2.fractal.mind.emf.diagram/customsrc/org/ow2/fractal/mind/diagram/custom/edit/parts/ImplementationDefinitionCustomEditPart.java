package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;

import adl.diagram.edit.parts.ImplementationDefinitionEditPart;

/**
 * This is an implementation of the methods defined in a data definition. Stands for the keyword "source"
 * @children FileC, InlineCCode
 * @author maroto
 *
 */
public class ImplementationDefinitionCustomEditPart extends
		ImplementationDefinitionEditPart {

	public ImplementationDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	
	@Override
	public void activate() {
		super.activate();
		genericEditPart.activate();
	}

}
