/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterList#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getParameterList()
 * @model
 * @generated
 */
public interface ParameterList extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getParameterList_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

} // ParameterList
