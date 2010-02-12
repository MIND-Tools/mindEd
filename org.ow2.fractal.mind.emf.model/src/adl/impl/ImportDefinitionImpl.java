/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.ImportDefinition;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.ImportDefinitionImpl#getImportName <em>Import Name</em>}</li>
 *   <li>{@link adl.impl.ImportDefinitionImpl#getSegments <em>Segments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportDefinitionImpl extends MergedObjectImpl implements ImportDefinition {
	/**
	 * The default value of the '{@link #getImportName() <em>Import Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_NAME_EDEFAULT = "import_Name";

	/**
	 * The cached value of the '{@link #getImportName() <em>Import Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportName()
	 * @generated
	 * @ordered
	 */
	protected String importName = IMPORT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> segments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.IMPORT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public String getImportName() {
		String tmpName = "";
		if(segments!=null && !segments.isEmpty())
		{
			for(String tmpString : segments)
			{
				tmpName+=tmpString+".";
			}
			segments.clear();
			importName=tmpName+importName;
		}
		return importName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportName(String newImportName) {
		String oldImportName = importName;
		importName = newImportName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.IMPORT_DEFINITION__IMPORT_NAME, oldImportName, importName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public EList<String> getSegments() {
		if (segments == null) {
			segments = new BasicEList<String>();
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdlPackage.IMPORT_DEFINITION__IMPORT_NAME:
				return getImportName();
			case AdlPackage.IMPORT_DEFINITION__SEGMENTS:
				return getSegments();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdlPackage.IMPORT_DEFINITION__IMPORT_NAME:
				setImportName((String)newValue);
				return;
			case AdlPackage.IMPORT_DEFINITION__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends String>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdlPackage.IMPORT_DEFINITION__IMPORT_NAME:
				setImportName(IMPORT_NAME_EDEFAULT);
				return;
			case AdlPackage.IMPORT_DEFINITION__SEGMENTS:
				getSegments().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdlPackage.IMPORT_DEFINITION__IMPORT_NAME:
				return IMPORT_NAME_EDEFAULT == null ? importName != null : !IMPORT_NAME_EDEFAULT.equals(importName);
			case AdlPackage.IMPORT_DEFINITION__SEGMENTS:
				return segments != null && !segments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (importName: ");
		result.append(importName);
		result.append(", segments: ");
		result.append(segments);
		result.append(')');
		return result.toString();
	}

} //ImportDefinitionImpl
