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
 * A representation of the model object '<em><b>Attack Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.AttackChain#getAttackchainSteps <em>Attackchain Steps</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChain#getComputedDifficulty <em>Computed Difficulty</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAttackChain()
 * @model
 * @generated
 */
public interface AttackChain extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attackchain Steps</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.AttackChainStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attackchain Steps</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAttackChain_AttackchainSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttackChainStep> getAttackchainSteps();

	/**
	 * Returns the value of the '<em><b>Computed Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed Difficulty</em>' attribute.
	 * @see #setComputedDifficulty(int)
	 * @see dsm.TRADES.TRADESPackage#getAttackChain_ComputedDifficulty()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	int getComputedDifficulty();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChain#getComputedDifficulty <em>Computed Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed Difficulty</em>' attribute.
	 * @see #getComputedDifficulty()
	 * @generated
	 */
	void setComputedDifficulty(int value);

} // AttackChain
