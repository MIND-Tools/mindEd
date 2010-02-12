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
 * A representation of the model object '<em><b>Itf File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fractalIDL.ItfFile#getIncludes <em>Includes</em>}</li>
 *   <li>{@link fractalIDL.ItfFile#getType <em>Type</em>}</li>
 *   <li>{@link fractalIDL.ItfFile#getConstant <em>Constant</em>}</li>
 *   <li>{@link fractalIDL.ItfFile#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see fractalIDL.FractalIDLPackage#getItfFile()
 * @model
 * @generated
 */
public interface ItfFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link fractalIDL.IncludeDirective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see fractalIDL.FractalIDLPackage#getItfFile_Includes()
   * @model containment="true"
   * @generated
   */
  EList<IncludeDirective> getIncludes();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference list.
   * The list contents are of type {@link fractalIDL.TypeDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference list.
   * @see fractalIDL.FractalIDLPackage#getItfFile_Type()
   * @model containment="true"
   * @generated
   */
  EList<TypeDefinition> getType();

  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference list.
   * The list contents are of type {@link fractalIDL.ConstantDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference list.
   * @see fractalIDL.FractalIDLPackage#getItfFile_Constant()
   * @model containment="true"
   * @generated
   */
  EList<ConstantDefinition> getConstant();

  /**
   * Returns the value of the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' containment reference.
   * @see #setInterface(InterfaceDefinition)
   * @see fractalIDL.FractalIDLPackage#getItfFile_Interface()
   * @model containment="true"
   * @generated
   */
  InterfaceDefinition getInterface();

  /**
   * Sets the value of the '{@link fractalIDL.ItfFile#getInterface <em>Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' containment reference.
   * @see #getInterface()
   * @generated
   */
  void setInterface(InterfaceDefinition value);

} // ItfFile
