package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import adl.diagram.edit.parts.CompositeBodyCompartmentEditPart;

public class CompositeBodyCompartmentCustomEditPart extends
		CompositeBodyCompartmentEditPart{

	public CompositeBodyCompartmentCustomEditPart(View view) {
		super(view);
	}

	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	
	
	@Override
	protected LayoutManager getLayoutManager() {
		LayoutManager lm = genericEditPart.getLayoutManager();
		if (lm == null)
			lm = super.getLayoutManager();
		return lm;
	}
}
