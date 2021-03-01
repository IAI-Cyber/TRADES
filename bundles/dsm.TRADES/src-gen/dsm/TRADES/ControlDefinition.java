/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured information object representing a security or privacy control. Each security or privacy control within the Catalog is defined by a distinct control instance
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ControlDefinition#getId <em>Id</em>}</li>
 *   <li>{@link dsm.TRADES.ControlDefinition#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.TRADES.ControlDefinition#getParts <em>Parts</em>}</li>
 *   <li>{@link dsm.TRADES.ControlDefinition#getOscalcontrols <em>Oscalcontrols</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getControlDefinition()
 * @model
 * @generated
 */
public interface ControlDefinition extends PropertyOwner, ParameterOwner, NamedElement, AnnotationOwner, LinkOwner {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for a specific control instance that can be used to reference the control in other OSCAL documents. This identifier's uniqueness is document scoped and is intended to be consistent for the same control across minor revisions of the document
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dsm.TRADES.TRADESPackage#getControlDefinition_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ControlDefinition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see dsm.TRADES.TRADESPackage#getControlDefinition_Title()
	 * @model dataType="dsm.TRADES.MarkupLine" required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ControlDefinition#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Partition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getControlDefinition_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Partition> getParts();

	/**
	 * Returns the value of the '<em><b>Oscalcontrols</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ControlDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oscalcontrols</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getControlDefinition_Oscalcontrols()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlDefinition> getOscalcontrols();

} // ControlDefinition
