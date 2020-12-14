/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.TRADESPackage;
import dsm.TRADES.ThreatType;
import dsm.TRADES.ThreatsOwner;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threats Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ThreatsOwnerImpl#getInternal <em>Internal</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatsOwnerImpl#getExternal <em>External</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatsOwnerImpl extends MinimalEObjectImpl.Container implements ThreatsOwner {
	/**
	 * The cached value of the '{@link #getInternal() <em>Internal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternal()
	 * @generated
	 * @ordered
	 */
	protected ThreatType internal;

	/**
	 * The cached value of the '{@link #getExternal() <em>External</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternal()
	 * @generated
	 * @ordered
	 */
	protected ThreatType external;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatsOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.THREATS_OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatType getInternal() {
		return internal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternal(ThreatType newInternal, NotificationChain msgs) {
		ThreatType oldInternal = internal;
		internal = newInternal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.THREATS_OWNER__INTERNAL, oldInternal, newInternal);
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
	public void setInternal(ThreatType newInternal) {
		if (newInternal != internal) {
			NotificationChain msgs = null;
			if (internal != null)
				msgs = ((InternalEObject) internal).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.THREATS_OWNER__INTERNAL, null, msgs);
			if (newInternal != null)
				msgs = ((InternalEObject) newInternal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.THREATS_OWNER__INTERNAL, null, msgs);
			msgs = basicSetInternal(newInternal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREATS_OWNER__INTERNAL, newInternal,
					newInternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatType getExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternal(ThreatType newExternal, NotificationChain msgs) {
		ThreatType oldExternal = external;
		external = newExternal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.THREATS_OWNER__EXTERNAL, oldExternal, newExternal);
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
	public void setExternal(ThreatType newExternal) {
		if (newExternal != external) {
			NotificationChain msgs = null;
			if (external != null)
				msgs = ((InternalEObject) external).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.THREATS_OWNER__EXTERNAL, null, msgs);
			if (newExternal != null)
				msgs = ((InternalEObject) newExternal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.THREATS_OWNER__EXTERNAL, null, msgs);
			msgs = basicSetExternal(newExternal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREATS_OWNER__EXTERNAL, newExternal,
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
		case TRADESPackage.THREATS_OWNER__INTERNAL:
			return basicSetInternal(null, msgs);
		case TRADESPackage.THREATS_OWNER__EXTERNAL:
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
		case TRADESPackage.THREATS_OWNER__INTERNAL:
			return getInternal();
		case TRADESPackage.THREATS_OWNER__EXTERNAL:
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
		case TRADESPackage.THREATS_OWNER__INTERNAL:
			setInternal((ThreatType) newValue);
			return;
		case TRADESPackage.THREATS_OWNER__EXTERNAL:
			setExternal((ThreatType) newValue);
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
		case TRADESPackage.THREATS_OWNER__INTERNAL:
			setInternal((ThreatType) null);
			return;
		case TRADESPackage.THREATS_OWNER__EXTERNAL:
			setExternal((ThreatType) null);
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
		case TRADESPackage.THREATS_OWNER__INTERNAL:
			return internal != null;
		case TRADESPackage.THREATS_OWNER__EXTERNAL:
			return external != null;
		}
		return super.eIsSet(featureID);
	}

} //ThreatsOwnerImpl
