package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;

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

	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	

	
//	public void refresh() {
//		super.refresh();
//		genericEditPart.refresh();
//	}
	
	

}
