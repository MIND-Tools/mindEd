/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getAnnotationsList <em>Annotations List</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getParameterQualifier <em>Parameter Qualifier</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getQualifiedTypeSpec <em>Qualified Type Spec</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getDec <em>Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
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
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getParameter_AnnotationsList()
   * @model containment="true"
   * @generated
   */
  AnnotationsList getAnnotationsList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getAnnotationsList <em>Annotations List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotations List</em>' containment reference.
   * @see #getAnnotationsList()
   * @generated
   */
  void setAnnotationsList(AnnotationsList value);

  /**
   * Returns the value of the '<em><b>Parameter Qualifier</b></em>' attribute list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterQualifier}.
   * The literals are from the enumeration {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterQualifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Qualifier</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Qualifier</em>' attribute list.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterQualifier
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getParameter_ParameterQualifier()
   * @model unique="false"
   * @generated
   */
  EList<ParameterQualifier> getParameterQualifier();

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
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getParameter_QualifiedTypeSpec()
   * @model containment="true"
   * @generated
   */
  QualifiedTypeSpecification getQualifiedTypeSpec();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getQualifiedTypeSpec <em>Qualified Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Type Spec</em>' containment reference.
   * @see #getQualifiedTypeSpec()
   * @generated
   */
  void setQualifiedTypeSpec(QualifiedTypeSpecification value);

  /**
   * Returns the value of the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dec</em>' containment reference.
   * @see #setDec(Declarator)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getParameter_Dec()
   * @model containment="true"
   * @generated
   */
  Declarator getDec();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getDec <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dec</em>' containment reference.
   * @see #getDec()
   * @generated
   */
  void setDec(Declarator value);

} // Parameter
