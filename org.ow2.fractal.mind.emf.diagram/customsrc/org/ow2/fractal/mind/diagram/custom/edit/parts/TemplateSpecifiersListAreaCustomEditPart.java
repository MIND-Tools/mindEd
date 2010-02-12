package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.TemplateSpecifiersListAreaCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;

import adl.diagram.edit.parts.TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart;

public class TemplateSpecifiersListAreaCustomEditPart extends
		TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart {

	public TemplateSpecifiersListAreaCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new TemplateSpecifiersListAreaCustomCanonicalEditPolicy());
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
	 * This implemantion returns a ConstrainedFlowLayout instance.
	 */
	protected LayoutManager getLayoutManager() {
		if (layoutManager == null) {
			layoutManager = new ConstrainedFlowLayout(true);
			((ConstrainedFlowLayout)layoutManager).setMinorSpacing(0);
			((ConstrainedFlowLayout)layoutManager).setMajorSpacing(0);
		}
		return layoutManager;
	}

}
