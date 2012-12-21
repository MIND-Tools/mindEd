/**
 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ow2.mindEd.adl.textual.fractal.AttributeDefinition;
import org.ow2.mindEd.adl.textual.fractal.FileC;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.AttributeDefinitionImpl#getHeaderFile <em>Header File</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.AttributeDefinitionImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.AttributeDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.AttributeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.AttributeDefinitionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionImpl extends PrimitiveElementImpl implements AttributeDefinition
{
  /**
   * The cached value of the '{@link #getHeaderFile() <em>Header File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaderFile()
   * @generated
   * @ordered
   */
  protected FileC headerFile;

  /**
   * The default value of the '{@link #getCType() <em>CType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCType()
   * @generated
   * @ordered
   */
  protected static final String CTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCType() <em>CType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCType()
   * @generated
   * @ordered
   */
  protected String cType = CTYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Value value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeDefinitionImpl()
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
    return FractalPackage.Literals.ATTRIBUTE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileC getHeaderFile()
  {
    return headerFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeaderFile(FileC newHeaderFile, NotificationChain msgs)
  {
    FileC oldHeaderFile = headerFile;
    headerFile = newHeaderFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.ATTRIBUTE_DEFINITION__HEADER_FILE, oldHeaderFile, newHeaderFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeaderFile(FileC newHeaderFile)
  {
    if (newHeaderFile != headerFile)
    {
      NotificationChain msgs = null;
      if (headerFile != null)
        msgs = ((InternalEObject)headerFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.ATTRIBUTE_DEFINITION__HEADER_FILE, null, msgs);
      if (newHeaderFile != null)
        msgs = ((InternalEObject)newHeaderFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.ATTRIBUTE_DEFINITION__HEADER_FILE, null, msgs);
      msgs = basicSetHeaderFile(newHeaderFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.ATTRIBUTE_DEFINITION__HEADER_FILE, newHeaderFile, newHeaderFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCType()
  {
    return cType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCType(String newCType)
  {
    String oldCType = cType;
    cType = newCType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.ATTRIBUTE_DEFINITION__CTYPE, oldCType, cType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.ATTRIBUTE_DEFINITION__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.ATTRIBUTE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Value newValue, NotificationChain msgs)
  {
    Value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.ATTRIBUTE_DEFINITION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.ATTRIBUTE_DEFINITION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.ATTRIBUTE_DEFINITION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.ATTRIBUTE_DEFINITION__VALUE, newValue, newValue));
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
      case FractalPackage.ATTRIBUTE_DEFINITION__HEADER_FILE:
        return basicSetHeaderFile(null, msgs);
      case FractalPackage.ATTRIBUTE_DEFINITION__VALUE:
        return basicSetValue(null, msgs);
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
      case FractalPackage.ATTRIBUTE_DEFINITION__HEADER_FILE:
        return getHeaderFile();
      case FractalPackage.ATTRIBUTE_DEFINITION__CTYPE:
        return getCType();
      case FractalPackage.ATTRIBUTE_DEFINITION__TYPE:
        return getType();
      case FractalPackage.ATTRIBUTE_DEFINITION__NAME:
        return getName();
      case FractalPackage.ATTRIBUTE_DEFINITION__VALUE:
        return getValue();
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
      case FractalPackage.ATTRIBUTE_DEFINITION__HEADER_FILE:
        setHeaderFile((FileC)newValue);
        return;
      case FractalPackage.ATTRIBUTE_DEFINITION__CTYPE:
        setCType((String)newValue);
        return;
      case FractalPackage.ATTRIBUTE_DEFINITION__TYPE:
        setType((String)newValue);
        return;
      case FractalPackage.ATTRIBUTE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case FractalPackage.ATTRIBUTE_DEFINITION__VALUE:
        setValue((Value)newValue);
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
      case FractalPackage.ATTRIBUTE_DEFINITION__HEADER_FILE:
        setHeaderFile((FileC)null);
        return;
      case FractalPackage.ATTRIBUTE_DEFINITION__CTYPE:
        setCType(CTYPE_EDEFAULT);
        return;
      case FractalPackage.ATTRIBUTE_DEFINITION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case FractalPackage.ATTRIBUTE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FractalPackage.ATTRIBUTE_DEFINITION__VALUE:
        setValue((Value)null);
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
      case FractalPackage.ATTRIBUTE_DEFINITION__HEADER_FILE:
        return headerFile != null;
      case FractalPackage.ATTRIBUTE_DEFINITION__CTYPE:
        return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
      case FractalPackage.ATTRIBUTE_DEFINITION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case FractalPackage.ATTRIBUTE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FractalPackage.ATTRIBUTE_DEFINITION__VALUE:
        return value != null;
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
    result.append(" (cType: ");
    result.append(cType);
    result.append(", type: ");
    result.append(type);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AttributeDefinitionImpl
