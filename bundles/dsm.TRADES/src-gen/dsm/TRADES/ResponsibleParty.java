/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsible Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a set of organizations or persons that have responsibility for performing a referenced role in the context of the containing object
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ResponsibleParty#getRoleId <em>Role Id</em>}</li>
 *   <li>{@link dsm.TRADES.ResponsibleParty#getPartyUuid <em>Party Uuid</em>}</li>
 *   <li>{@link dsm.TRADES.ResponsibleParty#getRemark <em>Remark</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getResponsibleParty()
 * @model
 * @generated
 */
public interface ResponsibleParty extends PropertyOwner, AnnotationOwner, LinkOwner {
	/**
	 * Returns the value of the '<em><b>Role Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role that the party is responsible for
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Id</em>' attribute.
	 * @see #setRoleId(String)
	 * @see dsm.TRADES.TRADESPackage#getResponsibleParty_RoleId()
	 * @model required="true"
	 * @generated
	 */
	String getRoleId();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ResponsibleParty#getRoleId <em>Role Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Id</em>' attribute.
	 * @see #getRoleId()
	 * @generated
	 */
	void setRoleId(String value);

	/**
	 * Returns the value of the '<em><b>Party Uuid</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Uuid</em>' attribute list.
	 * @see dsm.TRADES.TRADESPackage#getResponsibleParty_PartyUuid()
	 * @model
	 * @generated
	 */
	EList<String> getPartyUuid();

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' containment reference.
	 * @see #setRemark(Remark)
	 * @see dsm.TRADES.TRADESPackage#getResponsibleParty_Remark()
	 * @model containment="true"
	 * @generated
	 */
	Remark getRemark();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ResponsibleParty#getRemark <em>Remark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' containment reference.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(Remark value);

} // ResponsibleParty
