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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dsm.TRADES.TRADESPackage
 * @generated
 */
public interface TRADESFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TRADESFactory eINSTANCE = dsm.TRADES.impl.TRADESFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis</em>'.
	 * @generated
	 */
	Analysis createAnalysis();

	/**
	 * Returns a new object of class '<em>Threat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threat</em>'.
	 * @generated
	 */
	Threat createThreat();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control</em>'.
	 * @generated
	 */
	Control createControl();

	/**
	 * Returns a new object of class '<em>Threat Allocation Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threat Allocation Relation</em>'.
	 * @generated
	 */
	ThreatAllocationRelation createThreatAllocationRelation();

	/**
	 * Returns a new object of class '<em>Threat Mitigation Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threat Mitigation Relation</em>'.
	 * @generated
	 */
	ThreatMitigationRelation createThreatMitigationRelation();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns a new object of class '<em>Affect Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affect Relation</em>'.
	 * @generated
	 */
	AffectRelation createAffectRelation();

	/**
	 * Returns a new object of class '<em>Attack Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attack Chain</em>'.
	 * @generated
	 */
	AttackChain createAttackChain();

	/**
	 * Returns a new object of class '<em>Attack Chain Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attack Chain Step</em>'.
	 * @generated
	 */
	AttackChainStep createAttackChainStep();

	/**
	 * Returns a new object of class '<em>Score System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Score System</em>'.
	 * @generated
	 */
	ScoreSystem createScoreSystem();

	/**
	 * Returns a new object of class '<em>Impact Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impact Score</em>'.
	 * @generated
	 */
	ImpactScore createImpactScore();

	/**
	 * Returns a new object of class '<em>Difficulty Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Difficulty Score</em>'.
	 * @generated
	 */
	DifficultyScore createDifficultyScore();

	/**
	 * Returns a new object of class '<em>External Threat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Threat</em>'.
	 * @generated
	 */
	ExternalThreat createExternalThreat();

	/**
	 * Returns a new object of class '<em>Impact Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impact Configuration</em>'.
	 * @generated
	 */
	ImpactConfiguration createImpactConfiguration();

	/**
	 * Returns a new object of class '<em>External Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Control</em>'.
	 * @generated
	 */
	ExternalControl createExternalControl();

	/**
	 * Returns a new object of class '<em>Threats Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threats Owner</em>'.
	 * @generated
	 */
	ThreatsOwner createThreatsOwner();

	/**
	 * Returns a new object of class '<em>Control Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Owner</em>'.
	 * @generated
	 */
	ControlOwner createControlOwner();

	/**
	 * Returns a new object of class '<em>Data Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Owner</em>'.
	 * @generated
	 */
	DataOwner createDataOwner();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TRADESPackage getTRADESPackage();

} //TRADESFactory
