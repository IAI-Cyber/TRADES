/**
 * Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     ELTA Ltd - initial API and implementation
 * 
 */
package dsm.TRADES.impl;

import dsm.TRADES.ComponentType;
import dsm.TRADES.Control;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Vulnerability;
import dsm.TRADES.VulnerableAsset;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vulnerable Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.VulnerableAssetImpl#getVulnerability <em>Vulnerability</em>}</li>
 *   <li>{@link dsm.TRADES.impl.VulnerableAssetImpl#getComponentTypeAffected <em>Component Type Affected</em>}</li>
 *   <li>{@link dsm.TRADES.impl.VulnerableAssetImpl#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VulnerableAssetImpl extends AssetImpl implements VulnerableAsset {
	/**
	 * The cached value of the '{@link #getVulnerability() <em>Vulnerability</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerability()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> vulnerability;

	/**
	 * The cached value of the '{@link #getComponentTypeAffected() <em>Component Type Affected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTypeAffected()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> componentTypeAffected;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VulnerableAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.VULNERABLE_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vulnerability> getVulnerability() {
		if (vulnerability == null) {
			vulnerability = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this,
					TRADESPackage.VULNERABLE_ASSET__VULNERABILITY);
		}
		return vulnerability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentType> getComponentTypeAffected() {
		if (componentTypeAffected == null) {
			componentTypeAffected = new EObjectResolvingEList<ComponentType>(ComponentType.class, this,
					TRADESPackage.VULNERABLE_ASSET__COMPONENT_TYPE_AFFECTED);
		}
		return componentTypeAffected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectResolvingEList<Control>(Control.class, this,
					TRADESPackage.VULNERABLE_ASSET__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.VULNERABLE_ASSET__VULNERABILITY:
			return getVulnerability();
		case TRADESPackage.VULNERABLE_ASSET__COMPONENT_TYPE_AFFECTED:
			return getComponentTypeAffected();
		case TRADESPackage.VULNERABLE_ASSET__CONTROLS:
			return getControls();
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
		case TRADESPackage.VULNERABLE_ASSET__VULNERABILITY:
			getVulnerability().clear();
			getVulnerability().addAll((Collection<? extends Vulnerability>) newValue);
			return;
		case TRADESPackage.VULNERABLE_ASSET__COMPONENT_TYPE_AFFECTED:
			getComponentTypeAffected().clear();
			getComponentTypeAffected().addAll((Collection<? extends ComponentType>) newValue);
			return;
		case TRADESPackage.VULNERABLE_ASSET__CONTROLS:
			getControls().clear();
			getControls().addAll((Collection<? extends Control>) newValue);
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
		case TRADESPackage.VULNERABLE_ASSET__VULNERABILITY:
			getVulnerability().clear();
			return;
		case TRADESPackage.VULNERABLE_ASSET__COMPONENT_TYPE_AFFECTED:
			getComponentTypeAffected().clear();
			return;
		case TRADESPackage.VULNERABLE_ASSET__CONTROLS:
			getControls().clear();
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
		case TRADESPackage.VULNERABLE_ASSET__VULNERABILITY:
			return vulnerability != null && !vulnerability.isEmpty();
		case TRADESPackage.VULNERABLE_ASSET__COMPONENT_TYPE_AFFECTED:
			return componentTypeAffected != null && !componentTypeAffected.isEmpty();
		case TRADESPackage.VULNERABLE_ASSET__CONTROLS:
			return controls != null && !controls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VulnerableAssetImpl
