package adl.custom.impl;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;

import adl.AdlPackage;
import adl.AnnotationsList;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.Element;
import adl.TemplateSpecifier;
import adl.TemplateSpecifiersList;
import adl.custom.util.adapters.factory.AdlAdapterHelperFactory;
import adl.helpers.ArchitectureDefinitionHelper;
import adl.impl.TemplateSubComponentImpl;

/**
 * <b>Class</b> <i>TemplateSubComponentCustomImpl</i>
 * <p>
 * This class extends generated class PrimitiveSubComponentImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link adl.custom.impl.TemplateSubComponentCustomImpl#getReferenceDefinition <em>getReferenceDefinition</em>}</li>
 * <li>{@link adl.custom.impl.TemplateSubComponentCustomImpl#setReferenceDefinition <em>setReferenceDefinition</em>}</li>
 * <li>{@link adl.custom.impl.TemplateSubComponentCustomImpl#getTemplateReference <em>getTemplateReference</em>}</li>
 * <li>{@link adl.custom.impl.TemplateSubComponentCustomImpl#getHelper <em>getHelper</em>}</li>
 * <li>{@link adl.custom.impl.TemplateSubComponentCustomImpl#getActiveDefinitionCallsList <em>getActiveDefinitionCallsList</em>}</li>
 * <li>{@link adl.custom.impl.TemplateSubComponentCustomImpl#setActiveDefinitionCallsList <em>setActiveDefinitionCallsList</em>}</li>
 * <li>{@link adl.custom.impl.TemplateSubComponentCustomImpl#getLinkedAnnotationsList <em>getLinkedAnnotationsList</em>}</li>
 * <li>{@link adl.custom.impl.TemplateSubComponentCustomImpl#setLinkedAnnotationsList <em>setLinkedAnnotationsList</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends
 */
public class TemplateSubComponentCustomImpl extends TemplateSubComponentImpl {
	/**
	 * String oldreferenceValue : Remember last valid value for calculation of ReferenceDefinition.
	 */
	private String oldreferenceValue = "";
	/**
	 * EList<ComponentReference> activeDefinitionCallsList : Local variable containing the list of references that have already been treated.
	 */
	private EList<ComponentReference> activeDefinitionCallsList = null;

	/**
	 * <b>Method</b> <i>getReferenceDefinition</i>
	 * <p>
	 * This methods refresh templateReference value depending on referenceDefinition value. If templateDefinition name is equals to a template specifier name, set template reference value to this template Specifier.
	 * 
	 * @return ComponentReference
	 * 
	 * @author proustr
	 */
	public ComponentReference getReferenceDefinition() {
		if (referenceDefinition != null && !referenceDefinition.getReferenceName().equals(oldreferenceValue)) {
			oldreferenceValue = referenceDefinition.getReferenceName();
			templateReference = null;
			CompositeComponentDefinitionCustomImpl parent = (CompositeComponentDefinitionCustomImpl) this.getHelper()
					.getParentComponent();
			if (parent != null) {
				TemplateSpecifiersList tList = parent.getTemplateSpecifiersList();
				if (tList != null) {
					Iterator<TemplateSpecifier> iterator = tList.getTemplateSpecifiers().iterator();
					while (iterator.hasNext()) {
						TemplateSpecifier template = iterator.next();
						if (template.getName().equals(oldreferenceValue)) {
							templateReference = template;
							break;
						}
					}
				}
			}
		}

		return super.getReferenceDefinition();
	}

	/**
	 * <b>Method</b> <i>getTemplateReference</i>
	 * <p>
	 * This methods checks if the reference definition refers to a TemplateSpecifier defined in main Definition. If true, then updates the templateReference reference to the found template specifier. Else set templateReference to null.
	 * 
	 * @return TemplateSpecifier with same name as ComponentDefinition. If none, returns null.
	 * 
	 * @author proustr
	 */
	@Override
	public TemplateSpecifier getTemplateReference() {
		if (templateReference != null && referenceDefinition != null) {
			if (!referenceDefinition.getReferenceName().equals(templateReference.getName())
					&& !templateReference.getName().equals(
							AdlPackage.eINSTANCE.getTemplateSpecifier_Name().getDefaultValue())
					&& referenceDefinition.getReferenceName().equals(oldreferenceValue)) 
				referenceDefinition.setReferenceName(templateReference.getName());
		}
		else if (templateReference == null && referenceDefinition != null) {
			oldreferenceValue = referenceDefinition.getReferenceName();
			CompositeComponentDefinitionCustomImpl parent = (CompositeComponentDefinitionCustomImpl) this.getHelper()
					.getParentComponent();
			if (parent != null) {
				TemplateSpecifiersList tList = parent.getTemplateSpecifiersList();
				if (tList != null) {
					Iterator<TemplateSpecifier> iterator = tList.getTemplateSpecifiers().iterator();
					while (iterator.hasNext()) {
						TemplateSpecifier template = iterator.next();
						if (template.getName().equals(referenceDefinition.getReferenceName())) {
							templateReference = template;
						}
					}
				}
			}
		}
		return super.getTemplateReference();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ArchitectureDefinitionImpl#setReferenceDefinition(adl.ComponentReference)
	 */
	@Override
	public void setReferenceDefinition(ComponentReference newReferenceDefinition) {
		super.setReferenceDefinition(newReferenceDefinition);
	}

	/**
	 * <b>Method</b> <i>getHelper</i>
	 * <p>
	 * This methods use the AdlAdapterHelperFactory to recover the correct associated Helper for this class and the returns it.
	 * 
	 * @return ArchitectureDefinitionHelper
	 * 
	 * @author proustr
	 */
	public ArchitectureDefinitionHelper getHelper() {
		ArchitectureDefinitionHelper result = null;
		Adapter helper = AdlAdapterHelperFactory.getInstance().adapt(this, ArchitectureDefinitionHelper.class);
		if (helper != null) {
			result = (ArchitectureDefinitionHelper) helper;
		}
		return result;
	}

	/**
	 * <b>Method</b> <i>setActiveDefinitionCallsList</i>
	 * <p>
	 * This setter updates the local variable activeDefinitionCallsList
	 * 
	 * @param references
	 *            : EList of ComponentReference that must contain treated references.
	 * 
	 * @author proustr
	 */
	public void setActiveDefinitionCallsList(EList<ComponentReference> references) {
		this.activeDefinitionCallsList = references;
	}

	/**
	 * <b>Method</b> <i>getActiveDefinitionCallsList</i>
	 * <p>
	 * This getter allows to recover the local variable activeDefinitionCallsList
	 * 
	 * @return references that have already been treated in an EList of ComponentReference.
	 * 
	 * @author proustr
	 */
	public EList<ComponentReference> getActiveDefinitionCallsList() {
		return activeDefinitionCallsList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.TemplateSubComponentImpl#getLinkedAnnotationsList()
	 */
	@Override
	public AnnotationsList getLinkedAnnotationsList() {
		ArchitectureDefinition parent = this.getParentComponent();
		if (parent != null) {
			EList<Element> elements = this.getParentComponent().getElements();
			int index = elements.indexOf(this);
			if (index > 0 && elements.get(index - 1) instanceof AnnotationsList) linkedAnnotationsList = (AnnotationsList) elements
					.get(index - 1);
		}
		return linkedAnnotationsList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.TemplateSubComponentImpl#setLinkedAnnotationsList(adl.AnnotationsList)
	 */
	@Override
	public void setLinkedAnnotationsList(AnnotationsList newLinkedAnnotationsList) {
		ArchitectureDefinition parent = this.getParentComponent();
		if (parent != null) {
			EList<Element> elements = parent.getElements();
			int index = elements.indexOf(this);
			if (index > 0 && elements.get(index - 1) instanceof AnnotationsList) linkedAnnotationsList = (AnnotationsList) elements
					.get(index - 1);
		}
	}

}
