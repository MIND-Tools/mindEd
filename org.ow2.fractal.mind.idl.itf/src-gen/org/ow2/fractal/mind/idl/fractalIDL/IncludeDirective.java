/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getIncludeDirective()
 * @model
 * @generated
 */
public interface IncludeDirective extends EObject
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getIncludeDirective_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

} // IncludeDirective
