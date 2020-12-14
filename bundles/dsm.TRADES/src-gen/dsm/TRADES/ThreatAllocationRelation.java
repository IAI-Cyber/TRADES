/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link dsm.TRADES.ThreatAllocationRelation#getImpactscore <em>Impactscore</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatAllocationRelation#getDifficultyscore <em>Difficultyscore</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatAllocationRelation#getThreatRelated <em>Threat Related</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatAllocationRelation#getAttackChains <em>Attack Chains</em>}</li>
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
	 * <p>
	 * If the meaning of the '<em>Assessment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Threat#getThreatallocation <em>Threatallocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' reference.
	 * @see #setThreat(Threat)
	 * @see dsm.TRADES.TRADESPackage#getThreatAllocationRelation_Threat()
	 * @see dsm.TRADES.Threat#getThreatallocation
	 * @model opposite="threatallocation" required="true"
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
	 * Returns the value of the '<em><b>Impactscore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impactscore</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impactscore</em>' reference.
	 * @see #setImpactscore(ImpactScore)
	 * @see dsm.TRADES.TRADESPackage#getThreatAllocationRelation_Impactscore()
	 * @model
	 * @generated
	 */
	ImpactScore getImpactscore();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatAllocationRelation#getImpactscore <em>Impactscore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impactscore</em>' reference.
	 * @see #getImpactscore()
	 * @generated
	 */
	void setImpactscore(ImpactScore value);

	/**
	 * Returns the value of the '<em><b>Difficultyscore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficultyscore</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficultyscore</em>' reference.
	 * @see #setDifficultyscore(DifficultyScore)
	 * @see dsm.TRADES.TRADESPackage#getThreatAllocationRelation_Difficultyscore()
	 * @model
	 * @generated
	 */
	DifficultyScore getDifficultyscore();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatAllocationRelation#getDifficultyscore <em>Difficultyscore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficultyscore</em>' reference.
	 * @see #getDifficultyscore()
	 * @generated
	 */
	void setDifficultyscore(DifficultyScore value);

	/**
	 * Returns the value of the '<em><b>Threat Related</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.ThreatAllocationRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat Related</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getThreatAllocationRelation_ThreatRelated()
	 * @model
	 * @generated
	 */
	EList<ThreatAllocationRelation> getThreatRelated();

	/**
	 * Returns the value of the '<em><b>Attack Chains</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.AttackChain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack Chains</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getThreatAllocationRelation_AttackChains()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttackChain> getAttackChains();

} // ThreatAllocationRelation
