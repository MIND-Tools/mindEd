package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import org.ow2.fractal.mind.diagram.custom.edit.policies.ComponentLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.PrimitiveSubComponentCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.PrimitiveSubComponentCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.InterfaceBorderItemLocator;

import adl.diagram.edit.parts.PrimitiveSubComponentEditPart;

/**
 * Extends PrimitiveSubComponentEditPart to implement custom behavior
 * - recognize child's custom edit part
 * - disable spacing
 * - set child's default size
 * - implement interface's custom behavior
 * - change the binding's container in case of drag & drop
 * @author maroto
 *
 */
public class PrimitiveSubComponentCustomEditPart extends
		PrimitiveSubComponentEditPart {

	public PrimitiveSubComponentCustomEditPart(View view) {
		super(view);
	}
	
	protected MindEditPart genericEditPart = MindGenericEditPartFactory.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	
		
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		IFigure shape = genericEditPart.setupContentPane(nodeShape);
		if (shape == null)
			shape = super.setupContentPane(nodeShape);
		return shape;
	}
	
	@Override
	protected boolean addFixedChild(EditPart childEditPart) {
		if (genericEditPart.addFixedChild(childEditPart)) return true;
		return super.addFixedChild(childEditPart);
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		DragTracker tracker = genericEditPart.getDragTracker(request);
		if (tracker == null)
			tracker = super.getDragTracker(request);
		return tracker;
	}
	
	@Override
	public void activate() {
		super.activate();
		genericEditPart.activate();
	}

}
