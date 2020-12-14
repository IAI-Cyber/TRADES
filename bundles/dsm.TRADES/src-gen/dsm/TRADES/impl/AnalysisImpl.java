/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AffectRelation;
import dsm.TRADES.Analysis;
import dsm.TRADES.Control;
import dsm.TRADES.Data;
import dsm.TRADES.DataOwner;
import dsm.TRADES.NamedElement;
import dsm.TRADES.ScoreSystem;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.ThreatsOwner;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getData <em>Data</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getControl <em>Control</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getAffectrelation <em>Affectrelation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getScoresystem <em>Scoresystem</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getThreatOwner <em>Threat Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisImpl extends ComponentOwerImpl implements Analysis {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

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
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> control;

	/**
	 * The cached value of the '{@link #getAffectrelation() <em>Affectrelation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectrelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AffectRelation> affectrelation;

	/**
	 * The cached value of the '{@link #getScoresystem() <em>Scoresystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoresystem()
	 * @generated
	 * @ordered
	 */
	protected ScoreSystem scoresystem;

	/**
	 * The cached value of the '{@link #getThreatOwner() <em>Threat Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatOwner()
	 * @generated
	 * @ordered
	 */
	protected ThreatsOwner threatOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getControl() {
		if (control == null) {
			control = new EObjectContainmentEList<Control>(Control.class, this, TRADESPackage.ANALYSIS__CONTROL);
		}
		return control;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, TRADESPackage.ANALYSIS__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffectRelation> getAffectrelation() {
		if (affectrelation == null) {
			affectrelation = new EObjectContainmentEList<AffectRelation>(AffectRelation.class, this,
					TRADESPackage.ANALYSIS__AFFECTRELATION);
		}
		return affectrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScoreSystem getScoresystem() {
		return scoresystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoresystem(ScoreSystem newScoresystem, NotificationChain msgs) {
		ScoreSystem oldScoresystem = scoresystem;
		scoresystem = newScoresystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ANALYSIS__SCORESYSTEM, oldScoresystem, newScoresystem);
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
	public void setScoresystem(ScoreSystem newScoresystem) {
		if (newScoresystem != scoresystem) {
			NotificationChain msgs = null;
			if (scoresystem != null)
				msgs = ((InternalEObject) scoresystem).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__SCORESYSTEM, null, msgs);
			if (newScoresystem != null)
				msgs = ((InternalEObject) newScoresystem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__SCORESYSTEM, null, msgs);
			msgs = basicSetScoresystem(newScoresystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__SCORESYSTEM, newScoresystem,
					newScoresystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatsOwner getThreatOwner() {
		return threatOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreatOwner(ThreatsOwner newThreatOwner, NotificationChain msgs) {
		ThreatsOwner oldThreatOwner = threatOwner;
		threatOwner = newThreatOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ANALYSIS__THREAT_OWNER, oldThreatOwner, newThreatOwner);
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
	public void setThreatOwner(ThreatsOwner newThreatOwner) {
		if (newThreatOwner != threatOwner) {
			NotificationChain msgs = null;
			if (threatOwner != null)
				msgs = ((InternalEObject) threatOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__THREAT_OWNER, null, msgs);
			if (newThreatOwner != null)
				msgs = ((InternalEObject) newThreatOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__THREAT_OWNER, null, msgs);
			msgs = basicSetThreatOwner(newThreatOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__THREAT_OWNER, newThreatOwner,
					newThreatOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.ANALYSIS__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ANALYSIS__CONTROL:
			return ((InternalEList<?>) getControl()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ANALYSIS__AFFECTRELATION:
			return ((InternalEList<?>) getAffectrelation()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ANALYSIS__SCORESYSTEM:
			return basicSetScoresystem(null, msgs);
		case TRADESPackage.ANALYSIS__THREAT_OWNER:
			return basicSetThreatOwner(null, msgs);
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
		case TRADESPackage.ANALYSIS__DATA:
			return getData();
		case TRADESPackage.ANALYSIS__NAME:
			return getName();
		case TRADESPackage.ANALYSIS__CONTROL:
			return getControl();
		case TRADESPackage.ANALYSIS__AFFECTRELATION:
			return getAffectrelation();
		case TRADESPackage.ANALYSIS__SCORESYSTEM:
			return getScoresystem();
		case TRADESPackage.ANALYSIS__THREAT_OWNER:
			return getThreatOwner();
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
		case TRADESPackage.ANALYSIS__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case TRADESPackage.ANALYSIS__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.ANALYSIS__CONTROL:
			getControl().clear();
			getControl().addAll((Collection<? extends Control>) newValue);
			return;
		case TRADESPackage.ANALYSIS__AFFECTRELATION:
			getAffectrelation().clear();
			getAffectrelation().addAll((Collection<? extends AffectRelation>) newValue);
			return;
		case TRADESPackage.ANALYSIS__SCORESYSTEM:
			setScoresystem((ScoreSystem) newValue);
			return;
		case TRADESPackage.ANALYSIS__THREAT_OWNER:
			setThreatOwner((ThreatsOwner) newValue);
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
		case TRADESPackage.ANALYSIS__DATA:
			getData().clear();
			return;
		case TRADESPackage.ANALYSIS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.ANALYSIS__CONTROL:
			getControl().clear();
			return;
		case TRADESPackage.ANALYSIS__AFFECTRELATION:
			getAffectrelation().clear();
			return;
		case TRADESPackage.ANALYSIS__SCORESYSTEM:
			setScoresystem((ScoreSystem) null);
			return;
		case TRADESPackage.ANALYSIS__THREAT_OWNER:
			setThreatOwner((ThreatsOwner) null);
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
		case TRADESPackage.ANALYSIS__DATA:
			return data != null && !data.isEmpty();
		case TRADESPackage.ANALYSIS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.ANALYSIS__CONTROL:
			return control != null && !control.isEmpty();
		case TRADESPackage.ANALYSIS__AFFECTRELATION:
			return affectrelation != null && !affectrelation.isEmpty();
		case TRADESPackage.ANALYSIS__SCORESYSTEM:
			return scoresystem != null;
		case TRADESPackage.ANALYSIS__THREAT_OWNER:
			return threatOwner != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DataOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.ANALYSIS__DATA:
				return TRADESPackage.DATA_OWNER__DATA;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.ANALYSIS__NAME:
				return TRADESPackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DataOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.DATA_OWNER__DATA:
				return TRADESPackage.ANALYSIS__DATA;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case TRADESPackage.NAMED_ELEMENT__NAME:
				return TRADESPackage.ANALYSIS__NAME;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //AnalysisImpl
