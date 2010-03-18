package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPartFactory;

import adl.diagram.edit.parts.CompositeBodyEditPart;

public class CompositeBodyCustomEditPart extends CompositeBodyEditPart {

	protected MindEditPart genericEditPart = MindEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	public CompositeBodyCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	
	
	@Override
	protected boolean addFixedChild(EditPart childEditPart) {
		if (genericEditPart.addFixedChild(childEditPart)) return true;
		return super.addFixedChild(childEditPart);
	}
	
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(genericEditPart.addChildVisual(childEditPart, index))
			return;
		super.addChildVisual(childEditPart, index);
	}

}
