/**
 */
package dsm.oscal.model.Oscal.impl;

import dsm.oscal.model.Oscal.Call;
import dsm.oscal.model.Oscal.Exclude;
import dsm.oscal.model.Oscal.Match;
import dsm.oscal.model.Oscal.OscalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclude</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.ExcludeImpl#getCalls <em>Calls</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.ExcludeImpl#getMatchs <em>Matchs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcludeImpl extends MinimalEObjectImpl.Container implements Exclude {
	/**
	 * The cached value of the '{@link #getCalls() <em>Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<Call> calls;

	/**
	 * The cached value of the '{@link #getMatchs() <em>Matchs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchs()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matchs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.EXCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Call> getCalls() {
		if (calls == null) {
			calls = new EObjectContainmentEList<Call>(Call.class, this, OscalPackage.EXCLUDE__CALLS);
		}
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatchs() {
		if (matchs == null) {
			matchs = new EObjectContainmentEList<Match>(Match.class, this, OscalPackage.EXCLUDE__MATCHS);
		}
		return matchs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OscalPackage.EXCLUDE__CALLS:
			return ((InternalEList<?>) getCalls()).basicRemove(otherEnd, msgs);
		case OscalPackage.EXCLUDE__MATCHS:
			return ((InternalEList<?>) getMatchs()).basicRemove(otherEnd, msgs);
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
		case OscalPackage.EXCLUDE__CALLS:
			return getCalls();
		case OscalPackage.EXCLUDE__MATCHS:
			return getMatchs();
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
		case OscalPackage.EXCLUDE__CALLS:
			getCalls().clear();
			getCalls().addAll((Collection<? extends Call>) newValue);
			return;
		case OscalPackage.EXCLUDE__MATCHS:
			getMatchs().clear();
			getMatchs().addAll((Collection<? extends Match>) newValue);
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
		case OscalPackage.EXCLUDE__CALLS:
			getCalls().clear();
			return;
		case OscalPackage.EXCLUDE__MATCHS:
			getMatchs().clear();
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
		case OscalPackage.EXCLUDE__CALLS:
			return calls != null && !calls.isEmpty();
		case OscalPackage.EXCLUDE__MATCHS:
			return matchs != null && !matchs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExcludeImpl
