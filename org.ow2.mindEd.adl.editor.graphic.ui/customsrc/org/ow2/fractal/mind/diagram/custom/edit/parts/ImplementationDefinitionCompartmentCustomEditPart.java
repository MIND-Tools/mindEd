package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;

import adl.diagram.edit.parts.ImplementationDefinitionCompartmentEditPart;

public class ImplementationDefinitionCompartmentCustomEditPart extends
		ImplementationDefinitionCompartmentEditPart {

	public ImplementationDefinitionCompartmentCustomEditPart(View view) {
		super(view);
	}
	
	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}

}
