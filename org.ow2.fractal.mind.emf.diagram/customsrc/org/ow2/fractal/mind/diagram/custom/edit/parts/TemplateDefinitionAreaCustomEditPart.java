package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.TemplateDefinitionAreaCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.TemplateDefinitionAreaCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;

import adl.diagram.edit.parts.TemplateDefinitionTemplateDefinitionAreaEditPart;

public class TemplateDefinitionAreaCustomEditPart extends
		TemplateDefinitionTemplateDefinitionAreaEditPart {

	public TemplateDefinitionAreaCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Extended layout features
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// Extended creation features
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindSubCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TemplateDefinitionAreaCustomItemSemanticEditPolicy());
		// No drag and drop
		removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
		// Custom canonical edit policy
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new TemplateDefinitionAreaCustomCanonicalEditPolicy());
	}
	
	/**
	 * Remember the layout manager
	 */
	protected LayoutManager layoutManager; 
	
		
	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		// Change the layout manager
		result.setLayoutManager(getLayoutManager());
		return result;
	}

	/**
	 * Implements a ConstrainedToolbarLayout
	 * @return
	 */
	protected LayoutManager getLayoutManager() {
		if (layoutManager == null) {
			layoutManager = new ConstrainedFlowLayout(false);
			((ConstrainedFlowLayout)layoutManager).setMinorSpacing(0);
			((ConstrainedFlowLayout)layoutManager).setMajorSpacing(0);
			((ConstrainedFlowLayout)layoutManager).setObserveVisibility(true);
			((ConstrainedFlowLayout)layoutManager).setMinorAlignment(ConstrainedFlowLayout.ALIGN_LEFTTOP);
			((ConstrainedFlowLayout)layoutManager).setMajorAlignment(ConstrainedFlowLayout.ALIGN_LEFTTOP);
		}
		return layoutManager;
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new FixedChildrenLayoutEditPolicy();
	}

	@Override
	protected void addChild(EditPart childEditPart, int index) {
		super.addChild(childEditPart, index);
		// Should implement a listener instead
		// and use handleChildAdded
		getParent().refresh();
	}
	
	@Override
	protected void removeChild(EditPart childEditPart) {
		super.removeChild(childEditPart);
		// Should implement a listener instead
		// and use handleChildRemoved
		getParent().refresh();
	}
	

	@Override
	public void activate() {
		super.activate();
		if (ComponentHelper.isMerged(this)) 
			// If the component is merged handle custom behaviour
			ComponentHelper.handleMergedElement(this);
		getParent().refresh();
	}
	
	@Override
	public void refresh() {
		super.refresh();
		getParent().refresh();
	}

}
