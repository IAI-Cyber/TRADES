/**
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
 *   <li>{@link dsm.TRADES.ThreatMitigationRelation#getMitigates <em>Mitigates</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getThreatMitigationRelation()
 * @model
 * @generated
 */
public interface ThreatMitigationRelation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' attribute.
	 * The default value is <code>"Undecided"</code>.
	 * The literals are from the enumeration {@link dsm.TRADES.AssessmentENUM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Control#getMitigationrRelations <em>Mitigationr Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' container reference.
	 * @see #setControl(Control)
	 * @see dsm.TRADES.TRADESPackage#getThreatMitigationRelation_Control()
	 * @see dsm.TRADES.Control#getMitigationrRelations
	 * @model opposite="mitigationrRelations" required="true" transient="false"
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
	 * <p>
	 * If the meaning of the '<em>Threat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' reference.
	 * @see #setThreat(Threat)
	 * @see dsm.TRADES.TRADESPackage#getThreatMitigationRelation_Threat()
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Mitigates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mitigates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigates</em>' reference.
	 * @see #setMitigates(ThreatAllocationRelation)
	 * @see dsm.TRADES.TRADESPackage#getThreatMitigationRelation_Mitigates()
	 * @model
	 * @generated
	 */
	ThreatAllocationRelation getMitigates();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatMitigationRelation#getMitigates <em>Mitigates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitigates</em>' reference.
	 * @see #getMitigates()
	 * @generated
	 */
	void setMitigates(ThreatAllocationRelation value);

} // ThreatMitigationRelation
