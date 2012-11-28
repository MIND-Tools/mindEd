/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Super Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.CompositeSuperType#getTargetArchDef <em>Target Arch Def</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.CompositeSuperType#getTemplatesList <em>Templates List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.CompositeSuperType#getArgumentsList <em>Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getCompositeSuperType()
 * @model
 * @generated
 */
public interface CompositeSuperType extends EObject
{
  /**
   * Returns the value of the '<em><b>Target Arch Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Arch Def</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Arch Def</em>' reference.
   * @see #setTargetArchDef(CompositeSuperTypeDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getCompositeSuperType_TargetArchDef()
   * @model
   * @generated
   */
  CompositeSuperTypeDefinition getTargetArchDef();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.CompositeSuperType#getTargetArchDef <em>Target Arch Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Arch Def</em>' reference.
   * @see #getTargetArchDef()
   * @generated
   */
  void setTargetArchDef(CompositeSuperTypeDefinition value);

  /**
   * Returns the value of the '<em><b>Templates List</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.textual.fractal.TemplateReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Templates List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Templates List</em>' containment reference list.
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getCompositeSuperType_TemplatesList()
   * @model containment="true"
   * @generated
   */
  EList<TemplateReference> getTemplatesList();

  /**
   * Returns the value of the '<em><b>Arguments List</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments List</em>' containment reference list.
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getCompositeSuperType_ArgumentsList()
   * @model containment="true"
   * @generated
   */
  EList<ArgumentDefinition> getArgumentsList();

} // CompositeSuperType
