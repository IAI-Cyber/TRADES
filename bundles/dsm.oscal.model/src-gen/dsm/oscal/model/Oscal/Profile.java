/**
 */
package dsm.oscal.model.Oscal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each OSCAL profile is defined by a Profile element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Profile#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Profile#getImports <em>Imports</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Profile#getMerge <em>Merge</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Profile#getModify <em>Modify</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Profile#getBackmatter <em>Backmatter</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Profile#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getProfile()
 * @model
 * @generated
 */
public interface Profile extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getProfile_Metadata()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Profile#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getProfile_Imports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Merge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge</em>' containment reference.
	 * @see #setMerge(Merge)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getProfile_Merge()
	 * @model containment="true"
	 * @generated
	 */
	Merge getMerge();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Profile#getMerge <em>Merge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge</em>' containment reference.
	 * @see #getMerge()
	 * @generated
	 */
	void setMerge(Merge value);

	/**
	 * Returns the value of the '<em><b>Modify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify</em>' containment reference.
	 * @see #setModify(Modify)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getProfile_Modify()
	 * @model containment="true"
	 * @generated
	 */
	Modify getModify();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Profile#getModify <em>Modify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify</em>' containment reference.
	 * @see #getModify()
	 * @generated
	 */
	void setModify(Modify value);

	/**
	 * Returns the value of the '<em><b>Backmatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backmatter</em>' containment reference.
	 * @see #setBackmatter(BackMatter)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getProfile_Backmatter()
	 * @model containment="true"
	 * @generated
	 */
	BackMatter getBackmatter();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Profile#getBackmatter <em>Backmatter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backmatter</em>' containment reference.
	 * @see #getBackmatter()
	 * @generated
	 */
	void setBackmatter(BackMatter value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getProfile_Uuid()
	 * @model
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Profile#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // Profile
