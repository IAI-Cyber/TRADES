/**
 */
package extTRADES;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see extTRADES.ExtTRADESPackage
 * @generated
 */
public interface ExtTRADESFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtTRADESFactory eINSTANCE = extTRADES.impl.ExtTRADESFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ext Threat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ext Threat</em>'.
	 * @generated
	 */
	extThreat createextThreat();

	/**
	 * Returns a new object of class '<em>Ext Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ext Control</em>'.
	 * @generated
	 */
	ExtControl createExtControl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtTRADESPackage getExtTRADESPackage();

} //ExtTRADESFactory
