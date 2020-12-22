/**
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
 *   <li>{@link dsm.TRADES.Analysis#getAffectrelation <em>Affectrelation</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getScoresystem <em>Scoresystem</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getThreatOwner <em>Threat Owner</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAnalysis()
 * @model
 * @generated
 */
public interface Analysis extends ComponentOwer, DataOwner, NamedElement, AbstractControlOwner {
	/**
	 * Returns the value of the '<em><b>Affectrelation</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.AffectRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affectrelation</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Affectrelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AffectRelation> getAffectrelation();

	/**
	 * Returns the value of the '<em><b>Scoresystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoresystem</em>' containment reference.
	 * @see #setScoresystem(ScoreSystem)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Scoresystem()
	 * @model containment="true"
	 * @generated
	 */
	ScoreSystem getScoresystem();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#getScoresystem <em>Scoresystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoresystem</em>' containment reference.
	 * @see #getScoresystem()
	 * @generated
	 */
	void setScoresystem(ScoreSystem value);

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

} // Analysis
