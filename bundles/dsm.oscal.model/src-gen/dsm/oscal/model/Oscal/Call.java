/**
 */
package dsm.oscal.model.Oscal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Call#getControId <em>Contro Id</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Call#getWithChildControls <em>With Child Controls</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends EObject {
	/**
	 * Returns the value of the '<em><b>Contro Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Value of the 'id' flag on a target control
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contro Id</em>' attribute.
	 * @see #setControId(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCall_ControId()
	 * @model required="true"
	 * @generated
	 */
	String getControId();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Call#getControId <em>Contro Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contro Id</em>' attribute.
	 * @see #getControId()
	 * @generated
	 */
	void setControId(String value);

	/**
	 * Returns the value of the '<em><b>With Child Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Child Controls</em>' attribute.
	 * @see #setWithChildControls(short)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCall_WithChildControls()
	 * @model
	 * @generated
	 */
	short getWithChildControls();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Call#getWithChildControls <em>With Child Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Child Controls</em>' attribute.
	 * @see #getWithChildControls()
	 * @generated
	 */
	void setWithChildControls(short value);

} // Call
