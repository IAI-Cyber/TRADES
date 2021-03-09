/**
 */
package dsm.oscal.model.Oscal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Custom element frames a structure for embedding represented controls in resolution
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Custom#getGroups <em>Groups</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Custom#getCalls <em>Calls</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Custom#getMatchs <em>Matchs</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getCustom()
 * @model
 * @generated
 */
public interface Custom extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCustom_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Call}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCustom_Calls()
	 * @model containment="true"
	 * @generated
	 */
	EList<Call> getCalls();

	/**
	 * Returns the value of the '<em><b>Matchs</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchs</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCustom_Matchs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Match> getMatchs();

} // Custom
