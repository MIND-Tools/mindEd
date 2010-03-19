package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;

import adl.diagram.edit.parts.ArgumentDefinitionNameEditPart;

/**
 * Stands for the label of an ArgumentDefinition
 * @author maroto
 *
 */
public class ArgumentDefinitionNameCustomEditPart extends
		ArgumentDefinitionNameEditPart {

	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	public ArgumentDefinitionNameCustomEditPart(View view) {
		super(view);
	}
	
	public void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		//refresh the label on change
		refreshLabel();
	}

}
