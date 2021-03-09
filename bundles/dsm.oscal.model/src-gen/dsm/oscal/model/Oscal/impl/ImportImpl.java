/**
 */
package dsm.oscal.model.Oscal.impl;

import dsm.oscal.model.Oscal.Exclude;
import dsm.oscal.model.Oscal.Import;
import dsm.oscal.model.Oscal.Include;
import dsm.oscal.model.Oscal.OscalPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.ImportImpl#getHerf <em>Herf</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.ImportImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.ImportImpl#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import {
	/**
	 * The default value of the '{@link #getHerf() <em>Herf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerf()
	 * @generated
	 * @ordered
	 */
	protected static final String HERF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHerf() <em>Herf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerf()
	 * @generated
	 * @ordered
	 */
	protected String herf = HERF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected Include include;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected Exclude exclude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHerf() {
		return herf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHerf(String newHerf) {
		String oldHerf = herf;
		herf = newHerf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.IMPORT__HERF, oldHerf, herf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include getInclude() {
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclude(Include newInclude, NotificationChain msgs) {
		Include oldInclude = include;
		include = newInclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscalPackage.IMPORT__INCLUDE,
					oldInclude, newInclude);
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
	public void setInclude(Include newInclude) {
		if (newInclude != include) {
			NotificationChain msgs = null;
			if (include != null)
				msgs = ((InternalEObject) include).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.IMPORT__INCLUDE, null, msgs);
			if (newInclude != null)
				msgs = ((InternalEObject) newInclude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.IMPORT__INCLUDE, null, msgs);
			msgs = basicSetInclude(newInclude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.IMPORT__INCLUDE, newInclude,
					newInclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exclude getExclude() {
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclude(Exclude newExclude, NotificationChain msgs) {
		Exclude oldExclude = exclude;
		exclude = newExclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscalPackage.IMPORT__EXCLUDE,
					oldExclude, newExclude);
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
	public void setExclude(Exclude newExclude) {
		if (newExclude != exclude) {
			NotificationChain msgs = null;
			if (exclude != null)
				msgs = ((InternalEObject) exclude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.IMPORT__EXCLUDE, null, msgs);
			if (newExclude != null)
				msgs = ((InternalEObject) newExclude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.IMPORT__EXCLUDE, null, msgs);
			msgs = basicSetExclude(newExclude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.IMPORT__EXCLUDE, newExclude,
					newExclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OscalPackage.IMPORT__INCLUDE:
			return basicSetInclude(null, msgs);
		case OscalPackage.IMPORT__EXCLUDE:
			return basicSetExclude(null, msgs);
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
		case OscalPackage.IMPORT__HERF:
			return getHerf();
		case OscalPackage.IMPORT__INCLUDE:
			return getInclude();
		case OscalPackage.IMPORT__EXCLUDE:
			return getExclude();
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
		case OscalPackage.IMPORT__HERF:
			setHerf((String) newValue);
			return;
		case OscalPackage.IMPORT__INCLUDE:
			setInclude((Include) newValue);
			return;
		case OscalPackage.IMPORT__EXCLUDE:
			setExclude((Exclude) newValue);
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
		case OscalPackage.IMPORT__HERF:
			setHerf(HERF_EDEFAULT);
			return;
		case OscalPackage.IMPORT__INCLUDE:
			setInclude((Include) null);
			return;
		case OscalPackage.IMPORT__EXCLUDE:
			setExclude((Exclude) null);
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
		case OscalPackage.IMPORT__HERF:
			return HERF_EDEFAULT == null ? herf != null : !HERF_EDEFAULT.equals(herf);
		case OscalPackage.IMPORT__INCLUDE:
			return include != null;
		case OscalPackage.IMPORT__EXCLUDE:
			return exclude != null;
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
		result.append(" (herf: ");
		result.append(herf);
		result.append(')');
		return result.toString();
	}

} //ImportImpl
