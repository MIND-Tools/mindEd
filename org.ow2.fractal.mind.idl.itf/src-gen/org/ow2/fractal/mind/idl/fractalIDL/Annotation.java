/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.Annotation#getFqn <em>Fqn</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.Annotation#getAnnotationParamaters <em>Annotation Paramaters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
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
   * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getAnnotation_Fqn()
   * @model
   * @generated
   */
  String getFqn();

  /**
   * Sets the value of the '{@link org.ow2.fractal.mind.idl.fractalIDL.Annotation#getFqn <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fqn</em>' attribute.
   * @see #getFqn()
   * @generated
   */
  void setFqn(String value);

  /**
   * Returns the value of the '<em><b>Annotation Paramaters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation Paramaters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation Paramaters</em>' containment reference.
   * @see #setAnnotationParamaters(AnnotationParameters)
   * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getAnnotation_AnnotationParamaters()
   * @model containment="true"
   * @generated
   */
  AnnotationParameters getAnnotationParamaters();

  /**
   * Sets the value of the '{@link org.ow2.fractal.mind.idl.fractalIDL.Annotation#getAnnotationParamaters <em>Annotation Paramaters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation Paramaters</em>' containment reference.
   * @see #getAnnotationParamaters()
   * @generated
   */
  void setAnnotationParamaters(AnnotationParameters value);

} // Annotation
