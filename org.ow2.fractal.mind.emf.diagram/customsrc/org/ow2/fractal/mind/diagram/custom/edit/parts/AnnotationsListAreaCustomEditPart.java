/**
 * Not used yet - annotations disabled
 */

//package org.ow2.fractal.mind.diagram.custom.edit.parts;
//
//import org.eclipse.gef.EditPart;
//import org.eclipse.gmf.runtime.notation.View;
//
//import adl.diagram.edit.parts.AnnotationsListCompartmentAnnotationsAreaEditPart;
//
///**
// * Refresh the parent if a child is added or removed.
// * The parent (AnnotationsListEditPart) needs it to refresh his size
// * @author maroto
// *
// */
//public class AnnotationsListAreaCustomEditPart extends
//		AnnotationsListCompartmentAnnotationsAreaEditPart {
//
//	public AnnotationsListAreaCustomEditPart(View view) {
//		super(view);
//	}
//	
//	@Override
//	protected void addChild(EditPart childEditPart, int index) {
//		super.addChild(childEditPart, index);
//		getParent().refresh();
//	}
//	
//	@Override
//	protected void removeChild(EditPart childEditPart) {
//		super.removeChild(childEditPart);
//		getParent().refresh();
//	}
//
//}
