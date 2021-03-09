/**
 */
package dsm.oscal.model.Oscal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A location, with associated metadata that can be referenced
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Location#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Location#getAddress <em>Address</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Location#getEmailAddresses <em>Email Addresses</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Location#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Location#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Location#getUrl <em>Url</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Location#getRemark <em>Remark</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends PropertyOwner, AnnotationOwner, LinkOwner {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getLocation_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Location#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getLocation_Address()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Location#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Email Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Addresses</em>' attribute list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getLocation_EmailAddresses()
	 * @model
	 * @generated
	 */
	EList<String> getEmailAddresses();

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getLocation_Uuid()
	 * @model
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Location#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Telephone Numbers</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.TelephoneNumber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Numbers</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getLocation_TelephoneNumbers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TelephoneNumber> getTelephoneNumbers();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getLocation_Url()
	 * @model
	 * @generated
	 */
	EList<String> getUrl();

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' containment reference.
	 * @see #setRemark(Remark)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getLocation_Remark()
	 * @model containment="true"
	 * @generated
	 */
	Remark getRemark();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Location#getRemark <em>Remark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' containment reference.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(Remark value);

} // Location
