/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ow2.mindEd.ide.model.MindLibrary;
import org.ow2.mindEd.ide.model.MindidePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mind Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindLibraryImpl#getTargetFilter <em>Target Filter</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.impl.MindLibraryImpl#getFullpathLib <em>Fullpath Lib</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MindLibraryImpl extends MindRootSrcImpl implements MindLibrary {
	/**
	 * The default value of the '{@link #getTargetFilter() <em>Target Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFilter() <em>Target Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFilter()
	 * @generated
	 * @ordered
	 */
	protected String targetFilter = TARGET_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullpathLib() <em>Fullpath Lib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullpathLib()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLPATH_LIB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullpathLib() <em>Fullpath Lib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullpathLib()
	 * @generated
	 * @ordered
	 */
	protected String fullpathLib = FULLPATH_LIB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MindidePackage.Literals.MIND_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetFilter() {
		return targetFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFilter(String newTargetFilter) {
		String oldTargetFilter = targetFilter;
		targetFilter = newTargetFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_LIBRARY__TARGET_FILTER, oldTargetFilter, targetFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullpathLib() {
		return fullpathLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullpathLib(String newFullpathLib) {
		String oldFullpathLib = fullpathLib;
		fullpathLib = newFullpathLib;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindidePackage.MIND_LIBRARY__FULLPATH_LIB, oldFullpathLib, fullpathLib));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MindidePackage.MIND_LIBRARY__TARGET_FILTER:
				return getTargetFilter();
			case MindidePackage.MIND_LIBRARY__FULLPATH_LIB:
				return getFullpathLib();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MindidePackage.MIND_LIBRARY__TARGET_FILTER:
				setTargetFilter((String)newValue);
				return;
			case MindidePackage.MIND_LIBRARY__FULLPATH_LIB:
				setFullpathLib((String)newValue);
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
			case MindidePackage.MIND_LIBRARY__TARGET_FILTER:
				setTargetFilter(TARGET_FILTER_EDEFAULT);
				return;
			case MindidePackage.MIND_LIBRARY__FULLPATH_LIB:
				setFullpathLib(FULLPATH_LIB_EDEFAULT);
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
			case MindidePackage.MIND_LIBRARY__TARGET_FILTER:
				return TARGET_FILTER_EDEFAULT == null ? targetFilter != null : !TARGET_FILTER_EDEFAULT.equals(targetFilter);
			case MindidePackage.MIND_LIBRARY__FULLPATH_LIB:
				return FULLPATH_LIB_EDEFAULT == null ? fullpathLib != null : !FULLPATH_LIB_EDEFAULT.equals(fullpathLib);
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
		result.append(" (targetFilter: ");
		result.append(targetFilter);
		result.append(", fullpathLib: ");
		result.append(fullpathLib);
		result.append(')');
		return result.toString();
	}

} //MindLibraryImpl
