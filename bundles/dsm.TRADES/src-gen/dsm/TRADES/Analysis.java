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

import dsm.oscal.model.OscalCatalog.Catalog;
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
 *   <li>{@link dsm.TRADES.Analysis#getThreatOwner <em>Threat Owner</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getCatalogs <em>Catalogs</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAnalysis()
 * @model
 * @generated
 */
public interface Analysis extends ComponentOwner, DataOwnerElement, NamedElement, AbstractControlOwner {
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
	 * Returns the value of the '<em><b>Threat Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat Owner</em>' containment reference.
	 * @see #setThreatOwner(ThreatsOwner)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_ThreatOwner()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ThreatsOwner getThreatOwner();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#getThreatOwner <em>Threat Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threat Owner</em>' containment reference.
	 * @see #getThreatOwner()
	 * @generated
	 */
	void setThreatOwner(ThreatsOwner value);

	/**
	 * Returns the value of the '<em><b>Catalogs</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalCatalog.Catalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogs</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Catalogs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Catalog> getCatalogs();

} // Analysis
