/**
 */
package dsm.oscal.model.Oscal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Merge element merges controls in resolution
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Merge#getCombine <em>Combine</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getMerge()
 * @model
 * @generated
 */
public interface Merge extends EObject {
	/**
	 * Returns the value of the '<em><b>Combine</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Combine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combine</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMerge_Combine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Combine> getCombine();

} // Merge
