/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see fractalIDL.FractalIDLFactory
 * @model kind="package"
 * @generated
 */
public interface FractalIDLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fractalIDL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ow2.org/fractal/mind/idl/FractalItf";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fractalIDL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FractalIDLPackage eINSTANCE = fractalIDL.impl.FractalIDLPackageImpl.init();

  /**
   * The meta object id for the '{@link fractalIDL.impl.ItfFileImpl <em>Itf File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.ItfFileImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getItfFile()
   * @generated
   */
  int ITF_FILE = 0;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITF_FILE__INCLUDES = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITF_FILE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITF_FILE__CONSTANT = 2;

  /**
   * The feature id for the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITF_FILE__INTERFACE = 3;

  /**
   * The number of structural features of the '<em>Itf File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITF_FILE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fractalIDL.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.TypeDefinitionImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fractalIDL.impl.TypedefSpecificationImpl <em>Typedef Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.TypedefSpecificationImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getTypedefSpecification()
   * @generated
   */
  int TYPEDEF_SPECIFICATION = 2;

  /**
   * The feature id for the '<em><b>Qualifed Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_SPECIFICATION__QUALIFED_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_SPECIFICATION__DEC = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Typedef Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_SPECIFICATION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fractalIDL.impl.QualifiedTypeSpecificationImpl <em>Qualified Type Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.QualifiedTypeSpecificationImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getQualifiedTypeSpecification()
   * @generated
   */
  int QUALIFIED_TYPE_SPECIFICATION = 3;

  /**
   * The feature id for the '<em><b>Type Qualifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_TYPE_SPECIFICATION__TYPE_QUALIFIER = 0;

  /**
   * The feature id for the '<em><b>Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC = 1;

  /**
   * The number of structural features of the '<em>Qualified Type Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_TYPE_SPECIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fractalIDL.impl.TypeSpecificationImpl <em>Type Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.TypeSpecificationImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getTypeSpecification()
   * @generated
   */
  int TYPE_SPECIFICATION = 4;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFICATION__TYPE_DEF_NAME = 0;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFICATION__TYPE_SPECIFIER = 1;

  /**
   * The number of structural features of the '<em>Type Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fractalIDL.impl.StructOrUnionSpecificationImpl <em>Struct Or Union Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.StructOrUnionSpecificationImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getStructOrUnionSpecification()
   * @generated
   */
  int STRUCT_OR_UNION_SPECIFICATION = 5;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_SPECIFICATION__TYPE_DEF_NAME = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_SPECIFICATION__TYPE_SPECIFIER = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Struct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_SPECIFICATION__STRUCT = TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_SPECIFICATION__ID = TYPE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Struct Or Union Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_SPECIFICATION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fractalIDL.impl.StructOrUnionDefinitionImpl <em>Struct Or Union Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.StructOrUnionDefinitionImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getStructOrUnionDefinition()
   * @generated
   */
  int STRUCT_OR_UNION_DEFINITION = 6;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_DEFINITION__TYPE_DEF_NAME = STRUCT_OR_UNION_SPECIFICATION__TYPE_DEF_NAME;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_DEFINITION__TYPE_SPECIFIER = STRUCT_OR_UNION_SPECIFICATION__TYPE_SPECIFIER;

  /**
   * The feature id for the '<em><b>Struct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_DEFINITION__STRUCT = STRUCT_OR_UNION_SPECIFICATION__STRUCT;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_DEFINITION__ID = STRUCT_OR_UNION_SPECIFICATION__ID;

  /**
   * The feature id for the '<em><b>Struct Member</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_DEFINITION__STRUCT_MEMBER = STRUCT_OR_UNION_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Struct Or Union Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_DEFINITION_FEATURE_COUNT = STRUCT_OR_UNION_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fractalIDL.impl.StructorUnionReferenceImpl <em>Structor Union Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.StructorUnionReferenceImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getStructorUnionReference()
   * @generated
   */
  int STRUCTOR_UNION_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTOR_UNION_REFERENCE__TYPE_DEF_NAME = STRUCT_OR_UNION_SPECIFICATION__TYPE_DEF_NAME;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTOR_UNION_REFERENCE__TYPE_SPECIFIER = STRUCT_OR_UNION_SPECIFICATION__TYPE_SPECIFIER;

  /**
   * The feature id for the '<em><b>Struct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTOR_UNION_REFERENCE__STRUCT = STRUCT_OR_UNION_SPECIFICATION__STRUCT;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTOR_UNION_REFERENCE__ID = STRUCT_OR_UNION_SPECIFICATION__ID;

  /**
   * The number of structural features of the '<em>Structor Union Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTOR_UNION_REFERENCE_FEATURE_COUNT = STRUCT_OR_UNION_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fractalIDL.impl.StructMemberImpl <em>Struct Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.StructMemberImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getStructMember()
   * @generated
   */
  int STRUCT_MEMBER = 8;

  /**
   * The feature id for the '<em><b>Qual Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER__QUAL_TYPE = 0;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER__DEC = 1;

  /**
   * The number of structural features of the '<em>Struct Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fractalIDL.impl.EnumSpecificationImpl <em>Enum Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.EnumSpecificationImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getEnumSpecification()
   * @generated
   */
  int ENUM_SPECIFICATION = 9;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPECIFICATION__TYPE_DEF_NAME = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPECIFICATION__TYPE_SPECIFIER = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPECIFICATION__ID = TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Enum Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPECIFICATION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fractalIDL.impl.EnumDefinitionImpl <em>Enum Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.EnumDefinitionImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getEnumDefinition()
   * @generated
   */
  int ENUM_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEFINITION__TYPE_DEF_NAME = ENUM_SPECIFICATION__TYPE_DEF_NAME;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEFINITION__TYPE_SPECIFIER = ENUM_SPECIFICATION__TYPE_SPECIFIER;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEFINITION__ID = ENUM_SPECIFICATION__ID;

  /**
   * The feature id for the '<em><b>Enum Member List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEFINITION__ENUM_MEMBER_LIST = ENUM_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEFINITION_FEATURE_COUNT = ENUM_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fractalIDL.impl.EnumReferenceImpl <em>Enum Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.EnumReferenceImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getEnumReference()
   * @generated
   */
  int ENUM_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REFERENCE__TYPE_DEF_NAME = ENUM_SPECIFICATION__TYPE_DEF_NAME;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REFERENCE__TYPE_SPECIFIER = ENUM_SPECIFICATION__TYPE_SPECIFIER;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REFERENCE__ID = ENUM_SPECIFICATION__ID;

  /**
   * The number of structural features of the '<em>Enum Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REFERENCE_FEATURE_COUNT = ENUM_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fractalIDL.impl.EnumMemberListImpl <em>Enum Member List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.EnumMemberListImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getEnumMemberList()
   * @generated
   */
  int ENUM_MEMBER_LIST = 12;

  /**
   * The number of structural features of the '<em>Enum Member List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fractalIDL.impl.EnumMemberImpl <em>Enum Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.EnumMemberImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getEnumMember()
   * @generated
   */
  int ENUM_MEMBER = 13;

  /**
   * The feature id for the '<em><b>Enum Member</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__ENUM_MEMBER = ENUM_MEMBER_LIST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__ID = ENUM_MEMBER_LIST_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_FEATURE_COUNT = ENUM_MEMBER_LIST_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fractalIDL.impl.DeclaratorsImpl <em>Declarators</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.DeclaratorsImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getDeclarators()
   * @generated
   */
  int DECLARATORS = 14;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATORS__DEC = 0;

  /**
   * The feature id for the '<em><b>Declarator List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATORS__DECLARATOR_LIST = 1;

  /**
   * The number of structural features of the '<em>Declarators</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATORS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fractalIDL.impl.DirectDeclaratorImpl <em>Direct Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.DirectDeclaratorImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getDirectDeclarator()
   * @generated
   */
  int DIRECT_DECLARATOR = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_DECLARATOR__ID = 0;

  /**
   * The number of structural features of the '<em>Direct Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_DECLARATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fractalIDL.impl.DeclaratorImpl <em>Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.DeclaratorImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getDeclarator()
   * @generated
   */
  int DECLARATOR = 15;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATOR__ID = DIRECT_DECLARATOR__ID;

  /**
   * The feature id for the '<em><b>Type Qualifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATOR__TYPE_QUALIFIER = DIRECT_DECLARATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATOR__DC = DIRECT_DECLARATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATOR_FEATURE_COUNT = DIRECT_DECLARATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fractalIDL.impl.IdentifierImpl <em>Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.IdentifierImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getIdentifier()
   * @generated
   */
  int IDENTIFIER = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__ID = 0;

  /**
   * The number of structural features of the '<em>Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fractalIDL.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.ConstantDefinitionImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getConstantDefinition()
   * @generated
   */
  int CONSTANT_DEFINITION = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION__ID = 0;

  /**
   * The number of structural features of the '<em>Constant Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fractalIDL.impl.InterfaceDefinitionImpl <em>Interface Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.InterfaceDefinitionImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getInterfaceDefinition()
   * @generated
   */
  int INTERFACE_DEFINITION = 19;

  /**
   * The feature id for the '<em><b>Fqn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION__FQN = 0;

  /**
   * The feature id for the '<em><b>Fqn2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION__FQN2 = 1;

  /**
   * The feature id for the '<em><b>Method Def</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION__METHOD_DEF = 2;

  /**
   * The number of structural features of the '<em>Interface Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fractalIDL.impl.MethodDefinitionImpl <em>Method Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.MethodDefinitionImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getMethodDefinition()
   * @generated
   */
  int METHOD_DEFINITION = 20;

  /**
   * The feature id for the '<em><b>Qualified Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__QUALIFIED_TYPE_SPEC = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__ID = 1;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__PARAMETER_LIST = 2;

  /**
   * The number of structural features of the '<em>Method Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fractalIDL.impl.ParameterListImpl <em>Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.ParameterListImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getParameterList()
   * @generated
   */
  int PARAMETER_LIST = 21;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAM = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fractalIDL.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.ParameterImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 22;

  /**
   * The feature id for the '<em><b>Parameter Qualifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PARAMETER_QUALIFIER = 0;

  /**
   * The feature id for the '<em><b>Qualified Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__QUALIFIED_TYPE_SPEC = 1;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DEC = 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fractalIDL.impl.IncludeDirectiveImpl <em>Include Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.impl.IncludeDirectiveImpl
   * @see fractalIDL.impl.FractalIDLPackageImpl#getIncludeDirective()
   * @generated
   */
  int INCLUDE_DIRECTIVE = 23;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DIRECTIVE__PATH = 0;

  /**
   * The number of structural features of the '<em>Include Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DIRECTIVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fractalIDL.TypeQualifier <em>Type Qualifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.TypeQualifier
   * @see fractalIDL.impl.FractalIDLPackageImpl#getTypeQualifier()
   * @generated
   */
  int TYPE_QUALIFIER = 24;

  /**
   * The meta object id for the '{@link fractalIDL.TypeSpecifier <em>Type Specifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.TypeSpecifier
   * @see fractalIDL.impl.FractalIDLPackageImpl#getTypeSpecifier()
   * @generated
   */
  int TYPE_SPECIFIER = 25;

  /**
   * The meta object id for the '{@link fractalIDL.ParameterQualifier <em>Parameter Qualifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fractalIDL.ParameterQualifier
   * @see fractalIDL.impl.FractalIDLPackageImpl#getParameterQualifier()
   * @generated
   */
  int PARAMETER_QUALIFIER = 26;


  /**
   * Returns the meta object for class '{@link fractalIDL.ItfFile <em>Itf File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Itf File</em>'.
   * @see fractalIDL.ItfFile
   * @generated
   */
  EClass getItfFile();

  /**
   * Returns the meta object for the containment reference list '{@link fractalIDL.ItfFile#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see fractalIDL.ItfFile#getIncludes()
   * @see #getItfFile()
   * @generated
   */
  EReference getItfFile_Includes();

  /**
   * Returns the meta object for the containment reference list '{@link fractalIDL.ItfFile#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see fractalIDL.ItfFile#getType()
   * @see #getItfFile()
   * @generated
   */
  EReference getItfFile_Type();

  /**
   * Returns the meta object for the containment reference list '{@link fractalIDL.ItfFile#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constant</em>'.
   * @see fractalIDL.ItfFile#getConstant()
   * @see #getItfFile()
   * @generated
   */
  EReference getItfFile_Constant();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.ItfFile#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface</em>'.
   * @see fractalIDL.ItfFile#getInterface()
   * @see #getItfFile()
   * @generated
   */
  EReference getItfFile_Interface();

  /**
   * Returns the meta object for class '{@link fractalIDL.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see fractalIDL.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for class '{@link fractalIDL.TypedefSpecification <em>Typedef Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typedef Specification</em>'.
   * @see fractalIDL.TypedefSpecification
   * @generated
   */
  EClass getTypedefSpecification();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.TypedefSpecification#getQualifedType <em>Qualifed Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualifed Type</em>'.
   * @see fractalIDL.TypedefSpecification#getQualifedType()
   * @see #getTypedefSpecification()
   * @generated
   */
  EReference getTypedefSpecification_QualifedType();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.TypedefSpecification#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see fractalIDL.TypedefSpecification#getDec()
   * @see #getTypedefSpecification()
   * @generated
   */
  EReference getTypedefSpecification_Dec();

  /**
   * Returns the meta object for class '{@link fractalIDL.QualifiedTypeSpecification <em>Qualified Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Type Specification</em>'.
   * @see fractalIDL.QualifiedTypeSpecification
   * @generated
   */
  EClass getQualifiedTypeSpecification();

  /**
   * Returns the meta object for the attribute list '{@link fractalIDL.QualifiedTypeSpecification#getTypeQualifier <em>Type Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Qualifier</em>'.
   * @see fractalIDL.QualifiedTypeSpecification#getTypeQualifier()
   * @see #getQualifiedTypeSpecification()
   * @generated
   */
  EAttribute getQualifiedTypeSpecification_TypeQualifier();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.QualifiedTypeSpecification#getTypeSpec <em>Type Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Spec</em>'.
   * @see fractalIDL.QualifiedTypeSpecification#getTypeSpec()
   * @see #getQualifiedTypeSpecification()
   * @generated
   */
  EReference getQualifiedTypeSpecification_TypeSpec();

  /**
   * Returns the meta object for class '{@link fractalIDL.TypeSpecification <em>Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Specification</em>'.
   * @see fractalIDL.TypeSpecification
   * @generated
   */
  EClass getTypeSpecification();

  /**
   * Returns the meta object for the attribute '{@link fractalIDL.TypeSpecification#getTypeDefName <em>Type Def Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Def Name</em>'.
   * @see fractalIDL.TypeSpecification#getTypeDefName()
   * @see #getTypeSpecification()
   * @generated
   */
  EAttribute getTypeSpecification_TypeDefName();

  /**
   * Returns the meta object for the attribute list '{@link fractalIDL.TypeSpecification#getTypeSpecifier <em>Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Specifier</em>'.
   * @see fractalIDL.TypeSpecification#getTypeSpecifier()
   * @see #getTypeSpecification()
   * @generated
   */
  EAttribute getTypeSpecification_TypeSpecifier();

  /**
   * Returns the meta object for class '{@link fractalIDL.StructOrUnionSpecification <em>Struct Or Union Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Or Union Specification</em>'.
   * @see fractalIDL.StructOrUnionSpecification
   * @generated
   */
  EClass getStructOrUnionSpecification();

  /**
   * Returns the meta object for the attribute '{@link fractalIDL.StructOrUnionSpecification#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Struct</em>'.
   * @see fractalIDL.StructOrUnionSpecification#getStruct()
   * @see #getStructOrUnionSpecification()
   * @generated
   */
  EAttribute getStructOrUnionSpecification_Struct();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.StructOrUnionSpecification#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see fractalIDL.StructOrUnionSpecification#getId()
   * @see #getStructOrUnionSpecification()
   * @generated
   */
  EReference getStructOrUnionSpecification_Id();

  /**
   * Returns the meta object for class '{@link fractalIDL.StructOrUnionDefinition <em>Struct Or Union Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Or Union Definition</em>'.
   * @see fractalIDL.StructOrUnionDefinition
   * @generated
   */
  EClass getStructOrUnionDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link fractalIDL.StructOrUnionDefinition#getStructMember <em>Struct Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct Member</em>'.
   * @see fractalIDL.StructOrUnionDefinition#getStructMember()
   * @see #getStructOrUnionDefinition()
   * @generated
   */
  EReference getStructOrUnionDefinition_StructMember();

  /**
   * Returns the meta object for class '{@link fractalIDL.StructorUnionReference <em>Structor Union Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structor Union Reference</em>'.
   * @see fractalIDL.StructorUnionReference
   * @generated
   */
  EClass getStructorUnionReference();

  /**
   * Returns the meta object for class '{@link fractalIDL.StructMember <em>Struct Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Member</em>'.
   * @see fractalIDL.StructMember
   * @generated
   */
  EClass getStructMember();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.StructMember#getQualType <em>Qual Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qual Type</em>'.
   * @see fractalIDL.StructMember#getQualType()
   * @see #getStructMember()
   * @generated
   */
  EReference getStructMember_QualType();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.StructMember#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see fractalIDL.StructMember#getDec()
   * @see #getStructMember()
   * @generated
   */
  EReference getStructMember_Dec();

  /**
   * Returns the meta object for class '{@link fractalIDL.EnumSpecification <em>Enum Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Specification</em>'.
   * @see fractalIDL.EnumSpecification
   * @generated
   */
  EClass getEnumSpecification();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.EnumSpecification#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see fractalIDL.EnumSpecification#getId()
   * @see #getEnumSpecification()
   * @generated
   */
  EReference getEnumSpecification_Id();

  /**
   * Returns the meta object for class '{@link fractalIDL.EnumDefinition <em>Enum Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Definition</em>'.
   * @see fractalIDL.EnumDefinition
   * @generated
   */
  EClass getEnumDefinition();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.EnumDefinition#getEnumMemberList <em>Enum Member List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum Member List</em>'.
   * @see fractalIDL.EnumDefinition#getEnumMemberList()
   * @see #getEnumDefinition()
   * @generated
   */
  EReference getEnumDefinition_EnumMemberList();

  /**
   * Returns the meta object for class '{@link fractalIDL.EnumReference <em>Enum Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Reference</em>'.
   * @see fractalIDL.EnumReference
   * @generated
   */
  EClass getEnumReference();

  /**
   * Returns the meta object for class '{@link fractalIDL.EnumMemberList <em>Enum Member List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Member List</em>'.
   * @see fractalIDL.EnumMemberList
   * @generated
   */
  EClass getEnumMemberList();

  /**
   * Returns the meta object for class '{@link fractalIDL.EnumMember <em>Enum Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Member</em>'.
   * @see fractalIDL.EnumMember
   * @generated
   */
  EClass getEnumMember();

  /**
   * Returns the meta object for the containment reference list '{@link fractalIDL.EnumMember#getEnumMember <em>Enum Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enum Member</em>'.
   * @see fractalIDL.EnumMember#getEnumMember()
   * @see #getEnumMember()
   * @generated
   */
  EReference getEnumMember_EnumMember();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.EnumMember#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see fractalIDL.EnumMember#getId()
   * @see #getEnumMember()
   * @generated
   */
  EReference getEnumMember_Id();

  /**
   * Returns the meta object for class '{@link fractalIDL.Declarators <em>Declarators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declarators</em>'.
   * @see fractalIDL.Declarators
   * @generated
   */
  EClass getDeclarators();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.Declarators#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see fractalIDL.Declarators#getDec()
   * @see #getDeclarators()
   * @generated
   */
  EReference getDeclarators_Dec();

  /**
   * Returns the meta object for the containment reference list '{@link fractalIDL.Declarators#getDeclaratorList <em>Declarator List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarator List</em>'.
   * @see fractalIDL.Declarators#getDeclaratorList()
   * @see #getDeclarators()
   * @generated
   */
  EReference getDeclarators_DeclaratorList();

  /**
   * Returns the meta object for class '{@link fractalIDL.Declarator <em>Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declarator</em>'.
   * @see fractalIDL.Declarator
   * @generated
   */
  EClass getDeclarator();

  /**
   * Returns the meta object for the attribute list '{@link fractalIDL.Declarator#getTypeQualifier <em>Type Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Qualifier</em>'.
   * @see fractalIDL.Declarator#getTypeQualifier()
   * @see #getDeclarator()
   * @generated
   */
  EAttribute getDeclarator_TypeQualifier();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.Declarator#getDc <em>Dc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dc</em>'.
   * @see fractalIDL.Declarator#getDc()
   * @see #getDeclarator()
   * @generated
   */
  EReference getDeclarator_Dc();

  /**
   * Returns the meta object for class '{@link fractalIDL.DirectDeclarator <em>Direct Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Declarator</em>'.
   * @see fractalIDL.DirectDeclarator
   * @generated
   */
  EClass getDirectDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.DirectDeclarator#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see fractalIDL.DirectDeclarator#getId()
   * @see #getDirectDeclarator()
   * @generated
   */
  EReference getDirectDeclarator_Id();

  /**
   * Returns the meta object for class '{@link fractalIDL.Identifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier</em>'.
   * @see fractalIDL.Identifier
   * @generated
   */
  EClass getIdentifier();

  /**
   * Returns the meta object for the attribute '{@link fractalIDL.Identifier#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see fractalIDL.Identifier#getId()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Id();

  /**
   * Returns the meta object for class '{@link fractalIDL.ConstantDefinition <em>Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Definition</em>'.
   * @see fractalIDL.ConstantDefinition
   * @generated
   */
  EClass getConstantDefinition();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.ConstantDefinition#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see fractalIDL.ConstantDefinition#getId()
   * @see #getConstantDefinition()
   * @generated
   */
  EReference getConstantDefinition_Id();

  /**
   * Returns the meta object for class '{@link fractalIDL.InterfaceDefinition <em>Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Definition</em>'.
   * @see fractalIDL.InterfaceDefinition
   * @generated
   */
  EClass getInterfaceDefinition();

  /**
   * Returns the meta object for the attribute '{@link fractalIDL.InterfaceDefinition#getFqn <em>Fqn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fqn</em>'.
   * @see fractalIDL.InterfaceDefinition#getFqn()
   * @see #getInterfaceDefinition()
   * @generated
   */
  EAttribute getInterfaceDefinition_Fqn();

  /**
   * Returns the meta object for the attribute '{@link fractalIDL.InterfaceDefinition#getFqn2 <em>Fqn2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fqn2</em>'.
   * @see fractalIDL.InterfaceDefinition#getFqn2()
   * @see #getInterfaceDefinition()
   * @generated
   */
  EAttribute getInterfaceDefinition_Fqn2();

  /**
   * Returns the meta object for the containment reference list '{@link fractalIDL.InterfaceDefinition#getMethodDef <em>Method Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Method Def</em>'.
   * @see fractalIDL.InterfaceDefinition#getMethodDef()
   * @see #getInterfaceDefinition()
   * @generated
   */
  EReference getInterfaceDefinition_MethodDef();

  /**
   * Returns the meta object for class '{@link fractalIDL.MethodDefinition <em>Method Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Definition</em>'.
   * @see fractalIDL.MethodDefinition
   * @generated
   */
  EClass getMethodDefinition();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.MethodDefinition#getQualifiedTypeSpec <em>Qualified Type Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Type Spec</em>'.
   * @see fractalIDL.MethodDefinition#getQualifiedTypeSpec()
   * @see #getMethodDefinition()
   * @generated
   */
  EReference getMethodDefinition_QualifiedTypeSpec();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.MethodDefinition#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see fractalIDL.MethodDefinition#getId()
   * @see #getMethodDefinition()
   * @generated
   */
  EReference getMethodDefinition_Id();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.MethodDefinition#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List</em>'.
   * @see fractalIDL.MethodDefinition#getParameterList()
   * @see #getMethodDefinition()
   * @generated
   */
  EReference getMethodDefinition_ParameterList();

  /**
   * Returns the meta object for class '{@link fractalIDL.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter List</em>'.
   * @see fractalIDL.ParameterList
   * @generated
   */
  EClass getParameterList();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.ParameterList#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see fractalIDL.ParameterList#getParam()
   * @see #getParameterList()
   * @generated
   */
  EReference getParameterList_Param();

  /**
   * Returns the meta object for the containment reference list '{@link fractalIDL.ParameterList#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see fractalIDL.ParameterList#getParams()
   * @see #getParameterList()
   * @generated
   */
  EReference getParameterList_Params();

  /**
   * Returns the meta object for class '{@link fractalIDL.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see fractalIDL.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute list '{@link fractalIDL.Parameter#getParameterQualifier <em>Parameter Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameter Qualifier</em>'.
   * @see fractalIDL.Parameter#getParameterQualifier()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_ParameterQualifier();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.Parameter#getQualifiedTypeSpec <em>Qualified Type Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Type Spec</em>'.
   * @see fractalIDL.Parameter#getQualifiedTypeSpec()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_QualifiedTypeSpec();

  /**
   * Returns the meta object for the containment reference '{@link fractalIDL.Parameter#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see fractalIDL.Parameter#getDec()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Dec();

  /**
   * Returns the meta object for class '{@link fractalIDL.IncludeDirective <em>Include Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Directive</em>'.
   * @see fractalIDL.IncludeDirective
   * @generated
   */
  EClass getIncludeDirective();

  /**
   * Returns the meta object for the attribute '{@link fractalIDL.IncludeDirective#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see fractalIDL.IncludeDirective#getPath()
   * @see #getIncludeDirective()
   * @generated
   */
  EAttribute getIncludeDirective_Path();

  /**
   * Returns the meta object for enum '{@link fractalIDL.TypeQualifier <em>Type Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Qualifier</em>'.
   * @see fractalIDL.TypeQualifier
   * @generated
   */
  EEnum getTypeQualifier();

  /**
   * Returns the meta object for enum '{@link fractalIDL.TypeSpecifier <em>Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Specifier</em>'.
   * @see fractalIDL.TypeSpecifier
   * @generated
   */
  EEnum getTypeSpecifier();

  /**
   * Returns the meta object for enum '{@link fractalIDL.ParameterQualifier <em>Parameter Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parameter Qualifier</em>'.
   * @see fractalIDL.ParameterQualifier
   * @generated
   */
  EEnum getParameterQualifier();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FractalIDLFactory getFractalIDLFactory();

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
     * The meta object literal for the '{@link fractalIDL.impl.ItfFileImpl <em>Itf File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.ItfFileImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getItfFile()
     * @generated
     */
    EClass ITF_FILE = eINSTANCE.getItfFile();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITF_FILE__INCLUDES = eINSTANCE.getItfFile_Includes();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITF_FILE__TYPE = eINSTANCE.getItfFile_Type();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITF_FILE__CONSTANT = eINSTANCE.getItfFile_Constant();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITF_FILE__INTERFACE = eINSTANCE.getItfFile_Interface();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.TypeDefinitionImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getTypeDefinition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.TypedefSpecificationImpl <em>Typedef Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.TypedefSpecificationImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getTypedefSpecification()
     * @generated
     */
    EClass TYPEDEF_SPECIFICATION = eINSTANCE.getTypedefSpecification();

    /**
     * The meta object literal for the '<em><b>Qualifed Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF_SPECIFICATION__QUALIFED_TYPE = eINSTANCE.getTypedefSpecification_QualifedType();

    /**
     * The meta object literal for the '<em><b>Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF_SPECIFICATION__DEC = eINSTANCE.getTypedefSpecification_Dec();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.QualifiedTypeSpecificationImpl <em>Qualified Type Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.QualifiedTypeSpecificationImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getQualifiedTypeSpecification()
     * @generated
     */
    EClass QUALIFIED_TYPE_SPECIFICATION = eINSTANCE.getQualifiedTypeSpecification();

    /**
     * The meta object literal for the '<em><b>Type Qualifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_TYPE_SPECIFICATION__TYPE_QUALIFIER = eINSTANCE.getQualifiedTypeSpecification_TypeQualifier();

    /**
     * The meta object literal for the '<em><b>Type Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC = eINSTANCE.getQualifiedTypeSpecification_TypeSpec();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.TypeSpecificationImpl <em>Type Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.TypeSpecificationImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getTypeSpecification()
     * @generated
     */
    EClass TYPE_SPECIFICATION = eINSTANCE.getTypeSpecification();

    /**
     * The meta object literal for the '<em><b>Type Def Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SPECIFICATION__TYPE_DEF_NAME = eINSTANCE.getTypeSpecification_TypeDefName();

    /**
     * The meta object literal for the '<em><b>Type Specifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SPECIFICATION__TYPE_SPECIFIER = eINSTANCE.getTypeSpecification_TypeSpecifier();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.StructOrUnionSpecificationImpl <em>Struct Or Union Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.StructOrUnionSpecificationImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getStructOrUnionSpecification()
     * @generated
     */
    EClass STRUCT_OR_UNION_SPECIFICATION = eINSTANCE.getStructOrUnionSpecification();

    /**
     * The meta object literal for the '<em><b>Struct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_OR_UNION_SPECIFICATION__STRUCT = eINSTANCE.getStructOrUnionSpecification_Struct();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_OR_UNION_SPECIFICATION__ID = eINSTANCE.getStructOrUnionSpecification_Id();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.StructOrUnionDefinitionImpl <em>Struct Or Union Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.StructOrUnionDefinitionImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getStructOrUnionDefinition()
     * @generated
     */
    EClass STRUCT_OR_UNION_DEFINITION = eINSTANCE.getStructOrUnionDefinition();

    /**
     * The meta object literal for the '<em><b>Struct Member</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_OR_UNION_DEFINITION__STRUCT_MEMBER = eINSTANCE.getStructOrUnionDefinition_StructMember();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.StructorUnionReferenceImpl <em>Structor Union Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.StructorUnionReferenceImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getStructorUnionReference()
     * @generated
     */
    EClass STRUCTOR_UNION_REFERENCE = eINSTANCE.getStructorUnionReference();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.StructMemberImpl <em>Struct Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.StructMemberImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getStructMember()
     * @generated
     */
    EClass STRUCT_MEMBER = eINSTANCE.getStructMember();

    /**
     * The meta object literal for the '<em><b>Qual Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_MEMBER__QUAL_TYPE = eINSTANCE.getStructMember_QualType();

    /**
     * The meta object literal for the '<em><b>Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_MEMBER__DEC = eINSTANCE.getStructMember_Dec();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.EnumSpecificationImpl <em>Enum Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.EnumSpecificationImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getEnumSpecification()
     * @generated
     */
    EClass ENUM_SPECIFICATION = eINSTANCE.getEnumSpecification();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_SPECIFICATION__ID = eINSTANCE.getEnumSpecification_Id();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.EnumDefinitionImpl <em>Enum Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.EnumDefinitionImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getEnumDefinition()
     * @generated
     */
    EClass ENUM_DEFINITION = eINSTANCE.getEnumDefinition();

    /**
     * The meta object literal for the '<em><b>Enum Member List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DEFINITION__ENUM_MEMBER_LIST = eINSTANCE.getEnumDefinition_EnumMemberList();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.EnumReferenceImpl <em>Enum Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.EnumReferenceImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getEnumReference()
     * @generated
     */
    EClass ENUM_REFERENCE = eINSTANCE.getEnumReference();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.EnumMemberListImpl <em>Enum Member List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.EnumMemberListImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getEnumMemberList()
     * @generated
     */
    EClass ENUM_MEMBER_LIST = eINSTANCE.getEnumMemberList();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.EnumMemberImpl <em>Enum Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.EnumMemberImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getEnumMember()
     * @generated
     */
    EClass ENUM_MEMBER = eINSTANCE.getEnumMember();

    /**
     * The meta object literal for the '<em><b>Enum Member</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_MEMBER__ENUM_MEMBER = eINSTANCE.getEnumMember_EnumMember();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_MEMBER__ID = eINSTANCE.getEnumMember_Id();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.DeclaratorsImpl <em>Declarators</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.DeclaratorsImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getDeclarators()
     * @generated
     */
    EClass DECLARATORS = eINSTANCE.getDeclarators();

    /**
     * The meta object literal for the '<em><b>Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATORS__DEC = eINSTANCE.getDeclarators_Dec();

    /**
     * The meta object literal for the '<em><b>Declarator List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATORS__DECLARATOR_LIST = eINSTANCE.getDeclarators_DeclaratorList();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.DeclaratorImpl <em>Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.DeclaratorImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getDeclarator()
     * @generated
     */
    EClass DECLARATOR = eINSTANCE.getDeclarator();

    /**
     * The meta object literal for the '<em><b>Type Qualifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATOR__TYPE_QUALIFIER = eINSTANCE.getDeclarator_TypeQualifier();

    /**
     * The meta object literal for the '<em><b>Dc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATOR__DC = eINSTANCE.getDeclarator_Dc();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.DirectDeclaratorImpl <em>Direct Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.DirectDeclaratorImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getDirectDeclarator()
     * @generated
     */
    EClass DIRECT_DECLARATOR = eINSTANCE.getDirectDeclarator();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECT_DECLARATOR__ID = eINSTANCE.getDirectDeclarator_Id();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.IdentifierImpl <em>Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.IdentifierImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getIdentifier()
     * @generated
     */
    EClass IDENTIFIER = eINSTANCE.getIdentifier();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.ConstantDefinitionImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getConstantDefinition()
     * @generated
     */
    EClass CONSTANT_DEFINITION = eINSTANCE.getConstantDefinition();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DEFINITION__ID = eINSTANCE.getConstantDefinition_Id();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.InterfaceDefinitionImpl <em>Interface Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.InterfaceDefinitionImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getInterfaceDefinition()
     * @generated
     */
    EClass INTERFACE_DEFINITION = eINSTANCE.getInterfaceDefinition();

    /**
     * The meta object literal for the '<em><b>Fqn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DEFINITION__FQN = eINSTANCE.getInterfaceDefinition_Fqn();

    /**
     * The meta object literal for the '<em><b>Fqn2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DEFINITION__FQN2 = eINSTANCE.getInterfaceDefinition_Fqn2();

    /**
     * The meta object literal for the '<em><b>Method Def</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DEFINITION__METHOD_DEF = eINSTANCE.getInterfaceDefinition_MethodDef();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.MethodDefinitionImpl <em>Method Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.MethodDefinitionImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getMethodDefinition()
     * @generated
     */
    EClass METHOD_DEFINITION = eINSTANCE.getMethodDefinition();

    /**
     * The meta object literal for the '<em><b>Qualified Type Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DEFINITION__QUALIFIED_TYPE_SPEC = eINSTANCE.getMethodDefinition_QualifiedTypeSpec();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DEFINITION__ID = eINSTANCE.getMethodDefinition_Id();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DEFINITION__PARAMETER_LIST = eINSTANCE.getMethodDefinition_ParameterList();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.ParameterListImpl <em>Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.ParameterListImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getParameterList()
     * @generated
     */
    EClass PARAMETER_LIST = eINSTANCE.getParameterList();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAM = eINSTANCE.getParameterList_Param();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAMS = eINSTANCE.getParameterList_Params();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.ParameterImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Parameter Qualifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__PARAMETER_QUALIFIER = eINSTANCE.getParameter_ParameterQualifier();

    /**
     * The meta object literal for the '<em><b>Qualified Type Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__QUALIFIED_TYPE_SPEC = eINSTANCE.getParameter_QualifiedTypeSpec();

    /**
     * The meta object literal for the '<em><b>Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__DEC = eINSTANCE.getParameter_Dec();

    /**
     * The meta object literal for the '{@link fractalIDL.impl.IncludeDirectiveImpl <em>Include Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.impl.IncludeDirectiveImpl
     * @see fractalIDL.impl.FractalIDLPackageImpl#getIncludeDirective()
     * @generated
     */
    EClass INCLUDE_DIRECTIVE = eINSTANCE.getIncludeDirective();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_DIRECTIVE__PATH = eINSTANCE.getIncludeDirective_Path();

    /**
     * The meta object literal for the '{@link fractalIDL.TypeQualifier <em>Type Qualifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.TypeQualifier
     * @see fractalIDL.impl.FractalIDLPackageImpl#getTypeQualifier()
     * @generated
     */
    EEnum TYPE_QUALIFIER = eINSTANCE.getTypeQualifier();

    /**
     * The meta object literal for the '{@link fractalIDL.TypeSpecifier <em>Type Specifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.TypeSpecifier
     * @see fractalIDL.impl.FractalIDLPackageImpl#getTypeSpecifier()
     * @generated
     */
    EEnum TYPE_SPECIFIER = eINSTANCE.getTypeSpecifier();

    /**
     * The meta object literal for the '{@link fractalIDL.ParameterQualifier <em>Parameter Qualifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fractalIDL.ParameterQualifier
     * @see fractalIDL.impl.FractalIDLPackageImpl#getParameterQualifier()
     * @generated
     */
    EEnum PARAMETER_QUALIFIER = eINSTANCE.getParameterQualifier();

  }

} //FractalIDLPackage
