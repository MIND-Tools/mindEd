package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindComponentEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.policies.ComponentLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;

import adl.diagram.edit.parts.CompositeComponentDefinitionEditPart;

/**
 * Extends CompositeComponentDefinitionEditPart to implement custom behavior
 * - recognize child's custom edit part
 * - disable spacing
 * - set child's default size
 * - implement interface's custom behavior
 * - change the binding's container in case of drag & drop
 * @author maroto
 *
 */
public class CompositeComponentDefinitionCustomEditPart extends
		CompositeComponentDefinitionEditPart {
	
	protected MindEditPart genericEditPart = MindEditPart.createGenericEditPart (this, VISUAL_ID);
	
	public CompositeComponentDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.installEditPolicies();
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		// Get a ComponentLayout
		return genericEditPart.setupContentPane(nodeShape);
	}

	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (genericEditPart.addChildVisual(childEditPart, index)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}
	
	@Override
	protected boolean addFixedChild(EditPart childEditPart) {
//		if (childEditPart instanceof CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart) {
//			IFigure body = getPrimaryShape().getFigureCompositeBodyArea();
//			// Set the layout
//			ComponentHelper.setupBody(body);
//			body.add(((CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart) childEditPart)
//							.getFigure());
//			return true;
//		}
		if (genericEditPart.addFixedChild(childEditPart)) return true;
		return super.addFixedChild(childEditPart);
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		// Extended drag and drop features
		return ComponentHelper.getDragTracker(this);
	}
	
	@Override
	protected LayoutEditPolicy createLayoutEditPolicy() {
		// Extended drag and drop features
		return new ComponentLayoutEditPolicy();
	}
	

	@Override
	public void activate() {
		super.activate();
		if (ComponentHelper.isMerged(this)) 
			// If the component is merged handle custom behaviour
			ComponentHelper.handleMergedElement(this);
	}
	
	
	

}
