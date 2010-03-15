/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.ow2.fractal.mind.idl.fractalIDL.AbstractDeclarator;
import org.ow2.fractal.mind.idl.fractalIDL.Declarator;
import org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage;
import org.ow2.fractal.mind.idl.fractalIDL.Parameter;
import org.ow2.fractal.mind.idl.fractalIDL.ParameterQualifier;
import org.ow2.fractal.mind.idl.fractalIDL.QualifiedTypeSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.impl.ParameterImpl#getParameterQualifier <em>Parameter Qualifier</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.impl.ParameterImpl#getQualifiedTypeSpec <em>Qualified Type Spec</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.impl.ParameterImpl#getDec <em>Dec</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.impl.ParameterImpl#getAbstractDec <em>Abstract Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter
{
  /**
   * The cached value of the '{@link #getParameterQualifier() <em>Parameter Qualifier</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterQualifier()
   * @generated
   * @ordered
   */
  protected EList<ParameterQualifier> parameterQualifier;

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
   * The cached value of the '{@link #getDec() <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDec()
   * @generated
   * @ordered
   */
  protected Declarator dec;

  /**
   * The cached value of the '{@link #getAbstractDec() <em>Abstract Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractDec()
   * @generated
   * @ordered
   */
  protected AbstractDeclarator abstractDec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterImpl()
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
    return FractalIDLPackage.Literals.PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterQualifier> getParameterQualifier()
  {
    if (parameterQualifier == null)
    {
      parameterQualifier = new EDataTypeEList<ParameterQualifier>(ParameterQualifier.class, this, FractalIDLPackage.PARAMETER__PARAMETER_QUALIFIER);
    }
    return parameterQualifier;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC, oldQualifiedTypeSpec, newQualifiedTypeSpec);
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
        msgs = ((InternalEObject)qualifiedTypeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC, null, msgs);
      if (newQualifiedTypeSpec != null)
        msgs = ((InternalEObject)newQualifiedTypeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC, null, msgs);
      msgs = basicSetQualifiedTypeSpec(newQualifiedTypeSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC, newQualifiedTypeSpec, newQualifiedTypeSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarator getDec()
  {
    return dec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDec(Declarator newDec, NotificationChain msgs)
  {
    Declarator oldDec = dec;
    dec = newDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__DEC, oldDec, newDec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDec(Declarator newDec)
  {
    if (newDec != dec)
    {
      NotificationChain msgs = null;
      if (dec != null)
        msgs = ((InternalEObject)dec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__DEC, null, msgs);
      if (newDec != null)
        msgs = ((InternalEObject)newDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__DEC, null, msgs);
      msgs = basicSetDec(newDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__DEC, newDec, newDec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDeclarator getAbstractDec()
  {
    return abstractDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstractDec(AbstractDeclarator newAbstractDec, NotificationChain msgs)
  {
    AbstractDeclarator oldAbstractDec = abstractDec;
    abstractDec = newAbstractDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__ABSTRACT_DEC, oldAbstractDec, newAbstractDec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstractDec(AbstractDeclarator newAbstractDec)
  {
    if (newAbstractDec != abstractDec)
    {
      NotificationChain msgs = null;
      if (abstractDec != null)
        msgs = ((InternalEObject)abstractDec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__ABSTRACT_DEC, null, msgs);
      if (newAbstractDec != null)
        msgs = ((InternalEObject)newAbstractDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__ABSTRACT_DEC, null, msgs);
      msgs = basicSetAbstractDec(newAbstractDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__ABSTRACT_DEC, newAbstractDec, newAbstractDec));
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
      case FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC:
        return basicSetQualifiedTypeSpec(null, msgs);
      case FractalIDLPackage.PARAMETER__DEC:
        return basicSetDec(null, msgs);
      case FractalIDLPackage.PARAMETER__ABSTRACT_DEC:
        return basicSetAbstractDec(null, msgs);
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
      case FractalIDLPackage.PARAMETER__PARAMETER_QUALIFIER:
        return getParameterQualifier();
      case FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC:
        return getQualifiedTypeSpec();
      case FractalIDLPackage.PARAMETER__DEC:
        return getDec();
      case FractalIDLPackage.PARAMETER__ABSTRACT_DEC:
        return getAbstractDec();
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
      case FractalIDLPackage.PARAMETER__PARAMETER_QUALIFIER:
        getParameterQualifier().clear();
        getParameterQualifier().addAll((Collection<? extends ParameterQualifier>)newValue);
        return;
      case FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC:
        setQualifiedTypeSpec((QualifiedTypeSpecification)newValue);
        return;
      case FractalIDLPackage.PARAMETER__DEC:
        setDec((Declarator)newValue);
        return;
      case FractalIDLPackage.PARAMETER__ABSTRACT_DEC:
        setAbstractDec((AbstractDeclarator)newValue);
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
      case FractalIDLPackage.PARAMETER__PARAMETER_QUALIFIER:
        getParameterQualifier().clear();
        return;
      case FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC:
        setQualifiedTypeSpec((QualifiedTypeSpecification)null);
        return;
      case FractalIDLPackage.PARAMETER__DEC:
        setDec((Declarator)null);
        return;
      case FractalIDLPackage.PARAMETER__ABSTRACT_DEC:
        setAbstractDec((AbstractDeclarator)null);
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
      case FractalIDLPackage.PARAMETER__PARAMETER_QUALIFIER:
        return parameterQualifier != null && !parameterQualifier.isEmpty();
      case FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC:
        return qualifiedTypeSpec != null;
      case FractalIDLPackage.PARAMETER__DEC:
        return dec != null;
      case FractalIDLPackage.PARAMETER__ABSTRACT_DEC:
        return abstractDec != null;
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
    result.append(" (ParameterQualifier: ");
    result.append(parameterQualifier);
    result.append(')');
    return result.toString();
  }

} //ParameterImpl
