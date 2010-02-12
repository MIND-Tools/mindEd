/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.Declarator#getTypeQualifier <em>Type Qualifier</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.Declarator#getDc <em>Dc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getDeclarator()
 * @model
 * @generated
 */
public interface Declarator extends DirectDeclarator
{
  /**
   * Returns the value of the '<em><b>Type Qualifier</b></em>' attribute list.
   * The list contents are of type {@link org.ow2.fractal.mind.idl.fractalIDL.TypeQualifier}.
   * The literals are from the enumeration {@link org.ow2.fractal.mind.idl.fractalIDL.TypeQualifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Qualifier</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Qualifier</em>' attribute list.
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypeQualifier
   * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getDeclarator_TypeQualifier()
   * @model unique="false"
   * @generated
   */
  EList<TypeQualifier> getTypeQualifier();

  /**
   * Returns the value of the '<em><b>Dc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dc</em>' containment reference.
   * @see #setDc(DirectDeclarator)
   * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getDeclarator_Dc()
   * @model containment="true"
   * @generated
   */
  DirectDeclarator getDc();

  /**
   * Sets the value of the '{@link org.ow2.fractal.mind.idl.fractalIDL.Declarator#getDc <em>Dc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dc</em>' containment reference.
   * @see #getDc()
   * @generated
   */
  void setDc(DirectDeclarator value);

} // Declarator
