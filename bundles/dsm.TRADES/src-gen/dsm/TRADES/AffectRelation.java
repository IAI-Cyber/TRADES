/**
 */
package dsm.TRADES;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affect Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.AffectRelation#getData <em>Data</em>}</li>
 *   <li>{@link dsm.TRADES.AffectRelation#getSourceComponent <em>Source Component</em>}</li>
 *   <li>{@link dsm.TRADES.AffectRelation#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link dsm.TRADES.AffectRelation#getAnalysisStatus <em>Analysis Status</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAffectRelation()
 * @model
 * @generated
 */
public interface AffectRelation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getAffectRelation_Data()
	 * @model
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Source Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Component</em>' reference.
	 * @see #setSourceComponent(Component)
	 * @see dsm.TRADES.TRADESPackage#getAffectRelation_SourceComponent()
	 * @model required="true"
	 * @generated
	 */
	Component getSourceComponent();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AffectRelation#getSourceComponent <em>Source Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Component</em>' reference.
	 * @see #getSourceComponent()
	 * @generated
	 */
	void setSourceComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Target Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Component</em>' reference.
	 * @see #setTargetComponent(Component)
	 * @see dsm.TRADES.TRADESPackage#getAffectRelation_TargetComponent()
	 * @model required="true"
	 * @generated
	 */
	Component getTargetComponent();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AffectRelation#getTargetComponent <em>Target Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Component</em>' reference.
	 * @see #getTargetComponent()
	 * @generated
	 */
	void setTargetComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Analysis Status</b></em>' attribute.
	 * The literals are from the enumeration {@link dsm.TRADES.AffectedENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Status</em>' attribute.
	 * @see dsm.TRADES.AffectedENUM
	 * @see #setAnalysisStatus(AffectedENUM)
	 * @see dsm.TRADES.TRADESPackage#getAffectRelation_AnalysisStatus()
	 * @model required="true"
	 * @generated
	 */
	AffectedENUM getAnalysisStatus();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AffectRelation#getAnalysisStatus <em>Analysis Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Status</em>' attribute.
	 * @see dsm.TRADES.AffectedENUM
	 * @see #getAnalysisStatus()
	 * @generated
	 */
	void setAnalysisStatus(AffectedENUM value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Check that the referenced data belong to correct scope.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDataScope(DiagnosticChain chain, Map context);

} // AffectRelation
