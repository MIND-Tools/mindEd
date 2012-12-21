/**
 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ow2.mindEd.adl.textual.fractal.BindingDefinition;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#getSourceParent <em>Source Parent</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#isIsSrcParentThis <em>Is Src Parent This</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#getSourceInterface <em>Source Interface</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#getSourceIndex <em>Source Index</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#getTargetParent <em>Target Parent</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#isIsTgtParentThis <em>Is Tgt Parent This</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#getTargetInterface <em>Target Interface</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#getTargetIndex <em>Target Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingDefinitionImpl extends CompositeElementImpl implements BindingDefinition
{
  /**
   * The cached value of the '{@link #getSourceParent() <em>Source Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceParent()
   * @generated
   * @ordered
   */
  protected SubComponentDefinition sourceParent;

  /**
   * The default value of the '{@link #isIsSrcParentThis() <em>Is Src Parent This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSrcParentThis()
   * @generated
   * @ordered
   */
  protected static final boolean IS_SRC_PARENT_THIS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsSrcParentThis() <em>Is Src Parent This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSrcParentThis()
   * @generated
   * @ordered
   */
  protected boolean isSrcParentThis = IS_SRC_PARENT_THIS_EDEFAULT;

  /**
   * The cached value of the '{@link #getSourceInterface() <em>Source Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceInterface()
   * @generated
   * @ordered
   */
  protected HostedInterfaceDefinition sourceInterface;

  /**
   * The default value of the '{@link #getSourceIndex() <em>Source Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceIndex()
   * @generated
   * @ordered
   */
  protected static final int SOURCE_INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSourceIndex() <em>Source Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceIndex()
   * @generated
   * @ordered
   */
  protected int sourceIndex = SOURCE_INDEX_EDEFAULT;

  /**
   * The cached value of the '{@link #getTargetParent() <em>Target Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetParent()
   * @generated
   * @ordered
   */
  protected SubComponentDefinition targetParent;

  /**
   * The default value of the '{@link #isIsTgtParentThis() <em>Is Tgt Parent This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTgtParentThis()
   * @generated
   * @ordered
   */
  protected static final boolean IS_TGT_PARENT_THIS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsTgtParentThis() <em>Is Tgt Parent This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTgtParentThis()
   * @generated
   * @ordered
   */
  protected boolean isTgtParentThis = IS_TGT_PARENT_THIS_EDEFAULT;

  /**
   * The cached value of the '{@link #getTargetInterface() <em>Target Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetInterface()
   * @generated
   * @ordered
   */
  protected HostedInterfaceDefinition targetInterface;

  /**
   * The default value of the '{@link #getTargetIndex() <em>Target Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetIndex()
   * @generated
   * @ordered
   */
  protected static final int TARGET_INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTargetIndex() <em>Target Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetIndex()
   * @generated
   * @ordered
   */
  protected int targetIndex = TARGET_INDEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingDefinitionImpl()
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
    return FractalPackage.Literals.BINDING_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponentDefinition getSourceParent()
  {
    if (sourceParent != null && sourceParent.eIsProxy())
    {
      InternalEObject oldSourceParent = (InternalEObject)sourceParent;
      sourceParent = (SubComponentDefinition)eResolveProxy(oldSourceParent);
      if (sourceParent != oldSourceParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FractalPackage.BINDING_DEFINITION__SOURCE_PARENT, oldSourceParent, sourceParent));
      }
    }
    return sourceParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponentDefinition basicGetSourceParent()
  {
    return sourceParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceParent(SubComponentDefinition newSourceParent)
  {
    SubComponentDefinition oldSourceParent = sourceParent;
    sourceParent = newSourceParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__SOURCE_PARENT, oldSourceParent, sourceParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsSrcParentThis()
  {
    return isSrcParentThis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsSrcParentThis(boolean newIsSrcParentThis)
  {
    boolean oldIsSrcParentThis = isSrcParentThis;
    isSrcParentThis = newIsSrcParentThis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__IS_SRC_PARENT_THIS, oldIsSrcParentThis, isSrcParentThis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HostedInterfaceDefinition getSourceInterface()
  {
    if (sourceInterface != null && sourceInterface.eIsProxy())
    {
      InternalEObject oldSourceInterface = (InternalEObject)sourceInterface;
      sourceInterface = (HostedInterfaceDefinition)eResolveProxy(oldSourceInterface);
      if (sourceInterface != oldSourceInterface)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FractalPackage.BINDING_DEFINITION__SOURCE_INTERFACE, oldSourceInterface, sourceInterface));
      }
    }
    return sourceInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HostedInterfaceDefinition basicGetSourceInterface()
  {
    return sourceInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceInterface(HostedInterfaceDefinition newSourceInterface)
  {
    HostedInterfaceDefinition oldSourceInterface = sourceInterface;
    sourceInterface = newSourceInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__SOURCE_INTERFACE, oldSourceInterface, sourceInterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSourceIndex()
  {
    return sourceIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceIndex(int newSourceIndex)
  {
    int oldSourceIndex = sourceIndex;
    sourceIndex = newSourceIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__SOURCE_INDEX, oldSourceIndex, sourceIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponentDefinition getTargetParent()
  {
    if (targetParent != null && targetParent.eIsProxy())
    {
      InternalEObject oldTargetParent = (InternalEObject)targetParent;
      targetParent = (SubComponentDefinition)eResolveProxy(oldTargetParent);
      if (targetParent != oldTargetParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FractalPackage.BINDING_DEFINITION__TARGET_PARENT, oldTargetParent, targetParent));
      }
    }
    return targetParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponentDefinition basicGetTargetParent()
  {
    return targetParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetParent(SubComponentDefinition newTargetParent)
  {
    SubComponentDefinition oldTargetParent = targetParent;
    targetParent = newTargetParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__TARGET_PARENT, oldTargetParent, targetParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsTgtParentThis()
  {
    return isTgtParentThis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsTgtParentThis(boolean newIsTgtParentThis)
  {
    boolean oldIsTgtParentThis = isTgtParentThis;
    isTgtParentThis = newIsTgtParentThis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__IS_TGT_PARENT_THIS, oldIsTgtParentThis, isTgtParentThis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HostedInterfaceDefinition getTargetInterface()
  {
    if (targetInterface != null && targetInterface.eIsProxy())
    {
      InternalEObject oldTargetInterface = (InternalEObject)targetInterface;
      targetInterface = (HostedInterfaceDefinition)eResolveProxy(oldTargetInterface);
      if (targetInterface != oldTargetInterface)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FractalPackage.BINDING_DEFINITION__TARGET_INTERFACE, oldTargetInterface, targetInterface));
      }
    }
    return targetInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HostedInterfaceDefinition basicGetTargetInterface()
  {
    return targetInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetInterface(HostedInterfaceDefinition newTargetInterface)
  {
    HostedInterfaceDefinition oldTargetInterface = targetInterface;
    targetInterface = newTargetInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__TARGET_INTERFACE, oldTargetInterface, targetInterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTargetIndex()
  {
    return targetIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetIndex(int newTargetIndex)
  {
    int oldTargetIndex = targetIndex;
    targetIndex = newTargetIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__TARGET_INDEX, oldTargetIndex, targetIndex));
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
      case FractalPackage.BINDING_DEFINITION__SOURCE_PARENT:
        if (resolve) return getSourceParent();
        return basicGetSourceParent();
      case FractalPackage.BINDING_DEFINITION__IS_SRC_PARENT_THIS:
        return isIsSrcParentThis();
      case FractalPackage.BINDING_DEFINITION__SOURCE_INTERFACE:
        if (resolve) return getSourceInterface();
        return basicGetSourceInterface();
      case FractalPackage.BINDING_DEFINITION__SOURCE_INDEX:
        return getSourceIndex();
      case FractalPackage.BINDING_DEFINITION__TARGET_PARENT:
        if (resolve) return getTargetParent();
        return basicGetTargetParent();
      case FractalPackage.BINDING_DEFINITION__IS_TGT_PARENT_THIS:
        return isIsTgtParentThis();
      case FractalPackage.BINDING_DEFINITION__TARGET_INTERFACE:
        if (resolve) return getTargetInterface();
        return basicGetTargetInterface();
      case FractalPackage.BINDING_DEFINITION__TARGET_INDEX:
        return getTargetIndex();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FractalPackage.BINDING_DEFINITION__SOURCE_PARENT:
        setSourceParent((SubComponentDefinition)newValue);
        return;
      case FractalPackage.BINDING_DEFINITION__IS_SRC_PARENT_THIS:
        setIsSrcParentThis((Boolean)newValue);
        return;
      case FractalPackage.BINDING_DEFINITION__SOURCE_INTERFACE:
        setSourceInterface((HostedInterfaceDefinition)newValue);
        return;
      case FractalPackage.BINDING_DEFINITION__SOURCE_INDEX:
        setSourceIndex((Integer)newValue);
        return;
      case FractalPackage.BINDING_DEFINITION__TARGET_PARENT:
        setTargetParent((SubComponentDefinition)newValue);
        return;
      case FractalPackage.BINDING_DEFINITION__IS_TGT_PARENT_THIS:
        setIsTgtParentThis((Boolean)newValue);
        return;
      case FractalPackage.BINDING_DEFINITION__TARGET_INTERFACE:
        setTargetInterface((HostedInterfaceDefinition)newValue);
        return;
      case FractalPackage.BINDING_DEFINITION__TARGET_INDEX:
        setTargetIndex((Integer)newValue);
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
      case FractalPackage.BINDING_DEFINITION__SOURCE_PARENT:
        setSourceParent((SubComponentDefinition)null);
        return;
      case FractalPackage.BINDING_DEFINITION__IS_SRC_PARENT_THIS:
        setIsSrcParentThis(IS_SRC_PARENT_THIS_EDEFAULT);
        return;
      case FractalPackage.BINDING_DEFINITION__SOURCE_INTERFACE:
        setSourceInterface((HostedInterfaceDefinition)null);
        return;
      case FractalPackage.BINDING_DEFINITION__SOURCE_INDEX:
        setSourceIndex(SOURCE_INDEX_EDEFAULT);
        return;
      case FractalPackage.BINDING_DEFINITION__TARGET_PARENT:
        setTargetParent((SubComponentDefinition)null);
        return;
      case FractalPackage.BINDING_DEFINITION__IS_TGT_PARENT_THIS:
        setIsTgtParentThis(IS_TGT_PARENT_THIS_EDEFAULT);
        return;
      case FractalPackage.BINDING_DEFINITION__TARGET_INTERFACE:
        setTargetInterface((HostedInterfaceDefinition)null);
        return;
      case FractalPackage.BINDING_DEFINITION__TARGET_INDEX:
        setTargetIndex(TARGET_INDEX_EDEFAULT);
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
      case FractalPackage.BINDING_DEFINITION__SOURCE_PARENT:
        return sourceParent != null;
      case FractalPackage.BINDING_DEFINITION__IS_SRC_PARENT_THIS:
        return isSrcParentThis != IS_SRC_PARENT_THIS_EDEFAULT;
      case FractalPackage.BINDING_DEFINITION__SOURCE_INTERFACE:
        return sourceInterface != null;
      case FractalPackage.BINDING_DEFINITION__SOURCE_INDEX:
        return sourceIndex != SOURCE_INDEX_EDEFAULT;
      case FractalPackage.BINDING_DEFINITION__TARGET_PARENT:
        return targetParent != null;
      case FractalPackage.BINDING_DEFINITION__IS_TGT_PARENT_THIS:
        return isTgtParentThis != IS_TGT_PARENT_THIS_EDEFAULT;
      case FractalPackage.BINDING_DEFINITION__TARGET_INTERFACE:
        return targetInterface != null;
      case FractalPackage.BINDING_DEFINITION__TARGET_INDEX:
        return targetIndex != TARGET_INDEX_EDEFAULT;
    }
    return super.eIsSet(featureID);
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
    result.append(" (isSrcParentThis: ");
    result.append(isSrcParentThis);
    result.append(", sourceIndex: ");
    result.append(sourceIndex);
    result.append(", isTgtParentThis: ");
    result.append(isTgtParentThis);
    result.append(", targetIndex: ");
    result.append(targetIndex);
    result.append(')');
    return result.toString();
  }

} //BindingDefinitionImpl
