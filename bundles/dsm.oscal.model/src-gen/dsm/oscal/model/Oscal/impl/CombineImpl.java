/**
 */
package dsm.oscal.model.Oscal.impl;

import dsm.oscal.model.Oscal.Combine;
import dsm.oscal.model.Oscal.Custom;
import dsm.oscal.model.Oscal.OscalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.CombineImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.CombineImpl#isAsIs <em>As Is</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.CombineImpl#getCustom <em>Custom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombineImpl extends MinimalEObjectImpl.Container implements Combine {
	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #isAsIs() <em>As Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsIs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AS_IS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsIs() <em>As Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsIs()
	 * @generated
	 * @ordered
	 */
	protected boolean asIs = AS_IS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustom() <em>Custom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom()
	 * @generated
	 * @ordered
	 */
	protected Custom custom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.COMBINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.COMBINE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsIs() {
		return asIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsIs(boolean newAsIs) {
		boolean oldAsIs = asIs;
		asIs = newAsIs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.COMBINE__AS_IS, oldAsIs, asIs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custom getCustom() {
		return custom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustom(Custom newCustom, NotificationChain msgs) {
		Custom oldCustom = custom;
		custom = newCustom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscalPackage.COMBINE__CUSTOM,
					oldCustom, newCustom);
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
	public void setCustom(Custom newCustom) {
		if (newCustom != custom) {
			NotificationChain msgs = null;
			if (custom != null)
				msgs = ((InternalEObject) custom).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.COMBINE__CUSTOM, null, msgs);
			if (newCustom != null)
				msgs = ((InternalEObject) newCustom).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.COMBINE__CUSTOM, null, msgs);
			msgs = basicSetCustom(newCustom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.COMBINE__CUSTOM, newCustom, newCustom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OscalPackage.COMBINE__CUSTOM:
			return basicSetCustom(null, msgs);
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
		case OscalPackage.COMBINE__METHOD:
			return getMethod();
		case OscalPackage.COMBINE__AS_IS:
			return isAsIs();
		case OscalPackage.COMBINE__CUSTOM:
			return getCustom();
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
		case OscalPackage.COMBINE__METHOD:
			setMethod((String) newValue);
			return;
		case OscalPackage.COMBINE__AS_IS:
			setAsIs((Boolean) newValue);
			return;
		case OscalPackage.COMBINE__CUSTOM:
			setCustom((Custom) newValue);
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
		case OscalPackage.COMBINE__METHOD:
			setMethod(METHOD_EDEFAULT);
			return;
		case OscalPackage.COMBINE__AS_IS:
			setAsIs(AS_IS_EDEFAULT);
			return;
		case OscalPackage.COMBINE__CUSTOM:
			setCustom((Custom) null);
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
		case OscalPackage.COMBINE__METHOD:
			return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
		case OscalPackage.COMBINE__AS_IS:
			return asIs != AS_IS_EDEFAULT;
		case OscalPackage.COMBINE__CUSTOM:
			return custom != null;
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
		result.append(" (method: ");
		result.append(method);
		result.append(", asIs: ");
		result.append(asIs);
		result.append(')');
		return result.toString();
	}

} //CombineImpl
