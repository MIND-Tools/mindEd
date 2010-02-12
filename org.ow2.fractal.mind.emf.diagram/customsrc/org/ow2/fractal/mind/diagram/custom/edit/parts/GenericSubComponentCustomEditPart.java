package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartListener;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.ow2.fractal.mind.diagram.custom.edit.policies.ComponentLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.TemplateSubComponentCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.TemplateSubComponentCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.figures.IFractalShape;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.InterfaceBorderItemLocator;

import adl.diagram.edit.parts.CompositeReferenceDefinition2EditPart;
import adl.diagram.edit.parts.TemplateSubComponentCompartmentTemplateSubBodyEditPart;
import adl.diagram.edit.parts.TemplateSubComponentEditPart;

/**
 * This implementation uses generated TemplateSubComponent to stand for different type of sub components.
 * It can be :<ul>
 * <li>TemplateSubComponent : a sub component referencing a template specifier
 * <li>CompositeSubComponent
 * <li>PrimitiveSubComponent
 * </ul> 
 * In any case, it must have a reference. Each type of component has its own color, and a custom behavior is
 * implemented to switch color depending on the referenced item.
 * @author omarot
 *
 */
public class GenericSubComponentCustomEditPart extends
		TemplateSubComponentEditPart implements IFractalShape {

	public GenericSubComponentCustomEditPart(View view) {
		super(view);
	}	
	
	/**
	 * Undefined type means we don't know which type the component is
	 */
	public static final int TYPE_UNDEFINED = 0; 
	/**
	 * The component is a TemplateSubComponent
	 */
	public static final int TYPE_TEMPLATE = 1; 
	/**
	 * The component is a CompositeSubComponent
	 */
	public static final int TYPE_COMPOSITE = 2; 
	/**
	 * The component is a PrimitiveSubComponent
	 */
	public static final int TYPE_PRIMITIVE = 3;
	
	/**
	 * The current type of the component
	 */
	protected int current_type = TYPE_UNDEFINED;
	
	/**
	 * Sets the type of the component
	 * @param type : TYPE_UNDEFINED, TYPE_TEMPLATE, TYPE_COMPOSITE or TYPE_PRIMITIVE
	 */
	protected void setType(int type) {
		if (type != current_type) {
			current_type = type;
			switch (type) {
			case TYPE_UNDEFINED :
				setColor(LIGHT_GRAY);
				break;
			case TYPE_TEMPLATE :
				setColor(LIGHT_YELLOW);
				break;
			case TYPE_COMPOSITE :
				setColor(LIGHT_PURPLE);
				break;
			case TYPE_PRIMITIVE :
				setColor(LIGHT_ORANGE);
				break;
			}
		}
	}
	
	// TODO
	protected void setColor(Color color) {
		setBackgroundColor(color);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new TemplateSubComponentCustomCanonicalEditPolicy());
		// No creation
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TemplateSubComponentCustomItemSemanticEditPolicy());
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		// Get a ComponentLayout
		return ComponentHelper.setupContentPane(nodeShape);
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
		if(childEditPart instanceof CompositeReferenceDefinition2EditPart)
		{
			EditPartListener listener = new EditPartListener.Stub() {
				@Override
				public void removingChild(EditPart child, int index) {
					setType(TYPE_UNDEFINED);
				}
			};
			addEditPartListener(listener);
		}
		super.addChildVisual(childEditPart, -1);
	}
	
	@Override
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TemplateSubComponentCompartmentTemplateSubBodyEditPart) {
			IFigure body = getPrimaryShape().getFigureTemplateSubBodyArea();
			ComponentHelper.setupBody(body);
			body.add(((TemplateSubComponentCompartmentTemplateSubBodyEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return super.addFixedChild(childEditPart);
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		return ComponentHelper.getDragTracker(this);
	}
	
	@Override
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new ComponentLayoutEditPolicy();
	}
}
