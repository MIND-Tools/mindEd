/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationsList;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarators;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructMemberImpl#getAnnotationsList <em>Annotations List</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructMemberImpl#getQualType <em>Qual Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructMemberImpl#getDec <em>Dec</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructMemberImpl#getConstExpr <em>Const Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructMemberImpl extends MinimalEObjectImpl.Container implements StructMember
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.STRUCT_MEMBER__ANNOTATIONS_LIST, oldAnnotationsList, newAnnotationsList);
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
        msgs = ((InternalEObject)annotationsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.STRUCT_MEMBER__ANNOTATIONS_LIST, null, msgs);
      if (newAnnotationsList != null)
        msgs = ((InternalEObject)newAnnotationsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.STRUCT_MEMBER__ANNOTATIONS_LIST, null, msgs);
      msgs = basicSetAnnotationsList(newAnnotationsList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.STRUCT_MEMBER__ANNOTATIONS_LIST, newAnnotationsList, newAnnotationsList));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.STRUCT_MEMBER__CONST_EXPR, oldConstExpr, newConstExpr);
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
        msgs = ((InternalEObject)constExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.STRUCT_MEMBER__CONST_EXPR, null, msgs);
      if (newConstExpr != null)
        msgs = ((InternalEObject)newConstExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.STRUCT_MEMBER__CONST_EXPR, null, msgs);
      msgs = basicSetConstExpr(newConstExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.STRUCT_MEMBER__CONST_EXPR, newConstExpr, newConstExpr));
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
      case FractalIDLPackage.STRUCT_MEMBER__ANNOTATIONS_LIST:
        return basicSetAnnotationsList(null, msgs);
      case FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE:
        return basicSetQualType(null, msgs);
      case FractalIDLPackage.STRUCT_MEMBER__DEC:
        return basicSetDec(null, msgs);
      case FractalIDLPackage.STRUCT_MEMBER__CONST_EXPR:
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
      case FractalIDLPackage.STRUCT_MEMBER__ANNOTATIONS_LIST:
        return getAnnotationsList();
      case FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE:
        return getQualType();
      case FractalIDLPackage.STRUCT_MEMBER__DEC:
        return getDec();
      case FractalIDLPackage.STRUCT_MEMBER__CONST_EXPR:
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
      case FractalIDLPackage.STRUCT_MEMBER__ANNOTATIONS_LIST:
        setAnnotationsList((AnnotationsList)newValue);
        return;
      case FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE:
        setQualType((QualifiedTypeSpecification)newValue);
        return;
      case FractalIDLPackage.STRUCT_MEMBER__DEC:
        setDec((Declarators)newValue);
        return;
      case FractalIDLPackage.STRUCT_MEMBER__CONST_EXPR:
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
      case FractalIDLPackage.STRUCT_MEMBER__ANNOTATIONS_LIST:
        setAnnotationsList((AnnotationsList)null);
        return;
      case FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE:
        setQualType((QualifiedTypeSpecification)null);
        return;
      case FractalIDLPackage.STRUCT_MEMBER__DEC:
        setDec((Declarators)null);
        return;
      case FractalIDLPackage.STRUCT_MEMBER__CONST_EXPR:
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
      case FractalIDLPackage.STRUCT_MEMBER__ANNOTATIONS_LIST:
        return annotationsList != null;
      case FractalIDLPackage.STRUCT_MEMBER__QUAL_TYPE:
        return qualType != null;
      case FractalIDLPackage.STRUCT_MEMBER__DEC:
        return dec != null;
      case FractalIDLPackage.STRUCT_MEMBER__CONST_EXPR:
        return constExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //StructMemberImpl
