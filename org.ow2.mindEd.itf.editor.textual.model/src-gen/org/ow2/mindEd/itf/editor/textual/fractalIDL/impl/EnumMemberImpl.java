/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMember;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumMemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumMemberImpl#getConstExpr <em>Const Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumMemberImpl extends MinimalEObjectImpl.Container implements EnumMember
{
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
   * The cached value of the '{@link #getConstExpr() <em>Const Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstExpr()
   * @generated
   * @ordered
   */
  protected ConstantExpression constExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumMemberImpl()
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
    return FractalIDLPackage.Literals.ENUM_MEMBER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ENUM_MEMBER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression getConstExpr()
  {
    return constExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstExpr(ConstantExpression newConstExpr, NotificationChain msgs)
  {
    ConstantExpression oldConstExpr = constExpr;
    constExpr = newConstExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ENUM_MEMBER__CONST_EXPR, oldConstExpr, newConstExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstExpr(ConstantExpression newConstExpr)
  {
    if (newConstExpr != constExpr)
    {
      NotificationChain msgs = null;
      if (constExpr != null)
        msgs = ((InternalEObject)constExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ENUM_MEMBER__CONST_EXPR, null, msgs);
      if (newConstExpr != null)
        msgs = ((InternalEObject)newConstExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ENUM_MEMBER__CONST_EXPR, null, msgs);
      msgs = basicSetConstExpr(newConstExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ENUM_MEMBER__CONST_EXPR, newConstExpr, newConstExpr));
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
      case FractalIDLPackage.ENUM_MEMBER__CONST_EXPR:
        return basicSetConstExpr(null, msgs);
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
      case FractalIDLPackage.ENUM_MEMBER__NAME:
        return getName();
      case FractalIDLPackage.ENUM_MEMBER__CONST_EXPR:
        return getConstExpr();
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
      case FractalIDLPackage.ENUM_MEMBER__NAME:
        setName((String)newValue);
        return;
      case FractalIDLPackage.ENUM_MEMBER__CONST_EXPR:
        setConstExpr((ConstantExpression)newValue);
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
      case FractalIDLPackage.ENUM_MEMBER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FractalIDLPackage.ENUM_MEMBER__CONST_EXPR:
        setConstExpr((ConstantExpression)null);
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
      case FractalIDLPackage.ENUM_MEMBER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FractalIDLPackage.ENUM_MEMBER__CONST_EXPR:
        return constExpr != null;
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

} //EnumMemberImpl
