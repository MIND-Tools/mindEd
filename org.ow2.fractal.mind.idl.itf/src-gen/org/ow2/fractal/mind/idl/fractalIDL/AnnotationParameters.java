/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.AnnotationParameters#getValuePair <em>Value Pair</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.AnnotationParameters#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getAnnotationParameters()
 * @model
 * @generated
 */
public interface AnnotationParameters extends EObject
{
  /**
   * Returns the value of the '<em><b>Value Pair</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Pair</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Pair</em>' containment reference.
   * @see #setValuePair(AnnotationValuePairs)
   * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getAnnotationParameters_ValuePair()
   * @model containment="true"
   * @generated
   */
  AnnotationValuePairs getValuePair();

  /**
   * Sets the value of the '{@link org.ow2.fractal.mind.idl.fractalIDL.AnnotationParameters#getValuePair <em>Value Pair</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Pair</em>' containment reference.
   * @see #getValuePair()
   * @generated
   */
  void setValuePair(AnnotationValuePairs value);

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
   * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getAnnotationParameters_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.ow2.fractal.mind.idl.fractalIDL.AnnotationParameters#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // AnnotationParameters
