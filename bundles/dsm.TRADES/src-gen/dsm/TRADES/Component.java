/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Component#getAllocatedThreat <em>Allocated Threat</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getImplements <em>Implements</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getThreatAllocations <em>Threat Allocations</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getAffectrelation <em>Affectrelation</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getThreat <em>Threat</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends ComponentOwner, DataOwner, NamedElement, AbstractControlOwner {
	/**
	 * Returns the value of the '<em><b>Allocated Threat</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Threat}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Threat#getAllocated <em>Allocated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Threat</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_AllocatedThreat()
	 * @see dsm.TRADES.Threat#getAllocated
	 * @model opposite="allocated"
	 * @generated
	 */
	EList<Threat> getAllocatedThreat();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Control}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Control#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_Implements()
	 * @see dsm.TRADES.Control#getImplementedBy
	 * @model opposite="implementedBy"
	 * @generated
	 */
	EList<Control> getImplements();

	/**
	 * Returns the value of the '<em><b>Threat Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ThreatAllocationRelation}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.ThreatAllocationRelation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat Allocations</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_ThreatAllocations()
	 * @see dsm.TRADES.ThreatAllocationRelation#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<ThreatAllocationRelation> getThreatAllocations();

	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Analysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_Analysis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Analysis> getAnalysis();

	/**
	 * Returns the value of the '<em><b>Affectrelation</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.AffectRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affectrelation</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_Affectrelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AffectRelation> getAffectrelation();

	/**
	 * Returns the value of the '<em><b>Threat</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_Threat()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threat> getThreat();

} // Component
