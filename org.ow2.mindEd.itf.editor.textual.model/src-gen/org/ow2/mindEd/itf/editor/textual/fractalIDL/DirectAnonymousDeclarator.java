/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Anonymous Declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectAnonymousDeclarator#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getDirectAnonymousDeclarator()
 * @model
 * @generated
 */
public interface DirectAnonymousDeclarator extends EObject
{
  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference list.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getDirectAnonymousDeclarator_Array()
   * @model containment="true"
   * @generated
   */
  EList<ArraySpecification> getArray();

} // DirectAnonymousDeclarator
