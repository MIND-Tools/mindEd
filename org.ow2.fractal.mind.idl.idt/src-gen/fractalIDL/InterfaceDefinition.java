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
 * A representation of the model object '<em><b>Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fractalIDL.InterfaceDefinition#getFqn <em>Fqn</em>}</li>
 *   <li>{@link fractalIDL.InterfaceDefinition#getFqn2 <em>Fqn2</em>}</li>
 *   <li>{@link fractalIDL.InterfaceDefinition#getMethodDef <em>Method Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see fractalIDL.FractalIDLPackage#getInterfaceDefinition()
 * @model
 * @generated
 */
public interface InterfaceDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Fqn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fqn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fqn</em>' attribute.
   * @see #setFqn(String)
   * @see fractalIDL.FractalIDLPackage#getInterfaceDefinition_Fqn()
   * @model
   * @generated
   */
  String getFqn();

  /**
   * Sets the value of the '{@link fractalIDL.InterfaceDefinition#getFqn <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fqn</em>' attribute.
   * @see #getFqn()
   * @generated
   */
  void setFqn(String value);

  /**
   * Returns the value of the '<em><b>Fqn2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fqn2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fqn2</em>' attribute.
   * @see #setFqn2(String)
   * @see fractalIDL.FractalIDLPackage#getInterfaceDefinition_Fqn2()
   * @model
   * @generated
   */
  String getFqn2();

  /**
   * Sets the value of the '{@link fractalIDL.InterfaceDefinition#getFqn2 <em>Fqn2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fqn2</em>' attribute.
   * @see #getFqn2()
   * @generated
   */
  void setFqn2(String value);

  /**
   * Returns the value of the '<em><b>Method Def</b></em>' containment reference list.
   * The list contents are of type {@link fractalIDL.MethodDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Def</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Def</em>' containment reference list.
   * @see fractalIDL.FractalIDLPackage#getInterfaceDefinition_MethodDef()
   * @model containment="true"
   * @generated
   */
  EList<MethodDefinition> getMethodDef();

} // InterfaceDefinition
