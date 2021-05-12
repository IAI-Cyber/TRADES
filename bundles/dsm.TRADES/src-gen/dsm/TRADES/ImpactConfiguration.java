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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impact Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ImpactConfiguration#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link dsm.TRADES.ImpactConfiguration#getImpact <em>Impact</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getImpactConfiguration()
 * @model
 * @generated
 */
public interface ImpactConfiguration extends ColoredElement {
	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' reference.
	 * @see #setDifficulty(DifficultyScore)
	 * @see dsm.TRADES.TRADESPackage#getImpactConfiguration_Difficulty()
	 * @model required="true"
	 * @generated
	 */
	DifficultyScore getDifficulty();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ImpactConfiguration#getDifficulty <em>Difficulty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' reference.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(DifficultyScore value);

	/**
	 * Returns the value of the '<em><b>Impact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.ImpactScore#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact</em>' container reference.
	 * @see #setImpact(ImpactScore)
	 * @see dsm.TRADES.TRADESPackage#getImpactConfiguration_Impact()
	 * @see dsm.TRADES.ImpactScore#getConfigurations
	 * @model opposite="configurations" required="true" transient="false"
	 * @generated
	 */
	ImpactScore getImpact();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ImpactConfiguration#getImpact <em>Impact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' container reference.
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(ImpactScore value);

} // ImpactConfiguration
