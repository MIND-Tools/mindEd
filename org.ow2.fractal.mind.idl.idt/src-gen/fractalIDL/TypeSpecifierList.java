/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Specifier List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fractalIDL.TypeSpecifierList#getTypeSpecifier <em>Type Specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see fractalIDL.FractalIDLPackage#getTypeSpecifierList()
 * @model
 * @generated
 */
public interface TypeSpecifierList extends TypeSpecification
{
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
   * @see fractalIDL.FractalIDLPackage#getTypeSpecifierList_TypeSpecifier()
   * @model unique="false"
   * @generated
   */
  EList<TypeSpecifier> getTypeSpecifier();

} // TypeSpecifierList
