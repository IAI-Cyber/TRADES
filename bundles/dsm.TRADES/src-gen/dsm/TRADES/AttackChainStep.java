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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack Chain Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.AttackChainStep#getStepNum <em>Step Num</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChainStep#getThreatAllocationRelation <em>Threat Allocation Relation</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChainStep#getImpactDescription <em>Impact Description</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChainStep#getNext <em>Next</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChainStep#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAttackChainStep()
 * @model
 * @generated
 */
public interface AttackChainStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Step Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Num</em>' attribute.
	 * @see #setStepNum(String)
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_StepNum()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getStepNum();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChainStep#getStepNum <em>Step Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Num</em>' attribute.
	 * @see #getStepNum()
	 * @generated
	 */
	void setStepNum(String value);

	/**
	 * Returns the value of the '<em><b>Threat Allocation Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat Allocation Relation</em>' reference.
	 * @see #setThreatAllocationRelation(ThreatAllocationRelation)
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_ThreatAllocationRelation()
	 * @model
	 * @generated
	 */
	ThreatAllocationRelation getThreatAllocationRelation();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChainStep#getThreatAllocationRelation <em>Threat Allocation Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threat Allocation Relation</em>' reference.
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	void setThreatAllocationRelation(ThreatAllocationRelation value);

	/**
	 * Returns the value of the '<em><b>Impact Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Description</em>' attribute.
	 * @see #setImpactDescription(String)
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_ImpactDescription()
	 * @model
	 * @generated
	 */
	String getImpactDescription();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChainStep#getImpactDescription <em>Impact Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Description</em>' attribute.
	 * @see #getImpactDescription()
	 * @generated
	 */
	void setImpactDescription(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.AttackChainStep}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.AttackChainStep#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_Next()
	 * @see dsm.TRADES.AttackChainStep#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	EList<AttackChainStep> getNext();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.AttackChainStep}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.AttackChainStep#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_Previous()
	 * @see dsm.TRADES.AttackChainStep#getNext
	 * @model opposite="next"
	 * @generated
	 */
	EList<AttackChainStep> getPrevious();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Check that the actual threatAllocationRelation belong to the correct candidates scope.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ThreatAllocationRelation> getThreatAllocationRelationCandidates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkAllocationValue(DiagnosticChain chain, Map context);

} // AttackChainStep
