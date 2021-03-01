/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.Annotation;
import dsm.TRADES.AnnotationOwner;
import dsm.TRADES.Link;
import dsm.TRADES.LinkOwner;
import dsm.TRADES.Remark;
import dsm.TRADES.ResponsibleParty;
import dsm.TRADES.TRADESPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsible Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ResponsiblePartyImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ResponsiblePartyImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ResponsiblePartyImpl#getRoleId <em>Role Id</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ResponsiblePartyImpl#getPartyUuid <em>Party Uuid</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ResponsiblePartyImpl#getRemark <em>Remark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponsiblePartyImpl extends PropertyOwnerImpl implements ResponsibleParty {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The default value of the '{@link #getRoleId() <em>Role Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleId() <em>Role Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleId()
	 * @generated
	 * @ordered
	 */
	protected String roleId = ROLE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartyUuid() <em>Party Uuid</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyUuid()
	 * @generated
	 * @ordered
	 */
	protected EList<String> partyUuid;

	/**
	 * The cached value of the '{@link #getRemark() <em>Remark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected Remark remark;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsiblePartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.RESPONSIBLE_PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this,
					TRADESPackage.RESPONSIBLE_PARTY__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, TRADESPackage.RESPONSIBLE_PARTY__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleId() {
		return roleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleId(String newRoleId) {
		String oldRoleId = roleId;
		roleId = newRoleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.RESPONSIBLE_PARTY__ROLE_ID, oldRoleId,
					roleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPartyUuid() {
		if (partyUuid == null) {
			partyUuid = new EDataTypeUniqueEList<String>(String.class, this,
					TRADESPackage.RESPONSIBLE_PARTY__PARTY_UUID);
		}
		return partyUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Remark getRemark() {
		return remark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemark(Remark newRemark, NotificationChain msgs) {
		Remark oldRemark = remark;
		remark = newRemark;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.RESPONSIBLE_PARTY__REMARK, oldRemark, newRemark);
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
	public void setRemark(Remark newRemark) {
		if (newRemark != remark) {
			NotificationChain msgs = null;
			if (remark != null)
				msgs = ((InternalEObject) remark).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.RESPONSIBLE_PARTY__REMARK, null, msgs);
			if (newRemark != null)
				msgs = ((InternalEObject) newRemark).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.RESPONSIBLE_PARTY__REMARK, null, msgs);
			msgs = basicSetRemark(newRemark, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.RESPONSIBLE_PARTY__REMARK, newRemark,
					newRemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.RESPONSIBLE_PARTY__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
		case TRADESPackage.RESPONSIBLE_PARTY__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case TRADESPackage.RESPONSIBLE_PARTY__REMARK:
			return basicSetRemark(null, msgs);
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
		case TRADESPackage.RESPONSIBLE_PARTY__ANNOTATIONS:
			return getAnnotations();
		case TRADESPackage.RESPONSIBLE_PARTY__LINKS:
			return getLinks();
		case TRADESPackage.RESPONSIBLE_PARTY__ROLE_ID:
			return getRoleId();
		case TRADESPackage.RESPONSIBLE_PARTY__PARTY_UUID:
			return getPartyUuid();
		case TRADESPackage.RESPONSIBLE_PARTY__REMARK:
			return getRemark();
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
		case TRADESPackage.RESPONSIBLE_PARTY__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection<? extends Annotation>) newValue);
			return;
		case TRADESPackage.RESPONSIBLE_PARTY__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case TRADESPackage.RESPONSIBLE_PARTY__ROLE_ID:
			setRoleId((String) newValue);
			return;
		case TRADESPackage.RESPONSIBLE_PARTY__PARTY_UUID:
			getPartyUuid().clear();
			getPartyUuid().addAll((Collection<? extends String>) newValue);
			return;
		case TRADESPackage.RESPONSIBLE_PARTY__REMARK:
			setRemark((Remark) newValue);
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
		case TRADESPackage.RESPONSIBLE_PARTY__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case TRADESPackage.RESPONSIBLE_PARTY__LINKS:
			getLinks().clear();
			return;
		case TRADESPackage.RESPONSIBLE_PARTY__ROLE_ID:
			setRoleId(ROLE_ID_EDEFAULT);
			return;
		case TRADESPackage.RESPONSIBLE_PARTY__PARTY_UUID:
			getPartyUuid().clear();
			return;
		case TRADESPackage.RESPONSIBLE_PARTY__REMARK:
			setRemark((Remark) null);
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
		case TRADESPackage.RESPONSIBLE_PARTY__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case TRADESPackage.RESPONSIBLE_PARTY__LINKS:
			return links != null && !links.isEmpty();
		case TRADESPackage.RESPONSIBLE_PARTY__ROLE_ID:
			return ROLE_ID_EDEFAULT == null ? roleId != null : !ROLE_ID_EDEFAULT.equals(roleId);
		case TRADESPackage.RESPONSIBLE_PARTY__PARTY_UUID:
			return partyUuid != null && !partyUuid.isEmpty();
		case TRADESPackage.RESPONSIBLE_PARTY__REMARK:
			return remark != null;
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
		if (baseClass == AnnotationOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.RESPONSIBLE_PARTY__ANNOTATIONS:
				return TRADESPackage.ANNOTATION_OWNER__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.RESPONSIBLE_PARTY__LINKS:
				return TRADESPackage.LINK_OWNER__LINKS;
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
		if (baseClass == AnnotationOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ANNOTATION_OWNER__ANNOTATIONS:
				return TRADESPackage.RESPONSIBLE_PARTY__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.LINK_OWNER__LINKS:
				return TRADESPackage.RESPONSIBLE_PARTY__LINKS;
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
		result.append(" (roleId: ");
		result.append(roleId);
		result.append(", partyUuid: ");
		result.append(partyUuid);
		result.append(')');
		return result.toString();
	}

} //ResponsiblePartyImpl
