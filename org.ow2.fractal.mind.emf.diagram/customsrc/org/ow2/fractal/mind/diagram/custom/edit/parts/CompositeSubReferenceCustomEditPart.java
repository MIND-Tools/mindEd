package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import adl.diagram.edit.parts.CompositeSubReferenceEditPart;

/**
 * This is a single reference, meaning it is contained in a sub component
 * @author maroto
 *
 */
public class CompositeSubReferenceCustomEditPart extends
			CompositeSubReferenceEditPart {

	
	public CompositeSubReferenceCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		IFigure shape = genericEditPart.setupContentPane(nodeShape);
		if (shape != null) return shape;
		return super.setupContentPane(nodeShape);
	}
	
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		DragTracker tracker = genericEditPart.getDragTracker(request);
		if (tracker == null)
			tracker = super.getDragTracker(request);
		return tracker;
	}
	
//	/**
//	 * Returns the area : CompositeSingleReferenceDefinitionAreaCustomEditPart
//	 */
//	@Override
//	public EditPart getPrimaryChildEditPart() {
//		return getChildBySemanticHint(MindVisualIDRegistry
//				.getType(CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID));
//	}
	
	


//	/**
//	 * Returns the area : CompositeSingleReferenceDefinitionAreaCustomEditPart
//	 */
//	public CompositeSubReferenceCompartmentCustomEditPart getPane() {
//		EditPart pane = getChildBySemanticHint(MindVisualIDRegistry
//				.getType(CompositeSingleReferenceDefinitionAreaCustomEditPart.CompositeSubReferenceCompartmentCustomEditPart));
//		if (pane instanceof CompositeSubReferenceCompartmentCustomEditPart)
//			return (CompositeSubReferenceCompartmentCustomEditPart) pane;
//		return null;
//	}
}
