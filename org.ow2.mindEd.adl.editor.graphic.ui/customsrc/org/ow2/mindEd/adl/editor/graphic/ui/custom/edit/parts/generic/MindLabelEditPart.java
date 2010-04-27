package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;

public class MindLabelEditPart extends MindEditPart {

	public MindLabelEditPart(GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_LABEL);
	}
	
	public MindLabelEditPart(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}
	
	// Nothing special

}
