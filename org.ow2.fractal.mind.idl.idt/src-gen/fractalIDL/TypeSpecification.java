/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fractalIDL.TypeSpecification#getTypeDefName <em>Type Def Name</em>}</li>
 *   <li>{@link fractalIDL.TypeSpecification#getTypeSpecifier <em>Type Specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see fractalIDL.FractalIDLPackage#getTypeSpecification()
 * @model
 * @generated
 */
public interface TypeSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Def Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Def Name</em>' attribute.
   * @see #setTypeDefName(String)
   * @see fractalIDL.FractalIDLPackage#getTypeSpecification_TypeDefName()
   * @model
   * @generated
   */
  String getTypeDefName();

  /**
   * Sets the value of the '{@link fractalIDL.TypeSpecification#getTypeDefName <em>Type Def Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Def Name</em>' attribute.
   * @see #getTypeDefName()
   * @generated
   */
  void setTypeDefName(String value);

  /**
   * Returns the value of the '<em><b>Type Specifier</b></em>' attribute list.
   * The list contents are of type {@link fractalIDL.TypeSpecifier}.
   * The literals are from the enumeration {@link fractalIDL.TypeSpecifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Specifier</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Specifier</em>' attribute list.
   * @see fractalIDL.TypeSpecifier
   * @see fractalIDL.FractalIDLPackage#getTypeSpecification_TypeSpecifier()
   * @model unique="false"
   * @generated
   */
  EList<TypeSpecifier> getTypeSpecifier();

} // TypeSpecification
