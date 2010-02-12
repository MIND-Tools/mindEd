/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fractalIDL.MethodDefinition#getQualifiedTypeSpec <em>Qualified Type Spec</em>}</li>
 *   <li>{@link fractalIDL.MethodDefinition#getId <em>Id</em>}</li>
 *   <li>{@link fractalIDL.MethodDefinition#getParameterList <em>Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @see fractalIDL.FractalIDLPackage#getMethodDefinition()
 * @model
 * @generated
 */
public interface MethodDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Qualified Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Type Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Type Spec</em>' containment reference.
   * @see #setQualifiedTypeSpec(QualifiedTypeSpecification)
   * @see fractalIDL.FractalIDLPackage#getMethodDefinition_QualifiedTypeSpec()
   * @model containment="true"
   * @generated
   */
  QualifiedTypeSpecification getQualifiedTypeSpec();

  /**
   * Sets the value of the '{@link fractalIDL.MethodDefinition#getQualifiedTypeSpec <em>Qualified Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Type Spec</em>' containment reference.
   * @see #getQualifiedTypeSpec()
   * @generated
   */
  void setQualifiedTypeSpec(QualifiedTypeSpecification value);

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
   * @see fractalIDL.FractalIDLPackage#getMethodDefinition_Id()
   * @model containment="true"
   * @generated
   */
  Identifier getId();

  /**
   * Sets the value of the '{@link fractalIDL.MethodDefinition#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Identifier value);

  /**
   * Returns the value of the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter List</em>' containment reference.
   * @see #setParameterList(ParameterList)
   * @see fractalIDL.FractalIDLPackage#getMethodDefinition_ParameterList()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameterList();

  /**
   * Sets the value of the '{@link fractalIDL.MethodDefinition#getParameterList <em>Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter List</em>' containment reference.
   * @see #getParameterList()
   * @generated
   */
  void setParameterList(ParameterList value);

} // MethodDefinition
