/**
 */
package dsm.TRADES;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat Allocation Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ThreatAllocationRelation#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatAllocationRelation#getComponent <em>Component</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatAllocationRelation#getThreat <em>Threat</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatAllocationRelation#getImpactScore <em>Impact Score</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatAllocationRelation#getDifficultyScore <em>Difficulty Score</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatAllocationRelation#getAttackChain <em>Attack Chain</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getThreatAllocationRelation()
 * @model
 * @generated
 */
public interface ThreatAllocationRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' attribute.
	 * The default value is <code>"Undecided"</code>.
	 * The literals are from the enumeration {@link dsm.TRADES.AssessmentENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment</em>' attribute.
	 * @see dsm.TRADES.AssessmentENUM
	 * @see #setAssessment(AssessmentENUM)
	 * @see dsm.TRADES.TRADESPackage#getThreatAllocationRelation_Assessment()
	 * @model default="Undecided" required="true"
	 * @generated
	 */
	AssessmentENUM getAssessment();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatAllocationRelation#getAssessment <em>Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment</em>' attribute.
	 * @see dsm.TRADES.AssessmentENUM
	 * @see #getAssessment()
	 * @generated
	 */
	void setAssessment(AssessmentENUM value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Component#getThreatAllocations <em>Threat Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see dsm.TRADES.TRADESPackage#getThreatAllocationRelation_Component()
	 * @see dsm.TRADES.Component#getThreatAllocations
	 * @model opposite="threatAllocations" required="true" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatAllocationRelation#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Threat</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Threat#getThreatAllocations <em>Threat Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' reference.
	 * @see #setThreat(Threat)
	 * @see dsm.TRADES.TRADESPackage#getThreatAllocationRelation_Threat()
	 * @see dsm.TRADES.Threat#getThreatAllocations
	 * @model opposite="threatAllocations" required="true"
	 * @generated
	 */
	Threat getThreat();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatAllocationRelation#getThreat <em>Threat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threat</em>' reference.
	 * @see #getThreat()
	 * @generated
	 */
	void setThreat(Threat value);

	/**
	 * Returns the value of the '<em><b>Impact Score</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Score</em>' reference.
	 * @see #setImpactScore(ImpactScore)
	 * @see dsm.TRADES.TRADESPackage#getThreatAllocationRelation_ImpactScore()
	 * @model
	 * @generated
	 */
	ImpactScore getImpactScore();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatAllocationRelation#getImpactScore <em>Impact Score</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Score</em>' reference.
	 * @see #getImpactScore()
	 * @generated
	 */
	void setImpactScore(ImpactScore value);

	/**
	 * Returns the value of the '<em><b>Difficulty Score</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty Score</em>' reference.
	 * @see #setDifficultyScore(DifficultyScore)
	 * @see dsm.TRADES.TRADESPackage#getThreatAllocationRelation_DifficultyScore()
	 * @model
	 * @generated
	 */
	DifficultyScore getDifficultyScore();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatAllocationRelation#getDifficultyScore <em>Difficulty Score</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty Score</em>' reference.
	 * @see #getDifficultyScore()
	 * @generated
	 */
	void setDifficultyScore(DifficultyScore value);

	/**
	 * Returns the value of the '<em><b>Attack Chain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack Chain</em>' containment reference.
	 * @see #setAttackChain(AttackChain)
	 * @see dsm.TRADES.TRADESPackage#getThreatAllocationRelation_AttackChain()
	 * @model containment="true"
	 * @generated
	 */
	AttackChain getAttackChain();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatAllocationRelation#getAttackChain <em>Attack Chain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack Chain</em>' containment reference.
	 * @see #getAttackChain()
	 * @generated
	 */
	void setAttackChain(AttackChain value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Check that the define difference for this allocation is not different from the one computed on the attack chain
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean checkComputedDifficultyConstraint(DiagnosticChain chain, Map context);

} // ThreatAllocationRelation
