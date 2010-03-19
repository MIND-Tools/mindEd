package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import adl.diagram.edit.parts.DataDefinitionCompartmentEditPart;

/**
 * Body compartment of a {@link DataDefinitionCustomEditPart}
 * @children FileCEditPart, InlineCCodeEditPart
 * @author maroto
 *
 */
public class DataDefinitionCompartmentCustomEditPart extends
		DataDefinitionCompartmentEditPart {

	public DataDefinitionCompartmentCustomEditPart(View view) {
		super(view);
	}
	
	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}

}
