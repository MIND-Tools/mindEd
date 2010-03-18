package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPartFactory;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferenceCompartmentCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferenceCompartmentCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSuperCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;

import adl.diagram.edit.parts.CompositeReferenceCompartmentEditPart;

/**
 * Area of a {@link CompositeReferenceCustomEditPart}
 * @author maroto
 *
 */
public class CompositeReferenceCompartmentCustomEditPart extends
		CompositeReferenceCompartmentEditPart {

	protected MindEditPart genericEditPart = MindEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	public CompositeReferenceCompartmentCustomEditPart(View view) {
		super(view);
	}
		
	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result =
			(ResizableCompartmentFigure) super.createFigure();
		// Change the layout manager
		genericEditPart.setLayoutManager(result);
		return result;
	}

	
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
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
		genericEditPart.activate();
	}
	
	
	@Override
	public void refresh() {
		super.refresh();
		getParent().refresh();
	}

}
