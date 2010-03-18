package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.ow2.fractal.mind.diagram.custom.edit.parts.InterfaceDefinitionCustomEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.policies.*;
import org.ow2.fractal.mind.diagram.custom.figures.AbstractComponentShape;
import org.ow2.fractal.mind.diagram.custom.figures.ContainerShape;
import org.ow2.fractal.mind.diagram.custom.layouts.ComponentLayout;
import org.ow2.fractal.mind.diagram.custom.layouts.InterfaceBorderItemLocator;
import org.ow2.fractal.mind.diagram.custom.providers.CustomDragEditPartsTracker;

public class MindComponentEditPart extends MindEditPart {
	
	public MindComponentEditPart (GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_COMPONENT);
	}
	
	public MindComponentEditPart(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}
	
	@Override
	public void createDefaultEditPolicies(){
		super.createDefaultEditPolicies();
		
		realEditPart.installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		
		realEditPart.installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
		
		realEditPart.installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new ComponentLayoutEditPolicy());
	};
	
	
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
	
	/**
	 * Call this to implement our custom drag tracker which gives us extended drag and drop features
	 * @param ep
	 * @return
	 */
	public DragTracker getDragTracker(Request request) {
		return new CustomDragEditPartsTracker(realEditPart);
	}
	
	@Override
	public boolean addFixedChild(EditPart childEditPart) {
		if (getMindEditPartFor(childEditPart) instanceof MindCompartmentEditPart) {
			IFigure compartment = getCompartmentFigure();
			if (compartment == null) return false;
			// Set the layout
			setupCompartment(compartment);
			compartment.add(((GraphicalEditPart) childEditPart)
							.getFigure());
			return true;
		}
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
	
}
