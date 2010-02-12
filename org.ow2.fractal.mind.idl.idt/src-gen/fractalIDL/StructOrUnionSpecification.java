/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Or Union Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fractalIDL.StructOrUnionSpecification#getStruct <em>Struct</em>}</li>
 *   <li>{@link fractalIDL.StructOrUnionSpecification#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fractalIDL.FractalIDLPackage#getStructOrUnionSpecification()
 * @model
 * @generated
 */
public interface StructOrUnionSpecification extends TypeDefinition, TypeSpecification
{
  /**
   * Returns the value of the '<em><b>Struct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' attribute.
   * @see #setStruct(String)
   * @see fractalIDL.FractalIDLPackage#getStructOrUnionSpecification_Struct()
   * @model
   * @generated
   */
  String getStruct();

  /**
   * Sets the value of the '{@link fractalIDL.StructOrUnionSpecification#getStruct <em>Struct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' attribute.
   * @see #getStruct()
   * @generated
   */
  void setStruct(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(Identifier)
   * @see fractalIDL.FractalIDLPackage#getStructOrUnionSpecification_Id()
   * @model containment="true"
   * @generated
   */
  Identifier getId();

  /**
   * Sets the value of the '{@link fractalIDL.StructOrUnionSpecification#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Identifier value);

} // StructOrUnionSpecification
