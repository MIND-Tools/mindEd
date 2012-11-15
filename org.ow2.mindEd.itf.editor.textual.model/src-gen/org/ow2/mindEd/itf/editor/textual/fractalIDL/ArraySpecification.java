/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification#isUnspecifiedSize <em>Unspecified Size</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification#getFixedSize <em>Fixed Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getArraySpecification()
 * @model
 * @generated
 */
public interface ArraySpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Unspecified Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unspecified Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unspecified Size</em>' attribute.
   * @see #setUnspecifiedSize(boolean)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getArraySpecification_UnspecifiedSize()
   * @model
   * @generated
   */
  boolean isUnspecifiedSize();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification#isUnspecifiedSize <em>Unspecified Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unspecified Size</em>' attribute.
   * @see #isUnspecifiedSize()
   * @generated
   */
  void setUnspecifiedSize(boolean value);

  /**
   * Returns the value of the '<em><b>Fixed Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixed Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed Size</em>' containment reference.
   * @see #setFixedSize(ConstantExpression)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getArraySpecification_FixedSize()
   * @model containment="true"
   * @generated
   */
  ConstantExpression getFixedSize();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification#getFixedSize <em>Fixed Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed Size</em>' containment reference.
   * @see #getFixedSize()
   * @generated
   */
  void setFixedSize(ConstantExpression value);

} // ArraySpecification
