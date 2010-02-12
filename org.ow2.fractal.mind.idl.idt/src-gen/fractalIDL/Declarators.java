/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fractalIDL.Declarators#getDec <em>Dec</em>}</li>
 *   <li>{@link fractalIDL.Declarators#getDeclaratorList <em>Declarator List</em>}</li>
 * </ul>
 * </p>
 *
 * @see fractalIDL.FractalIDLPackage#getDeclarators()
 * @model
 * @generated
 */
public interface Declarators extends EObject
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
   * @see fractalIDL.FractalIDLPackage#getDeclarators_Dec()
   * @model containment="true"
   * @generated
   */
  Declarator getDec();

  /**
   * Sets the value of the '{@link fractalIDL.Declarators#getDec <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dec</em>' containment reference.
   * @see #getDec()
   * @generated
   */
  void setDec(Declarator value);

  /**
   * Returns the value of the '<em><b>Declarator List</b></em>' containment reference list.
   * The list contents are of type {@link fractalIDL.Declarator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarator List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarator List</em>' containment reference list.
   * @see fractalIDL.FractalIDLPackage#getDeclarators_DeclaratorList()
   * @model containment="true"
   * @generated
   */
  EList<Declarator> getDeclaratorList();

} // Declarators
