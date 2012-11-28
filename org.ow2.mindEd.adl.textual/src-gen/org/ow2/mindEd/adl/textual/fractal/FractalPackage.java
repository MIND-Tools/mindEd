/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.ow2.mindEd.adl.textual.fractal.FractalFactory
 * @model kind="package"
 * @generated
 */
public interface FractalPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fractal";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ow2.org/mindEd/adl/textual/Fractal";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fractal";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FractalPackage eINSTANCE = org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.AdlDefinitionImpl <em>Adl Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.AdlDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getAdlDefinition()
   * @generated
   */
  int ADL_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADL_DEFINITION__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADL_DEFINITION__ANNOTATIONS_LIST = 1;

  /**
   * The feature id for the '<em><b>Architecture Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADL_DEFINITION__ARCHITECTURE_DEFINITION = 2;

  /**
   * The number of structural features of the '<em>Adl Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADL_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.TypeReferenceImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ArchitectureDefinitionImpl <em>Architecture Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.ArchitectureDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getArchitectureDefinition()
   * @generated
   */
  int ARCHITECTURE_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_DEFINITION__NAME = TYPE_REFERENCE__NAME;

  /**
   * The number of structural features of the '<em>Architecture Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_DEFINITION_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ImportDefinitionImpl <em>Import Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.ImportDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getImportDefinition()
   * @generated
   */
  int IMPORT_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DEFINITION__ANNOTATIONS_LIST = 0;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DEFINITION__IMPORTED_NAMESPACE = 1;

  /**
   * The number of structural features of the '<em>Import Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeDefinitionImpl <em>Composite Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.CompositeDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getCompositeDefinition()
   * @generated
   */
  int COMPOSITE_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__NAME = ARCHITECTURE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Template Specifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Composite Formal Arguments List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__SUPER_TYPES = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__ELEMENTS = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Composite Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION_FEATURE_COUNT = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveDefinitionImpl <em>Primitive Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getPrimitiveDefinition()
   * @generated
   */
  int PRIMITIVE_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__NAME = ARCHITECTURE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__ABSTRACT = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Composite Formal Arguments List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__SUPER_TYPES = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__ELEMENTS = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Primitive Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION_FEATURE_COUNT = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.TypeDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__NAME = ARCHITECTURE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Super Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__SUPER_TYPES = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__ELEMENTS = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeSuperTypeImpl <em>Composite Super Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.CompositeSuperTypeImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getCompositeSuperType()
   * @generated
   */
  int COMPOSITE_SUPER_TYPE = 6;

  /**
   * The feature id for the '<em><b>Target Arch Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_SUPER_TYPE__TARGET_ARCH_DEF = 0;

  /**
   * The feature id for the '<em><b>Templates List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_SUPER_TYPE__TEMPLATES_LIST = 1;

  /**
   * The feature id for the '<em><b>Arguments List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_SUPER_TYPE__ARGUMENTS_LIST = 2;

  /**
   * The number of structural features of the '<em>Composite Super Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_SUPER_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveSuperTypeImpl <em>Primitive Super Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveSuperTypeImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getPrimitiveSuperType()
   * @generated
   */
  int PRIMITIVE_SUPER_TYPE = 7;

  /**
   * The feature id for the '<em><b>Target Arch Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_SUPER_TYPE__TARGET_ARCH_DEF = 0;

  /**
   * The feature id for the '<em><b>Arguments List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_SUPER_TYPE__ARGUMENTS_LIST = 1;

  /**
   * The number of structural features of the '<em>Primitive Super Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_SUPER_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeSuperTypeDefinitionImpl <em>Composite Super Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.CompositeSuperTypeDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getCompositeSuperTypeDefinition()
   * @generated
   */
  int COMPOSITE_SUPER_TYPE_DEFINITION = 8;

  /**
   * The number of structural features of the '<em>Composite Super Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_SUPER_TYPE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveSuperTypeDefinitionImpl <em>Primitive Super Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveSuperTypeDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getPrimitiveSuperTypeDefinition()
   * @generated
   */
  int PRIMITIVE_SUPER_TYPE_DEFINITION = 9;

  /**
   * The number of structural features of the '<em>Primitive Super Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_SUPER_TYPE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.ElementImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 15;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ANNOTATIONS_LIST = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.HostedInterfaceDefinitionImpl <em>Hosted Interface Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.HostedInterfaceDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getHostedInterfaceDefinition()
   * @generated
   */
  int HOSTED_INTERFACE_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_INTERFACE_DEFINITION__ANNOTATIONS_LIST = ELEMENT__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_INTERFACE_DEFINITION__ROLE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Signature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_INTERFACE_DEFINITION__SIGNATURE = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_INTERFACE_DEFINITION__NAME = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_INTERFACE_DEFINITION__COLLECTION = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Collectionsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Hosted Interface Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ProvidedInterfaceDefinitionImpl <em>Provided Interface Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.ProvidedInterfaceDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getProvidedInterfaceDefinition()
   * @generated
   */
  int PROVIDED_INTERFACE_DEFINITION = 11;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION__ANNOTATIONS_LIST = HOSTED_INTERFACE_DEFINITION__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION__ROLE = HOSTED_INTERFACE_DEFINITION__ROLE;

  /**
   * The feature id for the '<em><b>Signature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION__SIGNATURE = HOSTED_INTERFACE_DEFINITION__SIGNATURE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION__NAME = HOSTED_INTERFACE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION__COLLECTION = HOSTED_INTERFACE_DEFINITION__COLLECTION;

  /**
   * The feature id for the '<em><b>Collectionsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION__COLLECTIONSIZE = HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE;

  /**
   * The number of structural features of the '<em>Provided Interface Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION_FEATURE_COUNT = HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.RequiredInterfaceDefinitionImpl <em>Required Interface Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.RequiredInterfaceDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getRequiredInterfaceDefinition()
   * @generated
   */
  int REQUIRED_INTERFACE_DEFINITION = 12;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__ANNOTATIONS_LIST = HOSTED_INTERFACE_DEFINITION__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__ROLE = HOSTED_INTERFACE_DEFINITION__ROLE;

  /**
   * The feature id for the '<em><b>Signature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__SIGNATURE = HOSTED_INTERFACE_DEFINITION__SIGNATURE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__NAME = HOSTED_INTERFACE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__COLLECTION = HOSTED_INTERFACE_DEFINITION__COLLECTION;

  /**
   * The feature id for the '<em><b>Collectionsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__COLLECTIONSIZE = HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__OPTIONAL = HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Required Interface Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION_FEATURE_COUNT = HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeElementImpl <em>Composite Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.CompositeElementImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getCompositeElement()
   * @generated
   */
  int COMPOSITE_ELEMENT = 16;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_ELEMENT__ANNOTATIONS_LIST = ELEMENT__ANNOTATIONS_LIST;

  /**
   * The number of structural features of the '<em>Composite Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.SubComponentDefinitionImpl <em>Sub Component Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.SubComponentDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getSubComponentDefinition()
   * @generated
   */
  int SUB_COMPONENT_DEFINITION = 14;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__ANNOTATIONS_LIST = COMPOSITE_ELEMENT__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__TYPE = COMPOSITE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Templates List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__TEMPLATES_LIST = COMPOSITE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arguments List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST = COMPOSITE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__NAME = COMPOSITE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Body Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST = COMPOSITE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__BODY = COMPOSITE_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Sub Component Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION_FEATURE_COUNT = COMPOSITE_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveElementImpl <em>Primitive Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveElementImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getPrimitiveElement()
   * @generated
   */
  int PRIMITIVE_ELEMENT = 17;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_ELEMENT__ANNOTATIONS_LIST = ELEMENT__ANNOTATIONS_LIST;

  /**
   * The number of structural features of the '<em>Primitive Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl <em>Binding Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getBindingDefinition()
   * @generated
   */
  int BINDING_DEFINITION = 18;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__ANNOTATIONS_LIST = COMPOSITE_ELEMENT__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Source Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__SOURCE_PARENT = COMPOSITE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Src Parent This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__IS_SRC_PARENT_THIS = COMPOSITE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__SOURCE_INTERFACE = COMPOSITE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Source Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__SOURCE_INDEX = COMPOSITE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Target Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__TARGET_PARENT = COMPOSITE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Is Tgt Parent This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__IS_TGT_PARENT_THIS = COMPOSITE_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Target Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__TARGET_INTERFACE = COMPOSITE_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Target Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__TARGET_INDEX = COMPOSITE_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Binding Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION_FEATURE_COUNT = COMPOSITE_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.FormalArgumentImpl <em>Formal Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FormalArgumentImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getFormalArgument()
   * @generated
   */
  int FORMAL_ARGUMENT = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_ARGUMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Formal Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_ARGUMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.FormalArgumentsListImpl <em>Formal Arguments List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FormalArgumentsListImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getFormalArgumentsList()
   * @generated
   */
  int FORMAL_ARGUMENTS_LIST = 20;

  /**
   * The feature id for the '<em><b>Formal Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS = 0;

  /**
   * The number of structural features of the '<em>Formal Arguments List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_ARGUMENTS_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.TemplateSpecifierImpl <em>Template Specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.TemplateSpecifierImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getTemplateSpecifier()
   * @generated
   */
  int TEMPLATE_SPECIFIER = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SPECIFIER__NAME = TYPE_REFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SPECIFIER__TYPE_REFERENCE = TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Template Specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SPECIFIER_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.TemplateReferenceImpl <em>Template Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.TemplateReferenceImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getTemplateReference()
   * @generated
   */
  int TEMPLATE_REFERENCE = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REFERENCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REFERENCE__TYPE_REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Any Type Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REFERENCE__ANY_TYPE_REFERENCE = 2;

  /**
   * The feature id for the '<em><b>Templates List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REFERENCE__TEMPLATES_LIST = 3;

  /**
   * The feature id for the '<em><b>Arguments List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REFERENCE__ARGUMENTS_LIST = 4;

  /**
   * The number of structural features of the '<em>Template Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REFERENCE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ArgumentDefinitionImpl <em>Argument Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.ArgumentDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getArgumentDefinition()
   * @generated
   */
  int ARGUMENT_DEFINITION = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Argument Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DEFINITION__ARGUMENT_VALUE = 1;

  /**
   * The number of structural features of the '<em>Argument Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.AttributeDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getAttributeDefinition()
   * @generated
   */
  int ATTRIBUTE_DEFINITION = 24;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DEFINITION__ANNOTATIONS_LIST = PRIMITIVE_ELEMENT__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DEFINITION__TYPE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DEFINITION__ATTRIBUTE_NAME = PRIMITIVE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DEFINITION__VALUE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Attribute Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DEFINITION_FEATURE_COUNT = PRIMITIVE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ImplementationDefinitionImpl <em>Implementation Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.ImplementationDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getImplementationDefinition()
   * @generated
   */
  int IMPLEMENTATION_DEFINITION = 25;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_DEFINITION__ANNOTATIONS_LIST = PRIMITIVE_ELEMENT__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>File C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_DEFINITION__FILE_C = PRIMITIVE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inline Ccode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_DEFINITION__INLINE_CCODE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Implementation Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_DEFINITION_FEATURE_COUNT = PRIMITIVE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.DataDefinitionImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getDataDefinition()
   * @generated
   */
  int DATA_DEFINITION = 26;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION__ANNOTATIONS_LIST = PRIMITIVE_ELEMENT__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>File C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION__FILE_C = PRIMITIVE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inline Ccode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION__INLINE_CCODE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_FEATURE_COUNT = PRIMITIVE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.FileCImpl <em>File C</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FileCImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getFileC()
   * @generated
   */
  int FILE_C = 27;

  /**
   * The feature id for the '<em><b>Directory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_C__DIRECTORY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_C__NAME = 1;

  /**
   * The number of structural features of the '<em>File C</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_C_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.InlineCodeCImpl <em>Inline Code C</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.InlineCodeCImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getInlineCodeC()
   * @generated
   */
  int INLINE_CODE_C = 28;

  /**
   * The feature id for the '<em><b>Code C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_CODE_C__CODE_C = 0;

  /**
   * The number of structural features of the '<em>Inline Code C</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_CODE_C_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.AnnotationsListImpl <em>Annotations List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.AnnotationsListImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getAnnotationsList()
   * @generated
   */
  int ANNOTATIONS_LIST = 29;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATIONS_LIST__ANNOTATIONS = 0;

  /**
   * The number of structural features of the '<em>Annotations List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATIONS_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ElementValueImpl <em>Element Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.ElementValueImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getElementValue()
   * @generated
   */
  int ELEMENT_VALUE = 32;

  /**
   * The number of structural features of the '<em>Element Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.AnnotationImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__NAME = ELEMENT_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotation Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATION_ELEMENTS = ELEMENT_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = ELEMENT_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.AnnotationElementImpl <em>Annotation Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.AnnotationElementImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getAnnotationElement()
   * @generated
   */
  int ANNOTATION_ELEMENT = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Element Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ELEMENT__ELEMENT_VALUE = 1;

  /**
   * The number of structural features of the '<em>Annotation Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ElementValueArrayInitializerImpl <em>Element Value Array Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.ElementValueArrayInitializerImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getElementValueArrayInitializer()
   * @generated
   */
  int ELEMENT_VALUE_ARRAY_INITIALIZER = 33;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_VALUE_ARRAY_INITIALIZER__VALUES = ELEMENT_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element Value Array Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_VALUE_ARRAY_INITIALIZER_FEATURE_COUNT = ELEMENT_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ConstantValueImpl <em>Constant Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.textual.fractal.impl.ConstantValueImpl
   * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getConstantValue()
   * @generated
   */
  int CONSTANT_VALUE = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_VALUE__VALUE = ELEMENT_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_VALUE_FEATURE_COUNT = ELEMENT_VALUE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.AdlDefinition <em>Adl Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adl Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.AdlDefinition
   * @generated
   */
  EClass getAdlDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.AdlDefinition#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.AdlDefinition#getImports()
   * @see #getAdlDefinition()
   * @generated
   */
  EReference getAdlDefinition_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.AdlDefinition#getAnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotations List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.AdlDefinition#getAnnotationsList()
   * @see #getAdlDefinition()
   * @generated
   */
  EReference getAdlDefinition_AnnotationsList();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.AdlDefinition#getArchitectureDefinition <em>Architecture Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Architecture Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.AdlDefinition#getArchitectureDefinition()
   * @see #getAdlDefinition()
   * @generated
   */
  EReference getAdlDefinition_ArchitectureDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition <em>Architecture Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Architecture Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition
   * @generated
   */
  EClass getArchitectureDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.ImportDefinition <em>Import Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ImportDefinition
   * @generated
   */
  EClass getImportDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.ImportDefinition#getAnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotations List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ImportDefinition#getAnnotationsList()
   * @see #getImportDefinition()
   * @generated
   */
  EReference getImportDefinition_AnnotationsList();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.ImportDefinition#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ImportDefinition#getImportedNamespace()
   * @see #getImportDefinition()
   * @generated
   */
  EAttribute getImportDefinition_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition <em>Composite Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.CompositeDefinition
   * @generated
   */
  EClass getCompositeDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getTemplateSpecifiers <em>Template Specifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Template Specifiers</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getTemplateSpecifiers()
   * @see #getCompositeDefinition()
   * @generated
   */
  EReference getCompositeDefinition_TemplateSpecifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composite Formal Arguments List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getCompositeFormalArgumentsList()
   * @see #getCompositeDefinition()
   * @generated
   */
  EReference getCompositeDefinition_CompositeFormalArgumentsList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getSuperTypes <em>Super Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Super Types</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getSuperTypes()
   * @see #getCompositeDefinition()
   * @generated
   */
  EReference getCompositeDefinition_SuperTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getElements()
   * @see #getCompositeDefinition()
   * @generated
   */
  EReference getCompositeDefinition_Elements();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition <em>Primitive Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition
   * @generated
   */
  EClass getPrimitiveDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition#isAbstract()
   * @see #getPrimitiveDefinition()
   * @generated
   */
  EAttribute getPrimitiveDefinition_Abstract();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composite Formal Arguments List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition#getCompositeFormalArgumentsList()
   * @see #getPrimitiveDefinition()
   * @generated
   */
  EReference getPrimitiveDefinition_CompositeFormalArgumentsList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition#getSuperTypes <em>Super Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Super Types</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition#getSuperTypes()
   * @see #getPrimitiveDefinition()
   * @generated
   */
  EReference getPrimitiveDefinition_SuperTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition#getElements()
   * @see #getPrimitiveDefinition()
   * @generated
   */
  EReference getPrimitiveDefinition_Elements();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for the reference list '{@link org.ow2.mindEd.adl.textual.fractal.TypeDefinition#getSuperTypes <em>Super Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super Types</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.TypeDefinition#getSuperTypes()
   * @see #getTypeDefinition()
   * @generated
   */
  EReference getTypeDefinition_SuperTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.TypeDefinition#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.TypeDefinition#getElements()
   * @see #getTypeDefinition()
   * @generated
   */
  EReference getTypeDefinition_Elements();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.CompositeSuperType <em>Composite Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Super Type</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.CompositeSuperType
   * @generated
   */
  EClass getCompositeSuperType();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.textual.fractal.CompositeSuperType#getTargetArchDef <em>Target Arch Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Arch Def</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.CompositeSuperType#getTargetArchDef()
   * @see #getCompositeSuperType()
   * @generated
   */
  EReference getCompositeSuperType_TargetArchDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.CompositeSuperType#getTemplatesList <em>Templates List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Templates List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.CompositeSuperType#getTemplatesList()
   * @see #getCompositeSuperType()
   * @generated
   */
  EReference getCompositeSuperType_TemplatesList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.CompositeSuperType#getArgumentsList <em>Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.CompositeSuperType#getArgumentsList()
   * @see #getCompositeSuperType()
   * @generated
   */
  EReference getCompositeSuperType_ArgumentsList();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperType <em>Primitive Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Super Type</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperType
   * @generated
   */
  EClass getPrimitiveSuperType();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperType#getTargetArchDef <em>Target Arch Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Arch Def</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperType#getTargetArchDef()
   * @see #getPrimitiveSuperType()
   * @generated
   */
  EReference getPrimitiveSuperType_TargetArchDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperType#getArgumentsList <em>Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperType#getArgumentsList()
   * @see #getPrimitiveSuperType()
   * @generated
   */
  EReference getPrimitiveSuperType_ArgumentsList();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.CompositeSuperTypeDefinition <em>Composite Super Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Super Type Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.CompositeSuperTypeDefinition
   * @generated
   */
  EClass getCompositeSuperTypeDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperTypeDefinition <em>Primitive Super Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Super Type Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.PrimitiveSuperTypeDefinition
   * @generated
   */
  EClass getPrimitiveSuperTypeDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition <em>Hosted Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hosted Interface Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition
   * @generated
   */
  EClass getHostedInterfaceDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getRole()
   * @see #getHostedInterfaceDefinition()
   * @generated
   */
  EAttribute getHostedInterfaceDefinition_Role();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signature</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getSignature()
   * @see #getHostedInterfaceDefinition()
   * @generated
   */
  EReference getHostedInterfaceDefinition_Signature();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getName()
   * @see #getHostedInterfaceDefinition()
   * @generated
   */
  EAttribute getHostedInterfaceDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#isCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#isCollection()
   * @see #getHostedInterfaceDefinition()
   * @generated
   */
  EAttribute getHostedInterfaceDefinition_Collection();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getCollectionsize <em>Collectionsize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collectionsize</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getCollectionsize()
   * @see #getHostedInterfaceDefinition()
   * @generated
   */
  EAttribute getHostedInterfaceDefinition_Collectionsize();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.ProvidedInterfaceDefinition <em>Provided Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provided Interface Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ProvidedInterfaceDefinition
   * @generated
   */
  EClass getProvidedInterfaceDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.RequiredInterfaceDefinition <em>Required Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Interface Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.RequiredInterfaceDefinition
   * @generated
   */
  EClass getRequiredInterfaceDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.RequiredInterfaceDefinition#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.RequiredInterfaceDefinition#isOptional()
   * @see #getRequiredInterfaceDefinition()
   * @generated
   */
  EAttribute getRequiredInterfaceDefinition_Optional();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.TypeReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.TypeReference#getName()
   * @see #getTypeReference()
   * @generated
   */
  EAttribute getTypeReference_Name();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition <em>Sub Component Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Component Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition
   * @generated
   */
  EClass getSubComponentDefinition();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getType()
   * @see #getSubComponentDefinition()
   * @generated
   */
  EReference getSubComponentDefinition_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getTemplatesList <em>Templates List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Templates List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getTemplatesList()
   * @see #getSubComponentDefinition()
   * @generated
   */
  EReference getSubComponentDefinition_TemplatesList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getArgumentsList <em>Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getArgumentsList()
   * @see #getSubComponentDefinition()
   * @generated
   */
  EReference getSubComponentDefinition_ArgumentsList();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getName()
   * @see #getSubComponentDefinition()
   * @generated
   */
  EAttribute getSubComponentDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getBodyAnnotationsList <em>Body Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body Annotations List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getBodyAnnotationsList()
   * @see #getSubComponentDefinition()
   * @generated
   */
  EReference getSubComponentDefinition_BodyAnnotationsList();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition#getBody()
   * @see #getSubComponentDefinition()
   * @generated
   */
  EReference getSubComponentDefinition_Body();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.Element#getAnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotations List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.Element#getAnnotationsList()
   * @see #getElement()
   * @generated
   */
  EReference getElement_AnnotationsList();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.CompositeElement <em>Composite Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Element</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.CompositeElement
   * @generated
   */
  EClass getCompositeElement();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveElement <em>Primitive Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Element</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.PrimitiveElement
   * @generated
   */
  EClass getPrimitiveElement();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition <em>Binding Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.BindingDefinition
   * @generated
   */
  EClass getBindingDefinition();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getSourceParent <em>Source Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Parent</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getSourceParent()
   * @see #getBindingDefinition()
   * @generated
   */
  EReference getBindingDefinition_SourceParent();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#isIsSrcParentThis <em>Is Src Parent This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Src Parent This</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.BindingDefinition#isIsSrcParentThis()
   * @see #getBindingDefinition()
   * @generated
   */
  EAttribute getBindingDefinition_IsSrcParentThis();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getSourceInterface <em>Source Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Interface</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getSourceInterface()
   * @see #getBindingDefinition()
   * @generated
   */
  EReference getBindingDefinition_SourceInterface();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getSourceIndex <em>Source Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Index</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getSourceIndex()
   * @see #getBindingDefinition()
   * @generated
   */
  EAttribute getBindingDefinition_SourceIndex();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getTargetParent <em>Target Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Parent</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getTargetParent()
   * @see #getBindingDefinition()
   * @generated
   */
  EReference getBindingDefinition_TargetParent();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#isIsTgtParentThis <em>Is Tgt Parent This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Tgt Parent This</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.BindingDefinition#isIsTgtParentThis()
   * @see #getBindingDefinition()
   * @generated
   */
  EAttribute getBindingDefinition_IsTgtParentThis();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getTargetInterface <em>Target Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Interface</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getTargetInterface()
   * @see #getBindingDefinition()
   * @generated
   */
  EReference getBindingDefinition_TargetInterface();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getTargetIndex <em>Target Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Index</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getTargetIndex()
   * @see #getBindingDefinition()
   * @generated
   */
  EAttribute getBindingDefinition_TargetIndex();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.FormalArgument <em>Formal Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Argument</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.FormalArgument
   * @generated
   */
  EClass getFormalArgument();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.FormalArgument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.FormalArgument#getName()
   * @see #getFormalArgument()
   * @generated
   */
  EAttribute getFormalArgument_Name();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.FormalArgumentsList <em>Formal Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Arguments List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.FormalArgumentsList
   * @generated
   */
  EClass getFormalArgumentsList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.FormalArgumentsList#getFormalArguments <em>Formal Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Formal Arguments</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.FormalArgumentsList#getFormalArguments()
   * @see #getFormalArgumentsList()
   * @generated
   */
  EReference getFormalArgumentsList_FormalArguments();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier <em>Template Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Specifier</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier
   * @generated
   */
  EClass getTemplateSpecifier();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier#getTypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Reference</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier#getTypeReference()
   * @see #getTemplateSpecifier()
   * @generated
   */
  EReference getTemplateSpecifier_TypeReference();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.TemplateReference <em>Template Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Reference</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.TemplateReference
   * @generated
   */
  EClass getTemplateReference();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.TemplateReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.TemplateReference#getName()
   * @see #getTemplateReference()
   * @generated
   */
  EReference getTemplateReference_Name();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.textual.fractal.TemplateReference#getTypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Reference</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.TemplateReference#getTypeReference()
   * @see #getTemplateReference()
   * @generated
   */
  EReference getTemplateReference_TypeReference();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.TemplateReference#isAnyTypeReference <em>Any Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Any Type Reference</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.TemplateReference#isAnyTypeReference()
   * @see #getTemplateReference()
   * @generated
   */
  EAttribute getTemplateReference_AnyTypeReference();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.TemplateReference#getTemplatesList <em>Templates List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Templates List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.TemplateReference#getTemplatesList()
   * @see #getTemplateReference()
   * @generated
   */
  EReference getTemplateReference_TemplatesList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.TemplateReference#getArgumentsList <em>Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.TemplateReference#getArgumentsList()
   * @see #getTemplateReference()
   * @generated
   */
  EReference getTemplateReference_ArgumentsList();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition <em>Argument Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition
   * @generated
   */
  EClass getArgumentDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition#getName()
   * @see #getArgumentDefinition()
   * @generated
   */
  EAttribute getArgumentDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition#getArgumentValue <em>Argument Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Argument Value</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition#getArgumentValue()
   * @see #getArgumentDefinition()
   * @generated
   */
  EAttribute getArgumentDefinition_ArgumentValue();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.AttributeDefinition <em>Attribute Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.AttributeDefinition
   * @generated
   */
  EClass getAttributeDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.AttributeDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.AttributeDefinition#getType()
   * @see #getAttributeDefinition()
   * @generated
   */
  EAttribute getAttributeDefinition_Type();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.AttributeDefinition#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Name</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.AttributeDefinition#getAttributeName()
   * @see #getAttributeDefinition()
   * @generated
   */
  EAttribute getAttributeDefinition_AttributeName();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.AttributeDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.AttributeDefinition#getValue()
   * @see #getAttributeDefinition()
   * @generated
   */
  EAttribute getAttributeDefinition_Value();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.ImplementationDefinition <em>Implementation Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implementation Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ImplementationDefinition
   * @generated
   */
  EClass getImplementationDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.ImplementationDefinition#getFileC <em>File C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>File C</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ImplementationDefinition#getFileC()
   * @see #getImplementationDefinition()
   * @generated
   */
  EReference getImplementationDefinition_FileC();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.ImplementationDefinition#getInlineCcode <em>Inline Ccode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inline Ccode</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ImplementationDefinition#getInlineCcode()
   * @see #getImplementationDefinition()
   * @generated
   */
  EReference getImplementationDefinition_InlineCcode();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.DataDefinition <em>Data Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Definition</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.DataDefinition
   * @generated
   */
  EClass getDataDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.DataDefinition#getFileC <em>File C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>File C</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.DataDefinition#getFileC()
   * @see #getDataDefinition()
   * @generated
   */
  EReference getDataDefinition_FileC();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.DataDefinition#getInlineCcode <em>Inline Ccode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inline Ccode</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.DataDefinition#getInlineCcode()
   * @see #getDataDefinition()
   * @generated
   */
  EReference getDataDefinition_InlineCcode();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.FileC <em>File C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File C</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.FileC
   * @generated
   */
  EClass getFileC();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.FileC#getDirectory <em>Directory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Directory</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.FileC#getDirectory()
   * @see #getFileC()
   * @generated
   */
  EAttribute getFileC_Directory();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.FileC#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.FileC#getName()
   * @see #getFileC()
   * @generated
   */
  EAttribute getFileC_Name();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.InlineCodeC <em>Inline Code C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inline Code C</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.InlineCodeC
   * @generated
   */
  EClass getInlineCodeC();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.InlineCodeC#getCodeC <em>Code C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code C</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.InlineCodeC#getCodeC()
   * @see #getInlineCodeC()
   * @generated
   */
  EAttribute getInlineCodeC_CodeC();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.AnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotations List</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.AnnotationsList
   * @generated
   */
  EClass getAnnotationsList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.AnnotationsList#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.AnnotationsList#getAnnotations()
   * @see #getAnnotationsList()
   * @generated
   */
  EReference getAnnotationsList_Annotations();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.Annotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.Annotation#getName()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.Annotation#getAnnotationElements <em>Annotation Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation Elements</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.Annotation#getAnnotationElements()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_AnnotationElements();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.AnnotationElement <em>Annotation Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Element</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.AnnotationElement
   * @generated
   */
  EClass getAnnotationElement();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.AnnotationElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.AnnotationElement#getName()
   * @see #getAnnotationElement()
   * @generated
   */
  EAttribute getAnnotationElement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.textual.fractal.AnnotationElement#getElementValue <em>Element Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Value</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.AnnotationElement#getElementValue()
   * @see #getAnnotationElement()
   * @generated
   */
  EReference getAnnotationElement_ElementValue();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.ElementValue <em>Element Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Value</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ElementValue
   * @generated
   */
  EClass getElementValue();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.ElementValueArrayInitializer <em>Element Value Array Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Value Array Initializer</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ElementValueArrayInitializer
   * @generated
   */
  EClass getElementValueArrayInitializer();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.textual.fractal.ElementValueArrayInitializer#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ElementValueArrayInitializer#getValues()
   * @see #getElementValueArrayInitializer()
   * @generated
   */
  EReference getElementValueArrayInitializer_Values();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.textual.fractal.ConstantValue <em>Constant Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Value</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ConstantValue
   * @generated
   */
  EClass getConstantValue();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.textual.fractal.ConstantValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ow2.mindEd.adl.textual.fractal.ConstantValue#getValue()
   * @see #getConstantValue()
   * @generated
   */
  EAttribute getConstantValue_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FractalFactory getFractalFactory();

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
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.AdlDefinitionImpl <em>Adl Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.AdlDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getAdlDefinition()
     * @generated
     */
    EClass ADL_DEFINITION = eINSTANCE.getAdlDefinition();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADL_DEFINITION__IMPORTS = eINSTANCE.getAdlDefinition_Imports();

    /**
     * The meta object literal for the '<em><b>Annotations List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADL_DEFINITION__ANNOTATIONS_LIST = eINSTANCE.getAdlDefinition_AnnotationsList();

    /**
     * The meta object literal for the '<em><b>Architecture Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADL_DEFINITION__ARCHITECTURE_DEFINITION = eINSTANCE.getAdlDefinition_ArchitectureDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ArchitectureDefinitionImpl <em>Architecture Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.ArchitectureDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getArchitectureDefinition()
     * @generated
     */
    EClass ARCHITECTURE_DEFINITION = eINSTANCE.getArchitectureDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ImportDefinitionImpl <em>Import Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.ImportDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getImportDefinition()
     * @generated
     */
    EClass IMPORT_DEFINITION = eINSTANCE.getImportDefinition();

    /**
     * The meta object literal for the '<em><b>Annotations List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT_DEFINITION__ANNOTATIONS_LIST = eINSTANCE.getImportDefinition_AnnotationsList();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_DEFINITION__IMPORTED_NAMESPACE = eINSTANCE.getImportDefinition_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeDefinitionImpl <em>Composite Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.CompositeDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getCompositeDefinition()
     * @generated
     */
    EClass COMPOSITE_DEFINITION = eINSTANCE.getCompositeDefinition();

    /**
     * The meta object literal for the '<em><b>Template Specifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS = eINSTANCE.getCompositeDefinition_TemplateSpecifiers();

    /**
     * The meta object literal for the '<em><b>Composite Formal Arguments List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST = eINSTANCE.getCompositeDefinition_CompositeFormalArgumentsList();

    /**
     * The meta object literal for the '<em><b>Super Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_DEFINITION__SUPER_TYPES = eINSTANCE.getCompositeDefinition_SuperTypes();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_DEFINITION__ELEMENTS = eINSTANCE.getCompositeDefinition_Elements();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveDefinitionImpl <em>Primitive Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getPrimitiveDefinition()
     * @generated
     */
    EClass PRIMITIVE_DEFINITION = eINSTANCE.getPrimitiveDefinition();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_DEFINITION__ABSTRACT = eINSTANCE.getPrimitiveDefinition_Abstract();

    /**
     * The meta object literal for the '<em><b>Composite Formal Arguments List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST = eINSTANCE.getPrimitiveDefinition_CompositeFormalArgumentsList();

    /**
     * The meta object literal for the '<em><b>Super Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_DEFINITION__SUPER_TYPES = eINSTANCE.getPrimitiveDefinition_SuperTypes();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_DEFINITION__ELEMENTS = eINSTANCE.getPrimitiveDefinition_Elements();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.TypeDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getTypeDefinition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

    /**
     * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEFINITION__SUPER_TYPES = eINSTANCE.getTypeDefinition_SuperTypes();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEFINITION__ELEMENTS = eINSTANCE.getTypeDefinition_Elements();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeSuperTypeImpl <em>Composite Super Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.CompositeSuperTypeImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getCompositeSuperType()
     * @generated
     */
    EClass COMPOSITE_SUPER_TYPE = eINSTANCE.getCompositeSuperType();

    /**
     * The meta object literal for the '<em><b>Target Arch Def</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_SUPER_TYPE__TARGET_ARCH_DEF = eINSTANCE.getCompositeSuperType_TargetArchDef();

    /**
     * The meta object literal for the '<em><b>Templates List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_SUPER_TYPE__TEMPLATES_LIST = eINSTANCE.getCompositeSuperType_TemplatesList();

    /**
     * The meta object literal for the '<em><b>Arguments List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_SUPER_TYPE__ARGUMENTS_LIST = eINSTANCE.getCompositeSuperType_ArgumentsList();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveSuperTypeImpl <em>Primitive Super Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveSuperTypeImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getPrimitiveSuperType()
     * @generated
     */
    EClass PRIMITIVE_SUPER_TYPE = eINSTANCE.getPrimitiveSuperType();

    /**
     * The meta object literal for the '<em><b>Target Arch Def</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_SUPER_TYPE__TARGET_ARCH_DEF = eINSTANCE.getPrimitiveSuperType_TargetArchDef();

    /**
     * The meta object literal for the '<em><b>Arguments List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_SUPER_TYPE__ARGUMENTS_LIST = eINSTANCE.getPrimitiveSuperType_ArgumentsList();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeSuperTypeDefinitionImpl <em>Composite Super Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.CompositeSuperTypeDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getCompositeSuperTypeDefinition()
     * @generated
     */
    EClass COMPOSITE_SUPER_TYPE_DEFINITION = eINSTANCE.getCompositeSuperTypeDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveSuperTypeDefinitionImpl <em>Primitive Super Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveSuperTypeDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getPrimitiveSuperTypeDefinition()
     * @generated
     */
    EClass PRIMITIVE_SUPER_TYPE_DEFINITION = eINSTANCE.getPrimitiveSuperTypeDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.HostedInterfaceDefinitionImpl <em>Hosted Interface Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.HostedInterfaceDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getHostedInterfaceDefinition()
     * @generated
     */
    EClass HOSTED_INTERFACE_DEFINITION = eINSTANCE.getHostedInterfaceDefinition();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOSTED_INTERFACE_DEFINITION__ROLE = eINSTANCE.getHostedInterfaceDefinition_Role();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HOSTED_INTERFACE_DEFINITION__SIGNATURE = eINSTANCE.getHostedInterfaceDefinition_Signature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOSTED_INTERFACE_DEFINITION__NAME = eINSTANCE.getHostedInterfaceDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOSTED_INTERFACE_DEFINITION__COLLECTION = eINSTANCE.getHostedInterfaceDefinition_Collection();

    /**
     * The meta object literal for the '<em><b>Collectionsize</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE = eINSTANCE.getHostedInterfaceDefinition_Collectionsize();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ProvidedInterfaceDefinitionImpl <em>Provided Interface Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.ProvidedInterfaceDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getProvidedInterfaceDefinition()
     * @generated
     */
    EClass PROVIDED_INTERFACE_DEFINITION = eINSTANCE.getProvidedInterfaceDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.RequiredInterfaceDefinitionImpl <em>Required Interface Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.RequiredInterfaceDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getRequiredInterfaceDefinition()
     * @generated
     */
    EClass REQUIRED_INTERFACE_DEFINITION = eINSTANCE.getRequiredInterfaceDefinition();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_INTERFACE_DEFINITION__OPTIONAL = eINSTANCE.getRequiredInterfaceDefinition_Optional();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.TypeReferenceImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_REFERENCE__NAME = eINSTANCE.getTypeReference_Name();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.SubComponentDefinitionImpl <em>Sub Component Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.SubComponentDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getSubComponentDefinition()
     * @generated
     */
    EClass SUB_COMPONENT_DEFINITION = eINSTANCE.getSubComponentDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_COMPONENT_DEFINITION__TYPE = eINSTANCE.getSubComponentDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Templates List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_COMPONENT_DEFINITION__TEMPLATES_LIST = eINSTANCE.getSubComponentDefinition_TemplatesList();

    /**
     * The meta object literal for the '<em><b>Arguments List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST = eINSTANCE.getSubComponentDefinition_ArgumentsList();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_COMPONENT_DEFINITION__NAME = eINSTANCE.getSubComponentDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Body Annotations List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST = eINSTANCE.getSubComponentDefinition_BodyAnnotationsList();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_COMPONENT_DEFINITION__BODY = eINSTANCE.getSubComponentDefinition_Body();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.ElementImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Annotations List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__ANNOTATIONS_LIST = eINSTANCE.getElement_AnnotationsList();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeElementImpl <em>Composite Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.CompositeElementImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getCompositeElement()
     * @generated
     */
    EClass COMPOSITE_ELEMENT = eINSTANCE.getCompositeElement();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveElementImpl <em>Primitive Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveElementImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getPrimitiveElement()
     * @generated
     */
    EClass PRIMITIVE_ELEMENT = eINSTANCE.getPrimitiveElement();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl <em>Binding Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getBindingDefinition()
     * @generated
     */
    EClass BINDING_DEFINITION = eINSTANCE.getBindingDefinition();

    /**
     * The meta object literal for the '<em><b>Source Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_DEFINITION__SOURCE_PARENT = eINSTANCE.getBindingDefinition_SourceParent();

    /**
     * The meta object literal for the '<em><b>Is Src Parent This</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING_DEFINITION__IS_SRC_PARENT_THIS = eINSTANCE.getBindingDefinition_IsSrcParentThis();

    /**
     * The meta object literal for the '<em><b>Source Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_DEFINITION__SOURCE_INTERFACE = eINSTANCE.getBindingDefinition_SourceInterface();

    /**
     * The meta object literal for the '<em><b>Source Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING_DEFINITION__SOURCE_INDEX = eINSTANCE.getBindingDefinition_SourceIndex();

    /**
     * The meta object literal for the '<em><b>Target Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_DEFINITION__TARGET_PARENT = eINSTANCE.getBindingDefinition_TargetParent();

    /**
     * The meta object literal for the '<em><b>Is Tgt Parent This</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING_DEFINITION__IS_TGT_PARENT_THIS = eINSTANCE.getBindingDefinition_IsTgtParentThis();

    /**
     * The meta object literal for the '<em><b>Target Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_DEFINITION__TARGET_INTERFACE = eINSTANCE.getBindingDefinition_TargetInterface();

    /**
     * The meta object literal for the '<em><b>Target Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING_DEFINITION__TARGET_INDEX = eINSTANCE.getBindingDefinition_TargetIndex();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.FormalArgumentImpl <em>Formal Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FormalArgumentImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getFormalArgument()
     * @generated
     */
    EClass FORMAL_ARGUMENT = eINSTANCE.getFormalArgument();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMAL_ARGUMENT__NAME = eINSTANCE.getFormalArgument_Name();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.FormalArgumentsListImpl <em>Formal Arguments List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FormalArgumentsListImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getFormalArgumentsList()
     * @generated
     */
    EClass FORMAL_ARGUMENTS_LIST = eINSTANCE.getFormalArgumentsList();

    /**
     * The meta object literal for the '<em><b>Formal Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS = eINSTANCE.getFormalArgumentsList_FormalArguments();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.TemplateSpecifierImpl <em>Template Specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.TemplateSpecifierImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getTemplateSpecifier()
     * @generated
     */
    EClass TEMPLATE_SPECIFIER = eINSTANCE.getTemplateSpecifier();

    /**
     * The meta object literal for the '<em><b>Type Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_SPECIFIER__TYPE_REFERENCE = eINSTANCE.getTemplateSpecifier_TypeReference();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.TemplateReferenceImpl <em>Template Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.TemplateReferenceImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getTemplateReference()
     * @generated
     */
    EClass TEMPLATE_REFERENCE = eINSTANCE.getTemplateReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_REFERENCE__NAME = eINSTANCE.getTemplateReference_Name();

    /**
     * The meta object literal for the '<em><b>Type Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_REFERENCE__TYPE_REFERENCE = eINSTANCE.getTemplateReference_TypeReference();

    /**
     * The meta object literal for the '<em><b>Any Type Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE_REFERENCE__ANY_TYPE_REFERENCE = eINSTANCE.getTemplateReference_AnyTypeReference();

    /**
     * The meta object literal for the '<em><b>Templates List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_REFERENCE__TEMPLATES_LIST = eINSTANCE.getTemplateReference_TemplatesList();

    /**
     * The meta object literal for the '<em><b>Arguments List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_REFERENCE__ARGUMENTS_LIST = eINSTANCE.getTemplateReference_ArgumentsList();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ArgumentDefinitionImpl <em>Argument Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.ArgumentDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getArgumentDefinition()
     * @generated
     */
    EClass ARGUMENT_DEFINITION = eINSTANCE.getArgumentDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT_DEFINITION__NAME = eINSTANCE.getArgumentDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Argument Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT_DEFINITION__ARGUMENT_VALUE = eINSTANCE.getArgumentDefinition_ArgumentValue();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.AttributeDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getAttributeDefinition()
     * @generated
     */
    EClass ATTRIBUTE_DEFINITION = eINSTANCE.getAttributeDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_DEFINITION__TYPE = eINSTANCE.getAttributeDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_DEFINITION__ATTRIBUTE_NAME = eINSTANCE.getAttributeDefinition_AttributeName();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_DEFINITION__VALUE = eINSTANCE.getAttributeDefinition_Value();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ImplementationDefinitionImpl <em>Implementation Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.ImplementationDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getImplementationDefinition()
     * @generated
     */
    EClass IMPLEMENTATION_DEFINITION = eINSTANCE.getImplementationDefinition();

    /**
     * The meta object literal for the '<em><b>File C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTATION_DEFINITION__FILE_C = eINSTANCE.getImplementationDefinition_FileC();

    /**
     * The meta object literal for the '<em><b>Inline Ccode</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTATION_DEFINITION__INLINE_CCODE = eINSTANCE.getImplementationDefinition_InlineCcode();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.DataDefinitionImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getDataDefinition()
     * @generated
     */
    EClass DATA_DEFINITION = eINSTANCE.getDataDefinition();

    /**
     * The meta object literal for the '<em><b>File C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DEFINITION__FILE_C = eINSTANCE.getDataDefinition_FileC();

    /**
     * The meta object literal for the '<em><b>Inline Ccode</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DEFINITION__INLINE_CCODE = eINSTANCE.getDataDefinition_InlineCcode();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.FileCImpl <em>File C</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FileCImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getFileC()
     * @generated
     */
    EClass FILE_C = eINSTANCE.getFileC();

    /**
     * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_C__DIRECTORY = eINSTANCE.getFileC_Directory();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_C__NAME = eINSTANCE.getFileC_Name();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.InlineCodeCImpl <em>Inline Code C</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.InlineCodeCImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getInlineCodeC()
     * @generated
     */
    EClass INLINE_CODE_C = eINSTANCE.getInlineCodeC();

    /**
     * The meta object literal for the '<em><b>Code C</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INLINE_CODE_C__CODE_C = eINSTANCE.getInlineCodeC_CodeC();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.AnnotationsListImpl <em>Annotations List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.AnnotationsListImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getAnnotationsList()
     * @generated
     */
    EClass ANNOTATIONS_LIST = eINSTANCE.getAnnotationsList();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATIONS_LIST__ANNOTATIONS = eINSTANCE.getAnnotationsList_Annotations();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.AnnotationImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

    /**
     * The meta object literal for the '<em><b>Annotation Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__ANNOTATION_ELEMENTS = eINSTANCE.getAnnotation_AnnotationElements();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.AnnotationElementImpl <em>Annotation Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.AnnotationElementImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getAnnotationElement()
     * @generated
     */
    EClass ANNOTATION_ELEMENT = eINSTANCE.getAnnotationElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_ELEMENT__NAME = eINSTANCE.getAnnotationElement_Name();

    /**
     * The meta object literal for the '<em><b>Element Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_ELEMENT__ELEMENT_VALUE = eINSTANCE.getAnnotationElement_ElementValue();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ElementValueImpl <em>Element Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.ElementValueImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getElementValue()
     * @generated
     */
    EClass ELEMENT_VALUE = eINSTANCE.getElementValue();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ElementValueArrayInitializerImpl <em>Element Value Array Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.ElementValueArrayInitializerImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getElementValueArrayInitializer()
     * @generated
     */
    EClass ELEMENT_VALUE_ARRAY_INITIALIZER = eINSTANCE.getElementValueArrayInitializer();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_VALUE_ARRAY_INITIALIZER__VALUES = eINSTANCE.getElementValueArrayInitializer_Values();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.textual.fractal.impl.ConstantValueImpl <em>Constant Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.textual.fractal.impl.ConstantValueImpl
     * @see org.ow2.mindEd.adl.textual.fractal.impl.FractalPackageImpl#getConstantValue()
     * @generated
     */
    EClass CONSTANT_VALUE = eINSTANCE.getConstantValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_VALUE__VALUE = eINSTANCE.getConstantValue_Value();

  }

} //FractalPackage
