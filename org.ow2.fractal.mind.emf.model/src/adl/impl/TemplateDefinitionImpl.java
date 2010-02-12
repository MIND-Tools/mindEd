/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.CompositeReferenceDefinition;
import adl.TemplateDefinition;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.TemplateDefinitionImpl#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link adl.impl.TemplateDefinitionImpl#getTemplateValue <em>Template Value</em>}</li>
 *   <li>{@link adl.impl.TemplateDefinitionImpl#getParentCompositeReference <em>Parent Composite Reference</em>}</li>
 *   <li>{@link adl.impl.TemplateDefinitionImpl#getSegments <em>Segments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateDefinitionImpl extends EObjectImpl implements TemplateDefinition {
	/**
	 * The default value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_NAME_EDEFAULT = "template_Name";

	/**
	 * The cached value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateName()
	 * @generated
	 * @ordered
	 */
	protected String templateName = TEMPLATE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateValue() <em>Template Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateValue()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateValue() <em>Template Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateValue()
	 * @generated
	 * @ordered
	 */
	protected String templateValue = TEMPLATE_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> segments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.TEMPLATE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateName(String newTemplateName) {
		String oldTemplateName = templateName;
		templateName = newTemplateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME, oldTemplateName, templateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public String getTemplateValue() {
		String tmpName = "";
		if(segments!=null && !segments.isEmpty())
		{
			for(String tmpString : segments)
			{
				tmpName+=tmpString+".";
			}
			segments.clear();
			templateValue=tmpName+templateValue;
		}
		return templateValue;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateValue(String newTemplateValue) {
		String oldTemplateValue = templateValue;
		templateValue = newTemplateValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_VALUE, oldTemplateValue, templateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeReferenceDefinition getParentCompositeReference() {
		if (eContainerFeatureID() != AdlPackage.TEMPLATE_DEFINITION__PARENT_COMPOSITE_REFERENCE) return null;
		return (CompositeReferenceDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentCompositeReference(CompositeReferenceDefinition newParentCompositeReference, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentCompositeReference, AdlPackage.TEMPLATE_DEFINITION__PARENT_COMPOSITE_REFERENCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentCompositeReference(CompositeReferenceDefinition newParentCompositeReference) {
		if (newParentCompositeReference != eInternalContainer() || (eContainerFeatureID() != AdlPackage.TEMPLATE_DEFINITION__PARENT_COMPOSITE_REFERENCE && newParentCompositeReference != null)) {
			if (EcoreUtil.isAncestor(this, newParentCompositeReference))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentCompositeReference != null)
				msgs = ((InternalEObject)newParentCompositeReference).eInverseAdd(this, AdlPackage.COMPOSITE_REFERENCE_DEFINITION__TEMPLATES_LIST, CompositeReferenceDefinition.class, msgs);
			msgs = basicSetParentCompositeReference(newParentCompositeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_DEFINITION__PARENT_COMPOSITE_REFERENCE, newParentCompositeReference, newParentCompositeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public EList<String> getSegments() {
		if (segments == null) {
			segments = new BasicEList<String>();
		}
		return segments;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_DEFINITION__PARENT_COMPOSITE_REFERENCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentCompositeReference((CompositeReferenceDefinition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_DEFINITION__PARENT_COMPOSITE_REFERENCE:
				return basicSetParentCompositeReference(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AdlPackage.TEMPLATE_DEFINITION__PARENT_COMPOSITE_REFERENCE:
				return eInternalContainer().eInverseRemove(this, AdlPackage.COMPOSITE_REFERENCE_DEFINITION__TEMPLATES_LIST, CompositeReferenceDefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME:
				return getTemplateName();
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_VALUE:
				return getTemplateValue();
			case AdlPackage.TEMPLATE_DEFINITION__PARENT_COMPOSITE_REFERENCE:
				return getParentCompositeReference();
			case AdlPackage.TEMPLATE_DEFINITION__SEGMENTS:
				return getSegments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME:
				setTemplateName((String)newValue);
				return;
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_VALUE:
				setTemplateValue((String)newValue);
				return;
			case AdlPackage.TEMPLATE_DEFINITION__PARENT_COMPOSITE_REFERENCE:
				setParentCompositeReference((CompositeReferenceDefinition)newValue);
				return;
			case AdlPackage.TEMPLATE_DEFINITION__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME:
				setTemplateName(TEMPLATE_NAME_EDEFAULT);
				return;
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_VALUE:
				setTemplateValue(TEMPLATE_VALUE_EDEFAULT);
				return;
			case AdlPackage.TEMPLATE_DEFINITION__PARENT_COMPOSITE_REFERENCE:
				setParentCompositeReference((CompositeReferenceDefinition)null);
				return;
			case AdlPackage.TEMPLATE_DEFINITION__SEGMENTS:
				getSegments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_NAME:
				return TEMPLATE_NAME_EDEFAULT == null ? templateName != null : !TEMPLATE_NAME_EDEFAULT.equals(templateName);
			case AdlPackage.TEMPLATE_DEFINITION__TEMPLATE_VALUE:
				return TEMPLATE_VALUE_EDEFAULT == null ? templateValue != null : !TEMPLATE_VALUE_EDEFAULT.equals(templateValue);
			case AdlPackage.TEMPLATE_DEFINITION__PARENT_COMPOSITE_REFERENCE:
				return getParentCompositeReference() != null;
			case AdlPackage.TEMPLATE_DEFINITION__SEGMENTS:
				return segments != null && !segments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (templateName: ");
		result.append(templateName);
		result.append(", templateValue: ");
		result.append(templateValue);
		result.append(", segments: ");
		result.append(segments);
		result.append(')');
		return result.toString();
	}

} //TemplateDefinitionImpl
