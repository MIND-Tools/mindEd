package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.ComponentLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.PrimitiveAnonymousSubComponentCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.InterfaceBorderItemLocator;

import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart;
import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentEditPart;

/**
 * Extends PrimitiveAnonymousSubComponentEditPart to implement custom behavior
 * - recognize child's custom edit part
 * - disable spacing
 * - set child's default size
 * - implement interface's custom behavior
 * - change the binding's container in case of drag & drop<p>
 * This is a primitive anonymous sub component's main edit part
 * @author maroto
 *
 */
public class PrimitiveAnonymousSubComponentCustomEditPart extends
				PrimitiveAnonymousSubComponentEditPart {

	public PrimitiveAnonymousSubComponentCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PrimitiveAnonymousSubComponentCustomCanonicalEditPolicy());
		// Extended drag and drop features
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		// Get a ComponentLayout
		return ComponentHelper.setupContentPane(nodeShape);
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		// Extended drag and drop features
		return ComponentHelper.getDragTracker(this);
	}
	
	
	
	@Override
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart) {
			IFigure body = getPrimaryShape()
					.getFigurePrimitiveAnonymousSubBodyArea();
			// Custom body setup
			ComponentHelper.setupBody(body);
			body.add(((PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return super.addFixedChild(childEditPart);
	}

	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(childEditPart instanceof InterfaceDefinitionCustomEditPart)
		{
			//Implements interface's custom behavior
			InterfaceBorderItemLocator locator = new InterfaceBorderItemLocator(
					getMainFigure());
			getBorderedFigure().getBorderItemContainer().add(
					((InterfaceDefinitionCustomEditPart) childEditPart).getFigure(), locator);
			return;
		}
		else if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}
	
	@Override
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new ComponentLayoutEditPolicy();
	}
	

	@Override
	public void activate() {
		super.activate();
		if (ComponentHelper.isMerged(this)) 
			// If the component is merged then handle custom behaviour
			ComponentHelper.handleMergedElement(this);
	}

}
