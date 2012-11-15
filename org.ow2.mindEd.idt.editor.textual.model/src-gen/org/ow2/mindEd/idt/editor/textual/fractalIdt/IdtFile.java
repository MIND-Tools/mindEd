/**
 */
package org.ow2.mindEd.idt.editor.textual.fractalIdt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Idt File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getBegindef <em>Begindef</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getDef <em>Def</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getEndDef <em>End Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtPackage#getIdtFile()
 * @model
 * @generated
 */
public interface IdtFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Begindef</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Begindef</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Begindef</em>' containment reference.
   * @see #setBegindef(ConstantDefinitionBegin)
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtPackage#getIdtFile_Begindef()
   * @model containment="true"
   * @generated
   */
  ConstantDefinitionBegin getBegindef();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getBegindef <em>Begindef</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Begindef</em>' containment reference.
   * @see #getBegindef()
   * @generated
   */
  void setBegindef(ConstantDefinitionBegin value);

  /**
   * Returns the value of the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' containment reference.
   * @see #setDef(ConstantDefinition)
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtPackage#getIdtFile_Def()
   * @model containment="true"
   * @generated
   */
  ConstantDefinition getDef();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getDef <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' containment reference.
   * @see #getDef()
   * @generated
   */
  void setDef(ConstantDefinition value);

  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtPackage#getIdtFile_Includes()
   * @model containment="true"
   * @generated
   */
  EList<IncludeDirective> getIncludes();

  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference list.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtPackage#getIdtFile_Constant()
   * @model containment="true"
   * @generated
   */
  EList<ConstantDefinition> getConstant();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference list.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtPackage#getIdtFile_Type()
   * @model containment="true"
   * @generated
   */
  EList<TypeDefinition> getType();

  /**
   * Returns the value of the '<em><b>End Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Def</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Def</em>' attribute.
   * @see #setEndDef(String)
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtPackage#getIdtFile_EndDef()
   * @model
   * @generated
   */
  String getEndDef();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getEndDef <em>End Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Def</em>' attribute.
   * @see #getEndDef()
   * @generated
   */
  void setEndDef(String value);

} // IdtFile
