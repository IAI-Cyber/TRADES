/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ThreatType#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatType#getThreats <em>Threats</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getThreatType()
 * @model
 * @generated
 */
public interface ThreatType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Types</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ThreatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Types</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getThreatType_SubTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThreatType> getSubTypes();

	/**
	 * Returns the value of the '<em><b>Threats</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threats</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getThreatType_Threats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threat> getThreats();

} // ThreatType
