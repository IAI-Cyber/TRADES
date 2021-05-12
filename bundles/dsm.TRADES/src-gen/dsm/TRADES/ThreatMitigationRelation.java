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
 * A representation of the model object '<em><b>Threat Mitigation Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ThreatMitigationRelation#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatMitigationRelation#getControl <em>Control</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatMitigationRelation#getThreat <em>Threat</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatMitigationRelation#getMitigatedAllocation <em>Mitigated Allocation</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatMitigationRelation#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getThreatMitigationRelation()
 * @model
 * @generated
 */
public interface ThreatMitigationRelation extends IMitigationLink {
	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' attribute.
	 * The default value is <code>"Undecided"</code>.
	 * The literals are from the enumeration {@link dsm.TRADES.AssessmentENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment</em>' attribute.
	 * @see dsm.TRADES.AssessmentENUM
	 * @see #setAssessment(AssessmentENUM)
	 * @see dsm.TRADES.TRADESPackage#getThreatMitigationRelation_Assessment()
	 * @model default="Undecided" required="true"
	 * @generated
	 */
	AssessmentENUM getAssessment();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatMitigationRelation#getAssessment <em>Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment</em>' attribute.
	 * @see dsm.TRADES.AssessmentENUM
	 * @see #getAssessment()
	 * @generated
	 */
	void setAssessment(AssessmentENUM value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Control#getMitigationRelations <em>Mitigation Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' container reference.
	 * @see #setControl(Control)
	 * @see dsm.TRADES.TRADESPackage#getThreatMitigationRelation_Control()
	 * @see dsm.TRADES.Control#getMitigationRelations
	 * @model opposite="mitigationRelations" required="true" transient="false"
	 * @generated
	 */
	Control getControl();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatMitigationRelation#getControl <em>Control</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' container reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(Control value);

	/**
	 * Returns the value of the '<em><b>Threat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' reference.
	 * @see #setThreat(Threat)
	 * @see dsm.TRADES.TRADESPackage#getThreatMitigationRelation_Threat()
	 * @model
	 * @generated
	 */
	Threat getThreat();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatMitigationRelation#getThreat <em>Threat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threat</em>' reference.
	 * @see #getThreat()
	 * @generated
	 */
	void setThreat(Threat value);

	/**
	 * Returns the value of the '<em><b>Mitigated Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigated Allocation</em>' reference.
	 * @see #setMitigatedAllocation(ThreatAllocationRelation)
	 * @see dsm.TRADES.TRADESPackage#getThreatMitigationRelation_MitigatedAllocation()
	 * @model
	 * @generated
	 */
	ThreatAllocationRelation getMitigatedAllocation();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatMitigationRelation#getMitigatedAllocation <em>Mitigated Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitigated Allocation</em>' reference.
	 * @see #getMitigatedAllocation()
	 * @generated
	 */
	void setMitigatedAllocation(ThreatAllocationRelation value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dsm.TRADES.TRADESPackage#getThreatMitigationRelation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatMitigationRelation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ThreatMitigationRelation
