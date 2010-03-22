/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIDL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.fractal.mind.idl.fractalIDL.AnnotationParameters;
import org.ow2.fractal.mind.idl.fractalIDL.AnnotationValuePairs;
import org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.impl.AnnotationParametersImpl#getValuePair <em>Value Pair</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.impl.AnnotationParametersImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationParametersImpl extends MinimalEObjectImpl.Container implements AnnotationParameters
{
  /**
   * The cached value of the '{@link #getValuePair() <em>Value Pair</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuePair()
   * @generated
   * @ordered
   */
  protected AnnotationValuePairs valuePair;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationParametersImpl()
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
    return FractalIDLPackage.Literals.ANNOTATION_PARAMETERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationValuePairs getValuePair()
  {
    return valuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValuePair(AnnotationValuePairs newValuePair, NotificationChain msgs)
  {
    AnnotationValuePairs oldValuePair = valuePair;
    valuePair = newValuePair;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR, oldValuePair, newValuePair);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuePair(AnnotationValuePairs newValuePair)
  {
    if (newValuePair != valuePair)
    {
      NotificationChain msgs = null;
      if (valuePair != null)
        msgs = ((InternalEObject)valuePair).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR, null, msgs);
      if (newValuePair != null)
        msgs = ((InternalEObject)newValuePair).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR, null, msgs);
      msgs = basicSetValuePair(newValuePair, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR, newValuePair, newValuePair));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE, oldValue, value));
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
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR:
        return basicSetValuePair(null, msgs);
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
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR:
        return getValuePair();
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE:
        return getValue();
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
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR:
        setValuePair((AnnotationValuePairs)newValue);
        return;
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE:
        setValue((String)newValue);
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
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR:
        setValuePair((AnnotationValuePairs)null);
        return;
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR:
        return valuePair != null;
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //AnnotationParametersImpl
