/**
 */
package dsm.TRADES;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threats Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ThreatsOwner#getInternal <em>Internal</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatsOwner#getExternal <em>External</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getThreatsOwner()
 * @model
 * @generated
 */
public interface ThreatsOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal</em>' containment reference.
	 * @see #setInternal(ThreatType)
	 * @see dsm.TRADES.TRADESPackage#getThreatsOwner_Internal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ThreatType getInternal();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatsOwner#getInternal <em>Internal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal</em>' containment reference.
	 * @see #getInternal()
	 * @generated
	 */
	void setInternal(ThreatType value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' containment reference.
	 * @see #setExternal(ThreatType)
	 * @see dsm.TRADES.TRADESPackage#getThreatsOwner_External()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ThreatType getExternal();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ThreatsOwner#getExternal <em>External</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' containment reference.
	 * @see #getExternal()
	 * @generated
	 */
	void setExternal(ThreatType value);

} // ThreatsOwner
