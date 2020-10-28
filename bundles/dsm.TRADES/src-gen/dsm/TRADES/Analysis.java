/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link dsm.TRADES.Analysis#getComponent <em>Component</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getControl <em>Control</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getThreatallocation <em>Threatallocation</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getThreatmitigation <em>Threatmitigation</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getData <em>Data</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getAffectrelation <em>Affectrelation</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getAnalysisdiagram <em>Analysisdiagram</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getAttackchain <em>Attackchain</em>}</li>
 *   <li>{@link dsm.TRADES.Analysis#getScoresystem <em>Scoresystem</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAnalysis()
 * @model
 * @generated
 */
public interface Analysis extends EObject {
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
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Analysis#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Threatallocation</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ThreatAllocationRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threatallocation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threatallocation</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Threatallocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThreatAllocationRelation> getThreatallocation();

	/**
	 * Returns the value of the '<em><b>Threatmitigation</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ThreatMitigationRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threatmitigation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threatmitigation</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Threatmitigation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThreatMitigationRelation> getThreatmitigation();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

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
	 * Returns the value of the '<em><b>Analysisdiagram</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.AnalysisDiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysisdiagram</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysisdiagram</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Analysisdiagram()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnalysisDiagram> getAnalysisdiagram();

	/**
	 * Returns the value of the '<em><b>Attackchain</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.AttackChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attackchain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attackchain</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAnalysis_Attackchain()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttackChain> getAttackchain();

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
