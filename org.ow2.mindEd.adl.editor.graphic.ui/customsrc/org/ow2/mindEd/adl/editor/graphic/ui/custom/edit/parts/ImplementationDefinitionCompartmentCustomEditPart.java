package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindGenericEditPartFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.ImplementationDefinitionCompartmentEditPart;

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
