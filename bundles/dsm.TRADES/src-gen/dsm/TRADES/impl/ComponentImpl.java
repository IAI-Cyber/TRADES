/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AffectRelation;
import dsm.TRADES.Analysis;
import dsm.TRADES.Component;
import dsm.TRADES.Control;
import dsm.TRADES.Data;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getAllocatedThreat <em>Allocated Threat</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getThreatallocation <em>Threatallocation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getData <em>Data</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getControl <em>Control</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getAffectrelation <em>Affectrelation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ComponentImpl#getThreat <em>Threat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	 * The cached value of the '{@link #getThreatallocation() <em>Threatallocation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatallocation()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreatAllocationRelation> threatallocation;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

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
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> control;

	/**
	 * The cached value of the '{@link #getAnalysis() <em>Analysis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysis()
	 * @generated
	 * @ordered
	 */
	protected EList<Analysis> analysis;

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
	public EList<ThreatAllocationRelation> getThreatallocation() {
		if (threatallocation == null) {
			threatallocation = new EObjectWithInverseResolvingEList<ThreatAllocationRelation>(
					ThreatAllocationRelation.class, this, TRADESPackage.COMPONENT__THREATALLOCATION,
					TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT);
		}
		return threatallocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this,
					TRADESPackage.COMPONENT__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, TRADESPackage.COMPONENT__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getControl() {
		if (control == null) {
			control = new EObjectContainmentEList<Control>(Control.class, this, TRADESPackage.COMPONENT__CONTROL);
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Analysis> getAnalysis() {
		if (analysis == null) {
			analysis = new EObjectContainmentEList<Analysis>(Analysis.class, this, TRADESPackage.COMPONENT__ANALYSIS);
		}
		return analysis;
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
					TRADESPackage.COMPONENT__AFFECTRELATION);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.COMPONENT__ALLOCATED_THREAT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAllocatedThreat()).basicAdd(otherEnd, msgs);
		case TRADESPackage.COMPONENT__IMPLEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getImplements()).basicAdd(otherEnd, msgs);
		case TRADESPackage.COMPONENT__THREATALLOCATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getThreatallocation()).basicAdd(otherEnd, msgs);
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
		case TRADESPackage.COMPONENT__ALLOCATED_THREAT:
			return ((InternalEList<?>) getAllocatedThreat()).basicRemove(otherEnd, msgs);
		case TRADESPackage.COMPONENT__IMPLEMENTS:
			return ((InternalEList<?>) getImplements()).basicRemove(otherEnd, msgs);
		case TRADESPackage.COMPONENT__THREATALLOCATION:
			return ((InternalEList<?>) getThreatallocation()).basicRemove(otherEnd, msgs);
		case TRADESPackage.COMPONENT__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
		case TRADESPackage.COMPONENT__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case TRADESPackage.COMPONENT__CONTROL:
			return ((InternalEList<?>) getControl()).basicRemove(otherEnd, msgs);
		case TRADESPackage.COMPONENT__ANALYSIS:
			return ((InternalEList<?>) getAnalysis()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.COMPONENT__ALLOCATED_THREAT:
			return getAllocatedThreat();
		case TRADESPackage.COMPONENT__IMPLEMENTS:
			return getImplements();
		case TRADESPackage.COMPONENT__NAME:
			return getName();
		case TRADESPackage.COMPONENT__THREATALLOCATION:
			return getThreatallocation();
		case TRADESPackage.COMPONENT__COMPONENT:
			return getComponent();
		case TRADESPackage.COMPONENT__DATA:
			return getData();
		case TRADESPackage.COMPONENT__CONTROL:
			return getControl();
		case TRADESPackage.COMPONENT__ANALYSIS:
			return getAnalysis();
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
		case TRADESPackage.COMPONENT__ALLOCATED_THREAT:
			getAllocatedThreat().clear();
			getAllocatedThreat().addAll((Collection<? extends Threat>) newValue);
			return;
		case TRADESPackage.COMPONENT__IMPLEMENTS:
			getImplements().clear();
			getImplements().addAll((Collection<? extends Control>) newValue);
			return;
		case TRADESPackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.COMPONENT__THREATALLOCATION:
			getThreatallocation().clear();
			getThreatallocation().addAll((Collection<? extends ThreatAllocationRelation>) newValue);
			return;
		case TRADESPackage.COMPONENT__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends Component>) newValue);
			return;
		case TRADESPackage.COMPONENT__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case TRADESPackage.COMPONENT__CONTROL:
			getControl().clear();
			getControl().addAll((Collection<? extends Control>) newValue);
			return;
		case TRADESPackage.COMPONENT__ANALYSIS:
			getAnalysis().clear();
			getAnalysis().addAll((Collection<? extends Analysis>) newValue);
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
		case TRADESPackage.COMPONENT__ALLOCATED_THREAT:
			getAllocatedThreat().clear();
			return;
		case TRADESPackage.COMPONENT__IMPLEMENTS:
			getImplements().clear();
			return;
		case TRADESPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.COMPONENT__THREATALLOCATION:
			getThreatallocation().clear();
			return;
		case TRADESPackage.COMPONENT__COMPONENT:
			getComponent().clear();
			return;
		case TRADESPackage.COMPONENT__DATA:
			getData().clear();
			return;
		case TRADESPackage.COMPONENT__CONTROL:
			getControl().clear();
			return;
		case TRADESPackage.COMPONENT__ANALYSIS:
			getAnalysis().clear();
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
		case TRADESPackage.COMPONENT__ALLOCATED_THREAT:
			return allocatedThreat != null && !allocatedThreat.isEmpty();
		case TRADESPackage.COMPONENT__IMPLEMENTS:
			return implements_ != null && !implements_.isEmpty();
		case TRADESPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.COMPONENT__THREATALLOCATION:
			return threatallocation != null && !threatallocation.isEmpty();
		case TRADESPackage.COMPONENT__COMPONENT:
			return component != null && !component.isEmpty();
		case TRADESPackage.COMPONENT__DATA:
			return data != null && !data.isEmpty();
		case TRADESPackage.COMPONENT__CONTROL:
			return control != null && !control.isEmpty();
		case TRADESPackage.COMPONENT__ANALYSIS:
			return analysis != null && !analysis.isEmpty();
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
