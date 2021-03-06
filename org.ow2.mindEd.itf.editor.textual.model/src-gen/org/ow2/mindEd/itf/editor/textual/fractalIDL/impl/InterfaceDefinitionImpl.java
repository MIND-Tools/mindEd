/**
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationsList;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.InterfaceDefinitionImpl#getAnnotationsList <em>Annotations List</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.InterfaceDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.InterfaceDefinitionImpl#getFqn2 <em>Fqn2</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.InterfaceDefinitionImpl#getMethodDef <em>Method Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceDefinitionImpl extends MinimalEObjectImpl.Container implements InterfaceDefinition
{
  /**
   * The cached value of the '{@link #getAnnotationsList() <em>Annotations List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationsList()
   * @generated
   * @ordered
   */
  protected AnnotationsList annotationsList;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFqn2() <em>Fqn2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFqn2()
   * @generated
   * @ordered
   */
  protected InterfaceDefinition fqn2;

  /**
   * The cached value of the '{@link #getMethodDef() <em>Method Def</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodDef()
   * @generated
   * @ordered
   */
  protected EList<MethodDefinition> methodDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceDefinitionImpl()
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
    return FractalIDLPackage.Literals.INTERFACE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationsList getAnnotationsList()
  {
    return annotationsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotationsList(AnnotationsList newAnnotationsList, NotificationChain msgs)
  {
    AnnotationsList oldAnnotationsList = annotationsList;
    annotationsList = newAnnotationsList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS_LIST, oldAnnotationsList, newAnnotationsList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationsList(AnnotationsList newAnnotationsList)
  {
    if (newAnnotationsList != annotationsList)
    {
      NotificationChain msgs = null;
      if (annotationsList != null)
        msgs = ((InternalEObject)annotationsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS_LIST, null, msgs);
      if (newAnnotationsList != null)
        msgs = ((InternalEObject)newAnnotationsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS_LIST, null, msgs);
      msgs = basicSetAnnotationsList(newAnnotationsList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS_LIST, newAnnotationsList, newAnnotationsList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.INTERFACE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDefinition getFqn2()
  {
    if (fqn2 != null && fqn2.eIsProxy())
    {
      InternalEObject oldFqn2 = (InternalEObject)fqn2;
      fqn2 = (InterfaceDefinition)eResolveProxy(oldFqn2);
      if (fqn2 != oldFqn2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FractalIDLPackage.INTERFACE_DEFINITION__FQN2, oldFqn2, fqn2));
      }
    }
    return fqn2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDefinition basicGetFqn2()
  {
    return fqn2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFqn2(InterfaceDefinition newFqn2)
  {
    InterfaceDefinition oldFqn2 = fqn2;
    fqn2 = newFqn2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.INTERFACE_DEFINITION__FQN2, oldFqn2, fqn2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MethodDefinition> getMethodDef()
  {
    if (methodDef == null)
    {
      methodDef = new EObjectContainmentEList<MethodDefinition>(MethodDefinition.class, this, FractalIDLPackage.INTERFACE_DEFINITION__METHOD_DEF);
    }
    return methodDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS_LIST:
        return basicSetAnnotationsList(null, msgs);
      case FractalIDLPackage.INTERFACE_DEFINITION__METHOD_DEF:
        return ((InternalEList<?>)getMethodDef()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS_LIST:
        return getAnnotationsList();
      case FractalIDLPackage.INTERFACE_DEFINITION__NAME:
        return getName();
      case FractalIDLPackage.INTERFACE_DEFINITION__FQN2:
        if (resolve) return getFqn2();
        return basicGetFqn2();
      case FractalIDLPackage.INTERFACE_DEFINITION__METHOD_DEF:
        return getMethodDef();
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
      case FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS_LIST:
        setAnnotationsList((AnnotationsList)newValue);
        return;
      case FractalIDLPackage.INTERFACE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case FractalIDLPackage.INTERFACE_DEFINITION__FQN2:
        setFqn2((InterfaceDefinition)newValue);
        return;
      case FractalIDLPackage.INTERFACE_DEFINITION__METHOD_DEF:
        getMethodDef().clear();
        getMethodDef().addAll((Collection<? extends MethodDefinition>)newValue);
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
      case FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS_LIST:
        setAnnotationsList((AnnotationsList)null);
        return;
      case FractalIDLPackage.INTERFACE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FractalIDLPackage.INTERFACE_DEFINITION__FQN2:
        setFqn2((InterfaceDefinition)null);
        return;
      case FractalIDLPackage.INTERFACE_DEFINITION__METHOD_DEF:
        getMethodDef().clear();
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
      case FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS_LIST:
        return annotationsList != null;
      case FractalIDLPackage.INTERFACE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FractalIDLPackage.INTERFACE_DEFINITION__FQN2:
        return fqn2 != null;
      case FractalIDLPackage.INTERFACE_DEFINITION__METHOD_DEF:
        return methodDef != null && !methodDef.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //InterfaceDefinitionImpl
