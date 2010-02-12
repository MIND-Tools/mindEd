package adl.custom.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;

import adl.AnnotationsList;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.Element;
import adl.custom.util.adapters.factory.AdlAdapterHelperFactory;
import adl.helpers.ArchitectureDefinitionHelper;
import adl.helpers.IHelper;
import adl.impl.PrimitiveSubComponentImpl;

/**
 * <b>Class</b> <i>PrimitiveSubComponentCustomImpl</i>
 * <p>
 * This class extends generated class PrimitiveSubComponentImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link adl.custom.impl.PrimitiveSubComponentCustomImpl#getHelper <em>getHelper</em>}</li>
 * <li>{@link adl.custom.impl.PrimitiveSubComponentCustomImpl#setActiveDefinitionCallsList <em>setActiveDefinitionCallsList</em>}</li>
 * <li>{@link adl.custom.impl.PrimitiveSubComponentCustomImpl#getActiveDefinitionCallsList <em>getActiveDefinitionCallsList</em>}</li>
 * <li>{@link adl.custom.impl.PrimitiveSubComponentCustomImpl#setLinkedAnnotationsList <em>setLinkedAnnotationsList</em>}</li>
 * <li>{@link adl.custom.impl.PrimitiveSubComponentCustomImpl#getLinkedAnnotationsList <em>getLinkedAnnotationsList</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends PrimitiveSubComponentImpl
 */
public class PrimitiveSubComponentCustomImpl extends PrimitiveSubComponentImpl {
	/**
	 * EList<ComponentReference> activeDefinitionCallsList : Local variable containing the list of references that have already been treated.
	 */
	private EList<ComponentReference> activeDefinitionCallsList = null;

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
	 * @see adl.impl.PrimitiveAnonymousSubComponentImpl#getLinkedAnnotationsList()
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
	 * @see adl.impl.PrimitiveAnonymousSubComponentImpl#setLinkedAnnotationsList(adl.AnnotationsList)
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
