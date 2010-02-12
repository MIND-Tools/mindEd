/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL.impl;

import fractalIDL.FractalIDLPackage;
import fractalIDL.Identifier;
import fractalIDL.MethodDefinition;
import fractalIDL.ParameterList;
import fractalIDL.QualifiedTypeSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fractalIDL.impl.MethodDefinitionImpl#getQualifiedTypeSpec <em>Qualified Type Spec</em>}</li>
 *   <li>{@link fractalIDL.impl.MethodDefinitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link fractalIDL.impl.MethodDefinitionImpl#getParameterList <em>Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodDefinitionImpl extends MinimalEObjectImpl.Container implements MethodDefinition
{
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
   * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected Identifier id;

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
  public Identifier getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetId(Identifier newId, NotificationChain msgs)
  {
    Identifier oldId = id;
    id = newId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__ID, oldId, newId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(Identifier newId)
  {
    if (newId != id)
    {
      NotificationChain msgs = null;
      if (id != null)
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__ID, newId, newId));
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
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        return basicSetQualifiedTypeSpec(null, msgs);
      case FractalIDLPackage.METHOD_DEFINITION__ID:
        return basicSetId(null, msgs);
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
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        return getQualifiedTypeSpec();
      case FractalIDLPackage.METHOD_DEFINITION__ID:
        return getId();
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
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        setQualifiedTypeSpec((QualifiedTypeSpecification)newValue);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__ID:
        setId((Identifier)newValue);
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
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        setQualifiedTypeSpec((QualifiedTypeSpecification)null);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__ID:
        setId((Identifier)null);
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
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        return qualifiedTypeSpec != null;
      case FractalIDLPackage.METHOD_DEFINITION__ID:
        return id != null;
      case FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST:
        return parameterList != null;
    }
    return super.eIsSet(featureID);
  }

} //MethodDefinitionImpl
