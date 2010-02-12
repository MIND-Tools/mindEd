/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL.impl;

import fractalIDL.FractalIDLPackage;
import fractalIDL.TypeSpecifier;
import fractalIDL.TypeSpecifierList;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Specifier List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fractalIDL.impl.TypeSpecifierListImpl#getTypeSpecifier <em>Type Specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSpecifierListImpl extends TypeSpecificationImpl implements TypeSpecifierList
{
  /**
   * The cached value of the '{@link #getTypeSpecifier() <em>Type Specifier</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSpecifier()
   * @generated
   * @ordered
   */
  protected EList<TypeSpecifier> typeSpecifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeSpecifierListImpl()
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
    return FractalIDLPackage.Literals.TYPE_SPECIFIER_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeSpecifier> getTypeSpecifier()
  {
    if (typeSpecifier == null)
    {
      typeSpecifier = new EDataTypeEList<TypeSpecifier>(TypeSpecifier.class, this, FractalIDLPackage.TYPE_SPECIFIER_LIST__TYPE_SPECIFIER);
    }
    return typeSpecifier;
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
      case FractalIDLPackage.TYPE_SPECIFIER_LIST__TYPE_SPECIFIER:
        return getTypeSpecifier();
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
      case FractalIDLPackage.TYPE_SPECIFIER_LIST__TYPE_SPECIFIER:
        getTypeSpecifier().clear();
        getTypeSpecifier().addAll((Collection<? extends TypeSpecifier>)newValue);
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
      case FractalIDLPackage.TYPE_SPECIFIER_LIST__TYPE_SPECIFIER:
        getTypeSpecifier().clear();
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
      case FractalIDLPackage.TYPE_SPECIFIER_LIST__TYPE_SPECIFIER:
        return typeSpecifier != null && !typeSpecifier.isEmpty();
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
    result.append(" (typeSpecifier: ");
    result.append(typeSpecifier);
    result.append(')');
    return result.toString();
  }

} //TypeSpecifierListImpl
