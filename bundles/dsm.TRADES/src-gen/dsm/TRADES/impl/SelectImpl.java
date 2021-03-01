/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.Select;
import dsm.TRADES.TRADESPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.SelectImpl#getHowMany <em>How Many</em>}</li>
 *   <li>{@link dsm.TRADES.impl.SelectImpl#getChoice <em>Choice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectImpl extends MinimalEObjectImpl.Container implements Select {
	/**
	 * The default value of the '{@link #getHowMany() <em>How Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowMany()
	 * @generated
	 * @ordered
	 */
	protected static final String HOW_MANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHowMany() <em>How Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowMany()
	 * @generated
	 * @ordered
	 */
	protected String howMany = HOW_MANY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChoice() <em>Choice</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected EList<String> choice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHowMany() {
		return howMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHowMany(String newHowMany) {
		String oldHowMany = howMany;
		howMany = newHowMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.SELECT__HOW_MANY, oldHowMany, howMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getChoice() {
		if (choice == null) {
			choice = new EDataTypeUniqueEList<String>(String.class, this, TRADESPackage.SELECT__CHOICE);
		}
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.SELECT__HOW_MANY:
			return getHowMany();
		case TRADESPackage.SELECT__CHOICE:
			return getChoice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TRADESPackage.SELECT__HOW_MANY:
			setHowMany((String) newValue);
			return;
		case TRADESPackage.SELECT__CHOICE:
			getChoice().clear();
			getChoice().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TRADESPackage.SELECT__HOW_MANY:
			setHowMany(HOW_MANY_EDEFAULT);
			return;
		case TRADESPackage.SELECT__CHOICE:
			getChoice().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TRADESPackage.SELECT__HOW_MANY:
			return HOW_MANY_EDEFAULT == null ? howMany != null : !HOW_MANY_EDEFAULT.equals(howMany);
		case TRADESPackage.SELECT__CHOICE:
			return choice != null && !choice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (howMany: ");
		result.append(howMany);
		result.append(", choice: ");
		result.append(choice);
		result.append(')');
		return result.toString();
	}

} //SelectImpl
