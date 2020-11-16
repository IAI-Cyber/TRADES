/**
 */
package extTRADES.impl;

import extTRADES.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtTRADESFactoryImpl extends EFactoryImpl implements ExtTRADESFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtTRADESFactory init() {
		try {
			ExtTRADESFactory theExtTRADESFactory = (ExtTRADESFactory) EPackage.Registry.INSTANCE
					.getEFactory(ExtTRADESPackage.eNS_URI);
			if (theExtTRADESFactory != null) {
				return theExtTRADESFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtTRADESFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtTRADESFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ExtTRADESPackage.EXT_THREAT:
			return createextThreat();
		case ExtTRADESPackage.EXT_CONTROL:
			return createExtControl();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public extThreat createextThreat() {
		extThreatImpl extThreat = new extThreatImpl();
		return extThreat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtControl createExtControl() {
		ExtControlImpl extControl = new ExtControlImpl();
		return extControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtTRADESPackage getExtTRADESPackage() {
		return (ExtTRADESPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtTRADESPackage getPackage() {
		return ExtTRADESPackage.eINSTANCE;
	}

} //ExtTRADESFactoryImpl
