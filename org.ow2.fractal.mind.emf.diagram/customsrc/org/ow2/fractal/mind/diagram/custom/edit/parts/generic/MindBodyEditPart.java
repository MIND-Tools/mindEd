package org.ow2.fractal.mind.diagram.custom.edit.parts.generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.ow2.fractal.mind.diagram.custom.edit.parts.InterfaceDefinitionCustomEditPart;
import org.ow2.fractal.mind.diagram.custom.figures.AbstractComponentShape;
import org.ow2.fractal.mind.diagram.custom.layouts.InterfaceBorderItemLocator;

public class MindBodyEditPart extends MindEditPart {
	
	protected AbstractBorderedShapeEditPart realEditPart;

	public MindBodyEditPart(GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_BODY);
		if (editPart instanceof AbstractBorderedShapeEditPart) {
			realEditPart = (AbstractBorderedShapeEditPart) editPart;
		}
		else throw new IllegalArgumentException();
	}
	
	public MindBodyEditPart(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
		if (editPart instanceof AbstractBorderedShapeEditPart) {
			realEditPart = (AbstractBorderedShapeEditPart) editPart;
		}
		else throw new IllegalArgumentException();
	}

	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
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
		if(getMindEditPartFor(childEditPart) instanceof MindInterfaceEditPart)
		{
			//Make interfaces stick to the component's border
			//Use InterfaceBorderItemLocator
			InterfaceBorderItemLocator locator = new InterfaceBorderItemLocator(
					realEditPart.getMainFigure());
			realEditPart.getBorderedFigure().getBorderItemContainer().add(
					((InterfaceDefinitionCustomEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}
	
	public IFigure getCompartmentFigure() {
		try {
			
			Method meth = realEditPart.getClass().getMethod("getPrimaryShape", (Class<?>) null);
			AbstractComponentShape result = (AbstractComponentShape) meth.invoke(realEditPart, (Class<?>) null);
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
	
}
