/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Select#getHowMany <em>How Many</em>}</li>
 *   <li>{@link dsm.TRADES.Select#getChoice <em>Choice</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends EObject {
	/**
	 * Returns the value of the '<em><b>How Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>How Many</em>' attribute.
	 * @see #setHowMany(String)
	 * @see dsm.TRADES.TRADESPackage#getSelect_HowMany()
	 * @model
	 * @generated
	 */
	String getHowMany();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Select#getHowMany <em>How Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>How Many</em>' attribute.
	 * @see #getHowMany()
	 * @generated
	 */
	void setHowMany(String value);

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' attribute list.
	 * @see dsm.TRADES.TRADESPackage#getSelect_Choice()
	 * @model
	 * @generated
	 */
	EList<String> getChoice();

} // Select
