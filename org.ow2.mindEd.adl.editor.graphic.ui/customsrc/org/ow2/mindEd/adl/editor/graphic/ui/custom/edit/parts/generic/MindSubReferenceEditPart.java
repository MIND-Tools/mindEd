package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.listeners.MindListLayoutListener;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;

public class MindSubReferenceEditPart extends MindReferenceEditPart {

	
	
	public MindSubReferenceEditPart(GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_REFERENCE);
	}
	
	public MindSubReferenceEditPart(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}
	
	@Override
	public IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	
	public ComponentReference resolveSemanticElement() {
		View view = ((View)realEditPart.getModel());
		return ((ComponentReference)view.getElement());
	}

}
