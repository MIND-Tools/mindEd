package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindGenericEditPartFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.TemplateDefinitionNameEditPart;

public class TemplateDefinitionNameCustomEditPart extends
				TemplateDefinitionNameEditPart {

	public TemplateDefinitionNameCustomEditPart(View view) {
		super(view);
	}
	
	
	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	
	public void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		//refresh the label on change
		refreshLabel();
	}

}
