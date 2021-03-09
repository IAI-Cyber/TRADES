/**
 */
package dsm.oscal.model.Oscal.impl;

import dsm.oscal.model.Oscal.Addition;
import dsm.oscal.model.Oscal.Alter;
import dsm.oscal.model.Oscal.OscalPackage;
import dsm.oscal.model.Oscal.Remove;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.AlterImpl#getControlId <em>Control Id</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.AlterImpl#getRemoves <em>Removes</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.AlterImpl#getAdds <em>Adds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlterImpl extends MinimalEObjectImpl.Container implements Alter {
	/**
	 * The default value of the '{@link #getControlId() <em>Control Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlId() <em>Control Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlId()
	 * @generated
	 * @ordered
	 */
	protected String controlId = CONTROL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRemoves() <em>Removes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoves()
	 * @generated
	 * @ordered
	 */
	protected EList<Remove> removes;

	/**
	 * The cached value of the '{@link #getAdds() <em>Adds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdds()
	 * @generated
	 * @ordered
	 */
	protected EList<Addition> adds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.ALTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlId() {
		return controlId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlId(String newControlId) {
		String oldControlId = controlId;
		controlId = newControlId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.ALTER__CONTROL_ID, oldControlId,
					controlId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Remove> getRemoves() {
		if (removes == null) {
			removes = new EObjectContainmentEList<Remove>(Remove.class, this, OscalPackage.ALTER__REMOVES);
		}
		return removes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Addition> getAdds() {
		if (adds == null) {
			adds = new EObjectContainmentEList<Addition>(Addition.class, this, OscalPackage.ALTER__ADDS);
		}
		return adds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OscalPackage.ALTER__REMOVES:
			return ((InternalEList<?>) getRemoves()).basicRemove(otherEnd, msgs);
		case OscalPackage.ALTER__ADDS:
			return ((InternalEList<?>) getAdds()).basicRemove(otherEnd, msgs);
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
		case OscalPackage.ALTER__CONTROL_ID:
			return getControlId();
		case OscalPackage.ALTER__REMOVES:
			return getRemoves();
		case OscalPackage.ALTER__ADDS:
			return getAdds();
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
		case OscalPackage.ALTER__CONTROL_ID:
			setControlId((String) newValue);
			return;
		case OscalPackage.ALTER__REMOVES:
			getRemoves().clear();
			getRemoves().addAll((Collection<? extends Remove>) newValue);
			return;
		case OscalPackage.ALTER__ADDS:
			getAdds().clear();
			getAdds().addAll((Collection<? extends Addition>) newValue);
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
		case OscalPackage.ALTER__CONTROL_ID:
			setControlId(CONTROL_ID_EDEFAULT);
			return;
		case OscalPackage.ALTER__REMOVES:
			getRemoves().clear();
			return;
		case OscalPackage.ALTER__ADDS:
			getAdds().clear();
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
		case OscalPackage.ALTER__CONTROL_ID:
			return CONTROL_ID_EDEFAULT == null ? controlId != null : !CONTROL_ID_EDEFAULT.equals(controlId);
		case OscalPackage.ALTER__REMOVES:
			return removes != null && !removes.isEmpty();
		case OscalPackage.ALTER__ADDS:
			return adds != null && !adds.isEmpty();
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
		result.append(" (controlId: ");
		result.append(controlId);
		result.append(')');
		return result.toString();
	}

} //AlterImpl
