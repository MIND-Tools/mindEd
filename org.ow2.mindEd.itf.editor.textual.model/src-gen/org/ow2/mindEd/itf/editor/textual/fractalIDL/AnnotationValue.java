/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue#getArrayValue <em>Array Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getAnnotationValue()
 * @model
 * @generated
 */
public interface AnnotationValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getAnnotationValue_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Array Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Value</em>' containment reference.
   * @see #setArrayValue(ArrayAnnotationValue)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getAnnotationValue_ArrayValue()
   * @model containment="true"
   * @generated
   */
  ArrayAnnotationValue getArrayValue();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue#getArrayValue <em>Array Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Value</em>' containment reference.
   * @see #getArrayValue()
   * @generated
   */
  void setArrayValue(ArrayAnnotationValue value);

} // AnnotationValue
