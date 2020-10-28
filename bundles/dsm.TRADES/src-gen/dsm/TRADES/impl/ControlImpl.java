/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.Component;
import dsm.TRADES.Control;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ControlImpl#getMitigates <em>Mitigates</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlImpl#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends MinimalEObjectImpl.Container implements Control {
	/**
	 * The cached value of the '{@link #getMitigates() <em>Mitigates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigates()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> mitigates;

	/**
	 * The cached value of the '{@link #getImplementedBy() <em>Implemented By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> implementedBy;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Threat> getMitigates() {
		if (mitigates == null) {
			mitigates = new EObjectResolvingEList<Threat>(Threat.class, this, TRADESPackage.CONTROL__MITIGATES);
		}
		return mitigates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getImplementedBy() {
		if (implementedBy == null) {
			implementedBy = new EObjectWithInverseResolvingEList.ManyInverse<Component>(Component.class, this,
					TRADESPackage.CONTROL__IMPLEMENTED_BY, TRADESPackage.COMPONENT__IMPLEMENTS);
		}
		return implementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CONTROL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.CONTROL__IMPLEMENTED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getImplementedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.CONTROL__IMPLEMENTED_BY:
			return ((InternalEList<?>) getImplementedBy()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.CONTROL__MITIGATES:
			return getMitigates();
		case TRADESPackage.CONTROL__IMPLEMENTED_BY:
			return getImplementedBy();
		case TRADESPackage.CONTROL__NAME:
			return getName();
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
		case TRADESPackage.CONTROL__MITIGATES:
			getMitigates().clear();
			getMitigates().addAll((Collection<? extends Threat>) newValue);
			return;
		case TRADESPackage.CONTROL__IMPLEMENTED_BY:
			getImplementedBy().clear();
			getImplementedBy().addAll((Collection<? extends Component>) newValue);
			return;
		case TRADESPackage.CONTROL__NAME:
			setName((String) newValue);
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
		case TRADESPackage.CONTROL__MITIGATES:
			getMitigates().clear();
			return;
		case TRADESPackage.CONTROL__IMPLEMENTED_BY:
			getImplementedBy().clear();
			return;
		case TRADESPackage.CONTROL__NAME:
			setName(NAME_EDEFAULT);
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
		case TRADESPackage.CONTROL__MITIGATES:
			return mitigates != null && !mitigates.isEmpty();
		case TRADESPackage.CONTROL__IMPLEMENTED_BY:
			return implementedBy != null && !implementedBy.isEmpty();
		case TRADESPackage.CONTROL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ControlImpl
