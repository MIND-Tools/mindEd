/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Or Union Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructOrUnionSpecificationImpl#getTypeDefName <em>Type Def Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructOrUnionSpecificationImpl#getTypeSpecifier <em>Type Specifier</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructOrUnionSpecificationImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.StructOrUnionSpecificationImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructOrUnionSpecificationImpl extends TypeDefinitionImpl implements StructOrUnionSpecification
{
  /**
   * The default value of the '{@link #getTypeDefName() <em>Type Def Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefName()
   * @generated
   * @ordered
   */
  protected static final String TYPE_DEF_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypeDefName() <em>Type Def Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefName()
   * @generated
   * @ordered
   */
  protected String typeDefName = TYPE_DEF_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeSpecifier() <em>Type Specifier</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSpecifier()
   * @generated
   * @ordered
   */
  protected EList<TypeSpecifier> typeSpecifier;

  /**
   * The default value of the '{@link #getStruct() <em>Struct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct()
   * @generated
   * @ordered
   */
  protected static final String STRUCT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStruct() <em>Struct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct()
   * @generated
   * @ordered
   */
  protected String struct = STRUCT_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructOrUnionSpecificationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FractalIDLPackage.Literals.STRUCT_OR_UNION_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypeDefName()
  {
    return typeDefName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeDefName(String newTypeDefName)
  {
    String oldTypeDefName = typeDefName;
    typeDefName = newTypeDefName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_DEF_NAME, oldTypeDefName, typeDefName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeSpecifier> getTypeSpecifier()
  {
    if (typeSpecifier == null)
    {
      typeSpecifier = new EDataTypeEList<TypeSpecifier>(TypeSpecifier.class, this, FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_SPECIFIER);
    }
    return typeSpecifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStruct()
  {
    return struct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct(String newStruct)
  {
    String oldStruct = struct;
    struct = newStruct;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__STRUCT, oldStruct, struct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_DEF_NAME:
        return getTypeDefName();
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_SPECIFIER:
        return getTypeSpecifier();
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__STRUCT:
        return getStruct();
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__ID:
        return getId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_DEF_NAME:
        setTypeDefName((String)newValue);
        return;
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_SPECIFIER:
        getTypeSpecifier().clear();
        getTypeSpecifier().addAll((Collection<? extends TypeSpecifier>)newValue);
        return;
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__STRUCT:
        setStruct((String)newValue);
        return;
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__ID:
        setId((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_DEF_NAME:
        setTypeDefName(TYPE_DEF_NAME_EDEFAULT);
        return;
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_SPECIFIER:
        getTypeSpecifier().clear();
        return;
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__STRUCT:
        setStruct(STRUCT_EDEFAULT);
        return;
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__ID:
        setId(ID_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_DEF_NAME:
        return TYPE_DEF_NAME_EDEFAULT == null ? typeDefName != null : !TYPE_DEF_NAME_EDEFAULT.equals(typeDefName);
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_SPECIFIER:
        return typeSpecifier != null && !typeSpecifier.isEmpty();
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__STRUCT:
        return STRUCT_EDEFAULT == null ? struct != null : !STRUCT_EDEFAULT.equals(struct);
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == TypeSpecification.class)
    {
      switch (derivedFeatureID)
      {
        case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_DEF_NAME: return FractalIDLPackage.TYPE_SPECIFICATION__TYPE_DEF_NAME;
        case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_SPECIFIER: return FractalIDLPackage.TYPE_SPECIFICATION__TYPE_SPECIFIER;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == TypeSpecification.class)
    {
      switch (baseFeatureID)
      {
        case FractalIDLPackage.TYPE_SPECIFICATION__TYPE_DEF_NAME: return FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_DEF_NAME;
        case FractalIDLPackage.TYPE_SPECIFICATION__TYPE_SPECIFIER: return FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION__TYPE_SPECIFIER;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (typeDefName: ");
    result.append(typeDefName);
    result.append(", typeSpecifier: ");
    result.append(typeSpecifier);
    result.append(", struct: ");
    result.append(struct);
    result.append(", id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //StructOrUnionSpecificationImpl
