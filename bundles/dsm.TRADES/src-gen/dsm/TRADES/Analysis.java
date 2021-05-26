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
 * A representation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Analysis#getScoreSystem <em>Score System</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getLinkTypes <em>Link Types</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAnalysis()
 * @model
 * @generated
 */
public interface Analysis extends ComponentOwner, DataOwnerElement, NamedElement, AbstractControlOwner,
		AbstractThreatOwner, ElementWithId {
	/**
	 * Returns the value of the '<em><b>Score System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score System</em>' containment reference.
	 * @see #setScoreSystem(ScoreSystem)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_ScoreSystem()
	 * @model containment="true"
	 * @generated
	 */
	ScoreSystem getScoreSystem();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#getScoreSystem <em>Score System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score System</em>' containment reference.
	 * @see #getScoreSystem()
	 * @generated
	 */
	void setScoreSystem(ScoreSystem value);

	/**
	 * Returns the value of the '<em><b>Link Types</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Types</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_LinkTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkType> getLinkTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<ExternalThreat> getExternalThreats(String id, String catalogIdentifier);

} // Analysis
