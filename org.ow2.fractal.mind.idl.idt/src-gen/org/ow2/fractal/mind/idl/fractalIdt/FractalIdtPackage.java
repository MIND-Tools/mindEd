/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIdt;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ow2.fractal.mind.idl.fractalIdt.FractalIdtFactory
 * @model kind="package"
 * @generated
 */
public interface FractalIdtPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fractalIdt";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ow2.org/fractal/mind/idl/FractalIdt";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fractalIdt";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FractalIdtPackage eINSTANCE = org.ow2.fractal.mind.idl.fractalIdt.impl.FractalIdtPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIdt.impl.IdtFileImpl <em>Idt File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIdt.impl.IdtFileImpl
   * @see org.ow2.fractal.mind.idl.fractalIdt.impl.FractalIdtPackageImpl#getIdtFile()
   * @generated
   */
  int IDT_FILE = 0;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__INCLUDES = 0;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__CONSTANT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Idt File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIdt.IdtFile <em>Idt File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Idt File</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIdt.IdtFile
   * @generated
   */
  EClass getIdtFile();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.idl.fractalIdt.IdtFile#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIdt.IdtFile#getIncludes()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Includes();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.idl.fractalIdt.IdtFile#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constant</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIdt.IdtFile#getConstant()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Constant();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.idl.fractalIdt.IdtFile#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIdt.IdtFile#getType()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FractalIdtFactory getFractalIdtFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIdt.impl.IdtFileImpl <em>Idt File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIdt.impl.IdtFileImpl
     * @see org.ow2.fractal.mind.idl.fractalIdt.impl.FractalIdtPackageImpl#getIdtFile()
     * @generated
     */
    EClass IDT_FILE = eINSTANCE.getIdtFile();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__INCLUDES = eINSTANCE.getIdtFile_Includes();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__CONSTANT = eINSTANCE.getIdtFile_Constant();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__TYPE = eINSTANCE.getIdtFile_Type();

  }

} //FractalIdtPackage
