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
 *   <li>{@link dsm.TRADES.Component#getImplements <em>Implements</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getThreatAllocations <em>Threat Allocations</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getAffectRelations <em>Affect Relations</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends ComponentOwner, DataOwnerElement, NamedElement, AbstractControlOwner {
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
	 * Returns the value of the '<em><b>Affect Relations</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.AffectRelation}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.AffectRelation#getSourceComponent <em>Source Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affect Relations</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_AffectRelations()
	 * @see dsm.TRADES.AffectRelation#getSourceComponent
	 * @model opposite="sourceComponent" containment="true"
	 * @generated
	 */
	EList<AffectRelation> getAffectRelations();

} // Component
