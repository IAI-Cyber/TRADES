/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AttackChain;
import dsm.TRADES.AttackChainStep;
import dsm.TRADES.TRADESPackage;

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
 * An implementation of the model object '<em><b>Attack Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AttackChainImpl#getAttackchainstep <em>Attackchainstep</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainImpl#getStart <em>Start</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackChainImpl extends MinimalEObjectImpl.Container implements AttackChain {
	/**
	 * The cached value of the '{@link #getAttackchainstep() <em>Attackchainstep</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackchainstep()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackChainStep> attackchainstep;

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
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected AttackChainStep start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected AttackChainStep end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ATTACK_CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttackChainStep> getAttackchainstep() {
		if (attackchainstep == null) {
			attackchainstep = new EObjectContainmentEList<AttackChainStep>(AttackChainStep.class, this,
					TRADESPackage.ATTACK_CHAIN__ATTACKCHAINSTEP);
		}
		return attackchainstep;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ATTACK_CHAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttackChainStep getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject) start;
			start = (AttackChainStep) eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TRADESPackage.ATTACK_CHAIN__START,
							oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackChainStep basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(AttackChainStep newStart) {
		AttackChainStep oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ATTACK_CHAIN__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttackChainStep getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject) end;
			end = (AttackChainStep) eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TRADESPackage.ATTACK_CHAIN__END, oldEnd,
							end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackChainStep basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(AttackChainStep newEnd) {
		AttackChainStep oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ATTACK_CHAIN__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.ATTACK_CHAIN__ATTACKCHAINSTEP:
			return ((InternalEList<?>) getAttackchainstep()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.ATTACK_CHAIN__ATTACKCHAINSTEP:
			return getAttackchainstep();
		case TRADESPackage.ATTACK_CHAIN__NAME:
			return getName();
		case TRADESPackage.ATTACK_CHAIN__START:
			if (resolve)
				return getStart();
			return basicGetStart();
		case TRADESPackage.ATTACK_CHAIN__END:
			if (resolve)
				return getEnd();
			return basicGetEnd();
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
		case TRADESPackage.ATTACK_CHAIN__ATTACKCHAINSTEP:
			getAttackchainstep().clear();
			getAttackchainstep().addAll((Collection<? extends AttackChainStep>) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN__START:
			setStart((AttackChainStep) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN__END:
			setEnd((AttackChainStep) newValue);
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
		case TRADESPackage.ATTACK_CHAIN__ATTACKCHAINSTEP:
			getAttackchainstep().clear();
			return;
		case TRADESPackage.ATTACK_CHAIN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.ATTACK_CHAIN__START:
			setStart((AttackChainStep) null);
			return;
		case TRADESPackage.ATTACK_CHAIN__END:
			setEnd((AttackChainStep) null);
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
		case TRADESPackage.ATTACK_CHAIN__ATTACKCHAINSTEP:
			return attackchainstep != null && !attackchainstep.isEmpty();
		case TRADESPackage.ATTACK_CHAIN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.ATTACK_CHAIN__START:
			return start != null;
		case TRADESPackage.ATTACK_CHAIN__END:
			return end != null;
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

} //AttackChainImpl
