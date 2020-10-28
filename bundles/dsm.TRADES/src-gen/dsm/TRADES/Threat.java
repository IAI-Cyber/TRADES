/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Threat#getAllocated <em>Allocated</em>}</li>
 *   <li>{@link dsm.TRADES.Threat#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.Threat#getThreatallocation <em>Threatallocation</em>}</li>
 *   <li>{@link dsm.TRADES.Threat#getThreatType <em>Threat Type</em>}</li>
 *   <li>{@link dsm.TRADES.Threat#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getThreat()
 * @model
 * @generated
 */
public interface Threat extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocated</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Component}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Component#getAllocatedThreat <em>Allocated Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getThreat_Allocated()
	 * @see dsm.TRADES.Component#getAllocatedThreat
	 * @model opposite="allocatedThreat"
	 * @generated
	 */
	EList<Component> getAllocated();

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
	 * @see dsm.TRADES.TRADESPackage#getThreat_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Threat#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Threatallocation</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.ThreatAllocationRelation}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.ThreatAllocationRelation#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threatallocation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threatallocation</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getThreat_Threatallocation()
	 * @see dsm.TRADES.ThreatAllocationRelation#getThreat
	 * @model opposite="threat"
	 * @generated
	 */
	EList<ThreatAllocationRelation> getThreatallocation();

	/**
	 * Returns the value of the '<em><b>Threat Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dsm.TRADES.threatTypeENUM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threat Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat Type</em>' attribute.
	 * @see dsm.TRADES.threatTypeENUM
	 * @see #setThreatType(threatTypeENUM)
	 * @see dsm.TRADES.TRADESPackage#getThreat_ThreatType()
	 * @model
	 * @generated
	 */
	threatTypeENUM getThreatType();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Threat#getThreatType <em>Threat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threat Type</em>' attribute.
	 * @see dsm.TRADES.threatTypeENUM
	 * @see #getThreatType()
	 * @generated
	 */
	void setThreatType(threatTypeENUM value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dsm.TRADES.TRADESPackage#getThreat_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Threat#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Threat
