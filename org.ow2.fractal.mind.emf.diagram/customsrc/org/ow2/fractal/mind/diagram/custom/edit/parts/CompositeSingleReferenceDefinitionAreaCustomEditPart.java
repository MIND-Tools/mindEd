package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeSingleReferenceDefinitionAreaCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.OpenDefinitionEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;

import adl.diagram.edit.parts.CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart;

/**
 * This is the area of a CompositeSingleReferenceDefinition
 * @children arguments, templates
 */
public class CompositeSingleReferenceDefinitionAreaCustomEditPart extends
			CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart {

	public CompositeSingleReferenceDefinitionAreaCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompositeSingleReferenceDefinitionAreaCustomCanonicalEditPolicy());
		// To open the referenced definition on double clic
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
				new OpenDefinitionEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new FixedChildrenLayoutEditPolicy());
	}
	
	@Override
	protected void addChild(EditPart childEditPart, int index) {
		super.addChild(childEditPart, index);
		// A listener should be implemented on the parent instead
		getParent().refresh();
	}
	
	@Override
	protected void removeChild(EditPart childEditPart) {
		super.removeChild(childEditPart);
		// A listener should be implemented on the parent instead
		getParent().refresh();
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

}
