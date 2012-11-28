/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getAnnotationsList <em>Annotations List</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getQualifiedTypeSpec <em>Qualified Type Spec</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getPointerSpecification <em>Pointer Specification</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getParameterList <em>Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getMethodDefinition()
 * @model
 * @generated
 */
public interface MethodDefinition extends EObject
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
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getMethodDefinition_AnnotationsList()
   * @model containment="true"
   * @generated
   */
  AnnotationsList getAnnotationsList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getAnnotationsList <em>Annotations List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotations List</em>' containment reference.
   * @see #getAnnotationsList()
   * @generated
   */
  void setAnnotationsList(AnnotationsList value);

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
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getMethodDefinition_QualifiedTypeSpec()
   * @model containment="true"
   * @generated
   */
  QualifiedTypeSpecification getQualifiedTypeSpec();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getQualifiedTypeSpec <em>Qualified Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Type Spec</em>' containment reference.
   * @see #getQualifiedTypeSpec()
   * @generated
   */
  void setQualifiedTypeSpec(QualifiedTypeSpecification value);

  /**
   * Returns the value of the '<em><b>Pointer Specification</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedPointerSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointer Specification</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointer Specification</em>' containment reference list.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getMethodDefinition_PointerSpecification()
   * @model containment="true"
   * @generated
   */
  EList<QualifiedPointerSpecification> getPointerSpecification();

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
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getMethodDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getMethodDefinition_ParameterList()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameterList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getParameterList <em>Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter List</em>' containment reference.
   * @see #getParameterList()
   * @generated
   */
  void setParameterList(ParameterList value);

} // MethodDefinition
