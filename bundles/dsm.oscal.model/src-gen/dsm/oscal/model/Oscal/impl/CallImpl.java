/**
 */
package dsm.oscal.model.Oscal.impl;

import dsm.oscal.model.Oscal.Call;
import dsm.oscal.model.Oscal.OscalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.CallImpl#getControId <em>Contro Id</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.CallImpl#getWithChildControls <em>With Child Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallImpl extends MinimalEObjectImpl.Container implements Call {
	/**
	 * The default value of the '{@link #getControId() <em>Contro Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControId() <em>Contro Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControId()
	 * @generated
	 * @ordered
	 */
	protected String controId = CONTRO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWithChildControls() <em>With Child Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithChildControls()
	 * @generated
	 * @ordered
	 */
	protected static final short WITH_CHILD_CONTROLS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWithChildControls() <em>With Child Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithChildControls()
	 * @generated
	 * @ordered
	 */
	protected short withChildControls = WITH_CHILD_CONTROLS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControId() {
		return controId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControId(String newControId) {
		String oldControId = controId;
		controId = newControId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.CALL__CONTRO_ID, oldControId, controId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getWithChildControls() {
		return withChildControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithChildControls(short newWithChildControls) {
		short oldWithChildControls = withChildControls;
		withChildControls = newWithChildControls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.CALL__WITH_CHILD_CONTROLS,
					oldWithChildControls, withChildControls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OscalPackage.CALL__CONTRO_ID:
			return getControId();
		case OscalPackage.CALL__WITH_CHILD_CONTROLS:
			return getWithChildControls();
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
		case OscalPackage.CALL__CONTRO_ID:
			setControId((String) newValue);
			return;
		case OscalPackage.CALL__WITH_CHILD_CONTROLS:
			setWithChildControls((Short) newValue);
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
		case OscalPackage.CALL__CONTRO_ID:
			setControId(CONTRO_ID_EDEFAULT);
			return;
		case OscalPackage.CALL__WITH_CHILD_CONTROLS:
			setWithChildControls(WITH_CHILD_CONTROLS_EDEFAULT);
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
		case OscalPackage.CALL__CONTRO_ID:
			return CONTRO_ID_EDEFAULT == null ? controId != null : !CONTRO_ID_EDEFAULT.equals(controId);
		case OscalPackage.CALL__WITH_CHILD_CONTROLS:
			return withChildControls != WITH_CHILD_CONTROLS_EDEFAULT;
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
		result.append(" (controId: ");
		result.append(controId);
		result.append(", withChildControls: ");
		result.append(withChildControls);
		result.append(')');
		return result.toString();
	}

} //CallImpl
