/**
 */
package dsm.oscal.model.Oscal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Import element designates a catalog, profile, or other resource to be included (referenced and potentially modified) by this profile
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Import#getHerf <em>Herf</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Import#getInclude <em>Include</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Import#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Herf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herf</em>' attribute.
	 * @see #setHerf(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getImport_Herf()
	 * @model required="true"
	 * @generated
	 */
	String getHerf();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Import#getHerf <em>Herf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Herf</em>' attribute.
	 * @see #getHerf()
	 * @generated
	 */
	void setHerf(String value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference.
	 * @see #setInclude(Include)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getImport_Include()
	 * @model containment="true"
	 * @generated
	 */
	Include getInclude();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Import#getInclude <em>Include</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' containment reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(Include value);

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference.
	 * @see #setExclude(Exclude)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getImport_Exclude()
	 * @model containment="true"
	 * @generated
	 */
	Exclude getExclude();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Import#getExclude <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' containment reference.
	 * @see #getExclude()
	 * @generated
	 */
	void setExclude(Exclude value);

} // Import
