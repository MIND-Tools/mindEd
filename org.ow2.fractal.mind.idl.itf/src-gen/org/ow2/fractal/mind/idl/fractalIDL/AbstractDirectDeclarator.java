/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Direct Declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.AbstractDirectDeclarator#getDec <em>Dec</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.AbstractDirectDeclarator#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getAbstractDirectDeclarator()
 * @model
 * @generated
 */
public interface AbstractDirectDeclarator extends EObject
{
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
   * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getAbstractDirectDeclarator_Dec()
   * @model containment="true"
   * @generated
   */
  Declarator getDec();

  /**
   * Sets the value of the '{@link org.ow2.fractal.mind.idl.fractalIDL.AbstractDirectDeclarator#getDec <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dec</em>' containment reference.
   * @see #getDec()
   * @generated
   */
  void setDec(Declarator value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' attribute list.
   * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getAbstractDirectDeclarator_Array()
   * @model unique="false"
   * @generated
   */
  EList<String> getArray();

} // AbstractDirectDeclarator
