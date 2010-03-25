//package org.ow2.fractal.mind.diagram.custom.edit.parts;
//
//import org.eclipse.draw2d.LayoutManager;
//import org.eclipse.gef.DragTracker;
//import org.eclipse.gef.EditPart;
//import org.eclipse.gef.Request;
//import org.eclipse.gmf.runtime.notation.View;
//import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
//import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
//import adl.diagram.edit.parts.CompositeSubReferenceCompartmentEditPart;
//
///**
// * This is the area of a CompositeSingleReferenceDefinition
// * @children arguments, templates
// */
//public class CompositeSubReferenceCompartmentCustomEditPart extends
//				CompositeSubReferenceCompartmentEditPart {
//
//	public CompositeSubReferenceCompartmentCustomEditPart(View view) {
//		super(view);
//	}
//	
//	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
//	
//	@Override
//	public void refresh() {
//		super.refresh();
//		genericEditPart.refresh();
//	}
//
//	@Override
//	public void createDefaultEditPolicies() {
//		super.createDefaultEditPolicies();
//		genericEditPart.createDefaultEditPolicies();
//	}
//	
//	public DragTracker getDragTracker(Request request) {
//		DragTracker tracker = genericEditPart.getDragTracker(request);
//		if (tracker == null)
//			tracker = super.getDragTracker(request);
//		return tracker;
//	}
//	
//	@Override
//	public void activate() {
//		super.activate();
//		genericEditPart.activate();
//	}
//	
//	@Override
//	protected LayoutManager getLayoutManager() {
//		LayoutManager layoutManager = genericEditPart.getLayoutManager();
//		if (layoutManager == null) {
//			layoutManager = super.getLayoutManager();
//		}
//		return layoutManager;
//	}
//	
//	
////	/**
////	 * Remember the layout manager
////	 */
////	protected LayoutManager layoutManager; 
////	
////		
//	
////
////	/**
////	 * Implements a ConstrainedToolbarLayout
////	 * @return
////	 */
////	protected LayoutManager getLayoutManager() {
////		if (layoutManager == null) {
////			layoutManager = new ConstrainedFlowLayout(false);
////			((ConstrainedFlowLayout)layoutManager).setMinorSpacing(0);
////			((ConstrainedFlowLayout)layoutManager).setMajorSpacing(0);
////			((ConstrainedFlowLayout)layoutManager).setObserveVisibility(true);
////			((ConstrainedFlowLayout)layoutManager).setMinorAlignment(ConstrainedFlowLayout.ALIGN_LEFTTOP);
////			((ConstrainedFlowLayout)layoutManager).setMajorAlignment(ConstrainedFlowLayout.ALIGN_LEFTTOP);
////		}
////		return layoutManager;
////	}
//
//}
