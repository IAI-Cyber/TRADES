/**
 */
package dsm.oscal.model.Oscal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Citation#getText <em>Text</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Citation#getBiblio <em>Biblio</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getCitation()
 * @model
 * @generated
 */
public interface Citation extends PropertyOwner, AnnotationOwner {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCitation_Text()
	 * @model dataType="dsm.oscal.model.Oscal.MarkupLine" required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Citation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Biblio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for structured bibliographic information. The model of this information is undefined by OSCAL
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Biblio</em>' attribute.
	 * @see #setBiblio(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCitation_Biblio()
	 * @model
	 * @generated
	 */
	String getBiblio();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Citation#getBiblio <em>Biblio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biblio</em>' attribute.
	 * @see #getBiblio()
	 * @generated
	 */
	void setBiblio(String value);

} // Citation
