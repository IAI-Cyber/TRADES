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
	 * Returns the value of the '<em><b>Component Type Affected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type Affected</em>' reference.
	 * @see #setComponentTypeAffected(ComponentType)
	 * @see dsm.TRADES.TRADESPackage#getVulnerableAsset_ComponentTypeAffected()
	 * @model required="true"
	 * @generated
	 */
	ComponentType getComponentTypeAffected();

	/**
	 * Sets the value of the '{@link dsm.TRADES.VulnerableAsset#getComponentTypeAffected <em>Component Type Affected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type Affected</em>' reference.
	 * @see #getComponentTypeAffected()
	 * @generated
	 */
	void setComponentTypeAffected(ComponentType value);
} // VulnerableAsset
