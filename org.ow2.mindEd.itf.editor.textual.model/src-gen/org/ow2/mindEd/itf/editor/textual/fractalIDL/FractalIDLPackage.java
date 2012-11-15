/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

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
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLFactory
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
  String eNS_URI = "http://www.ow2.org/mindEd/itf/";

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
  FractalIDLPackage eINSTANCE = org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ItfFileImpl <em>Itf File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ItfFileImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getItfFile()
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
   * The feature id for the '<em><b>Constant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITF_FILE__CONSTANT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITF_FILE__TYPE = 2;

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
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypeDefinitionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getTypeDefinition()
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
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypedefSpecificationImpl <em>Typedef Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypedefSpecificationImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getTypedefSpecification()
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
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.QualifiedTypeSpecificationImpl <em>Qualified Type Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.QualifiedTypeSpecificationImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getQualifiedTypeSpecification()
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
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypeSpecificationImpl <em>Type Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypeSpecificationImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getTypeSpecification()
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
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructOrUnionSpecificationImpl <em>Struct Or Union Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructOrUnionSpecificationImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getStructOrUnionSpecification()
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
   * The feature id for the '<em><b>Id</b></em>' attribute.
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
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructOrUnionDefinitionImpl <em>Struct Or Union Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructOrUnionDefinitionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getStructOrUnionDefinition()
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
   * The feature id for the '<em><b>Id</b></em>' attribute.
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
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructorUnionReferenceImpl <em>Structor Union Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructorUnionReferenceImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getStructorUnionReference()
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
   * The feature id for the '<em><b>Id</b></em>' attribute.
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
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructMemberImpl <em>Struct Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructMemberImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getStructMember()
   * @generated
   */
  int STRUCT_MEMBER = 8;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER__ANNOTATIONS_LIST = 0;

  /**
   * The feature id for the '<em><b>Qual Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER__QUAL_TYPE = 1;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER__DEC = 2;

  /**
   * The feature id for the '<em><b>Const Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER__CONST_EXPR = 3;

  /**
   * The number of structural features of the '<em>Struct Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumSpecificationImpl <em>Enum Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumSpecificationImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getEnumSpecification()
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
   * The feature id for the '<em><b>Id</b></em>' attribute.
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
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumDefinitionImpl <em>Enum Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumDefinitionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getEnumDefinition()
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
   * The feature id for the '<em><b>Id</b></em>' attribute.
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
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumReferenceImpl <em>Enum Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumReferenceImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getEnumReference()
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
   * The feature id for the '<em><b>Id</b></em>' attribute.
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
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumMemberListImpl <em>Enum Member List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumMemberListImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getEnumMemberList()
   * @generated
   */
  int ENUM_MEMBER_LIST = 12;

  /**
   * The feature id for the '<em><b>Enum Member</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_LIST__ENUM_MEMBER = 0;

  /**
   * The number of structural features of the '<em>Enum Member List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumMemberImpl <em>Enum Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumMemberImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getEnumMember()
   * @generated
   */
  int ENUM_MEMBER = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__NAME = 0;

  /**
   * The feature id for the '<em><b>Const Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__CONST_EXPR = 1;

  /**
   * The number of structural features of the '<em>Enum Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DeclaratorsImpl <em>Declarators</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DeclaratorsImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getDeclarators()
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
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DeclaratorImpl <em>Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DeclaratorImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getDeclarator()
   * @generated
   */
  int DECLARATOR = 15;

  /**
   * The feature id for the '<em><b>Pointer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATOR__POINTER = 0;

  /**
   * The feature id for the '<em><b>Dc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATOR__DC = 1;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATOR__DEC = 2;

  /**
   * The number of structural features of the '<em>Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.QualifiedPointerSpecificationImpl <em>Qualified Pointer Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.QualifiedPointerSpecificationImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getQualifiedPointerSpecification()
   * @generated
   */
  int QUALIFIED_POINTER_SPECIFICATION = 16;

  /**
   * The feature id for the '<em><b>Type Qualifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIERS = 0;

  /**
   * The number of structural features of the '<em>Qualified Pointer Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_POINTER_SPECIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DirectNamedDeclaratorImpl <em>Direct Named Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DirectNamedDeclaratorImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getDirectNamedDeclarator()
   * @generated
   */
  int DIRECT_NAMED_DECLARATOR = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_NAMED_DECLARATOR__ID = 0;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_NAMED_DECLARATOR__ARRAY = 1;

  /**
   * The number of structural features of the '<em>Direct Named Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_NAMED_DECLARATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DirectAnonymousDeclaratorImpl <em>Direct Anonymous Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DirectAnonymousDeclaratorImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getDirectAnonymousDeclarator()
   * @generated
   */
  int DIRECT_ANONYMOUS_DECLARATOR = 18;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_ANONYMOUS_DECLARATOR__ARRAY = 0;

  /**
   * The number of structural features of the '<em>Direct Anonymous Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_ANONYMOUS_DECLARATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ArraySpecificationImpl <em>Array Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ArraySpecificationImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getArraySpecification()
   * @generated
   */
  int ARRAY_SPECIFICATION = 19;

  /**
   * The feature id for the '<em><b>Unspecified Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SPECIFICATION__UNSPECIFIED_SIZE = 0;

  /**
   * The feature id for the '<em><b>Fixed Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SPECIFICATION__FIXED_SIZE = 1;

  /**
   * The number of structural features of the '<em>Array Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SPECIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ConstantDefinitionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getConstantDefinition()
   * @generated
   */
  int CONSTANT_DEFINITION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION__EXPR = 1;

  /**
   * The number of structural features of the '<em>Constant Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.InterfaceDefinitionImpl <em>Interface Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.InterfaceDefinitionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getInterfaceDefinition()
   * @generated
   */
  int INTERFACE_DEFINITION = 21;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION__ANNOTATIONS_LIST = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION__NAME = 1;

  /**
   * The feature id for the '<em><b>Fqn2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION__FQN2 = 2;

  /**
   * The feature id for the '<em><b>Method Def</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION__METHOD_DEF = 3;

  /**
   * The number of structural features of the '<em>Interface Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl <em>Method Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getMethodDefinition()
   * @generated
   */
  int METHOD_DEFINITION = 22;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__ANNOTATIONS_LIST = 0;

  /**
   * The feature id for the '<em><b>Qualified Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__QUALIFIED_TYPE_SPEC = 1;

  /**
   * The feature id for the '<em><b>Pointer Specification</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__POINTER_SPECIFICATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__NAME = 3;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__PARAMETER_LIST = 4;

  /**
   * The number of structural features of the '<em>Method Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ParameterListImpl <em>Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ParameterListImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getParameterList()
   * @generated
   */
  int PARAMETER_LIST = 23;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ParameterImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 24;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ANNOTATIONS_LIST = 0;

  /**
   * The feature id for the '<em><b>Parameter Qualifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PARAMETER_QUALIFIER = 1;

  /**
   * The feature id for the '<em><b>Qualified Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__QUALIFIED_TYPE_SPEC = 2;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DEC = 3;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.IncludeDirectiveImpl <em>Include Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.IncludeDirectiveImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getIncludeDirective()
   * @generated
   */
  int INCLUDE_DIRECTIVE = 25;

  /**
   * The feature id for the '<em><b>Imported URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DIRECTIVE__IMPORTED_URI = 0;

  /**
   * The feature id for the '<em><b>Include ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DIRECTIVE__INCLUDE_ID = 1;

  /**
   * The number of structural features of the '<em>Include Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DIRECTIVE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationsListImpl <em>Annotations List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationsListImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getAnnotationsList()
   * @generated
   */
  int ANNOTATIONS_LIST = 26;

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
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Annotation Parameters List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATION_PARAMETERS_LIST = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationValuePairImpl <em>Annotation Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationValuePairImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getAnnotationValuePair()
   * @generated
   */
  int ANNOTATION_VALUE_PAIR = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_VALUE_PAIR__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_VALUE_PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Annotation Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_VALUE_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationValueImpl <em>Annotation Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationValueImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getAnnotationValue()
   * @generated
   */
  int ANNOTATION_VALUE = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_VALUE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Array Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_VALUE__ARRAY_VALUE = 1;

  /**
   * The number of structural features of the '<em>Annotation Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ArrayAnnotationValueImpl <em>Array Annotation Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ArrayAnnotationValueImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getArrayAnnotationValue()
   * @generated
   */
  int ARRAY_ANNOTATION_VALUE = 30;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ANNOTATION_VALUE__VALUES = 0;

  /**
   * The number of structural features of the '<em>Array Annotation Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ANNOTATION_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.PrimaryExpressionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getPrimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__LITERAL = 0;

  /**
   * The number of structural features of the '<em>Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ConstantExpressionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getConstantExpression()
   * @generated
   */
  int CONSTANT_EXPRESSION = 31;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION__LITERAL = PRIMARY_EXPRESSION__LITERAL;

  /**
   * The number of structural features of the '<em>Constant Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.LogicalOrExpressionImpl <em>Logical Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.LogicalOrExpressionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getLogicalOrExpression()
   * @generated
   */
  int LOGICAL_OR_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__LITERAL = CONSTANT_EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__LEFT_EXPR = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__RIGHT_EXPR = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Logical Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.LogicalAndExpressionImpl <em>Logical And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.LogicalAndExpressionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getLogicalAndExpression()
   * @generated
   */
  int LOGICAL_AND_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPRESSION__LEFT_EXPR = 0;

  /**
   * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPRESSION__RIGHT_EXPR = 1;

  /**
   * The number of structural features of the '<em>Logical And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.OrExpressionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__LEFT_EXPR = 0;

  /**
   * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__RIGHT_EXPR = 1;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.XorExpressionImpl <em>Xor Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.XorExpressionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getXorExpression()
   * @generated
   */
  int XOR_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPRESSION__LEFT_EXPR = 0;

  /**
   * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPRESSION__RIGHT_EXPR = 1;

  /**
   * The number of structural features of the '<em>Xor Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AndExpressionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LEFT_EXPR = 0;

  /**
   * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__RIGHT_EXPR = 1;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ShiftExpressionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getShiftExpression()
   * @generated
   */
  int SHIFT_EXPRESSION = 37;

  /**
   * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__LEFT_EXPR = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__OP = 1;

  /**
   * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__RIGHT_EXPR = 2;

  /**
   * The number of structural features of the '<em>Shift Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AdditiveExpressionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getAdditiveExpression()
   * @generated
   */
  int ADDITIVE_EXPRESSION = 38;

  /**
   * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__LEFT_EXPR = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__OP = 1;

  /**
   * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__RIGHT_EXPR = 2;

  /**
   * The number of structural features of the '<em>Additive Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MulExpressionImpl <em>Mul Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MulExpressionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getMulExpression()
   * @generated
   */
  int MUL_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPRESSION__LEFT_EXPR = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPRESSION__OP = 1;

  /**
   * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPRESSION__RIGHT_EXPR = 2;

  /**
   * The number of structural features of the '<em>Mul Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.CastExpressionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getCastExpression()
   * @generated
   */
  int CAST_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__EXPR = 1;

  /**
   * The feature id for the '<em><b>Unary Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__UNARY_EXPR = 2;

  /**
   * The number of structural features of the '<em>Cast Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.UnaryExpressionImpl
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Unary Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__UNARY_EXPR = 0;

  /**
   * The feature id for the '<em><b>Primary Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__PRIMARY_EXPR = 1;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeQualifier <em>Type Qualifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeQualifier
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getTypeQualifier()
   * @generated
   */
  int TYPE_QUALIFIER = 43;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecifier <em>Type Specifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecifier
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getTypeSpecifier()
   * @generated
   */
  int TYPE_SPECIFIER = 44;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterQualifier <em>Parameter Qualifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterQualifier
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getParameterQualifier()
   * @generated
   */
  int PARAMETER_QUALIFIER = 45;


  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ItfFile <em>Itf File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Itf File</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ItfFile
   * @generated
   */
  EClass getItfFile();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ItfFile#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ItfFile#getIncludes()
   * @see #getItfFile()
   * @generated
   */
  EReference getItfFile_Includes();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ItfFile#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constant</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ItfFile#getConstant()
   * @see #getItfFile()
   * @generated
   */
  EReference getItfFile_Constant();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ItfFile#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ItfFile#getType()
   * @see #getItfFile()
   * @generated
   */
  EReference getItfFile_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ItfFile#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ItfFile#getInterface()
   * @see #getItfFile()
   * @generated
   */
  EReference getItfFile_Interface();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification <em>Typedef Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typedef Specification</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification
   * @generated
   */
  EClass getTypedefSpecification();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification#getQualifedType <em>Qualifed Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualifed Type</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification#getQualifedType()
   * @see #getTypedefSpecification()
   * @generated
   */
  EReference getTypedefSpecification_QualifedType();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification#getDec()
   * @see #getTypedefSpecification()
   * @generated
   */
  EReference getTypedefSpecification_Dec();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification <em>Qualified Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Type Specification</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification
   * @generated
   */
  EClass getQualifiedTypeSpecification();

  /**
   * Returns the meta object for the attribute list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification#getTypeQualifier <em>Type Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Qualifier</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification#getTypeQualifier()
   * @see #getQualifiedTypeSpecification()
   * @generated
   */
  EAttribute getQualifiedTypeSpecification_TypeQualifier();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification#getTypeSpec <em>Type Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Spec</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification#getTypeSpec()
   * @see #getQualifiedTypeSpecification()
   * @generated
   */
  EReference getQualifiedTypeSpecification_TypeSpec();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecification <em>Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Specification</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecification
   * @generated
   */
  EClass getTypeSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecification#getTypeDefName <em>Type Def Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Def Name</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecification#getTypeDefName()
   * @see #getTypeSpecification()
   * @generated
   */
  EAttribute getTypeSpecification_TypeDefName();

  /**
   * Returns the meta object for the attribute list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecification#getTypeSpecifier <em>Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Specifier</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecification#getTypeSpecifier()
   * @see #getTypeSpecification()
   * @generated
   */
  EAttribute getTypeSpecification_TypeSpecifier();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification <em>Struct Or Union Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Or Union Specification</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification
   * @generated
   */
  EClass getStructOrUnionSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Struct</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification#getStruct()
   * @see #getStructOrUnionSpecification()
   * @generated
   */
  EAttribute getStructOrUnionSpecification_Struct();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification#getId()
   * @see #getStructOrUnionSpecification()
   * @generated
   */
  EAttribute getStructOrUnionSpecification_Id();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionDefinition <em>Struct Or Union Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Or Union Definition</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionDefinition
   * @generated
   */
  EClass getStructOrUnionDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionDefinition#getStructMember <em>Struct Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct Member</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionDefinition#getStructMember()
   * @see #getStructOrUnionDefinition()
   * @generated
   */
  EReference getStructOrUnionDefinition_StructMember();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructorUnionReference <em>Structor Union Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structor Union Reference</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructorUnionReference
   * @generated
   */
  EClass getStructorUnionReference();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember <em>Struct Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Member</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember
   * @generated
   */
  EClass getStructMember();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getAnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotations List</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getAnnotationsList()
   * @see #getStructMember()
   * @generated
   */
  EReference getStructMember_AnnotationsList();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getQualType <em>Qual Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qual Type</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getQualType()
   * @see #getStructMember()
   * @generated
   */
  EReference getStructMember_QualType();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getDec()
   * @see #getStructMember()
   * @generated
   */
  EReference getStructMember_Dec();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getConstExpr <em>Const Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Const Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getConstExpr()
   * @see #getStructMember()
   * @generated
   */
  EReference getStructMember_ConstExpr();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumSpecification <em>Enum Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Specification</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumSpecification
   * @generated
   */
  EClass getEnumSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumSpecification#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumSpecification#getId()
   * @see #getEnumSpecification()
   * @generated
   */
  EAttribute getEnumSpecification_Id();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumDefinition <em>Enum Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Definition</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumDefinition
   * @generated
   */
  EClass getEnumDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumDefinition#getEnumMemberList <em>Enum Member List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum Member List</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumDefinition#getEnumMemberList()
   * @see #getEnumDefinition()
   * @generated
   */
  EReference getEnumDefinition_EnumMemberList();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumReference <em>Enum Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Reference</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumReference
   * @generated
   */
  EClass getEnumReference();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMemberList <em>Enum Member List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Member List</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMemberList
   * @generated
   */
  EClass getEnumMemberList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMemberList#getEnumMember <em>Enum Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enum Member</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMemberList#getEnumMember()
   * @see #getEnumMemberList()
   * @generated
   */
  EReference getEnumMemberList_EnumMember();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMember <em>Enum Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Member</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMember
   * @generated
   */
  EClass getEnumMember();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMember#getName()
   * @see #getEnumMember()
   * @generated
   */
  EAttribute getEnumMember_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMember#getConstExpr <em>Const Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Const Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMember#getConstExpr()
   * @see #getEnumMember()
   * @generated
   */
  EReference getEnumMember_ConstExpr();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarators <em>Declarators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declarators</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarators
   * @generated
   */
  EClass getDeclarators();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarators#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarators#getDec()
   * @see #getDeclarators()
   * @generated
   */
  EReference getDeclarators_Dec();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarators#getDeclaratorList <em>Declarator List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarator List</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarators#getDeclaratorList()
   * @see #getDeclarators()
   * @generated
   */
  EReference getDeclarators_DeclaratorList();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator <em>Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declarator</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator
   * @generated
   */
  EClass getDeclarator();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator#getPointer <em>Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pointer</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator#getPointer()
   * @see #getDeclarator()
   * @generated
   */
  EReference getDeclarator_Pointer();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator#getDc <em>Dc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dc</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator#getDc()
   * @see #getDeclarator()
   * @generated
   */
  EReference getDeclarator_Dc();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator#getDec()
   * @see #getDeclarator()
   * @generated
   */
  EReference getDeclarator_Dec();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedPointerSpecification <em>Qualified Pointer Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Pointer Specification</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedPointerSpecification
   * @generated
   */
  EClass getQualifiedPointerSpecification();

  /**
   * Returns the meta object for the attribute list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedPointerSpecification#getTypeQualifiers <em>Type Qualifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Qualifiers</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedPointerSpecification#getTypeQualifiers()
   * @see #getQualifiedPointerSpecification()
   * @generated
   */
  EAttribute getQualifiedPointerSpecification_TypeQualifiers();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectNamedDeclarator <em>Direct Named Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Named Declarator</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectNamedDeclarator
   * @generated
   */
  EClass getDirectNamedDeclarator();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectNamedDeclarator#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectNamedDeclarator#getId()
   * @see #getDirectNamedDeclarator()
   * @generated
   */
  EAttribute getDirectNamedDeclarator_Id();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectNamedDeclarator#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Array</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectNamedDeclarator#getArray()
   * @see #getDirectNamedDeclarator()
   * @generated
   */
  EReference getDirectNamedDeclarator_Array();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectAnonymousDeclarator <em>Direct Anonymous Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Anonymous Declarator</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectAnonymousDeclarator
   * @generated
   */
  EClass getDirectAnonymousDeclarator();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectAnonymousDeclarator#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Array</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectAnonymousDeclarator#getArray()
   * @see #getDirectAnonymousDeclarator()
   * @generated
   */
  EReference getDirectAnonymousDeclarator_Array();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification <em>Array Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Specification</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification
   * @generated
   */
  EClass getArraySpecification();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification#isUnspecifiedSize <em>Unspecified Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unspecified Size</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification#isUnspecifiedSize()
   * @see #getArraySpecification()
   * @generated
   */
  EAttribute getArraySpecification_UnspecifiedSize();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification#getFixedSize <em>Fixed Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fixed Size</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification#getFixedSize()
   * @see #getArraySpecification()
   * @generated
   */
  EReference getArraySpecification_FixedSize();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantDefinition <em>Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Definition</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantDefinition
   * @generated
   */
  EClass getConstantDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantDefinition#getName()
   * @see #getConstantDefinition()
   * @generated
   */
  EAttribute getConstantDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantDefinition#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantDefinition#getExpr()
   * @see #getConstantDefinition()
   * @generated
   */
  EReference getConstantDefinition_Expr();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition <em>Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Definition</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition
   * @generated
   */
  EClass getInterfaceDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getAnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotations List</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getAnnotationsList()
   * @see #getInterfaceDefinition()
   * @generated
   */
  EReference getInterfaceDefinition_AnnotationsList();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getName()
   * @see #getInterfaceDefinition()
   * @generated
   */
  EAttribute getInterfaceDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getFqn2 <em>Fqn2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fqn2</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getFqn2()
   * @see #getInterfaceDefinition()
   * @generated
   */
  EAttribute getInterfaceDefinition_Fqn2();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getMethodDef <em>Method Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Method Def</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getMethodDef()
   * @see #getInterfaceDefinition()
   * @generated
   */
  EReference getInterfaceDefinition_MethodDef();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition <em>Method Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Definition</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition
   * @generated
   */
  EClass getMethodDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getAnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotations List</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getAnnotationsList()
   * @see #getMethodDefinition()
   * @generated
   */
  EReference getMethodDefinition_AnnotationsList();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getQualifiedTypeSpec <em>Qualified Type Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Type Spec</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getQualifiedTypeSpec()
   * @see #getMethodDefinition()
   * @generated
   */
  EReference getMethodDefinition_QualifiedTypeSpec();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getPointerSpecification <em>Pointer Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pointer Specification</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getPointerSpecification()
   * @see #getMethodDefinition()
   * @generated
   */
  EReference getMethodDefinition_PointerSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getName()
   * @see #getMethodDefinition()
   * @generated
   */
  EAttribute getMethodDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getParameterList()
   * @see #getMethodDefinition()
   * @generated
   */
  EReference getMethodDefinition_ParameterList();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter List</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterList
   * @generated
   */
  EClass getParameterList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterList#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterList#getParams()
   * @see #getParameterList()
   * @generated
   */
  EReference getParameterList_Params();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getAnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotations List</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getAnnotationsList()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_AnnotationsList();

  /**
   * Returns the meta object for the attribute list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getParameterQualifier <em>Parameter Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameter Qualifier</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getParameterQualifier()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_ParameterQualifier();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getQualifiedTypeSpec <em>Qualified Type Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Type Spec</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getQualifiedTypeSpec()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_QualifiedTypeSpec();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter#getDec()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Dec();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective <em>Include Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Directive</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective
   * @generated
   */
  EClass getIncludeDirective();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective#getImportedURI <em>Imported URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported URI</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective#getImportedURI()
   * @see #getIncludeDirective()
   * @generated
   */
  EAttribute getIncludeDirective_ImportedURI();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective#getIncludeID <em>Include ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include ID</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective#getIncludeID()
   * @see #getIncludeDirective()
   * @generated
   */
  EAttribute getIncludeDirective_IncludeID();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotations List</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationsList
   * @generated
   */
  EClass getAnnotationsList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationsList#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationsList#getAnnotations()
   * @see #getAnnotationsList()
   * @generated
   */
  EReference getAnnotationsList_Annotations();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotation#getName()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotation#getAnnotationParametersList <em>Annotation Parameters List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation Parameters List</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotation#getAnnotationParametersList()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_AnnotationParametersList();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePair <em>Annotation Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Value Pair</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePair
   * @generated
   */
  EClass getAnnotationValuePair();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePair#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePair#getName()
   * @see #getAnnotationValuePair()
   * @generated
   */
  EAttribute getAnnotationValuePair_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePair#getValue()
   * @see #getAnnotationValuePair()
   * @generated
   */
  EReference getAnnotationValuePair_Value();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Value</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue
   * @generated
   */
  EClass getAnnotationValue();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue#getValue()
   * @see #getAnnotationValue()
   * @generated
   */
  EAttribute getAnnotationValue_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue#getArrayValue <em>Array Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Value</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue#getArrayValue()
   * @see #getAnnotationValue()
   * @generated
   */
  EReference getAnnotationValue_ArrayValue();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArrayAnnotationValue <em>Array Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Annotation Value</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ArrayAnnotationValue
   * @generated
   */
  EClass getArrayAnnotationValue();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArrayAnnotationValue#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ArrayAnnotationValue#getValues()
   * @see #getArrayAnnotationValue()
   * @generated
   */
  EReference getArrayAnnotationValue_Values();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantExpression <em>Constant Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expression</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantExpression
   * @generated
   */
  EClass getConstantExpression();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalOrExpression <em>Logical Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Or Expression</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalOrExpression
   * @generated
   */
  EClass getLogicalOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalOrExpression#getLeftExpr <em>Left Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalOrExpression#getLeftExpr()
   * @see #getLogicalOrExpression()
   * @generated
   */
  EReference getLogicalOrExpression_LeftExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalOrExpression#getRightExpr <em>Right Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalOrExpression#getRightExpr()
   * @see #getLogicalOrExpression()
   * @generated
   */
  EReference getLogicalOrExpression_RightExpr();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalAndExpression <em>Logical And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical And Expression</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalAndExpression
   * @generated
   */
  EClass getLogicalAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalAndExpression#getLeftExpr <em>Left Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalAndExpression#getLeftExpr()
   * @see #getLogicalAndExpression()
   * @generated
   */
  EReference getLogicalAndExpression_LeftExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalAndExpression#getRightExpr <em>Right Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalAndExpression#getRightExpr()
   * @see #getLogicalAndExpression()
   * @generated
   */
  EReference getLogicalAndExpression_RightExpr();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.OrExpression#getLeftExpr <em>Left Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.OrExpression#getLeftExpr()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_LeftExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.OrExpression#getRightExpr <em>Right Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.OrExpression#getRightExpr()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_RightExpr();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.XorExpression <em>Xor Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xor Expression</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.XorExpression
   * @generated
   */
  EClass getXorExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.XorExpression#getLeftExpr <em>Left Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.XorExpression#getLeftExpr()
   * @see #getXorExpression()
   * @generated
   */
  EReference getXorExpression_LeftExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.XorExpression#getRightExpr <em>Right Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.XorExpression#getRightExpr()
   * @see #getXorExpression()
   * @generated
   */
  EReference getXorExpression_RightExpr();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression#getLeftExpr <em>Left Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression#getLeftExpr()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_LeftExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression#getRightExpr <em>Right Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression#getRightExpr()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_RightExpr();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ShiftExpression <em>Shift Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Expression</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ShiftExpression
   * @generated
   */
  EClass getShiftExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ShiftExpression#getLeftExpr <em>Left Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ShiftExpression#getLeftExpr()
   * @see #getShiftExpression()
   * @generated
   */
  EReference getShiftExpression_LeftExpr();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ShiftExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ShiftExpression#getOp()
   * @see #getShiftExpression()
   * @generated
   */
  EAttribute getShiftExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ShiftExpression#getRightExpr <em>Right Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ShiftExpression#getRightExpr()
   * @see #getShiftExpression()
   * @generated
   */
  EReference getShiftExpression_RightExpr();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expression</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AdditiveExpression
   * @generated
   */
  EClass getAdditiveExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AdditiveExpression#getLeftExpr <em>Left Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AdditiveExpression#getLeftExpr()
   * @see #getAdditiveExpression()
   * @generated
   */
  EReference getAdditiveExpression_LeftExpr();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AdditiveExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AdditiveExpression#getOp()
   * @see #getAdditiveExpression()
   * @generated
   */
  EAttribute getAdditiveExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AdditiveExpression#getRightExpr <em>Right Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AdditiveExpression#getRightExpr()
   * @see #getAdditiveExpression()
   * @generated
   */
  EReference getAdditiveExpression_RightExpr();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MulExpression <em>Mul Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mul Expression</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.MulExpression
   * @generated
   */
  EClass getMulExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MulExpression#getLeftExpr <em>Left Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.MulExpression#getLeftExpr()
   * @see #getMulExpression()
   * @generated
   */
  EReference getMulExpression_LeftExpr();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MulExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.MulExpression#getOp()
   * @see #getMulExpression()
   * @generated
   */
  EAttribute getMulExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MulExpression#getRightExpr <em>Right Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.MulExpression#getRightExpr()
   * @see #getMulExpression()
   * @generated
   */
  EReference getMulExpression_RightExpr();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast Expression</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression
   * @generated
   */
  EClass getCastExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression#getType()
   * @see #getCastExpression()
   * @generated
   */
  EReference getCastExpression_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression#getExpr()
   * @see #getCastExpression()
   * @generated
   */
  EReference getCastExpression_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression#getUnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression#getUnaryExpr()
   * @see #getCastExpression()
   * @generated
   */
  EReference getCastExpression_UnaryExpr();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.UnaryExpression#getUnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unary Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.UnaryExpression#getUnaryExpr()
   * @see #getUnaryExpression()
   * @generated
   */
  EAttribute getUnaryExpression_UnaryExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.UnaryExpression#getPrimaryExpr <em>Primary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Expr</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.UnaryExpression#getPrimaryExpr()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_PrimaryExpr();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.PrimaryExpression
   * @generated
   */
  EClass getPrimaryExpression();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.PrimaryExpression#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.PrimaryExpression#getLiteral()
   * @see #getPrimaryExpression()
   * @generated
   */
  EAttribute getPrimaryExpression_Literal();

  /**
   * Returns the meta object for enum '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeQualifier <em>Type Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Qualifier</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeQualifier
   * @generated
   */
  EEnum getTypeQualifier();

  /**
   * Returns the meta object for enum '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecifier <em>Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Specifier</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecifier
   * @generated
   */
  EEnum getTypeSpecifier();

  /**
   * Returns the meta object for enum '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterQualifier <em>Parameter Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parameter Qualifier</em>'.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterQualifier
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
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ItfFileImpl <em>Itf File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ItfFileImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getItfFile()
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
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITF_FILE__CONSTANT = eINSTANCE.getItfFile_Constant();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITF_FILE__TYPE = eINSTANCE.getItfFile_Type();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITF_FILE__INTERFACE = eINSTANCE.getItfFile_Interface();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypeDefinitionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getTypeDefinition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypedefSpecificationImpl <em>Typedef Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypedefSpecificationImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getTypedefSpecification()
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
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.QualifiedTypeSpecificationImpl <em>Qualified Type Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.QualifiedTypeSpecificationImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getQualifiedTypeSpecification()
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
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypeSpecificationImpl <em>Type Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypeSpecificationImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getTypeSpecification()
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
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructOrUnionSpecificationImpl <em>Struct Or Union Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructOrUnionSpecificationImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getStructOrUnionSpecification()
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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_OR_UNION_SPECIFICATION__ID = eINSTANCE.getStructOrUnionSpecification_Id();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructOrUnionDefinitionImpl <em>Struct Or Union Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructOrUnionDefinitionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getStructOrUnionDefinition()
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
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructorUnionReferenceImpl <em>Structor Union Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructorUnionReferenceImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getStructorUnionReference()
     * @generated
     */
    EClass STRUCTOR_UNION_REFERENCE = eINSTANCE.getStructorUnionReference();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructMemberImpl <em>Struct Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructMemberImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getStructMember()
     * @generated
     */
    EClass STRUCT_MEMBER = eINSTANCE.getStructMember();

    /**
     * The meta object literal for the '<em><b>Annotations List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_MEMBER__ANNOTATIONS_LIST = eINSTANCE.getStructMember_AnnotationsList();

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
     * The meta object literal for the '<em><b>Const Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_MEMBER__CONST_EXPR = eINSTANCE.getStructMember_ConstExpr();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumSpecificationImpl <em>Enum Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumSpecificationImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getEnumSpecification()
     * @generated
     */
    EClass ENUM_SPECIFICATION = eINSTANCE.getEnumSpecification();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_SPECIFICATION__ID = eINSTANCE.getEnumSpecification_Id();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumDefinitionImpl <em>Enum Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumDefinitionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getEnumDefinition()
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
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumReferenceImpl <em>Enum Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumReferenceImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getEnumReference()
     * @generated
     */
    EClass ENUM_REFERENCE = eINSTANCE.getEnumReference();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumMemberListImpl <em>Enum Member List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumMemberListImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getEnumMemberList()
     * @generated
     */
    EClass ENUM_MEMBER_LIST = eINSTANCE.getEnumMemberList();

    /**
     * The meta object literal for the '<em><b>Enum Member</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_MEMBER_LIST__ENUM_MEMBER = eINSTANCE.getEnumMemberList_EnumMember();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumMemberImpl <em>Enum Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumMemberImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getEnumMember()
     * @generated
     */
    EClass ENUM_MEMBER = eINSTANCE.getEnumMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_MEMBER__NAME = eINSTANCE.getEnumMember_Name();

    /**
     * The meta object literal for the '<em><b>Const Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_MEMBER__CONST_EXPR = eINSTANCE.getEnumMember_ConstExpr();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DeclaratorsImpl <em>Declarators</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DeclaratorsImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getDeclarators()
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
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DeclaratorImpl <em>Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DeclaratorImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getDeclarator()
     * @generated
     */
    EClass DECLARATOR = eINSTANCE.getDeclarator();

    /**
     * The meta object literal for the '<em><b>Pointer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATOR__POINTER = eINSTANCE.getDeclarator_Pointer();

    /**
     * The meta object literal for the '<em><b>Dc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATOR__DC = eINSTANCE.getDeclarator_Dc();

    /**
     * The meta object literal for the '<em><b>Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATOR__DEC = eINSTANCE.getDeclarator_Dec();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.QualifiedPointerSpecificationImpl <em>Qualified Pointer Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.QualifiedPointerSpecificationImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getQualifiedPointerSpecification()
     * @generated
     */
    EClass QUALIFIED_POINTER_SPECIFICATION = eINSTANCE.getQualifiedPointerSpecification();

    /**
     * The meta object literal for the '<em><b>Type Qualifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIERS = eINSTANCE.getQualifiedPointerSpecification_TypeQualifiers();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DirectNamedDeclaratorImpl <em>Direct Named Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DirectNamedDeclaratorImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getDirectNamedDeclarator()
     * @generated
     */
    EClass DIRECT_NAMED_DECLARATOR = eINSTANCE.getDirectNamedDeclarator();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECT_NAMED_DECLARATOR__ID = eINSTANCE.getDirectNamedDeclarator_Id();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECT_NAMED_DECLARATOR__ARRAY = eINSTANCE.getDirectNamedDeclarator_Array();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DirectAnonymousDeclaratorImpl <em>Direct Anonymous Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.DirectAnonymousDeclaratorImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getDirectAnonymousDeclarator()
     * @generated
     */
    EClass DIRECT_ANONYMOUS_DECLARATOR = eINSTANCE.getDirectAnonymousDeclarator();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECT_ANONYMOUS_DECLARATOR__ARRAY = eINSTANCE.getDirectAnonymousDeclarator_Array();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ArraySpecificationImpl <em>Array Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ArraySpecificationImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getArraySpecification()
     * @generated
     */
    EClass ARRAY_SPECIFICATION = eINSTANCE.getArraySpecification();

    /**
     * The meta object literal for the '<em><b>Unspecified Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_SPECIFICATION__UNSPECIFIED_SIZE = eINSTANCE.getArraySpecification_UnspecifiedSize();

    /**
     * The meta object literal for the '<em><b>Fixed Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_SPECIFICATION__FIXED_SIZE = eINSTANCE.getArraySpecification_FixedSize();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ConstantDefinitionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getConstantDefinition()
     * @generated
     */
    EClass CONSTANT_DEFINITION = eINSTANCE.getConstantDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DEFINITION__NAME = eINSTANCE.getConstantDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DEFINITION__EXPR = eINSTANCE.getConstantDefinition_Expr();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.InterfaceDefinitionImpl <em>Interface Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.InterfaceDefinitionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getInterfaceDefinition()
     * @generated
     */
    EClass INTERFACE_DEFINITION = eINSTANCE.getInterfaceDefinition();

    /**
     * The meta object literal for the '<em><b>Annotations List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DEFINITION__ANNOTATIONS_LIST = eINSTANCE.getInterfaceDefinition_AnnotationsList();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DEFINITION__NAME = eINSTANCE.getInterfaceDefinition_Name();

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
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl <em>Method Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getMethodDefinition()
     * @generated
     */
    EClass METHOD_DEFINITION = eINSTANCE.getMethodDefinition();

    /**
     * The meta object literal for the '<em><b>Annotations List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DEFINITION__ANNOTATIONS_LIST = eINSTANCE.getMethodDefinition_AnnotationsList();

    /**
     * The meta object literal for the '<em><b>Qualified Type Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DEFINITION__QUALIFIED_TYPE_SPEC = eINSTANCE.getMethodDefinition_QualifiedTypeSpec();

    /**
     * The meta object literal for the '<em><b>Pointer Specification</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DEFINITION__POINTER_SPECIFICATION = eINSTANCE.getMethodDefinition_PointerSpecification();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DEFINITION__NAME = eINSTANCE.getMethodDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DEFINITION__PARAMETER_LIST = eINSTANCE.getMethodDefinition_ParameterList();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ParameterListImpl <em>Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ParameterListImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getParameterList()
     * @generated
     */
    EClass PARAMETER_LIST = eINSTANCE.getParameterList();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAMS = eINSTANCE.getParameterList_Params();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ParameterImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Annotations List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__ANNOTATIONS_LIST = eINSTANCE.getParameter_AnnotationsList();

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
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.IncludeDirectiveImpl <em>Include Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.IncludeDirectiveImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getIncludeDirective()
     * @generated
     */
    EClass INCLUDE_DIRECTIVE = eINSTANCE.getIncludeDirective();

    /**
     * The meta object literal for the '<em><b>Imported URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_DIRECTIVE__IMPORTED_URI = eINSTANCE.getIncludeDirective_ImportedURI();

    /**
     * The meta object literal for the '<em><b>Include ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_DIRECTIVE__INCLUDE_ID = eINSTANCE.getIncludeDirective_IncludeID();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationsListImpl <em>Annotations List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationsListImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getAnnotationsList()
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
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getAnnotation()
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
     * The meta object literal for the '<em><b>Annotation Parameters List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__ANNOTATION_PARAMETERS_LIST = eINSTANCE.getAnnotation_AnnotationParametersList();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationValuePairImpl <em>Annotation Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationValuePairImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getAnnotationValuePair()
     * @generated
     */
    EClass ANNOTATION_VALUE_PAIR = eINSTANCE.getAnnotationValuePair();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_VALUE_PAIR__NAME = eINSTANCE.getAnnotationValuePair_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_VALUE_PAIR__VALUE = eINSTANCE.getAnnotationValuePair_Value();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationValueImpl <em>Annotation Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationValueImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getAnnotationValue()
     * @generated
     */
    EClass ANNOTATION_VALUE = eINSTANCE.getAnnotationValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_VALUE__VALUE = eINSTANCE.getAnnotationValue_Value();

    /**
     * The meta object literal for the '<em><b>Array Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_VALUE__ARRAY_VALUE = eINSTANCE.getAnnotationValue_ArrayValue();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ArrayAnnotationValueImpl <em>Array Annotation Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ArrayAnnotationValueImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getArrayAnnotationValue()
     * @generated
     */
    EClass ARRAY_ANNOTATION_VALUE = eINSTANCE.getArrayAnnotationValue();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ANNOTATION_VALUE__VALUES = eINSTANCE.getArrayAnnotationValue_Values();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ConstantExpressionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getConstantExpression()
     * @generated
     */
    EClass CONSTANT_EXPRESSION = eINSTANCE.getConstantExpression();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.LogicalOrExpressionImpl <em>Logical Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.LogicalOrExpressionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getLogicalOrExpression()
     * @generated
     */
    EClass LOGICAL_OR_EXPRESSION = eINSTANCE.getLogicalOrExpression();

    /**
     * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_OR_EXPRESSION__LEFT_EXPR = eINSTANCE.getLogicalOrExpression_LeftExpr();

    /**
     * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_OR_EXPRESSION__RIGHT_EXPR = eINSTANCE.getLogicalOrExpression_RightExpr();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.LogicalAndExpressionImpl <em>Logical And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.LogicalAndExpressionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getLogicalAndExpression()
     * @generated
     */
    EClass LOGICAL_AND_EXPRESSION = eINSTANCE.getLogicalAndExpression();

    /**
     * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_AND_EXPRESSION__LEFT_EXPR = eINSTANCE.getLogicalAndExpression_LeftExpr();

    /**
     * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_AND_EXPRESSION__RIGHT_EXPR = eINSTANCE.getLogicalAndExpression_RightExpr();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.OrExpressionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__LEFT_EXPR = eINSTANCE.getOrExpression_LeftExpr();

    /**
     * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__RIGHT_EXPR = eINSTANCE.getOrExpression_RightExpr();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.XorExpressionImpl <em>Xor Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.XorExpressionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getXorExpression()
     * @generated
     */
    EClass XOR_EXPRESSION = eINSTANCE.getXorExpression();

    /**
     * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XOR_EXPRESSION__LEFT_EXPR = eINSTANCE.getXorExpression_LeftExpr();

    /**
     * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XOR_EXPRESSION__RIGHT_EXPR = eINSTANCE.getXorExpression_RightExpr();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AndExpressionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__LEFT_EXPR = eINSTANCE.getAndExpression_LeftExpr();

    /**
     * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__RIGHT_EXPR = eINSTANCE.getAndExpression_RightExpr();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ShiftExpressionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getShiftExpression()
     * @generated
     */
    EClass SHIFT_EXPRESSION = eINSTANCE.getShiftExpression();

    /**
     * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHIFT_EXPRESSION__LEFT_EXPR = eINSTANCE.getShiftExpression_LeftExpr();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHIFT_EXPRESSION__OP = eINSTANCE.getShiftExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHIFT_EXPRESSION__RIGHT_EXPR = eINSTANCE.getShiftExpression_RightExpr();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AdditiveExpressionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getAdditiveExpression()
     * @generated
     */
    EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

    /**
     * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPRESSION__LEFT_EXPR = eINSTANCE.getAdditiveExpression_LeftExpr();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITIVE_EXPRESSION__OP = eINSTANCE.getAdditiveExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPRESSION__RIGHT_EXPR = eINSTANCE.getAdditiveExpression_RightExpr();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MulExpressionImpl <em>Mul Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MulExpressionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getMulExpression()
     * @generated
     */
    EClass MUL_EXPRESSION = eINSTANCE.getMulExpression();

    /**
     * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_EXPRESSION__LEFT_EXPR = eINSTANCE.getMulExpression_LeftExpr();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUL_EXPRESSION__OP = eINSTANCE.getMulExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_EXPRESSION__RIGHT_EXPR = eINSTANCE.getMulExpression_RightExpr();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.CastExpressionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getCastExpression()
     * @generated
     */
    EClass CAST_EXPRESSION = eINSTANCE.getCastExpression();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__TYPE = eINSTANCE.getCastExpression_Type();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__EXPR = eINSTANCE.getCastExpression_Expr();

    /**
     * The meta object literal for the '<em><b>Unary Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__UNARY_EXPR = eINSTANCE.getCastExpression_UnaryExpr();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.UnaryExpressionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Unary Expr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPRESSION__UNARY_EXPR = eINSTANCE.getUnaryExpression_UnaryExpr();

    /**
     * The meta object literal for the '<em><b>Primary Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__PRIMARY_EXPR = eINSTANCE.getUnaryExpression_PrimaryExpr();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.PrimaryExpressionImpl
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getPrimaryExpression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_EXPRESSION__LITERAL = eINSTANCE.getPrimaryExpression_Literal();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeQualifier <em>Type Qualifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeQualifier
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getTypeQualifier()
     * @generated
     */
    EEnum TYPE_QUALIFIER = eINSTANCE.getTypeQualifier();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecifier <em>Type Specifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecifier
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getTypeSpecifier()
     * @generated
     */
    EEnum TYPE_SPECIFIER = eINSTANCE.getTypeSpecifier();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterQualifier <em>Parameter Qualifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterQualifier
     * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLPackageImpl#getParameterQualifier()
     * @generated
     */
    EEnum PARAMETER_QUALIFIER = eINSTANCE.getParameterQualifier();

  }

} //FractalIDLPackage
