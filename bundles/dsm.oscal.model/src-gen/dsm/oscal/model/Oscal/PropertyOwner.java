/**
 */
package dsm.oscal.model.Oscal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.PropertyOwner#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getPropertyOwner()
 * @model abstract="true"
 * @generated
 */
public interface PropertyOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getPropertyOwner_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // PropertyOwner
