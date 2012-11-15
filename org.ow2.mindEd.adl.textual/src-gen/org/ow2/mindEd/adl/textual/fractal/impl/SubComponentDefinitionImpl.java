/**
 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.adl.textual.fractal.AnnotationsList;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;
import org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition;
import org.ow2.mindEd.adl.textual.fractal.TemplateReference;
import org.ow2.mindEd.adl.textual.fractal.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Component Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.SubComponentDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.SubComponentDefinitionImpl#getTemplatesList <em>Templates List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.SubComponentDefinitionImpl#getArgumentsList <em>Arguments List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.SubComponentDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.SubComponentDefinitionImpl#getBodyAnnotationsList <em>Body Annotations List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.SubComponentDefinitionImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubComponentDefinitionImpl extends CompositeElementImpl implements SubComponentDefinition
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeReference type;

  /**
   * The cached value of the '{@link #getTemplatesList() <em>Templates List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplatesList()
   * @generated
   * @ordered
   */
  protected EList<TemplateReference> templatesList;

  /**
   * The cached value of the '{@link #getArgumentsList() <em>Arguments List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgumentsList()
   * @generated
   * @ordered
   */
  protected EList<ArgumentDefinition> argumentsList;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBodyAnnotationsList() <em>Body Annotations List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyAnnotationsList()
   * @generated
   * @ordered
   */
  protected AnnotationsList bodyAnnotationsList;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected ArchitectureDefinition body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubComponentDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FractalPackage.Literals.SUB_COMPONENT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (TypeReference)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FractalPackage.SUB_COMPONENT_DEFINITION__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeReference newType)
  {
    TypeReference oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.SUB_COMPONENT_DEFINITION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateReference> getTemplatesList()
  {
    if (templatesList == null)
    {
      templatesList = new EObjectContainmentEList<TemplateReference>(TemplateReference.class, this, FractalPackage.SUB_COMPONENT_DEFINITION__TEMPLATES_LIST);
    }
    return templatesList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArgumentDefinition> getArgumentsList()
  {
    if (argumentsList == null)
    {
      argumentsList = new EObjectContainmentEList<ArgumentDefinition>(ArgumentDefinition.class, this, FractalPackage.SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST);
    }
    return argumentsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.SUB_COMPONENT_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationsList getBodyAnnotationsList()
  {
    return bodyAnnotationsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBodyAnnotationsList(AnnotationsList newBodyAnnotationsList, NotificationChain msgs)
  {
    AnnotationsList oldBodyAnnotationsList = bodyAnnotationsList;
    bodyAnnotationsList = newBodyAnnotationsList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST, oldBodyAnnotationsList, newBodyAnnotationsList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBodyAnnotationsList(AnnotationsList newBodyAnnotationsList)
  {
    if (newBodyAnnotationsList != bodyAnnotationsList)
    {
      NotificationChain msgs = null;
      if (bodyAnnotationsList != null)
        msgs = ((InternalEObject)bodyAnnotationsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST, null, msgs);
      if (newBodyAnnotationsList != null)
        msgs = ((InternalEObject)newBodyAnnotationsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST, null, msgs);
      msgs = basicSetBodyAnnotationsList(newBodyAnnotationsList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST, newBodyAnnotationsList, newBodyAnnotationsList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureDefinition getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(ArchitectureDefinition newBody, NotificationChain msgs)
  {
    ArchitectureDefinition oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.SUB_COMPONENT_DEFINITION__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(ArchitectureDefinition newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.SUB_COMPONENT_DEFINITION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.SUB_COMPONENT_DEFINITION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.SUB_COMPONENT_DEFINITION__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FractalPackage.SUB_COMPONENT_DEFINITION__TEMPLATES_LIST:
        return ((InternalEList<?>)getTemplatesList()).basicRemove(otherEnd, msgs);
      case FractalPackage.SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST:
        return ((InternalEList<?>)getArgumentsList()).basicRemove(otherEnd, msgs);
      case FractalPackage.SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST:
        return basicSetBodyAnnotationsList(null, msgs);
      case FractalPackage.SUB_COMPONENT_DEFINITION__BODY:
        return basicSetBody(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FractalPackage.SUB_COMPONENT_DEFINITION__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case FractalPackage.SUB_COMPONENT_DEFINITION__TEMPLATES_LIST:
        return getTemplatesList();
      case FractalPackage.SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST:
        return getArgumentsList();
      case FractalPackage.SUB_COMPONENT_DEFINITION__NAME:
        return getName();
      case FractalPackage.SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST:
        return getBodyAnnotationsList();
      case FractalPackage.SUB_COMPONENT_DEFINITION__BODY:
        return getBody();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FractalPackage.SUB_COMPONENT_DEFINITION__TYPE:
        setType((TypeReference)newValue);
        return;
      case FractalPackage.SUB_COMPONENT_DEFINITION__TEMPLATES_LIST:
        getTemplatesList().clear();
        getTemplatesList().addAll((Collection<? extends TemplateReference>)newValue);
        return;
      case FractalPackage.SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST:
        getArgumentsList().clear();
        getArgumentsList().addAll((Collection<? extends ArgumentDefinition>)newValue);
        return;
      case FractalPackage.SUB_COMPONENT_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case FractalPackage.SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST:
        setBodyAnnotationsList((AnnotationsList)newValue);
        return;
      case FractalPackage.SUB_COMPONENT_DEFINITION__BODY:
        setBody((ArchitectureDefinition)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FractalPackage.SUB_COMPONENT_DEFINITION__TYPE:
        setType((TypeReference)null);
        return;
      case FractalPackage.SUB_COMPONENT_DEFINITION__TEMPLATES_LIST:
        getTemplatesList().clear();
        return;
      case FractalPackage.SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST:
        getArgumentsList().clear();
        return;
      case FractalPackage.SUB_COMPONENT_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FractalPackage.SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST:
        setBodyAnnotationsList((AnnotationsList)null);
        return;
      case FractalPackage.SUB_COMPONENT_DEFINITION__BODY:
        setBody((ArchitectureDefinition)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FractalPackage.SUB_COMPONENT_DEFINITION__TYPE:
        return type != null;
      case FractalPackage.SUB_COMPONENT_DEFINITION__TEMPLATES_LIST:
        return templatesList != null && !templatesList.isEmpty();
      case FractalPackage.SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST:
        return argumentsList != null && !argumentsList.isEmpty();
      case FractalPackage.SUB_COMPONENT_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FractalPackage.SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST:
        return bodyAnnotationsList != null;
      case FractalPackage.SUB_COMPONENT_DEFINITION__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SubComponentDefinitionImpl
