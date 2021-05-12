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
 * A representation of the model object '<em><b>Score System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ScoreSystem#getImpactScores <em>Impact Scores</em>}</li>
 *   <li>{@link dsm.TRADES.ScoreSystem#getDifficultyScores <em>Difficulty Scores</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getScoreSystem()
 * @model
 * @generated
 */
public interface ScoreSystem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Impact Scores</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ImpactScore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Scores</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getScoreSystem_ImpactScores()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImpactScore> getImpactScores();

	/**
	 * Returns the value of the '<em><b>Difficulty Scores</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.DifficultyScore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty Scores</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getScoreSystem_DifficultyScores()
	 * @model containment="true"
	 * @generated
	 */
	EList<DifficultyScore> getDifficultyScores();

} // ScoreSystem
