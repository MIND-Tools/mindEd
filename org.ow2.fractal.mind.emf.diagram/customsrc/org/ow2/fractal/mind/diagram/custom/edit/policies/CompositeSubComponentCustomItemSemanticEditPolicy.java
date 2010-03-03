package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.parts.CompositeReferenceDefinition2EditPart;
import adl.diagram.edit.policies.SubComponentDefinitionItemSemanticEditPolicy;
import adl.diagram.part.MindVisualIDRegistry;

public class CompositeSubComponentCustomItemSemanticEditPolicy extends
		SubComponentDefinitionItemSemanticEditPolicy {
	
	// A sub component can't be override
	protected Command getCreateCommand(CreateElementRequest req) {

		// Allow the creation of a reference
		if (req.getElementType() instanceof IHintedType) {
			IHintedType type = (IHintedType) req.getElementType();
			int vid = MindVisualIDRegistry.getVisualID(type.getSemanticHint());
			if (vid == CompositeReferenceDefinition2EditPart.VISUAL_ID)
				return super.getCreateCommand(req);
		}
		// But nothing else to prevent override
		return null;
	}

}
