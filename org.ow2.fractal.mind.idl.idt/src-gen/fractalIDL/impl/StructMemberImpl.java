/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL.impl;

import fractalIDL.Declarators;
import fractalIDL.FractalIDLPackage;
import fractalIDL.QualifiedTypeSpecification;
import fractalIDL.StructMember;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fractalIDL.impl.StructMemberImpl#getQualType <em>Qual Type</em>}</li>
 *   <li>{@link fractalIDL.impl.StructMemberImpl#getDec <em>Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructMemberImpl extends MinimalEObjectImpl.Container implements StructMember
{
  /**
   * The cached value of the '{@link #getQualType() <em>Qual Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualType()
   * @generated
   * @ordered
   */
  protected QualifiedTypeSpecification qualType;

  /**
   * The cached value of the '{@link #getDec() <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDec()
   * @generated
   * @ordered
   */
  protected Declarators dec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructMemberImpl()
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
    return FractalIDLPackage.Literals.STRUCT_MEMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedTypeSpecification getQualType()
  {
    return qualType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQualType(QualifiedTypeSpecification newQualType, NotificationChain msgs)
  {
    QualifiedTypeSpecification oldQualType = qualType;
    qualType = newQualType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE, oldQualType, newQualType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualType(QualifiedTypeSpecification newQualType)
  {
    if (newQualType != qualType)
    {
      NotificationChain msgs = null;
      if (qualType != null)
        msgs = ((InternalEObject)qualType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE, null, msgs);
      if (newQualType != null)
        msgs = ((InternalEObject)newQualType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE, null, msgs);
      msgs = basicSetQualType(newQualType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE, newQualType, newQualType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarators getDec()
  {
    return dec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDec(Declarators newDec, NotificationChain msgs)
  {
    Declarators oldDec = dec;
    dec = newDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.STRUCT_MEMBER__DEC, oldDec, newDec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDec(Declarators newDec)
  {
    if (newDec != dec)
    {
      NotificationChain msgs = null;
      if (dec != null)
        msgs = ((InternalEObject)dec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.STRUCT_MEMBER__DEC, null, msgs);
      if (newDec != null)
        msgs = ((InternalEObject)newDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.STRUCT_MEMBER__DEC, null, msgs);
      msgs = basicSetDec(newDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.STRUCT_MEMBER__DEC, newDec, newDec));
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
      case FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE:
        return basicSetQualType(null, msgs);
      case FractalIDLPackage.STRUCT_MEMBER__DEC:
        return basicSetDec(null, msgs);
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
      case FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE:
        return getQualType();
      case FractalIDLPackage.STRUCT_MEMBER__DEC:
        return getDec();
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
      case FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE:
        setQualType((QualifiedTypeSpecification)newValue);
        return;
      case FractalIDLPackage.STRUCT_MEMBER__DEC:
        setDec((Declarators)newValue);
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
      case FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE:
        setQualType((QualifiedTypeSpecification)null);
        return;
      case FractalIDLPackage.STRUCT_MEMBER__DEC:
        setDec((Declarators)null);
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
      case FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE:
        return qualType != null;
      case FractalIDLPackage.STRUCT_MEMBER__DEC:
        return dec != null;
    }
    return super.eIsSet(featureID);
  }

} //StructMemberImpl
