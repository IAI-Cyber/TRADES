/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.Data;
import dsm.TRADES.DataOwner;
import dsm.TRADES.DataOwnerElement;
import dsm.TRADES.TRADESPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Owner Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.DataOwnerElementImpl#getDataOwner <em>Data Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataOwnerElementImpl extends MinimalEObjectImpl.Container implements DataOwnerElement {
	/**
	 * The cached value of the '{@link #getDataOwner() <em>Data Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOwner()
	 * @generated
	 * @ordered
	 */
	protected DataOwner dataOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataOwnerElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.DATA_OWNER_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataOwner getDataOwner() {
		return dataOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataOwner(DataOwner newDataOwner, NotificationChain msgs) {
		DataOwner oldDataOwner = dataOwner;
		dataOwner = newDataOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER, oldDataOwner, newDataOwner);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataOwner(DataOwner newDataOwner) {
		if (newDataOwner != dataOwner) {
			NotificationChain msgs = null;
			if (dataOwner != null)
				msgs = ((InternalEObject) dataOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER, null, msgs);
			if (newDataOwner != null)
				msgs = ((InternalEObject) newDataOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER, null, msgs);
			msgs = basicSetDataOwner(newDataOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER,
					newDataOwner, newDataOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getDatas() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getInheritedDatas() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getAllDatas() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER:
			return basicSetDataOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER:
			return getDataOwner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER:
			setDataOwner((DataOwner) newValue);
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
		case TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER:
			setDataOwner((DataOwner) null);
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
		case TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER:
			return dataOwner != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TRADESPackage.DATA_OWNER_ELEMENT___GET_DATAS:
			return getDatas();
		case TRADESPackage.DATA_OWNER_ELEMENT___GET_INHERITED_DATAS:
			return getInheritedDatas();
		case TRADESPackage.DATA_OWNER_ELEMENT___GET_ALL_DATAS:
			return getAllDatas();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataOwnerElementImpl
