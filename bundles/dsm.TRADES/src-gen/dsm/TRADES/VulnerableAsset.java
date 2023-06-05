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
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vulnerable Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.VulnerableAsset#getVulnerability <em>Vulnerability</em>}</li>
 *   <li>{@link dsm.TRADES.VulnerableAsset#getComponentTypeAffected <em>Component Type Affected</em>}</li>
 *   <li>{@link dsm.TRADES.VulnerableAsset#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getVulnerableAsset()
 * @model
 * @generated
 */
public interface VulnerableAsset extends Asset {

	/**
	 * Returns the value of the '<em><b>Vulnerability</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vulnerability</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getVulnerableAsset_Vulnerability()
	 * @model required="true"
	 * @generated
	 */
	EList<Vulnerability> getVulnerability();

	/**
	 * Returns the value of the '<em><b>Component Type Affected</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type Affected</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getVulnerableAsset_ComponentTypeAffected()
	 * @model required="true"
	 * @generated
	 */
	EList<ComponentType> getComponentTypeAffected();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getVulnerableAsset_Controls()
	 * @model
	 * @generated
	 */
	EList<Control> getControls();
} // VulnerableAsset
