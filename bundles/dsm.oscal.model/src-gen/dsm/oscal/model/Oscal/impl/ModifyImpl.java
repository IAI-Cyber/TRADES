/**
 */
package dsm.oscal.model.Oscal.impl;

import dsm.oscal.model.Oscal.Alter;
import dsm.oscal.model.Oscal.Modify;
import dsm.oscal.model.Oscal.OscalPackage;
import dsm.oscal.model.Oscal.SetParameter;

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
 * An implementation of the model object '<em><b>Modify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.ModifyImpl#getSetparameters <em>Setparameters</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.ModifyImpl#getAlters <em>Alters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifyImpl extends MinimalEObjectImpl.Container implements Modify {
	/**
	 * The cached value of the '{@link #getSetparameters() <em>Setparameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetparameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SetParameter> setparameters;

	/**
	 * The cached value of the '{@link #getAlters() <em>Alters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlters()
	 * @generated
	 * @ordered
	 */
	protected EList<Alter> alters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.MODIFY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetParameter> getSetparameters() {
		if (setparameters == null) {
			setparameters = new EObjectContainmentEList<SetParameter>(SetParameter.class, this,
					OscalPackage.MODIFY__SETPARAMETERS);
		}
		return setparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alter> getAlters() {
		if (alters == null) {
			alters = new EObjectContainmentEList<Alter>(Alter.class, this, OscalPackage.MODIFY__ALTERS);
		}
		return alters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OscalPackage.MODIFY__SETPARAMETERS:
			return ((InternalEList<?>) getSetparameters()).basicRemove(otherEnd, msgs);
		case OscalPackage.MODIFY__ALTERS:
			return ((InternalEList<?>) getAlters()).basicRemove(otherEnd, msgs);
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
		case OscalPackage.MODIFY__SETPARAMETERS:
			return getSetparameters();
		case OscalPackage.MODIFY__ALTERS:
			return getAlters();
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
		case OscalPackage.MODIFY__SETPARAMETERS:
			getSetparameters().clear();
			getSetparameters().addAll((Collection<? extends SetParameter>) newValue);
			return;
		case OscalPackage.MODIFY__ALTERS:
			getAlters().clear();
			getAlters().addAll((Collection<? extends Alter>) newValue);
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
		case OscalPackage.MODIFY__SETPARAMETERS:
			getSetparameters().clear();
			return;
		case OscalPackage.MODIFY__ALTERS:
			getAlters().clear();
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
		case OscalPackage.MODIFY__SETPARAMETERS:
			return setparameters != null && !setparameters.isEmpty();
		case OscalPackage.MODIFY__ALTERS:
			return alters != null && !alters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModifyImpl
