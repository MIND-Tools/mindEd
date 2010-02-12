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
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fractalIDL.Parameter#getParameterQualifier <em>Parameter Qualifier</em>}</li>
 *   <li>{@link fractalIDL.Parameter#getQualifiedTypeSpec <em>Qualified Type Spec</em>}</li>
 *   <li>{@link fractalIDL.Parameter#getDec <em>Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @see fractalIDL.FractalIDLPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Qualifier</b></em>' attribute list.
   * The list contents are of type {@link fractalIDL.ParameterQualifier}.
   * The literals are from the enumeration {@link fractalIDL.ParameterQualifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Qualifier</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Qualifier</em>' attribute list.
   * @see fractalIDL.ParameterQualifier
   * @see fractalIDL.FractalIDLPackage#getParameter_ParameterQualifier()
   * @model unique="false"
   * @generated
   */
  EList<ParameterQualifier> getParameterQualifier();

  /**
   * Returns the value of the '<em><b>Qualified Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Type Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Type Spec</em>' containment reference.
   * @see #setQualifiedTypeSpec(QualifiedTypeSpecification)
   * @see fractalIDL.FractalIDLPackage#getParameter_QualifiedTypeSpec()
   * @model containment="true"
   * @generated
   */
  QualifiedTypeSpecification getQualifiedTypeSpec();

  /**
   * Sets the value of the '{@link fractalIDL.Parameter#getQualifiedTypeSpec <em>Qualified Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Type Spec</em>' containment reference.
   * @see #getQualifiedTypeSpec()
   * @generated
   */
  void setQualifiedTypeSpec(QualifiedTypeSpecification value);

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
   * @see fractalIDL.FractalIDLPackage#getParameter_Dec()
   * @model containment="true"
   * @generated
   */
  Declarator getDec();

  /**
   * Sets the value of the '{@link fractalIDL.Parameter#getDec <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dec</em>' containment reference.
   * @see #getDec()
   * @generated
   */
  void setDec(Declarator value);

} // Parameter
