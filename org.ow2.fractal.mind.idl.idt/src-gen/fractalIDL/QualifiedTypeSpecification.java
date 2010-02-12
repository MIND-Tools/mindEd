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
 * A representation of the model object '<em><b>Qualified Type Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fractalIDL.QualifiedTypeSpecification#getTypeQualifier <em>Type Qualifier</em>}</li>
 *   <li>{@link fractalIDL.QualifiedTypeSpecification#getTypeSpec <em>Type Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see fractalIDL.FractalIDLPackage#getQualifiedTypeSpecification()
 * @model
 * @generated
 */
public interface QualifiedTypeSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Qualifier</b></em>' attribute list.
   * The list contents are of type {@link fractalIDL.TypeQualifier}.
   * The literals are from the enumeration {@link fractalIDL.TypeQualifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Qualifier</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Qualifier</em>' attribute list.
   * @see fractalIDL.TypeQualifier
   * @see fractalIDL.FractalIDLPackage#getQualifiedTypeSpecification_TypeQualifier()
   * @model unique="false"
   * @generated
   */
  EList<TypeQualifier> getTypeQualifier();

  /**
   * Returns the value of the '<em><b>Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Spec</em>' containment reference.
   * @see #setTypeSpec(TypeSpecification)
   * @see fractalIDL.FractalIDLPackage#getQualifiedTypeSpecification_TypeSpec()
   * @model containment="true"
   * @generated
   */
  TypeSpecification getTypeSpec();

  /**
   * Sets the value of the '{@link fractalIDL.QualifiedTypeSpecification#getTypeSpec <em>Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Spec</em>' containment reference.
   * @see #getTypeSpec()
   * @generated
   */
  void setTypeSpec(TypeSpecification value);

} // QualifiedTypeSpecification
