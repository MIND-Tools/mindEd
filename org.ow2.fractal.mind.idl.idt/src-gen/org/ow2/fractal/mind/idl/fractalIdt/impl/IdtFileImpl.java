/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIdt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.fractal.mind.idl.fractalIDL.ConstantDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective;
import org.ow2.fractal.mind.idl.fractalIDL.TypeDefinition;

import org.ow2.fractal.mind.idl.fractalIdt.FractalIdtPackage;
import org.ow2.fractal.mind.idl.fractalIdt.IdtFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Idt File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIdt.impl.IdtFileImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIdt.impl.IdtFileImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIdt.impl.IdtFileImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdtFileImpl extends MinimalEObjectImpl.Container implements IdtFile
{
  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<IncludeDirective> includes;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected EList<ConstantDefinition> constant;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EList<TypeDefinition> type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdtFileImpl()
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
    return FractalIdtPackage.Literals.IDT_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IncludeDirective> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectContainmentEList<IncludeDirective>(IncludeDirective.class, this, FractalIdtPackage.IDT_FILE__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConstantDefinition> getConstant()
  {
    if (constant == null)
    {
      constant = new EObjectContainmentEList<ConstantDefinition>(ConstantDefinition.class, this, FractalIdtPackage.IDT_FILE__CONSTANT);
    }
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeDefinition> getType()
  {
    if (type == null)
    {
      type = new EObjectContainmentEList<TypeDefinition>(TypeDefinition.class, this, FractalIdtPackage.IDT_FILE__TYPE);
    }
    return type;
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
      case FractalIdtPackage.IDT_FILE__INCLUDES:
        return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
      case FractalIdtPackage.IDT_FILE__CONSTANT:
        return ((InternalEList<?>)getConstant()).basicRemove(otherEnd, msgs);
      case FractalIdtPackage.IDT_FILE__TYPE:
        return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
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
      case FractalIdtPackage.IDT_FILE__INCLUDES:
        return getIncludes();
      case FractalIdtPackage.IDT_FILE__CONSTANT:
        return getConstant();
      case FractalIdtPackage.IDT_FILE__TYPE:
        return getType();
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
      case FractalIdtPackage.IDT_FILE__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends IncludeDirective>)newValue);
        return;
      case FractalIdtPackage.IDT_FILE__CONSTANT:
        getConstant().clear();
        getConstant().addAll((Collection<? extends ConstantDefinition>)newValue);
        return;
      case FractalIdtPackage.IDT_FILE__TYPE:
        getType().clear();
        getType().addAll((Collection<? extends TypeDefinition>)newValue);
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
      case FractalIdtPackage.IDT_FILE__INCLUDES:
        getIncludes().clear();
        return;
      case FractalIdtPackage.IDT_FILE__CONSTANT:
        getConstant().clear();
        return;
      case FractalIdtPackage.IDT_FILE__TYPE:
        getType().clear();
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
      case FractalIdtPackage.IDT_FILE__INCLUDES:
        return includes != null && !includes.isEmpty();
      case FractalIdtPackage.IDT_FILE__CONSTANT:
        return constant != null && !constant.isEmpty();
      case FractalIdtPackage.IDT_FILE__TYPE:
        return type != null && !type.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IdtFileImpl
