/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.AffectRelation;
import dsm.TRADES.Component;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.Data;
import dsm.TRADES.DataOwner;
import dsm.TRADES.DataOwnerElement;
import dsm.TRADES.NamedElement;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getDataOwner <em>Data Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getControlOwner <em>Control Owner</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getAllocatedThreat <em>Allocated Threat</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getThreatAllocations <em>Threat Allocations</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getAffectrelation <em>Affectrelation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getThreat <em>Threat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ComponentOwnerImpl implements Component {
	/**
	 * The cached value of the '{@link #getDataOwner() <em>Data Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOwner()
	 * @generated
	 * @ordered
	 */
	protected DataOwner dataOwner;

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
	 * The cached value of the '{@link #getControlOwner() <em>Control Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlOwner()
	 * @generated
	 * @ordered
	 */
	protected ControlOwner controlOwner;

	/**
	 * The cached value of the '{@link #getAllocatedThreat() <em>Allocated Threat</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedThreat()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> allocatedThreat;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> implements_;

	/**
	 * The cached value of the '{@link #getThreatAllocations() <em>Threat Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreatAllocationRelation> threatAllocations;

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
	 * The cached value of the '{@link #getThreat() <em>Threat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreat()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> threat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataOwner getDataOwner() {
		return dataOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataOwner(DataOwner newDataOwner, NotificationChain msgs) {
		DataOwner oldDataOwner = dataOwner;
		dataOwner = newDataOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.COMPONENT__DATA_OWNER, oldDataOwner, newDataOwner);
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
	public void setDataOwner(DataOwner newDataOwner) {
		if (newDataOwner != dataOwner) {
			NotificationChain msgs = null;
			if (dataOwner != null)
				msgs = ((InternalEObject) dataOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.COMPONENT__DATA_OWNER, null, msgs);
			if (newDataOwner != null)
				msgs = ((InternalEObject) newDataOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.COMPONENT__DATA_OWNER, null, msgs);
			msgs = basicSetDataOwner(newDataOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.COMPONENT__DATA_OWNER, newDataOwner,
					newDataOwner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlOwner getControlOwner() {
		return controlOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlOwner(ControlOwner newControlOwner, NotificationChain msgs) {
		ControlOwner oldControlOwner = controlOwner;
		controlOwner = newControlOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.COMPONENT__CONTROL_OWNER, oldControlOwner, newControlOwner);
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
	public void setControlOwner(ControlOwner newControlOwner) {
		if (newControlOwner != controlOwner) {
			NotificationChain msgs = null;
			if (controlOwner != null)
				msgs = ((InternalEObject) controlOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.COMPONENT__CONTROL_OWNER, null, msgs);
			if (newControlOwner != null)
				msgs = ((InternalEObject) newControlOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.COMPONENT__CONTROL_OWNER, null, msgs);
			msgs = basicSetControlOwner(newControlOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.COMPONENT__CONTROL_OWNER,
					newControlOwner, newControlOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Threat> getAllocatedThreat() {
		if (allocatedThreat == null) {
			allocatedThreat = new EObjectWithInverseResolvingEList.ManyInverse<Threat>(Threat.class, this,
					TRADESPackage.COMPONENT__ALLOCATED_THREAT, TRADESPackage.THREAT__ALLOCATED);
		}
		return allocatedThreat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectWithInverseResolvingEList.ManyInverse<Control>(Control.class, this,
					TRADESPackage.COMPONENT__IMPLEMENTS, TRADESPackage.CONTROL__IMPLEMENTED_BY);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreatAllocationRelation> getThreatAllocations() {
		if (threatAllocations == null) {
			threatAllocations = new EObjectContainmentWithInverseEList<ThreatAllocationRelation>(
					ThreatAllocationRelation.class, this, TRADESPackage.COMPONENT__THREAT_ALLOCATIONS,
					TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT);
		}
		return threatAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffectRelation> getAffectrelation() {
		if (affectrelation == null) {
			affectrelation = new EObjectContainmentWithInverseEList<AffectRelation>(AffectRelation.class, this,
					TRADESPackage.COMPONENT__AFFECTRELATION, TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT);
		}
		return affectrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Threat> getThreat() {
		if (threat == null) {
			threat = new EObjectContainmentEList<Threat>(Threat.class, this, TRADESPackage.COMPONENT__THREAT);
		}
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getAllControls() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getDatas() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getInheritedDatas() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getAllDatas() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		case TRADESPackage.COMPONENT__ALLOCATED_THREAT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAllocatedThreat()).basicAdd(otherEnd, msgs);
		case TRADESPackage.COMPONENT__IMPLEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getImplements()).basicAdd(otherEnd, msgs);
		case TRADESPackage.COMPONENT__THREAT_ALLOCATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getThreatAllocations()).basicAdd(otherEnd,
					msgs);
		case TRADESPackage.COMPONENT__AFFECTRELATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAffectrelation()).basicAdd(otherEnd, msgs);
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
		case TRADESPackage.COMPONENT__DATA_OWNER:
			return basicSetDataOwner(null, msgs);
		case TRADESPackage.COMPONENT__CONTROL_OWNER:
			return basicSetControlOwner(null, msgs);
		case TRADESPackage.COMPONENT__ALLOCATED_THREAT:
			return ((InternalEList<?>) getAllocatedThreat()).basicRemove(otherEnd, msgs);
		case TRADESPackage.COMPONENT__IMPLEMENTS:
			return ((InternalEList<?>) getImplements()).basicRemove(otherEnd, msgs);
		case TRADESPackage.COMPONENT__THREAT_ALLOCATIONS:
			return ((InternalEList<?>) getThreatAllocations()).basicRemove(otherEnd, msgs);
		case TRADESPackage.COMPONENT__AFFECTRELATION:
			return ((InternalEList<?>) getAffectrelation()).basicRemove(otherEnd, msgs);
		case TRADESPackage.COMPONENT__THREAT:
			return ((InternalEList<?>) getThreat()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.COMPONENT__DATA_OWNER:
			return getDataOwner();
		case TRADESPackage.COMPONENT__NAME:
			return getName();
		case TRADESPackage.COMPONENT__CONTROL_OWNER:
			return getControlOwner();
		case TRADESPackage.COMPONENT__ALLOCATED_THREAT:
			return getAllocatedThreat();
		case TRADESPackage.COMPONENT__IMPLEMENTS:
			return getImplements();
		case TRADESPackage.COMPONENT__THREAT_ALLOCATIONS:
			return getThreatAllocations();
		case TRADESPackage.COMPONENT__AFFECTRELATION:
			return getAffectrelation();
		case TRADESPackage.COMPONENT__THREAT:
			return getThreat();
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
		case TRADESPackage.COMPONENT__DATA_OWNER:
			setDataOwner((DataOwner) newValue);
			return;
		case TRADESPackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.COMPONENT__CONTROL_OWNER:
			setControlOwner((ControlOwner) newValue);
			return;
		case TRADESPackage.COMPONENT__ALLOCATED_THREAT:
			getAllocatedThreat().clear();
			getAllocatedThreat().addAll((Collection<? extends Threat>) newValue);
			return;
		case TRADESPackage.COMPONENT__IMPLEMENTS:
			getImplements().clear();
			getImplements().addAll((Collection<? extends Control>) newValue);
			return;
		case TRADESPackage.COMPONENT__THREAT_ALLOCATIONS:
			getThreatAllocations().clear();
			getThreatAllocations().addAll((Collection<? extends ThreatAllocationRelation>) newValue);
			return;
		case TRADESPackage.COMPONENT__AFFECTRELATION:
			getAffectrelation().clear();
			getAffectrelation().addAll((Collection<? extends AffectRelation>) newValue);
			return;
		case TRADESPackage.COMPONENT__THREAT:
			getThreat().clear();
			getThreat().addAll((Collection<? extends Threat>) newValue);
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
		case TRADESPackage.COMPONENT__DATA_OWNER:
			setDataOwner((DataOwner) null);
			return;
		case TRADESPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.COMPONENT__CONTROL_OWNER:
			setControlOwner((ControlOwner) null);
			return;
		case TRADESPackage.COMPONENT__ALLOCATED_THREAT:
			getAllocatedThreat().clear();
			return;
		case TRADESPackage.COMPONENT__IMPLEMENTS:
			getImplements().clear();
			return;
		case TRADESPackage.COMPONENT__THREAT_ALLOCATIONS:
			getThreatAllocations().clear();
			return;
		case TRADESPackage.COMPONENT__AFFECTRELATION:
			getAffectrelation().clear();
			return;
		case TRADESPackage.COMPONENT__THREAT:
			getThreat().clear();
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
		case TRADESPackage.COMPONENT__DATA_OWNER:
			return dataOwner != null;
		case TRADESPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.COMPONENT__CONTROL_OWNER:
			return controlOwner != null;
		case TRADESPackage.COMPONENT__ALLOCATED_THREAT:
			return allocatedThreat != null && !allocatedThreat.isEmpty();
		case TRADESPackage.COMPONENT__IMPLEMENTS:
			return implements_ != null && !implements_.isEmpty();
		case TRADESPackage.COMPONENT__THREAT_ALLOCATIONS:
			return threatAllocations != null && !threatAllocations.isEmpty();
		case TRADESPackage.COMPONENT__AFFECTRELATION:
			return affectrelation != null && !affectrelation.isEmpty();
		case TRADESPackage.COMPONENT__THREAT:
			return threat != null && !threat.isEmpty();
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
		if (baseClass == DataOwnerElement.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.COMPONENT__DATA_OWNER:
				return TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.COMPONENT__NAME:
				return TRADESPackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractControlOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.COMPONENT__CONTROL_OWNER:
				return TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER;
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
		if (baseClass == DataOwnerElement.class) {
			switch (baseFeatureID) {
			case TRADESPackage.DATA_OWNER_ELEMENT__DATA_OWNER:
				return TRADESPackage.COMPONENT__DATA_OWNER;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case TRADESPackage.NAMED_ELEMENT__NAME:
				return TRADESPackage.COMPONENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractControlOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER:
				return TRADESPackage.COMPONENT__CONTROL_OWNER;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == DataOwnerElement.class) {
			switch (baseOperationID) {
			case TRADESPackage.DATA_OWNER_ELEMENT___GET_DATAS:
				return TRADESPackage.COMPONENT___GET_DATAS;
			case TRADESPackage.DATA_OWNER_ELEMENT___GET_INHERITED_DATAS:
				return TRADESPackage.COMPONENT___GET_INHERITED_DATAS;
			case TRADESPackage.DATA_OWNER_ELEMENT___GET_ALL_DATAS:
				return TRADESPackage.COMPONENT___GET_ALL_DATAS;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == AbstractControlOwner.class) {
			switch (baseOperationID) {
			case TRADESPackage.ABSTRACT_CONTROL_OWNER___GET_ALL_CONTROLS:
				return TRADESPackage.COMPONENT___GET_ALL_CONTROLS;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TRADESPackage.COMPONENT___GET_ALL_CONTROLS:
			return getAllControls();
		case TRADESPackage.COMPONENT___GET_DATAS:
			return getDatas();
		case TRADESPackage.COMPONENT___GET_INHERITED_DATAS:
			return getInheritedDatas();
		case TRADESPackage.COMPONENT___GET_ALL_DATAS:
			return getAllDatas();
		}
		return super.eInvoke(operationID, arguments);
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

} //ComponentImpl
