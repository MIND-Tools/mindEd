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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.fractal.mind.idl.fractalIDL.EnumMember;
import org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage;
import org.ow2.fractal.mind.idl.fractalIDL.Identifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.impl.EnumMemberImpl#getEnumMember <em>Enum Member</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.impl.EnumMemberImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumMemberImpl extends EnumMemberListImpl implements EnumMember
{
  /**
   * The cached value of the '{@link #getEnumMember() <em>Enum Member</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumMember()
   * @generated
   * @ordered
   */
  protected EList<EnumMember> enumMember;

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
  public EList<EnumMember> getEnumMember()
  {
    if (enumMember == null)
    {
      enumMember = new EObjectContainmentEList<EnumMember>(EnumMember.class, this, FractalIDLPackage.ENUM_MEMBER__ENUM_MEMBER);
    }
    return enumMember;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ENUM_MEMBER__ID, oldId, newId);
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
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ENUM_MEMBER__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ENUM_MEMBER__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ENUM_MEMBER__ID, newId, newId));
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
      case FractalIDLPackage.ENUM_MEMBER__ENUM_MEMBER:
        return ((InternalEList<?>)getEnumMember()).basicRemove(otherEnd, msgs);
      case FractalIDLPackage.ENUM_MEMBER__ID:
        return basicSetId(null, msgs);
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
      case FractalIDLPackage.ENUM_MEMBER__ENUM_MEMBER:
        return getEnumMember();
      case FractalIDLPackage.ENUM_MEMBER__ID:
        return getId();
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
      case FractalIDLPackage.ENUM_MEMBER__ENUM_MEMBER:
        getEnumMember().clear();
        getEnumMember().addAll((Collection<? extends EnumMember>)newValue);
        return;
      case FractalIDLPackage.ENUM_MEMBER__ID:
        setId((Identifier)newValue);
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
      case FractalIDLPackage.ENUM_MEMBER__ENUM_MEMBER:
        getEnumMember().clear();
        return;
      case FractalIDLPackage.ENUM_MEMBER__ID:
        setId((Identifier)null);
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
      case FractalIDLPackage.ENUM_MEMBER__ENUM_MEMBER:
        return enumMember != null && !enumMember.isEmpty();
      case FractalIDLPackage.ENUM_MEMBER__ID:
        return id != null;
    }
    return super.eIsSet(featureID);
  }

} //EnumMemberImpl
