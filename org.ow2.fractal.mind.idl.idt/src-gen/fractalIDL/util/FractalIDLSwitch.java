/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL.util;

import fractalIDL.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fractalIDL.FractalIDLPackage
 * @generated
 */
public class FractalIDLSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FractalIDLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalIDLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FractalIDLPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FractalIDLPackage.ITF_FILE:
      {
        ItfFile itfFile = (ItfFile)theEObject;
        T result = caseItfFile(itfFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.TYPEDEF_SPECIFICATION:
      {
        TypedefSpecification typedefSpecification = (TypedefSpecification)theEObject;
        T result = caseTypedefSpecification(typedefSpecification);
        if (result == null) result = caseTypeDefinition(typedefSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.QUALIFIED_TYPE_SPECIFICATION:
      {
        QualifiedTypeSpecification qualifiedTypeSpecification = (QualifiedTypeSpecification)theEObject;
        T result = caseQualifiedTypeSpecification(qualifiedTypeSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.TYPE_SPECIFICATION:
      {
        TypeSpecification typeSpecification = (TypeSpecification)theEObject;
        T result = caseTypeSpecification(typeSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION:
      {
        StructOrUnionSpecification structOrUnionSpecification = (StructOrUnionSpecification)theEObject;
        T result = caseStructOrUnionSpecification(structOrUnionSpecification);
        if (result == null) result = caseTypeDefinition(structOrUnionSpecification);
        if (result == null) result = caseTypeSpecification(structOrUnionSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.STRUCT_OR_UNION_DEFINITION:
      {
        StructOrUnionDefinition structOrUnionDefinition = (StructOrUnionDefinition)theEObject;
        T result = caseStructOrUnionDefinition(structOrUnionDefinition);
        if (result == null) result = caseStructOrUnionSpecification(structOrUnionDefinition);
        if (result == null) result = caseTypeDefinition(structOrUnionDefinition);
        if (result == null) result = caseTypeSpecification(structOrUnionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.STRUCTOR_UNION_REFERENCE:
      {
        StructorUnionReference structorUnionReference = (StructorUnionReference)theEObject;
        T result = caseStructorUnionReference(structorUnionReference);
        if (result == null) result = caseStructOrUnionSpecification(structorUnionReference);
        if (result == null) result = caseTypeDefinition(structorUnionReference);
        if (result == null) result = caseTypeSpecification(structorUnionReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.STRUCT_MEMBER:
      {
        StructMember structMember = (StructMember)theEObject;
        T result = caseStructMember(structMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.ENUM_SPECIFICATION:
      {
        EnumSpecification enumSpecification = (EnumSpecification)theEObject;
        T result = caseEnumSpecification(enumSpecification);
        if (result == null) result = caseTypeDefinition(enumSpecification);
        if (result == null) result = caseTypeSpecification(enumSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.ENUM_DEFINITION:
      {
        EnumDefinition enumDefinition = (EnumDefinition)theEObject;
        T result = caseEnumDefinition(enumDefinition);
        if (result == null) result = caseEnumSpecification(enumDefinition);
        if (result == null) result = caseTypeDefinition(enumDefinition);
        if (result == null) result = caseTypeSpecification(enumDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.ENUM_REFERENCE:
      {
        EnumReference enumReference = (EnumReference)theEObject;
        T result = caseEnumReference(enumReference);
        if (result == null) result = caseEnumSpecification(enumReference);
        if (result == null) result = caseTypeDefinition(enumReference);
        if (result == null) result = caseTypeSpecification(enumReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.ENUM_MEMBER_LIST:
      {
        EnumMemberList enumMemberList = (EnumMemberList)theEObject;
        T result = caseEnumMemberList(enumMemberList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.ENUM_MEMBER:
      {
        EnumMember enumMember = (EnumMember)theEObject;
        T result = caseEnumMember(enumMember);
        if (result == null) result = caseEnumMemberList(enumMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.DECLARATORS:
      {
        Declarators declarators = (Declarators)theEObject;
        T result = caseDeclarators(declarators);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.DECLARATOR:
      {
        Declarator declarator = (Declarator)theEObject;
        T result = caseDeclarator(declarator);
        if (result == null) result = caseDirectDeclarator(declarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.DIRECT_DECLARATOR:
      {
        DirectDeclarator directDeclarator = (DirectDeclarator)theEObject;
        T result = caseDirectDeclarator(directDeclarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.IDENTIFIER:
      {
        Identifier identifier = (Identifier)theEObject;
        T result = caseIdentifier(identifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.CONSTANT_DEFINITION:
      {
        ConstantDefinition constantDefinition = (ConstantDefinition)theEObject;
        T result = caseConstantDefinition(constantDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.INTERFACE_DEFINITION:
      {
        InterfaceDefinition interfaceDefinition = (InterfaceDefinition)theEObject;
        T result = caseInterfaceDefinition(interfaceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.METHOD_DEFINITION:
      {
        MethodDefinition methodDefinition = (MethodDefinition)theEObject;
        T result = caseMethodDefinition(methodDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.PARAMETER_LIST:
      {
        ParameterList parameterList = (ParameterList)theEObject;
        T result = caseParameterList(parameterList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalIDLPackage.INCLUDE_DIRECTIVE:
      {
        IncludeDirective includeDirective = (IncludeDirective)theEObject;
        T result = caseIncludeDirective(includeDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Itf File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Itf File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItfFile(ItfFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDefinition(TypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typedef Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typedef Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedefSpecification(TypedefSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Type Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Type Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedTypeSpecification(QualifiedTypeSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeSpecification(TypeSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Or Union Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Or Union Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructOrUnionSpecification(StructOrUnionSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Or Union Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Or Union Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructOrUnionDefinition(StructOrUnionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structor Union Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structor Union Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructorUnionReference(StructorUnionReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructMember(StructMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumSpecification(EnumSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumDefinition(EnumDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumReference(EnumReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Member List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Member List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumMemberList(EnumMemberList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumMember(EnumMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarators</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarators</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarators(Declarators object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarator(Declarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectDeclarator(DirectDeclarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentifier(Identifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantDefinition(ConstantDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceDefinition(InterfaceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodDefinition(MethodDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterList(ParameterList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncludeDirective(IncludeDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FractalIDLSwitch
