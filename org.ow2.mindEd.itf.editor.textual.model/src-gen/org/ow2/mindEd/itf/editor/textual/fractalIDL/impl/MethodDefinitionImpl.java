/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationsList;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterList;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedPointerSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl#getAnnotationsList <em>Annotations List</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl#getQualifiedTypeSpec <em>Qualified Type Spec</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl#getPointerSpecification <em>Pointer Specification</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl#getParameterList <em>Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodDefinitionImpl extends MinimalEObjectImpl.Container implements MethodDefinition
{
  /**
   * The cached value of the '{@link #getAnnotationsList() <em>Annotations List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationsList()
   * @generated
   * @ordered
   */
  protected AnnotationsList annotationsList;

  /**
   * The cached value of the '{@link #getQualifiedTypeSpec() <em>Qualified Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedTypeSpec()
   * @generated
   * @ordered
   */
  protected QualifiedTypeSpecification qualifiedTypeSpec;

  /**
   * The cached value of the '{@link #getPointerSpecification() <em>Pointer Specification</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointerSpecification()
   * @generated
   * @ordered
   */
  protected EList<QualifiedPointerSpecification> pointerSpecification;

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
   * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterList()
   * @generated
   * @ordered
   */
  protected ParameterList parameterList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodDefinitionImpl()
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
    return FractalIDLPackage.Literals.METHOD_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationsList getAnnotationsList()
  {
    return annotationsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotationsList(AnnotationsList newAnnotationsList, NotificationChain msgs)
  {
    AnnotationsList oldAnnotationsList = annotationsList;
    annotationsList = newAnnotationsList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS_LIST, oldAnnotationsList, newAnnotationsList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationsList(AnnotationsList newAnnotationsList)
  {
    if (newAnnotationsList != annotationsList)
    {
      NotificationChain msgs = null;
      if (annotationsList != null)
        msgs = ((InternalEObject)annotationsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS_LIST, null, msgs);
      if (newAnnotationsList != null)
        msgs = ((InternalEObject)newAnnotationsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS_LIST, null, msgs);
      msgs = basicSetAnnotationsList(newAnnotationsList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS_LIST, newAnnotationsList, newAnnotationsList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedTypeSpecification getQualifiedTypeSpec()
  {
    return qualifiedTypeSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQualifiedTypeSpec(QualifiedTypeSpecification newQualifiedTypeSpec, NotificationChain msgs)
  {
    QualifiedTypeSpecification oldQualifiedTypeSpec = qualifiedTypeSpec;
    qualifiedTypeSpec = newQualifiedTypeSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC, oldQualifiedTypeSpec, newQualifiedTypeSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifiedTypeSpec(QualifiedTypeSpecification newQualifiedTypeSpec)
  {
    if (newQualifiedTypeSpec != qualifiedTypeSpec)
    {
      NotificationChain msgs = null;
      if (qualifiedTypeSpec != null)
        msgs = ((InternalEObject)qualifiedTypeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC, null, msgs);
      if (newQualifiedTypeSpec != null)
        msgs = ((InternalEObject)newQualifiedTypeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC, null, msgs);
      msgs = basicSetQualifiedTypeSpec(newQualifiedTypeSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC, newQualifiedTypeSpec, newQualifiedTypeSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QualifiedPointerSpecification> getPointerSpecification()
  {
    if (pointerSpecification == null)
    {
      pointerSpecification = new EObjectContainmentEList<QualifiedPointerSpecification>(QualifiedPointerSpecification.class, this, FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION);
    }
    return pointerSpecification;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList getParameterList()
  {
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs)
  {
    ParameterList oldParameterList = parameterList;
    parameterList = newParameterList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST, oldParameterList, newParameterList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterList(ParameterList newParameterList)
  {
    if (newParameterList != parameterList)
    {
      NotificationChain msgs = null;
      if (parameterList != null)
        msgs = ((InternalEObject)parameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST, null, msgs);
      if (newParameterList != null)
        msgs = ((InternalEObject)newParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST, null, msgs);
      msgs = basicSetParameterList(newParameterList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST, newParameterList, newParameterList));
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
      case FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS_LIST:
        return basicSetAnnotationsList(null, msgs);
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        return basicSetQualifiedTypeSpec(null, msgs);
      case FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION:
        return ((InternalEList<?>)getPointerSpecification()).basicRemove(otherEnd, msgs);
      case FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST:
        return basicSetParameterList(null, msgs);
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
      case FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS_LIST:
        return getAnnotationsList();
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        return getQualifiedTypeSpec();
      case FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION:
        return getPointerSpecification();
      case FractalIDLPackage.METHOD_DEFINITION__NAME:
        return getName();
      case FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST:
        return getParameterList();
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
      case FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS_LIST:
        setAnnotationsList((AnnotationsList)newValue);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        setQualifiedTypeSpec((QualifiedTypeSpecification)newValue);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION:
        getPointerSpecification().clear();
        getPointerSpecification().addAll((Collection<? extends QualifiedPointerSpecification>)newValue);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST:
        setParameterList((ParameterList)newValue);
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
      case FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS_LIST:
        setAnnotationsList((AnnotationsList)null);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        setQualifiedTypeSpec((QualifiedTypeSpecification)null);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION:
        getPointerSpecification().clear();
        return;
      case FractalIDLPackage.METHOD_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST:
        setParameterList((ParameterList)null);
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
      case FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS_LIST:
        return annotationsList != null;
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        return qualifiedTypeSpec != null;
      case FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION:
        return pointerSpecification != null && !pointerSpecification.isEmpty();
      case FractalIDLPackage.METHOD_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST:
        return parameterList != null;
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

} //MethodDefinitionImpl
