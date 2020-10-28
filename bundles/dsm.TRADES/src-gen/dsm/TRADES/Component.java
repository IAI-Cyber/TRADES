/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link dsm.TRADES.Component#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getThreatallocation <em>Threatallocation</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getComponent <em>Component</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getData <em>Data</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getControl <em>Control</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getAffectrelation <em>Affectrelation</em>}</li>
 *   <li>{@link dsm.TRADES.Component#getThreat <em>Threat</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocated Threat</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Threat}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Threat#getAllocated <em>Allocated</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Threat</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_Implements()
	 * @see dsm.TRADES.Control#getImplementedBy
	 * @model opposite="implementedBy"
	 * @generated
	 */
	EList<Control> getImplements();

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
	 * @see dsm.TRADES.TRADESPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Component#getName <em>Name</em>}' attribute.
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
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.ThreatAllocationRelation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threatallocation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threatallocation</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_Threatallocation()
	 * @see dsm.TRADES.ThreatAllocationRelation#getComponent
	 * @model opposite="component"
	 * @generated
	 */
	EList<ThreatAllocationRelation> getThreatallocation();

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
	 * @see dsm.TRADES.TRADESPackage#getComponent_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

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
	 * @see dsm.TRADES.TRADESPackage#getComponent_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

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
	 * @see dsm.TRADES.TRADESPackage#getComponent_Control()
	 * @model containment="true"
	 * @generated
	 */
	EList<Control> getControl();

	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Analysis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of the '<em>Affectrelation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of the '<em>Threat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponent_Threat()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threat> getThreat();

} // Component
