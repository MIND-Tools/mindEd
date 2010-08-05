package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import java.net.URL;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.Annotation;
import org.ow2.mindEd.adl.AnnotationsList;
import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.IFractalShape;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;

public abstract class AbstractMindProxy implements IMindTypes {
	
	protected int visualID;
	protected static final String ANNOTATION_EXTENSION_ID = "org.ow2.mindEd.adl.editor.graphic.ui.mindAnnotation";
	protected EditPart editPart;
	public int mindType = TYPE_UNDEFINED;
	
	public AbstractMindProxy(EditPart realEditPart, int vID) {
		if (realEditPart == null) throw new NullPointerException();
		editPart = realEditPart;
		visualID = vID;
	}
	
	public AbstractMindProxy(EditPart realEditPart, int vID, int type) {
		if (realEditPart == null) throw new NullPointerException();
		editPart = realEditPart;
		visualID = vID;
		mindType = type;
	}
	
	/**
	 * @param visualID the visualID of the element
	 * @return the type of the element
	 */
	public static int getMindType(int visualID) {
		return MindProxyFactory.getMindType(visualID);
	}
	
	/**
	 * @return the type of this proxy
	 */
	public int getMindType() {
		return mindType;
	}	
	
	/**
	 * @return the editpart associated with this proxy
	 */
	public EditPart getEditPart() {
		return editPart;
	}
	
	/**
	 * 
	 * @return the EObject associated with the editpart of this proxy
	 */
	public EObject resolveSemanticElement() {
		return ((View) getEditPart().getModel()).getElement();
	}
	
	/**
	 * @return true if the semantic element has an annotation on it
	 */
	public Boolean isAnnotated() {
		Boolean isAnnotated = false;
		
		EObject semantic = resolveSemanticElement();
		if (semantic instanceof Body) {
			semantic = ((Body) semantic).getParentComponent();
		}
		List<EObject> contents = semantic.eContents();
		for (EObject content : contents) {
			if (content instanceof AnnotationsList) {
				isAnnotated = true;
			}
		}
		return isAnnotated;
	}
	
	/**
	 * @return true if the semantic element has the given annotation on it
	 */
	public Boolean hasAnnotation(String annotationName) {
		Boolean hasAnnotation = false;
		
		EObject semantic = resolveSemanticElement();
		if (semantic instanceof Body) {
			semantic = ((Body) semantic).getParentComponent();
		}
		List<EObject> contents = semantic.eContents();
		for (EObject content : contents) {
			if (content instanceof AnnotationsList) {
				List<Annotation> annotations = ((AnnotationsList) content).getAnnotations();
				for (Annotation annotation : annotations) {
					if ((annotation.getName()).compareTo(annotationName) == 0)
						hasAnnotation = true;
				}
			}
		}
		return hasAnnotation;
	}
	
	/**
	 * 
	 * @return the root configuration element of the extension
	 * org.ow2.mindEd.adl.editor.graphic.ui.mindAnnotation
	 */
	protected IConfigurationElement[] getAnnotationExtension() {
		return Platform.getExtensionRegistry()
			.getConfigurationElementsFor(ANNOTATION_EXTENSION_ID);
	}
	
	protected IConfigurationElement getAnnotationExtensionAppearance() {
		// Get the extension
		IConfigurationElement[] config = getAnnotationExtension();
		
		try {
			for (IConfigurationElement element : config) {
				
				// Check if there is the given annotation
				String name = element.getAttribute("annotationName");
				if (name == "" || !hasAnnotation(name))
					continue;
				
				IConfigurationElement[] appearances = element.getChildren("Appearance");
				for (IConfigurationElement appearance : appearances) {
					// This is the appearance parameters
					// Check if the element type match
					IConfigurationElement[] elementTypes = appearance.getChildren("Element");
					for (IConfigurationElement elementType : elementTypes) {
						// This is the element types this extension is applicable on
						String type = elementType.getAttribute("elementType");
						if (type.equals("Components") &&
								(this instanceof MindComponentProxy
								|| this instanceof MindBodyProxy))
							return appearance;
						else if (type.equals("Interfaces") &&
								this instanceof MindInterfaceProxy)
							return appearance;
						else if (type.equals("Bindings") &&
								this instanceof MindBindingProxy)
							return appearance;
					}
				}
			}
			return null;
		} catch (Exception e) {
			MindDiagramEditorPlugin.getInstance().logError("Error in extension mindAnnotation", e);
		}
		return null;
	}
	
	public String getExtensionColor() {
		IConfigurationElement extensionElement = getAnnotationExtensionAppearance();
		if (extensionElement != null) {
			return extensionElement.getAttribute("color");
		}
		return null;
	}
	
	public URL getExtensionIconURL() {
		IConfigurationElement extensionElement = getAnnotationExtensionAppearance();
		if (extensionElement != null && !(this instanceof MindBodyProxy)) {
			String icon = extensionElement.getAttribute("icon");
			String contributor = extensionElement.getContributor().getName();
			
			return Platform.getBundle(contributor).getResource(icon);
		}
		return null;
	}
	
	public String getExtensionIcon() {
		IConfigurationElement extensionElement = getAnnotationExtensionAppearance();
		if (extensionElement != null) {
			return extensionElement.getAttribute("icon");
		}
		return null;
	}
	
	/**
	 * @param color the color to return
	 * @return the color from IFractalShape
	 */
	protected Color getColorFromString(String color) {
		if (color == null)
			return null;
		if (color.equals("Yellow"))
			return IFractalShape.YELLOW;
		else if (color.equals("Light Yellow"))
			return IFractalShape.LIGHT_YELLOW;
		else if (color.equals("Red"))
			return IFractalShape.RED;
		else if (color.equals("Light Red"))
			return IFractalShape.LIGHT_RED;
		else if (color.equals("Blue"))
			return IFractalShape.BLUE;
		else if (color.equals("Light Blue"))
			return IFractalShape.LIGHT_BLUE;
		else if (color.equals("Green"))
			return IFractalShape.GREEN;
		else if (color.equals("Light Green"))
			return IFractalShape.LIGHT_GREEN;
		else if (color.equals("Purple"))
			return IFractalShape.PURPLE;
		else if (color.equals("Light Purple"))
			return IFractalShape.LIGHT_PURPLE;
		else if (color.equals("Orange"))
			return IFractalShape.ORANGE;
		else if (color.equals("Light Orange"))
			return IFractalShape.LIGHT_ORANGE;
		else if (color.equals("Brown"))
			return IFractalShape.BROWN;
		else if (color.equals("Light Brown"))
			return IFractalShape.LIGHT_BROWN;
		else if (color.equals("Grey"))
			return IFractalShape.GREY;
		else if (color.equals("Light Grey"))
			return IFractalShape.LIGHT_GREY;
		
		return null;
	}
	
	
	
	/**
	 * @param color the color to return
	 * @return the light version of the color from IFractalShape
	 */
	protected Color getLightColorFromString(String color) {
		if (color == null)
			return null;
		if (color.equals("Yellow"))
			return IFractalShape.LIGHT_YELLOW;
		else if (color.equals("Light Yellow"))
			return IFractalShape.LIGHT_YELLOW;
		else if (color.equals("Red"))
			return IFractalShape.LIGHT_RED;
		else if (color.equals("Light Red"))
			return IFractalShape.LIGHT_RED;
		else if (color.equals("Blue"))
			return IFractalShape.LIGHT_BLUE;
		else if (color.equals("Light Blue"))
			return IFractalShape.LIGHT_BLUE;
		else if (color.equals("Green"))
			return IFractalShape.LIGHT_GREEN;
		else if (color.equals("Light Green"))
			return IFractalShape.LIGHT_GREEN;
		else if (color.equals("Purple"))
			return IFractalShape.LIGHT_PURPLE;
		else if (color.equals("Light Purple"))
			return IFractalShape.LIGHT_PURPLE;
		else if (color.equals("Orange"))
			return IFractalShape.LIGHT_ORANGE;
		else if (color.equals("Light Orange"))
			return IFractalShape.LIGHT_ORANGE;
		else if (color.equals("Brown"))
			return IFractalShape.LIGHT_BROWN;
		else if (color.equals("Light Brown"))
			return IFractalShape.LIGHT_BROWN;
		else if (color.equals("Grey"))
			return IFractalShape.LIGHT_GREY;
		else if (color.equals("Light Grey"))
			return IFractalShape.LIGHT_GREY;
		
		return null;
	}
	

	
	public static AbstractMindProxy getAbstractMindProxyFor(EditPart editPart) {
		return MindProxyFactory.INSTANCE.getAbstractMindProxyFor(editPart);
	}
	
	public static MindProxy getMindProxyFor(GraphicalEditPart editPart) {
		return MindProxyFactory.INSTANCE.getMindProxyFor(editPart);
	}
	
	public static MindBindingProxy getMindProxyFor(ConnectionEditPart editPart) {
		return MindProxyFactory.INSTANCE.getMindProxyFor(editPart);
	}
	
	/**
	 * Should be removed
	 * @param editPart
	 * @return the MindProxy associated to editPart if it is a GraphicalEditPart
	 * @throws IllegalArgumentException if editPart is not a GraphicalEditPart
	 */
	@Deprecated
	public static MindProxy getMindProxyFor(EditPart editPart) {
		if (editPart instanceof GraphicalEditPart)
			return getMindProxyFor((GraphicalEditPart)editPart);
		else
			throw new IllegalArgumentException();
	}
	
}
