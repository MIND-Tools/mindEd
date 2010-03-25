package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.swt.graphics.Color;
import org.ow2.fractal.mind.diagram.custom.edit.policies.*;
import org.ow2.fractal.mind.diagram.custom.figures.AbstractComponentShape;
import org.ow2.fractal.mind.diagram.custom.figures.IFractalShape;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.ComponentLayout;
import org.ow2.fractal.mind.diagram.custom.providers.CustomDragEditPartsTracker;
import org.ow2.fractal.mind.diagram.custom.providers.DragEditPartsCustomTracker;
import org.ow2.fractal.mind.diagram.custom.providers.NoDragTracker;

import adl.diagram.edit.parts.*;

public class MindComponentEditPart extends MindEditPart {

	/**
	 * The edit part if it is a BorderedShapeEditPart
	 * May be null.
	 */
	AbstractBorderedShapeEditPart borderedEditPart;
	
	public MindComponentEditPart (GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_COMPONENT);
		if (editPart instanceof AbstractBorderedShapeEditPart)
			borderedEditPart = (AbstractBorderedShapeEditPart) editPart;
	}
	
	public MindComponentEditPart(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
		if (editPart instanceof AbstractBorderedShapeEditPart)
			borderedEditPart = (AbstractBorderedShapeEditPart) editPart;
	}
	
	@Override
	public void createDefaultEditPolicies(){
		super.createDefaultEditPolicies();
		
		realEditPart.installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindSubCreationEditPolicy());
		
		realEditPart.installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
		
		realEditPart.installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new ComponentLayoutEditPolicy());
	};
	
	
	public DragTracker getDragTracker(EditPart ep) {
		return new DragEditPartsCustomTracker(ep);
	}
	
	
	/**
	 * Call this instead of generated setupContentPane to implement our custom layout
	 * @param nodeShape
	 * @return
	 */
	public IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			// Custom Layout
			ComponentLayout layout = new ComponentLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	@Override
	public boolean addFixedChild(EditPart childEditPart) {
//		if (getMindEditPartFor(childEditPart) instanceof MindCompartmentEditPart) {
//			IFigure compartment = getCompartmentFigure();
//			if (compartment == null) return false;
//			// Set the layout
//			setupCompartment(compartment);
//			compartment.add(((GraphicalEditPart) childEditPart)
//							.getFigure());
//			return true;
//		}
		return false;
	}
	
	/**
	 * Call this for compartment edit parts instead of generated setupContentPane, to keep
	 * the default layout but without the annoying 5 pixels spacing
	 * @param body
	 * @return
	 */
	public IFigure setupCompartment(IFigure compartment) {
		if (compartment.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout() ;
			compartment.setLayoutManager(layout);
		}
		return compartment; // use compartment itself as contentPane
	}
	
	public IFigure getCompartmentFigure() {
		try {
			
			Method meth = realEditPart.getClass().getMethod("getPrimaryShape", null);
			AbstractComponentShape result = (AbstractComponentShape) meth.invoke(realEditPart, null);
			return result.getCompartment();
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} 
		
		return null;
	}
	
	public int getComponentType() {
		if (realEditPart instanceof CompositeComponentDefinitionEditPart)
			return COMPONENT_COMPOSITE;
		if (realEditPart instanceof CompositeSubComponentEditPart)
			return COMPONENT_SUB_COMPOSITE;
		if (realEditPart instanceof PrimitiveComponentDefinitionEditPart)
			return COMPONENT_PRIMITIVE;
		if (realEditPart instanceof PrimitiveSubComponentEditPart)
			return COMPONENT_SUB_PRIMITIVE;
		if (realEditPart instanceof ComponentTypeDefinitionEditPart)
			return COMPONENT_TYPE;
		return COMPONENT_UNDEFINED;
	}
	
	
	public Color getMindBorderColor() {
		switch(getComponentType()) {
		case COMPONENT_COMPOSITE:
			return IFractalShape.BLUE;
		case COMPONENT_SUB_COMPOSITE:
			return IFractalShape.PURPLE;
		case COMPONENT_PRIMITIVE:
			return IFractalShape.RED;
		case COMPONENT_SUB_PRIMITIVE:
			return IFractalShape.ORANGE;
		case COMPONENT_TYPE:
			return IFractalShape.GRAY;
		}
		return IFractalShape.GRAY;
	}
	
	public Color getMindBackgroundColor() {
		switch(getComponentType()) {
		case COMPONENT_COMPOSITE:
			return IFractalShape.LIGHT_BLUE;
		case COMPONENT_SUB_COMPOSITE:
			return IFractalShape.LIGHT_PURPLE;
		case COMPONENT_PRIMITIVE:
			return IFractalShape.LIGHT_RED;
		case COMPONENT_SUB_PRIMITIVE:
			return IFractalShape.LIGHT_ORANGE;
		case COMPONENT_TYPE:
			return IFractalShape.LIGHT_GRAY;
		}
		return IFractalShape.LIGHT_GRAY;
	}
	
	public Dimension getMindPreferredSize() {
		switch(getComponentType()) {
		case COMPONENT_COMPOSITE:
		case COMPONENT_PRIMITIVE:
		case COMPONENT_TYPE:
			return new Dimension(500,500);
		case COMPONENT_SUB_COMPOSITE:
		case COMPONENT_SUB_PRIMITIVE:
			return new Dimension(200,200);
		default :
			return super.getMindPreferredSize();	
		}
	}
	
	@Override
	public void activate() {
		super.activate();
		realEditPart.refresh();
	}
	
	
	
}
