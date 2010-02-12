/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIDL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ow2.fractal.mind.idl.fractalIDL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage
 * @generated
 */
public class FractalIDLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FractalIDLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalIDLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FractalIDLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FractalIDLSwitch<Adapter> modelSwitch =
    new FractalIDLSwitch<Adapter>()
    {
      @Override
      public Adapter caseItfFile(ItfFile object)
      {
        return createItfFileAdapter();
      }
      @Override
      public Adapter caseTypeDefinition(TypeDefinition object)
      {
        return createTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseTypedefSpecification(TypedefSpecification object)
      {
        return createTypedefSpecificationAdapter();
      }
      @Override
      public Adapter caseQualifiedTypeSpecification(QualifiedTypeSpecification object)
      {
        return createQualifiedTypeSpecificationAdapter();
      }
      @Override
      public Adapter caseTypeSpecification(TypeSpecification object)
      {
        return createTypeSpecificationAdapter();
      }
      @Override
      public Adapter caseStructOrUnionSpecification(StructOrUnionSpecification object)
      {
        return createStructOrUnionSpecificationAdapter();
      }
      @Override
      public Adapter caseStructOrUnionDefinition(StructOrUnionDefinition object)
      {
        return createStructOrUnionDefinitionAdapter();
      }
      @Override
      public Adapter caseStructorUnionReference(StructorUnionReference object)
      {
        return createStructorUnionReferenceAdapter();
      }
      @Override
      public Adapter caseStructMember(StructMember object)
      {
        return createStructMemberAdapter();
      }
      @Override
      public Adapter caseEnumSpecification(EnumSpecification object)
      {
        return createEnumSpecificationAdapter();
      }
      @Override
      public Adapter caseEnumDefinition(EnumDefinition object)
      {
        return createEnumDefinitionAdapter();
      }
      @Override
      public Adapter caseEnumReference(EnumReference object)
      {
        return createEnumReferenceAdapter();
      }
      @Override
      public Adapter caseEnumMemberList(EnumMemberList object)
      {
        return createEnumMemberListAdapter();
      }
      @Override
      public Adapter caseEnumMember(EnumMember object)
      {
        return createEnumMemberAdapter();
      }
      @Override
      public Adapter caseDeclarators(Declarators object)
      {
        return createDeclaratorsAdapter();
      }
      @Override
      public Adapter caseDeclarator(Declarator object)
      {
        return createDeclaratorAdapter();
      }
      @Override
      public Adapter caseDirectDeclarator(DirectDeclarator object)
      {
        return createDirectDeclaratorAdapter();
      }
      @Override
      public Adapter caseIdentifier(Identifier object)
      {
        return createIdentifierAdapter();
      }
      @Override
      public Adapter caseConstantDefinition(ConstantDefinition object)
      {
        return createConstantDefinitionAdapter();
      }
      @Override
      public Adapter caseInterfaceDefinition(InterfaceDefinition object)
      {
        return createInterfaceDefinitionAdapter();
      }
      @Override
      public Adapter caseMethodDefinition(MethodDefinition object)
      {
        return createMethodDefinitionAdapter();
      }
      @Override
      public Adapter caseParameterList(ParameterList object)
      {
        return createParameterListAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseIncludeDirective(IncludeDirective object)
      {
        return createIncludeDirectiveAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.ItfFile <em>Itf File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ItfFile
   * @generated
   */
  public Adapter createItfFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypeDefinition
   * @generated
   */
  public Adapter createTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.TypedefSpecification <em>Typedef Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypedefSpecification
   * @generated
   */
  public Adapter createTypedefSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.QualifiedTypeSpecification <em>Qualified Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.QualifiedTypeSpecification
   * @generated
   */
  public Adapter createQualifiedTypeSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.TypeSpecification <em>Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypeSpecification
   * @generated
   */
  public Adapter createTypeSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionSpecification <em>Struct Or Union Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionSpecification
   * @generated
   */
  public Adapter createStructOrUnionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionDefinition <em>Struct Or Union Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionDefinition
   * @generated
   */
  public Adapter createStructOrUnionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.StructorUnionReference <em>Structor Union Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.StructorUnionReference
   * @generated
   */
  public Adapter createStructorUnionReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.StructMember <em>Struct Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.StructMember
   * @generated
   */
  public Adapter createStructMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumSpecification <em>Enum Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumSpecification
   * @generated
   */
  public Adapter createEnumSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumDefinition <em>Enum Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumDefinition
   * @generated
   */
  public Adapter createEnumDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumReference <em>Enum Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumReference
   * @generated
   */
  public Adapter createEnumReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumMemberList <em>Enum Member List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumMemberList
   * @generated
   */
  public Adapter createEnumMemberListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumMember <em>Enum Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumMember
   * @generated
   */
  public Adapter createEnumMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.Declarators <em>Declarators</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Declarators
   * @generated
   */
  public Adapter createDeclaratorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.Declarator <em>Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Declarator
   * @generated
   */
  public Adapter createDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.DirectDeclarator <em>Direct Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.DirectDeclarator
   * @generated
   */
  public Adapter createDirectDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.Identifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Identifier
   * @generated
   */
  public Adapter createIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.ConstantDefinition <em>Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ConstantDefinition
   * @generated
   */
  public Adapter createConstantDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.InterfaceDefinition <em>Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.InterfaceDefinition
   * @generated
   */
  public Adapter createInterfaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition <em>Method Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition
   * @generated
   */
  public Adapter createMethodDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ParameterList
   * @generated
   */
  public Adapter createParameterListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective <em>Include Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective
   * @generated
   */
  public Adapter createIncludeDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FractalIDLAdapterFactory
