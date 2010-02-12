/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIdt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage;
import org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl;
import org.ow2.fractal.mind.idl.fractalIdt.FractalIdtFactory;
import org.ow2.fractal.mind.idl.fractalIdt.FractalIdtPackage;
import org.ow2.fractal.mind.idl.fractalIdt.IdtFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FractalIdtPackageImpl extends EPackageImpl implements FractalIdtPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idtFileEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.ow2.fractal.mind.idl.fractalIdt.FractalIdtPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FractalIdtPackageImpl()
  {
    super(eNS_URI, FractalIdtFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FractalIdtPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FractalIdtPackage init()
  {
    if (isInited) return (FractalIdtPackage)EPackage.Registry.INSTANCE.getEPackage(FractalIdtPackage.eNS_URI);

    // Obtain or create and register package
    FractalIdtPackageImpl theFractalIdtPackage = (FractalIdtPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FractalIdtPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FractalIdtPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    FractalIDLPackageImpl theFractalIDLPackage = (FractalIDLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FractalIDLPackage.eNS_URI) instanceof FractalIDLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FractalIDLPackage.eNS_URI) : FractalIDLPackage.eINSTANCE);

    // Create package meta-data objects
    theFractalIdtPackage.createPackageContents();
    theFractalIDLPackage.createPackageContents();

    // Initialize created meta-data
    theFractalIdtPackage.initializePackageContents();
    theFractalIDLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFractalIdtPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FractalIdtPackage.eNS_URI, theFractalIdtPackage);
    return theFractalIdtPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdtFile()
  {
    return idtFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdtFile_Includes()
  {
    return (EReference)idtFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdtFile_Type()
  {
    return (EReference)idtFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdtFile_Constant()
  {
    return (EReference)idtFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalIdtFactory getFractalIdtFactory()
  {
    return (FractalIdtFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    idtFileEClass = createEClass(IDT_FILE);
    createEReference(idtFileEClass, IDT_FILE__INCLUDES);
    createEReference(idtFileEClass, IDT_FILE__TYPE);
    createEReference(idtFileEClass, IDT_FILE__CONSTANT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    FractalIDLPackage theFractalIDLPackage = (FractalIDLPackage)EPackage.Registry.INSTANCE.getEPackage(FractalIDLPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(idtFileEClass, IdtFile.class, "IdtFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIdtFile_Includes(), theFractalIDLPackage.getIncludeDirective(), null, "includes", null, 0, -1, IdtFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIdtFile_Type(), theFractalIDLPackage.getTypeDefinition(), null, "type", null, 0, -1, IdtFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIdtFile_Constant(), theFractalIDLPackage.getConstantDefinition(), null, "constant", null, 0, -1, IdtFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FractalIdtPackageImpl
