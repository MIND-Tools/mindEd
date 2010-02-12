package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.parts.TemplateSpecifierNameEditPart;


/**
 * Extends TemplateSpecifierEditPart to implement custom behavior
 * - refresh the label on change
 * @author maroto
 *
 */
public class TemplateSpecifierNameCustomEditPart extends
			TemplateSpecifierNameEditPart {
	
	public TemplateSpecifierNameCustomEditPart(View view) {
		super(view);
	}

	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		//refresh the label on change
		this.refreshLabel();
	}

}
