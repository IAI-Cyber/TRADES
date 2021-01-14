/**
 */
package dsm.TRADES;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link dsm.TRADES.Threat#getThreatallocation <em>Threatallocation</em>}</li>
 *   <li>{@link dsm.TRADES.Threat#getThreatType <em>Threat Type</em>}</li>
 *   <li>{@link dsm.TRADES.Threat#getID <em>ID</em>}</li>
 *   <li>{@link dsm.TRADES.Threat#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.TRADES.Threat#getApplicability <em>Applicability</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getThreat()
 * @model
 * @generated
 */
public interface Threat extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Allocated</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Component}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Component#getAllocatedThreat <em>Allocated Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getThreat_Allocated()
	 * @see dsm.TRADES.Component#getAllocatedThreat
	 * @model opposite="allocatedThreat"
	 * @generated
	 */
	EList<Component> getAllocated();

	/**
	 * Returns the value of the '<em><b>Threatallocation</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.ThreatAllocationRelation}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.ThreatAllocationRelation#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
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
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see dsm.TRADES.TRADESPackage#getThreat_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Threat#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dsm.TRADES.TRADESPackage#getThreat_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Threat#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Applicability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicability</em>' attribute.
	 * @see #setApplicability(String)
	 * @see dsm.TRADES.TRADESPackage#getThreat_Applicability()
	 * @model
	 * @generated
	 */
	String getApplicability();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Threat#getApplicability <em>Applicability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicability</em>' attribute.
	 * @see #getApplicability()
	 * @generated
	 */
	void setApplicability(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkIsUsed(DiagnosticChain chain, Map context);

} // Threat
