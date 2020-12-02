/**
 */
package dsm.TRADES;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ExternalElement#getSource <em>Source</em>}</li>
 *   <li>{@link dsm.TRADES.ExternalElement#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getExternalElement()
 * @model abstract="true"
 * @generated
 */
public interface ExternalElement extends Threat {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see dsm.TRADES.TRADESPackage#getExternalElement_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ExternalElement#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see dsm.TRADES.TRADESPackage#getExternalElement_Link()
	 * @model
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ExternalElement#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

} // ExternalElement
