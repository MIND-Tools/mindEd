package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomXYLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.TemplateSpecifiersListAreaCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;

import adl.diagram.edit.parts.TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart;

public class TemplateSpecifiersListAreaCustomEditPart extends
		TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart {
	
	protected MindEditPart genericEditPart = MindEditPart.createGenericEditPart (this, VISUAL_ID);

	public TemplateSpecifiersListAreaCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.installEditPolicies();
	}
	
	@Override
	protected void addChild(EditPart childEditPart, int index) {
		super.addChild(childEditPart, index);
		getParent().refresh();
	}
	
	@Override
	protected void removeChild(EditPart childEditPart) {
		super.removeChild(childEditPart);
		getParent().refresh();
	}
	
	/**
	 * The layout manager of this edit part
	 */
	protected LayoutManager layoutManager;
	
	/**
	 * Returns the layout manager to be used by this shape compartment.
	 */
	@Override
	protected LayoutManager getLayoutManager() {
		if (layoutManager == null) {
			layoutManager = genericEditPart.getLayoutManager(layoutManager);
		}
		return layoutManager;
	}

}
