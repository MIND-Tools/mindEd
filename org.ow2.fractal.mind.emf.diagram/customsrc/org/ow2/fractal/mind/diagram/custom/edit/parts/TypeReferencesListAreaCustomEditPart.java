package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.internal.figures.NestedResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferencesListAreaCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferencesListAreaCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.NoDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.TypeReferencesListAreaCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;

import adl.diagram.edit.parts.TypeReferencesListCompartmentReferencesListAreaEditPart;

public class TypeReferencesListAreaCustomEditPart extends
		TypeReferencesListCompartmentReferencesListAreaEditPart {

	public TypeReferencesListAreaCustomEditPart(View view) {
		super(view);
	}
	
	protected ConstrainedFlowLayout layoutManager;
	
	/**
	 * Custom layout
	 */
	protected ConstrainedFlowLayout getLayoutManager() {
		if (layoutManager == null) {
			layoutManager = new ConstrainedFlowLayout(false);
		}
		return layoutManager;
	}
	
	public IFigure createFigure() {
		ResizableCompartmentFigure rcf;
		if (getParent() == getTopGraphicEditPart()){
			rcf = (ResizableCompartmentFigure) super.createFigure();
		} else {
			rcf = new NestedResizableCompartmentFigure(getMapMode());
		}
		
		ConstrainedFlowLayout layout = getLayoutManager();
		rcf.getContentPane().setLayoutManager(layout);		
		return rcf;
	}

	/**
	 * Custom layout edit policy to support the custom layout manager
	 */
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
//		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
//				new TypeReferencesListAreaCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new NoDragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new TypeReferencesListAreaCustomCanonicalEditPolicy());
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new FixedChildrenLayoutEditPolicy();
	}
	
	@Override
	public void refresh() {
		super.refresh();
		getParent().refresh();
	}

}
