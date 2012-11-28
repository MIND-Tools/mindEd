/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getTemplateSpecifiers <em>Template Specifiers</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getCompositeDefinition()
 * @model
 * @generated
 */
public interface CompositeDefinition extends ArchitectureDefinition, CompositeSuperTypeDefinition
{
  /**
   * Returns the value of the '<em><b>Template Specifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Specifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Specifiers</em>' containment reference list.
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getCompositeDefinition_TemplateSpecifiers()
   * @model containment="true"
   * @generated
   */
  EList<TemplateSpecifier> getTemplateSpecifiers();

  /**
   * Returns the value of the '<em><b>Composite Formal Arguments List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composite Formal Arguments List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composite Formal Arguments List</em>' containment reference.
   * @see #setCompositeFormalArgumentsList(FormalArgumentsList)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getCompositeDefinition_CompositeFormalArgumentsList()
   * @model containment="true"
   * @generated
   */
  FormalArgumentsList getCompositeFormalArgumentsList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composite Formal Arguments List</em>' containment reference.
   * @see #getCompositeFormalArgumentsList()
   * @generated
   */
  void setCompositeFormalArgumentsList(FormalArgumentsList value);

  /**
   * Returns the value of the '<em><b>Super Types</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.textual.fractal.CompositeSuperType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Types</em>' containment reference list.
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getCompositeDefinition_SuperTypes()
   * @model containment="true"
   * @generated
   */
  EList<CompositeSuperType> getSuperTypes();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.textual.fractal.CompositeElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getCompositeDefinition_Elements()
   * @model containment="true"
   * @generated
   */
  EList<CompositeElement> getElements();

} // CompositeDefinition
