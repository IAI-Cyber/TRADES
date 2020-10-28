/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AffectRelation;
import dsm.TRADES.AffectedENUM;
import dsm.TRADES.Component;
import dsm.TRADES.Data;
import dsm.TRADES.TRADESPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affect Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AffectRelationImpl#getData <em>Data</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AffectRelationImpl#getSourceComponent <em>Source Component</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AffectRelationImpl#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AffectRelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AffectRelationImpl#getAnalysisStatus <em>Analysis Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffectRelationImpl extends MinimalEObjectImpl.Container implements AffectRelation {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getSourceComponent() <em>Source Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceComponent()
	 * @generated
	 * @ordered
	 */
	protected Component sourceComponent;

	/**
	 * The cached value of the '{@link #getTargetComponent() <em>Target Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetComponent()
	 * @generated
	 * @ordered
	 */
	protected Component targetComponent;

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
	 * The default value of the '{@link #getAnalysisStatus() <em>Analysis Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisStatus()
	 * @generated
	 * @ordered
	 */
	protected static final AffectedENUM ANALYSIS_STATUS_EDEFAULT = AffectedENUM.UNDECIDED;

	/**
	 * The cached value of the '{@link #getAnalysisStatus() <em>Analysis Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisStatus()
	 * @generated
	 * @ordered
	 */
	protected AffectedENUM analysisStatus = ANALYSIS_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffectRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.AFFECT_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectResolvingEList<Data>(Data.class, this, TRADESPackage.AFFECT_RELATION__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getSourceComponent() {
		if (sourceComponent != null && sourceComponent.eIsProxy()) {
			InternalEObject oldSourceComponent = (InternalEObject) sourceComponent;
			sourceComponent = (Component) eResolveProxy(oldSourceComponent);
			if (sourceComponent != oldSourceComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT, oldSourceComponent, sourceComponent));
			}
		}
		return sourceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetSourceComponent() {
		return sourceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceComponent(Component newSourceComponent) {
		Component oldSourceComponent = sourceComponent;
		sourceComponent = newSourceComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT,
					oldSourceComponent, sourceComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getTargetComponent() {
		if (targetComponent != null && targetComponent.eIsProxy()) {
			InternalEObject oldTargetComponent = (InternalEObject) targetComponent;
			targetComponent = (Component) eResolveProxy(oldTargetComponent);
			if (targetComponent != oldTargetComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.AFFECT_RELATION__TARGET_COMPONENT, oldTargetComponent, targetComponent));
			}
		}
		return targetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetTargetComponent() {
		return targetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetComponent(Component newTargetComponent) {
		Component oldTargetComponent = targetComponent;
		targetComponent = newTargetComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.AFFECT_RELATION__TARGET_COMPONENT,
					oldTargetComponent, targetComponent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.AFFECT_RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffectedENUM getAnalysisStatus() {
		return analysisStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnalysisStatus(AffectedENUM newAnalysisStatus) {
		AffectedENUM oldAnalysisStatus = analysisStatus;
		analysisStatus = newAnalysisStatus == null ? ANALYSIS_STATUS_EDEFAULT : newAnalysisStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.AFFECT_RELATION__ANALYSIS_STATUS,
					oldAnalysisStatus, analysisStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.AFFECT_RELATION__DATA:
			return getData();
		case TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT:
			if (resolve)
				return getSourceComponent();
			return basicGetSourceComponent();
		case TRADESPackage.AFFECT_RELATION__TARGET_COMPONENT:
			if (resolve)
				return getTargetComponent();
			return basicGetTargetComponent();
		case TRADESPackage.AFFECT_RELATION__NAME:
			return getName();
		case TRADESPackage.AFFECT_RELATION__ANALYSIS_STATUS:
			return getAnalysisStatus();
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
		case TRADESPackage.AFFECT_RELATION__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT:
			setSourceComponent((Component) newValue);
			return;
		case TRADESPackage.AFFECT_RELATION__TARGET_COMPONENT:
			setTargetComponent((Component) newValue);
			return;
		case TRADESPackage.AFFECT_RELATION__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.AFFECT_RELATION__ANALYSIS_STATUS:
			setAnalysisStatus((AffectedENUM) newValue);
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
		case TRADESPackage.AFFECT_RELATION__DATA:
			getData().clear();
			return;
		case TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT:
			setSourceComponent((Component) null);
			return;
		case TRADESPackage.AFFECT_RELATION__TARGET_COMPONENT:
			setTargetComponent((Component) null);
			return;
		case TRADESPackage.AFFECT_RELATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.AFFECT_RELATION__ANALYSIS_STATUS:
			setAnalysisStatus(ANALYSIS_STATUS_EDEFAULT);
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
		case TRADESPackage.AFFECT_RELATION__DATA:
			return data != null && !data.isEmpty();
		case TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT:
			return sourceComponent != null;
		case TRADESPackage.AFFECT_RELATION__TARGET_COMPONENT:
			return targetComponent != null;
		case TRADESPackage.AFFECT_RELATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.AFFECT_RELATION__ANALYSIS_STATUS:
			return analysisStatus != ANALYSIS_STATUS_EDEFAULT;
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
		result.append(", analysisStatus: ");
		result.append(analysisStatus);
		result.append(')');
		return result.toString();
	}

} //AffectRelationImpl
