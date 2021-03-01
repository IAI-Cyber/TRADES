/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of controls
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Catalog#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.TRADES.Catalog#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link dsm.TRADES.Catalog#getGroups <em>Groups</em>}</li>
 *   <li>{@link dsm.TRADES.Catalog#getBackmatter <em>Backmatter</em>}</li>
 *   <li>{@link dsm.TRADES.Catalog#getOscalcontrols <em>Oscalcontrols</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getCatalog()
 * @model
 * @generated
 */
public interface Catalog extends ParameterOwner {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A globally unique identifier for this catalog instance. This UUID should be changed when this document is revised.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see dsm.TRADES.TRADESPackage#getCatalog_Uuid()
	 * @model changeable="false"
	 * @generated
	 */
	String getUuid();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see dsm.TRADES.TRADESPackage#getCatalog_Metadata()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Catalog#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getCatalog_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Backmatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backmatter</em>' containment reference.
	 * @see #setBackmatter(BackMatter)
	 * @see dsm.TRADES.TRADESPackage#getCatalog_Backmatter()
	 * @model containment="true"
	 * @generated
	 */
	BackMatter getBackmatter();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Catalog#getBackmatter <em>Backmatter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backmatter</em>' containment reference.
	 * @see #getBackmatter()
	 * @generated
	 */
	void setBackmatter(BackMatter value);

	/**
	 * Returns the value of the '<em><b>Oscalcontrols</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ControlDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oscalcontrols</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getCatalog_Oscalcontrols()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlDefinition> getOscalcontrols();

} // Catalog
