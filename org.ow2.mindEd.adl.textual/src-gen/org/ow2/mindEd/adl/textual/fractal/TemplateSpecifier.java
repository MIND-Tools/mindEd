/**
 */
package org.ow2.mindEd.adl.textual.fractal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier#getTypeReference <em>Type Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getTemplateSpecifier()
 * @model
 * @generated
 */
public interface TemplateSpecifier extends TypeReference
{
  /**
   * Returns the value of the '<em><b>Type Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Reference</em>' reference.
   * @see #setTypeReference(TypeDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getTemplateSpecifier_TypeReference()
   * @model
   * @generated
   */
  TypeDefinition getTypeReference();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier#getTypeReference <em>Type Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Reference</em>' reference.
   * @see #getTypeReference()
   * @generated
   */
  void setTypeReference(TypeDefinition value);

} // TemplateSpecifier
