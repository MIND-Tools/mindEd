/**
 */
package org.ow2.mindEd.adl.textual.fractal.impl;

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

import org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeSuperType;
import org.ow2.mindEd.adl.textual.fractal.CompositeSuperTypeDefinition;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.TemplateReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Super Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeSuperTypeImpl#getTargetArchDef <em>Target Arch Def</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeSuperTypeImpl#getTemplatesList <em>Templates List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeSuperTypeImpl#getArgumentsList <em>Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeSuperTypeImpl extends MinimalEObjectImpl.Container implements CompositeSuperType
{
  /**
   * The cached value of the '{@link #getTargetArchDef() <em>Target Arch Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetArchDef()
   * @generated
   * @ordered
   */
  protected CompositeSuperTypeDefinition targetArchDef;

  /**
   * The cached value of the '{@link #getTemplatesList() <em>Templates List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplatesList()
   * @generated
   * @ordered
   */
  protected EList<TemplateReference> templatesList;

  /**
   * The cached value of the '{@link #getArgumentsList() <em>Arguments List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgumentsList()
   * @generated
   * @ordered
   */
  protected EList<ArgumentDefinition> argumentsList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositeSuperTypeImpl()
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
    return FractalPackage.Literals.COMPOSITE_SUPER_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeSuperTypeDefinition getTargetArchDef()
  {
    if (targetArchDef != null && targetArchDef.eIsProxy())
    {
      InternalEObject oldTargetArchDef = (InternalEObject)targetArchDef;
      targetArchDef = (CompositeSuperTypeDefinition)eResolveProxy(oldTargetArchDef);
      if (targetArchDef != oldTargetArchDef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FractalPackage.COMPOSITE_SUPER_TYPE__TARGET_ARCH_DEF, oldTargetArchDef, targetArchDef));
      }
    }
    return targetArchDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeSuperTypeDefinition basicGetTargetArchDef()
  {
    return targetArchDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetArchDef(CompositeSuperTypeDefinition newTargetArchDef)
  {
    CompositeSuperTypeDefinition oldTargetArchDef = targetArchDef;
    targetArchDef = newTargetArchDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.COMPOSITE_SUPER_TYPE__TARGET_ARCH_DEF, oldTargetArchDef, targetArchDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateReference> getTemplatesList()
  {
    if (templatesList == null)
    {
      templatesList = new EObjectContainmentEList<TemplateReference>(TemplateReference.class, this, FractalPackage.COMPOSITE_SUPER_TYPE__TEMPLATES_LIST);
    }
    return templatesList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArgumentDefinition> getArgumentsList()
  {
    if (argumentsList == null)
    {
      argumentsList = new EObjectContainmentEList<ArgumentDefinition>(ArgumentDefinition.class, this, FractalPackage.COMPOSITE_SUPER_TYPE__ARGUMENTS_LIST);
    }
    return argumentsList;
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
      case FractalPackage.COMPOSITE_SUPER_TYPE__TEMPLATES_LIST:
        return ((InternalEList<?>)getTemplatesList()).basicRemove(otherEnd, msgs);
      case FractalPackage.COMPOSITE_SUPER_TYPE__ARGUMENTS_LIST:
        return ((InternalEList<?>)getArgumentsList()).basicRemove(otherEnd, msgs);
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
      case FractalPackage.COMPOSITE_SUPER_TYPE__TARGET_ARCH_DEF:
        if (resolve) return getTargetArchDef();
        return basicGetTargetArchDef();
      case FractalPackage.COMPOSITE_SUPER_TYPE__TEMPLATES_LIST:
        return getTemplatesList();
      case FractalPackage.COMPOSITE_SUPER_TYPE__ARGUMENTS_LIST:
        return getArgumentsList();
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
      case FractalPackage.COMPOSITE_SUPER_TYPE__TARGET_ARCH_DEF:
        setTargetArchDef((CompositeSuperTypeDefinition)newValue);
        return;
      case FractalPackage.COMPOSITE_SUPER_TYPE__TEMPLATES_LIST:
        getTemplatesList().clear();
        getTemplatesList().addAll((Collection<? extends TemplateReference>)newValue);
        return;
      case FractalPackage.COMPOSITE_SUPER_TYPE__ARGUMENTS_LIST:
        getArgumentsList().clear();
        getArgumentsList().addAll((Collection<? extends ArgumentDefinition>)newValue);
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
      case FractalPackage.COMPOSITE_SUPER_TYPE__TARGET_ARCH_DEF:
        setTargetArchDef((CompositeSuperTypeDefinition)null);
        return;
      case FractalPackage.COMPOSITE_SUPER_TYPE__TEMPLATES_LIST:
        getTemplatesList().clear();
        return;
      case FractalPackage.COMPOSITE_SUPER_TYPE__ARGUMENTS_LIST:
        getArgumentsList().clear();
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
      case FractalPackage.COMPOSITE_SUPER_TYPE__TARGET_ARCH_DEF:
        return targetArchDef != null;
      case FractalPackage.COMPOSITE_SUPER_TYPE__TEMPLATES_LIST:
        return templatesList != null && !templatesList.isEmpty();
      case FractalPackage.COMPOSITE_SUPER_TYPE__ARGUMENTS_LIST:
        return argumentsList != null && !argumentsList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CompositeSuperTypeImpl
