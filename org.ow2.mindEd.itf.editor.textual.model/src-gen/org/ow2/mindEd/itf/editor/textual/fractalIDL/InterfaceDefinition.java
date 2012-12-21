/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

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
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getAnnotationsList <em>Annotations List</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getFqn2 <em>Fqn2</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getMethodDef <em>Method Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getInterfaceDefinition()
 * @model
 * @generated
 */
public interface InterfaceDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations List</em>' containment reference.
   * @see #setAnnotationsList(AnnotationsList)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getInterfaceDefinition_AnnotationsList()
   * @model containment="true"
   * @generated
   */
  AnnotationsList getAnnotationsList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getAnnotationsList <em>Annotations List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotations List</em>' containment reference.
   * @see #getAnnotationsList()
   * @generated
   */
  void setAnnotationsList(AnnotationsList value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getInterfaceDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fqn2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fqn2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fqn2</em>' reference.
   * @see #setFqn2(InterfaceDefinition)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getInterfaceDefinition_Fqn2()
   * @model
   * @generated
   */
  InterfaceDefinition getFqn2();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getFqn2 <em>Fqn2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fqn2</em>' reference.
   * @see #getFqn2()
   * @generated
   */
  void setFqn2(InterfaceDefinition value);

  /**
   * Returns the value of the '<em><b>Method Def</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Def</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Def</em>' containment reference list.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getInterfaceDefinition_MethodDef()
   * @model containment="true"
   * @generated
   */
  EList<MethodDefinition> getMethodDef();

} // InterfaceDefinition
