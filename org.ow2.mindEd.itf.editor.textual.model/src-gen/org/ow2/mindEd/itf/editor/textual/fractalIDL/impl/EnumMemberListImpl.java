/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMember;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMemberList;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Member List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumMemberListImpl#getEnumMember <em>Enum Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumMemberListImpl extends MinimalEObjectImpl.Container implements EnumMemberList
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumMemberListImpl()
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
    return FractalIDLPackage.Literals.ENUM_MEMBER_LIST;
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
      enumMember = new EObjectContainmentEList<EnumMember>(EnumMember.class, this, FractalIDLPackage.ENUM_MEMBER_LIST__ENUM_MEMBER);
    }
    return enumMember;
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
      case FractalIDLPackage.ENUM_MEMBER_LIST__ENUM_MEMBER:
        return ((InternalEList<?>)getEnumMember()).basicRemove(otherEnd, msgs);
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
      case FractalIDLPackage.ENUM_MEMBER_LIST__ENUM_MEMBER:
        return getEnumMember();
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
      case FractalIDLPackage.ENUM_MEMBER_LIST__ENUM_MEMBER:
        getEnumMember().clear();
        getEnumMember().addAll((Collection<? extends EnumMember>)newValue);
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
      case FractalIDLPackage.ENUM_MEMBER_LIST__ENUM_MEMBER:
        getEnumMember().clear();
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
      case FractalIDLPackage.ENUM_MEMBER_LIST__ENUM_MEMBER:
        return enumMember != null && !enumMember.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnumMemberListImpl
