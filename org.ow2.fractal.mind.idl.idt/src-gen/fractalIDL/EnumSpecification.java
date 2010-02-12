/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fractalIDL.EnumSpecification#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fractalIDL.FractalIDLPackage#getEnumSpecification()
 * @model
 * @generated
 */
public interface EnumSpecification extends TypeDefinition, TypeSpecification
{
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
   * @see fractalIDL.FractalIDLPackage#getEnumSpecification_Id()
   * @model containment="true"
   * @generated
   */
  Identifier getId();

  /**
   * Sets the value of the '{@link fractalIDL.EnumSpecification#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Identifier value);

} // EnumSpecification
