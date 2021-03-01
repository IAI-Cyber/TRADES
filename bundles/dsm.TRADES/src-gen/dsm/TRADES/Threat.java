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
 *   <li>{@link dsm.TRADES.Threat#getThreatAllocations <em>Threat Allocations</em>}</li>
 *   <li>{@link dsm.TRADES.Threat#getThreatType <em>Threat Type</em>}</li>
 *   <li>{@link dsm.TRADES.Threat#getId <em>Id</em>}</li>
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
	 * Returns the value of the '<em><b>Threat Allocations</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.ThreatAllocationRelation}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.ThreatAllocationRelation#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat Allocations</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getThreat_ThreatAllocations()
	 * @see dsm.TRADES.ThreatAllocationRelation#getThreat
	 * @model opposite="threat"
	 * @generated
	 */
	EList<ThreatAllocationRelation> getThreatAllocations();

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
