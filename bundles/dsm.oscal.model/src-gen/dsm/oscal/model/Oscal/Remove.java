/**
 */
package dsm.oscal.model.Oscal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Remove#getNameRef <em>Name Ref</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Remove#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Remove#getIdRef <em>Id Ref</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Remove#getItemName <em>Item Name</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getRemove()
 * @model
 * @generated
 */
public interface Remove extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Items to remove, by assigned name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Ref</em>' attribute.
	 * @see #setNameRef(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getRemove_NameRef()
	 * @model
	 * @generated
	 */
	String getNameRef();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Remove#getNameRef <em>Name Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Ref</em>' attribute.
	 * @see #getNameRef()
	 * @generated
	 */
	void setNameRef(String value);

	/**
	 * Returns the value of the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Items to remove, by class. A token match
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Ref</em>' attribute.
	 * @see #setClassRef(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getRemove_ClassRef()
	 * @model
	 * @generated
	 */
	String getClassRef();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Remove#getClassRef <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Ref</em>' attribute.
	 * @see #getClassRef()
	 * @generated
	 */
	void setClassRef(String value);

	/**
	 * Returns the value of the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Items to remove, indicated by their IDs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id Ref</em>' attribute.
	 * @see #setIdRef(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getRemove_IdRef()
	 * @model
	 * @generated
	 */
	String getIdRef();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Remove#getIdRef <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Ref</em>' attribute.
	 * @see #getIdRef()
	 * @generated
	 */
	void setIdRef(String value);

	/**
	 * Returns the value of the '<em><b>Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Items to remove, by the name of the item's type, or generic identifier, e.g. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Name</em>' attribute.
	 * @see #setItemName(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getRemove_ItemName()
	 * @model
	 * @generated
	 */
	String getItemName();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Remove#getItemName <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Name</em>' attribute.
	 * @see #getItemName()
	 * @generated
	 */
	void setItemName(String value);

} // Remove
