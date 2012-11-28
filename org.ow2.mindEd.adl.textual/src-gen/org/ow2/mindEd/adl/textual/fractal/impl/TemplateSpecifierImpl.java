/**
 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier;
import org.ow2.mindEd.adl.textual.fractal.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.TemplateSpecifierImpl#getTypeReference <em>Type Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateSpecifierImpl extends TypeReferenceImpl implements TemplateSpecifier
{
  /**
   * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeReference()
   * @generated
   * @ordered
   */
  protected TypeDefinition typeReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateSpecifierImpl()
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
    return FractalPackage.Literals.TEMPLATE_SPECIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition getTypeReference()
  {
    if (typeReference != null && typeReference.eIsProxy())
    {
      InternalEObject oldTypeReference = (InternalEObject)typeReference;
      typeReference = (TypeDefinition)eResolveProxy(oldTypeReference);
      if (typeReference != oldTypeReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FractalPackage.TEMPLATE_SPECIFIER__TYPE_REFERENCE, oldTypeReference, typeReference));
      }
    }
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition basicGetTypeReference()
  {
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeReference(TypeDefinition newTypeReference)
  {
    TypeDefinition oldTypeReference = typeReference;
    typeReference = newTypeReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.TEMPLATE_SPECIFIER__TYPE_REFERENCE, oldTypeReference, typeReference));
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
      case FractalPackage.TEMPLATE_SPECIFIER__TYPE_REFERENCE:
        if (resolve) return getTypeReference();
        return basicGetTypeReference();
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
      case FractalPackage.TEMPLATE_SPECIFIER__TYPE_REFERENCE:
        setTypeReference((TypeDefinition)newValue);
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
      case FractalPackage.TEMPLATE_SPECIFIER__TYPE_REFERENCE:
        setTypeReference((TypeDefinition)null);
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
      case FractalPackage.TEMPLATE_SPECIFIER__TYPE_REFERENCE:
        return typeReference != null;
    }
    return super.eIsSet(featureID);
  }

} //TemplateSpecifierImpl
