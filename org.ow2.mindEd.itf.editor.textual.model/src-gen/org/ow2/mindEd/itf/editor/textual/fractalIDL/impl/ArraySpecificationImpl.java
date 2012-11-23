/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ArraySpecificationImpl#isUnspecifiedSize <em>Unspecified Size</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ArraySpecificationImpl#getFixedSize <em>Fixed Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArraySpecificationImpl extends MinimalEObjectImpl.Container implements ArraySpecification
{
  /**
   * The default value of the '{@link #isUnspecifiedSize() <em>Unspecified Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnspecifiedSize()
   * @generated
   * @ordered
   */
  protected static final boolean UNSPECIFIED_SIZE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnspecifiedSize() <em>Unspecified Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnspecifiedSize()
   * @generated
   * @ordered
   */
  protected boolean unspecifiedSize = UNSPECIFIED_SIZE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFixedSize() <em>Fixed Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixedSize()
   * @generated
   * @ordered
   */
  protected ConstantExpression fixedSize;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArraySpecificationImpl()
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
    return FractalIDLPackage.Literals.ARRAY_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnspecifiedSize()
  {
    return unspecifiedSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnspecifiedSize(boolean newUnspecifiedSize)
  {
    boolean oldUnspecifiedSize = unspecifiedSize;
    unspecifiedSize = newUnspecifiedSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ARRAY_SPECIFICATION__UNSPECIFIED_SIZE, oldUnspecifiedSize, unspecifiedSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression getFixedSize()
  {
    return fixedSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFixedSize(ConstantExpression newFixedSize, NotificationChain msgs)
  {
    ConstantExpression oldFixedSize = fixedSize;
    fixedSize = newFixedSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ARRAY_SPECIFICATION__FIXED_SIZE, oldFixedSize, newFixedSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixedSize(ConstantExpression newFixedSize)
  {
    if (newFixedSize != fixedSize)
    {
      NotificationChain msgs = null;
      if (fixedSize != null)
        msgs = ((InternalEObject)fixedSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ARRAY_SPECIFICATION__FIXED_SIZE, null, msgs);
      if (newFixedSize != null)
        msgs = ((InternalEObject)newFixedSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ARRAY_SPECIFICATION__FIXED_SIZE, null, msgs);
      msgs = basicSetFixedSize(newFixedSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ARRAY_SPECIFICATION__FIXED_SIZE, newFixedSize, newFixedSize));
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
      case FractalIDLPackage.ARRAY_SPECIFICATION__FIXED_SIZE:
        return basicSetFixedSize(null, msgs);
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
      case FractalIDLPackage.ARRAY_SPECIFICATION__UNSPECIFIED_SIZE:
        return isUnspecifiedSize();
      case FractalIDLPackage.ARRAY_SPECIFICATION__FIXED_SIZE:
        return getFixedSize();
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
      case FractalIDLPackage.ARRAY_SPECIFICATION__UNSPECIFIED_SIZE:
        setUnspecifiedSize((Boolean)newValue);
        return;
      case FractalIDLPackage.ARRAY_SPECIFICATION__FIXED_SIZE:
        setFixedSize((ConstantExpression)newValue);
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
      case FractalIDLPackage.ARRAY_SPECIFICATION__UNSPECIFIED_SIZE:
        setUnspecifiedSize(UNSPECIFIED_SIZE_EDEFAULT);
        return;
      case FractalIDLPackage.ARRAY_SPECIFICATION__FIXED_SIZE:
        setFixedSize((ConstantExpression)null);
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
      case FractalIDLPackage.ARRAY_SPECIFICATION__UNSPECIFIED_SIZE:
        return unspecifiedSize != UNSPECIFIED_SIZE_EDEFAULT;
      case FractalIDLPackage.ARRAY_SPECIFICATION__FIXED_SIZE:
        return fixedSize != null;
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
    result.append(" (unspecifiedSize: ");
    result.append(unspecifiedSize);
    result.append(')');
    return result.toString();
  }

} //ArraySpecificationImpl
