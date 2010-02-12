/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fractalIDL.StructMember#getQualType <em>Qual Type</em>}</li>
 *   <li>{@link fractalIDL.StructMember#getDec <em>Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @see fractalIDL.FractalIDLPackage#getStructMember()
 * @model
 * @generated
 */
public interface StructMember extends EObject
{
  /**
   * Returns the value of the '<em><b>Qual Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qual Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qual Type</em>' containment reference.
   * @see #setQualType(QualifiedTypeSpecification)
   * @see fractalIDL.FractalIDLPackage#getStructMember_QualType()
   * @model containment="true"
   * @generated
   */
  QualifiedTypeSpecification getQualType();

  /**
   * Sets the value of the '{@link fractalIDL.StructMember#getQualType <em>Qual Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qual Type</em>' containment reference.
   * @see #getQualType()
   * @generated
   */
  void setQualType(QualifiedTypeSpecification value);

  /**
   * Returns the value of the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dec</em>' containment reference.
   * @see #setDec(Declarators)
   * @see fractalIDL.FractalIDLPackage#getStructMember_Dec()
   * @model containment="true"
   * @generated
   */
  Declarators getDec();

  /**
   * Sets the value of the '{@link fractalIDL.StructMember#getDec <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dec</em>' containment reference.
   * @see #getDec()
   * @generated
   */
  void setDec(Declarators value);

} // StructMember
