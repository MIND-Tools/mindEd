/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.EnumMember#getEnumMember <em>Enum Member</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIDL.EnumMember#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getEnumMember()
 * @model
 * @generated
 */
public interface EnumMember extends EnumMemberList
{
  /**
   * Returns the value of the '<em><b>Enum Member</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.fractal.mind.idl.fractalIDL.EnumMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Member</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Member</em>' containment reference list.
   * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getEnumMember_EnumMember()
   * @model containment="true"
   * @generated
   */
  EList<EnumMember> getEnumMember();

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(Identifier)
   * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#getEnumMember_Id()
   * @model containment="true"
   * @generated
   */
  Identifier getId();

  /**
   * Sets the value of the '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumMember#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Identifier value);

} // EnumMember
