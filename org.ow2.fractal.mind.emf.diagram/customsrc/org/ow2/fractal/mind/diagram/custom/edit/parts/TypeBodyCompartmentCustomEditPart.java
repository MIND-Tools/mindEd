package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPartFactory;
import adl.diagram.edit.parts.TypeBodyCompartmentEditPart;

/**
 * Body compartment of a {@link ComponentTypeDefinitionCustomEditPart}
 * @children components
 * @author maroto
 *
 */
public class TypeBodyCompartmentCustomEditPart extends
		TypeBodyCompartmentEditPart {

	public TypeBodyCompartmentCustomEditPart(View view) {
		super(view);
	}
	
	protected MindEditPart genericEditPart = MindEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}

}
