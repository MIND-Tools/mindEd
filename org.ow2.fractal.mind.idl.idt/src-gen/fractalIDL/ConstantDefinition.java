/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fractalIDL.ConstantDefinition#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fractalIDL.FractalIDLPackage#getConstantDefinition()
 * @model
 * @generated
 */
public interface ConstantDefinition extends EObject
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
   * @see fractalIDL.FractalIDLPackage#getConstantDefinition_Id()
   * @model containment="true"
   * @generated
   */
  Identifier getId();

  /**
   * Sets the value of the '{@link fractalIDL.ConstantDefinition#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Identifier value);

} // ConstantDefinition
