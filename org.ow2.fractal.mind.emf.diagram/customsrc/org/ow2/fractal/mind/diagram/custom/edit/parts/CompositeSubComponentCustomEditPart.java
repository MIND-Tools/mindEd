package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.ComponentLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeSubComponentCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeSubComponentCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.InterfaceBorderItemLocator;

import adl.diagram.edit.parts.CompositeSubComponentEditPart;
import adl.diagram.edit.parts.SubComponentDefinitionEditPart;

/**
 * Extends CompositeSubComponentEditPart to implement custom behavior
 * - recognize child's custom edit part
 * - disable spacing
 * - set child's default size
 * - implement interface's custom behavior
 * - change the binding's container in case of drag & drop
 * @author maroto
 *
 */
public class CompositeSubComponentCustomEditPart extends
	CompositeSubComponentEditPart {

	

	public CompositeSubComponentCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompositeSubComponentCustomCanonicalEditPolicy());
		// Extended creation features
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeSubComponentCustomItemSemanticEditPolicy());
		// Extended drag and drop features
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
	}
	
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(childEditPart instanceof InterfaceDefinitionCustomEditPart)
		{
			//Make interfaces stick to the component's border
			//Use InterfaceBorderItemLocator
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
		// Extended layout features
		return new ComponentLayoutEditPolicy();
	}
	
		
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		// Get a ComponentLayout
		return ComponentHelper.setupContentPane(nodeShape);
	}
	
//	@Override
//	protected boolean addFixedChild(EditPart childEditPart) {
//		if (childEditPart instanceof CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart) {
//			IFigure body = getPrimaryShape().getFigureCompositeSubBodyArea();
//			// Custom body setup
//			ComponentHelper.setupBody(body);
//			body.add(((CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart) childEditPart)
//							.getFigure());
//			return true;
//		}
//		return super.addFixedChild(childEditPart);
//	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		// Extended drag and drop features
		return ComponentHelper.getDragTracker(this);
	}
	
	@Override
	public void activate() {
		super.activate();
		if (ComponentHelper.isMerged(this))
			// If the component is merged, handle custom behaviour
			ComponentHelper.handleMergedElement(this);
	}
	
	
	
}
