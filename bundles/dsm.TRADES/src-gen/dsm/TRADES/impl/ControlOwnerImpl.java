/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.ControlOwner;
import dsm.TRADES.ControlType;
import dsm.TRADES.TRADESPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ControlOwnerImpl#getInternal <em>Internal</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlOwnerImpl#getExternal <em>External</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlOwnerImpl extends MinimalEObjectImpl.Container implements ControlOwner {
	/**
	 * The cached value of the '{@link #getInternal() <em>Internal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternal()
	 * @generated
	 * @ordered
	 */
	protected ControlType internal;

	/**
	 * The cached value of the '{@link #getExternal() <em>External</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternal()
	 * @generated
	 * @ordered
	 */
	protected ControlType external;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.CONTROL_OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlType getInternal() {
		return internal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternal(ControlType newInternal, NotificationChain msgs) {
		ControlType oldInternal = internal;
		internal = newInternal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.CONTROL_OWNER__INTERNAL, oldInternal, newInternal);
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
	public void setInternal(ControlType newInternal) {
		if (newInternal != internal) {
			NotificationChain msgs = null;
			if (internal != null)
				msgs = ((InternalEObject) internal).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.CONTROL_OWNER__INTERNAL, null, msgs);
			if (newInternal != null)
				msgs = ((InternalEObject) newInternal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.CONTROL_OWNER__INTERNAL, null, msgs);
			msgs = basicSetInternal(newInternal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CONTROL_OWNER__INTERNAL, newInternal,
					newInternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlType getExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternal(ControlType newExternal, NotificationChain msgs) {
		ControlType oldExternal = external;
		external = newExternal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.CONTROL_OWNER__EXTERNAL, oldExternal, newExternal);
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
	public void setExternal(ControlType newExternal) {
		if (newExternal != external) {
			NotificationChain msgs = null;
			if (external != null)
				msgs = ((InternalEObject) external).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.CONTROL_OWNER__EXTERNAL, null, msgs);
			if (newExternal != null)
				msgs = ((InternalEObject) newExternal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.CONTROL_OWNER__EXTERNAL, null, msgs);
			msgs = basicSetExternal(newExternal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CONTROL_OWNER__EXTERNAL, newExternal,
					newExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.CONTROL_OWNER__INTERNAL:
			return basicSetInternal(null, msgs);
		case TRADESPackage.CONTROL_OWNER__EXTERNAL:
			return basicSetExternal(null, msgs);
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
		case TRADESPackage.CONTROL_OWNER__INTERNAL:
			return getInternal();
		case TRADESPackage.CONTROL_OWNER__EXTERNAL:
			return getExternal();
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
		case TRADESPackage.CONTROL_OWNER__INTERNAL:
			setInternal((ControlType) newValue);
			return;
		case TRADESPackage.CONTROL_OWNER__EXTERNAL:
			setExternal((ControlType) newValue);
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
		case TRADESPackage.CONTROL_OWNER__INTERNAL:
			setInternal((ControlType) null);
			return;
		case TRADESPackage.CONTROL_OWNER__EXTERNAL:
			setExternal((ControlType) null);
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
		case TRADESPackage.CONTROL_OWNER__INTERNAL:
			return internal != null;
		case TRADESPackage.CONTROL_OWNER__EXTERNAL:
			return external != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlOwnerImpl
