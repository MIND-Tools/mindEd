/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIDL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ow2.fractal.mind.idl.fractalIDL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FractalIDLFactoryImpl extends EFactoryImpl implements FractalIDLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FractalIDLFactory init()
  {
    try
    {
      FractalIDLFactory theFractalIDLFactory = (FractalIDLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ow2.org/fractal/mind/idl/FractalItf"); 
      if (theFractalIDLFactory != null)
      {
        return theFractalIDLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FractalIDLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalIDLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FractalIDLPackage.ITF_FILE: return createItfFile();
      case FractalIDLPackage.TYPE_DEFINITION: return createTypeDefinition();
      case FractalIDLPackage.TYPEDEF_SPECIFICATION: return createTypedefSpecification();
      case FractalIDLPackage.QUALIFIED_TYPE_SPECIFICATION: return createQualifiedTypeSpecification();
      case FractalIDLPackage.TYPE_SPECIFICATION: return createTypeSpecification();
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION: return createStructOrUnionSpecification();
      case FractalIDLPackage.STRUCT_OR_UNION_DEFINITION: return createStructOrUnionDefinition();
      case FractalIDLPackage.STRUCTOR_UNION_REFERENCE: return createStructorUnionReference();
      case FractalIDLPackage.STRUCT_MEMBER: return createStructMember();
      case FractalIDLPackage.ENUM_SPECIFICATION: return createEnumSpecification();
      case FractalIDLPackage.ENUM_DEFINITION: return createEnumDefinition();
      case FractalIDLPackage.ENUM_REFERENCE: return createEnumReference();
      case FractalIDLPackage.ENUM_MEMBER_LIST: return createEnumMemberList();
      case FractalIDLPackage.ENUM_MEMBER: return createEnumMember();
      case FractalIDLPackage.DECLARATORS: return createDeclarators();
      case FractalIDLPackage.DECLARATOR: return createDeclarator();
      case FractalIDLPackage.DIRECT_DECLARATOR: return createDirectDeclarator();
      case FractalIDLPackage.CONSTANT_DEFINITION: return createConstantDefinition();
      case FractalIDLPackage.INTERFACE_DEFINITION: return createInterfaceDefinition();
      case FractalIDLPackage.METHOD_DEFINITION: return createMethodDefinition();
      case FractalIDLPackage.PARAMETER_LIST: return createParameterList();
      case FractalIDLPackage.PARAMETER: return createParameter();
      case FractalIDLPackage.INCLUDE_DIRECTIVE: return createIncludeDirective();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FractalIDLPackage.TYPE_QUALIFIER:
        return createTypeQualifierFromString(eDataType, initialValue);
      case FractalIDLPackage.TYPE_SPECIFIER:
        return createTypeSpecifierFromString(eDataType, initialValue);
      case FractalIDLPackage.PARAMETER_QUALIFIER:
        return createParameterQualifierFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FractalIDLPackage.TYPE_QUALIFIER:
        return convertTypeQualifierToString(eDataType, instanceValue);
      case FractalIDLPackage.TYPE_SPECIFIER:
        return convertTypeSpecifierToString(eDataType, instanceValue);
      case FractalIDLPackage.PARAMETER_QUALIFIER:
        return convertParameterQualifierToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItfFile createItfFile()
  {
    ItfFileImpl itfFile = new ItfFileImpl();
    return itfFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition createTypeDefinition()
  {
    TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefSpecification createTypedefSpecification()
  {
    TypedefSpecificationImpl typedefSpecification = new TypedefSpecificationImpl();
    return typedefSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedTypeSpecification createQualifiedTypeSpecification()
  {
    QualifiedTypeSpecificationImpl qualifiedTypeSpecification = new QualifiedTypeSpecificationImpl();
    return qualifiedTypeSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpecification createTypeSpecification()
  {
    TypeSpecificationImpl typeSpecification = new TypeSpecificationImpl();
    return typeSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructOrUnionSpecification createStructOrUnionSpecification()
  {
    StructOrUnionSpecificationImpl structOrUnionSpecification = new StructOrUnionSpecificationImpl();
    return structOrUnionSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructOrUnionDefinition createStructOrUnionDefinition()
  {
    StructOrUnionDefinitionImpl structOrUnionDefinition = new StructOrUnionDefinitionImpl();
    return structOrUnionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructorUnionReference createStructorUnionReference()
  {
    StructorUnionReferenceImpl structorUnionReference = new StructorUnionReferenceImpl();
    return structorUnionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructMember createStructMember()
  {
    StructMemberImpl structMember = new StructMemberImpl();
    return structMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumSpecification createEnumSpecification()
  {
    EnumSpecificationImpl enumSpecification = new EnumSpecificationImpl();
    return enumSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDefinition createEnumDefinition()
  {
    EnumDefinitionImpl enumDefinition = new EnumDefinitionImpl();
    return enumDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumReference createEnumReference()
  {
    EnumReferenceImpl enumReference = new EnumReferenceImpl();
    return enumReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumMemberList createEnumMemberList()
  {
    EnumMemberListImpl enumMemberList = new EnumMemberListImpl();
    return enumMemberList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumMember createEnumMember()
  {
    EnumMemberImpl enumMember = new EnumMemberImpl();
    return enumMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarators createDeclarators()
  {
    DeclaratorsImpl declarators = new DeclaratorsImpl();
    return declarators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarator createDeclarator()
  {
    DeclaratorImpl declarator = new DeclaratorImpl();
    return declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectDeclarator createDirectDeclarator()
  {
    DirectDeclaratorImpl directDeclarator = new DirectDeclaratorImpl();
    return directDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinition createConstantDefinition()
  {
    ConstantDefinitionImpl constantDefinition = new ConstantDefinitionImpl();
    return constantDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDefinition createInterfaceDefinition()
  {
    InterfaceDefinitionImpl interfaceDefinition = new InterfaceDefinitionImpl();
    return interfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDefinition createMethodDefinition()
  {
    MethodDefinitionImpl methodDefinition = new MethodDefinitionImpl();
    return methodDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList createParameterList()
  {
    ParameterListImpl parameterList = new ParameterListImpl();
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeDirective createIncludeDirective()
  {
    IncludeDirectiveImpl includeDirective = new IncludeDirectiveImpl();
    return includeDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeQualifier createTypeQualifierFromString(EDataType eDataType, String initialValue)
  {
    TypeQualifier result = TypeQualifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeQualifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpecifier createTypeSpecifierFromString(EDataType eDataType, String initialValue)
  {
    TypeSpecifier result = TypeSpecifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeSpecifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterQualifier createParameterQualifierFromString(EDataType eDataType, String initialValue)
  {
    ParameterQualifier result = ParameterQualifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertParameterQualifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalIDLPackage getFractalIDLPackage()
  {
    return (FractalIDLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FractalIDLPackage getPackage()
  {
    return FractalIDLPackage.eINSTANCE;
  }

} //FractalIDLFactoryImpl
