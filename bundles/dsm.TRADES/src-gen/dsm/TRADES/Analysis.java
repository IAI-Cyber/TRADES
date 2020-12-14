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
 *   <li>{@link dsm.TRADES.Analysis#getThreat <em>Threat</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getControl <em>Control</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getAffectrelation <em>Affectrelation</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getScoresystem <em>Scoresystem</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAnalysis()
 * @model
 * @generated
 */
public interface Analysis extends ComponentOwer, DataOwner, NamedElement {
	/**
	 * Returns the value of the '<em><b>Threat</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Threat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Threat()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threat> getThreat();

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Control}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Control()
	 * @model containment="true"
	 * @generated
	 */
	EList<Control> getControl();

	/**
	 * Returns the value of the '<em><b>Affectrelation</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.AffectRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affectrelation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of the '<em>Scoresystem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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

} // Analysis
