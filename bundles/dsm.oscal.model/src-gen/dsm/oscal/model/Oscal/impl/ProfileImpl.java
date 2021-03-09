/**
 */
package dsm.oscal.model.Oscal.impl;

import dsm.oscal.model.Oscal.BackMatter;
import dsm.oscal.model.Oscal.Import;
import dsm.oscal.model.Oscal.Merge;
import dsm.oscal.model.Oscal.Metadata;
import dsm.oscal.model.Oscal.Modify;
import dsm.oscal.model.Oscal.OscalPackage;
import dsm.oscal.model.Oscal.Profile;

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
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.ProfileImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.ProfileImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.ProfileImpl#getMerge <em>Merge</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.ProfileImpl#getModify <em>Modify</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.ProfileImpl#getBackmatter <em>Backmatter</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.ProfileImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileImpl extends MinimalEObjectImpl.Container implements Profile {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getMerge() <em>Merge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerge()
	 * @generated
	 * @ordered
	 */
	protected Merge merge;

	/**
	 * The cached value of the '{@link #getModify() <em>Modify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModify()
	 * @generated
	 * @ordered
	 */
	protected Modify modify;

	/**
	 * The cached value of the '{@link #getBackmatter() <em>Backmatter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackmatter()
	 * @generated
	 * @ordered
	 */
	protected BackMatter backmatter;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OscalPackage.PROFILE__METADATA, oldMetadata, newMetadata);
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
	public void setMetadata(Metadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject) metadata).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.PROFILE__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject) newMetadata).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.PROFILE__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PROFILE__METADATA, newMetadata,
					newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, OscalPackage.PROFILE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merge getMerge() {
		return merge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMerge(Merge newMerge, NotificationChain msgs) {
		Merge oldMerge = merge;
		merge = newMerge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscalPackage.PROFILE__MERGE,
					oldMerge, newMerge);
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
	public void setMerge(Merge newMerge) {
		if (newMerge != merge) {
			NotificationChain msgs = null;
			if (merge != null)
				msgs = ((InternalEObject) merge).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.PROFILE__MERGE, null, msgs);
			if (newMerge != null)
				msgs = ((InternalEObject) newMerge).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.PROFILE__MERGE, null, msgs);
			msgs = basicSetMerge(newMerge, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PROFILE__MERGE, newMerge, newMerge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modify getModify() {
		return modify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModify(Modify newModify, NotificationChain msgs) {
		Modify oldModify = modify;
		modify = newModify;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscalPackage.PROFILE__MODIFY,
					oldModify, newModify);
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
	public void setModify(Modify newModify) {
		if (newModify != modify) {
			NotificationChain msgs = null;
			if (modify != null)
				msgs = ((InternalEObject) modify).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.PROFILE__MODIFY, null, msgs);
			if (newModify != null)
				msgs = ((InternalEObject) newModify).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.PROFILE__MODIFY, null, msgs);
			msgs = basicSetModify(newModify, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PROFILE__MODIFY, newModify, newModify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackMatter getBackmatter() {
		return backmatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackmatter(BackMatter newBackmatter, NotificationChain msgs) {
		BackMatter oldBackmatter = backmatter;
		backmatter = newBackmatter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OscalPackage.PROFILE__BACKMATTER, oldBackmatter, newBackmatter);
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
	public void setBackmatter(BackMatter newBackmatter) {
		if (newBackmatter != backmatter) {
			NotificationChain msgs = null;
			if (backmatter != null)
				msgs = ((InternalEObject) backmatter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.PROFILE__BACKMATTER, null, msgs);
			if (newBackmatter != null)
				msgs = ((InternalEObject) newBackmatter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.PROFILE__BACKMATTER, null, msgs);
			msgs = basicSetBackmatter(newBackmatter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PROFILE__BACKMATTER, newBackmatter,
					newBackmatter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PROFILE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OscalPackage.PROFILE__METADATA:
			return basicSetMetadata(null, msgs);
		case OscalPackage.PROFILE__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
		case OscalPackage.PROFILE__MERGE:
			return basicSetMerge(null, msgs);
		case OscalPackage.PROFILE__MODIFY:
			return basicSetModify(null, msgs);
		case OscalPackage.PROFILE__BACKMATTER:
			return basicSetBackmatter(null, msgs);
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
		case OscalPackage.PROFILE__METADATA:
			return getMetadata();
		case OscalPackage.PROFILE__IMPORTS:
			return getImports();
		case OscalPackage.PROFILE__MERGE:
			return getMerge();
		case OscalPackage.PROFILE__MODIFY:
			return getModify();
		case OscalPackage.PROFILE__BACKMATTER:
			return getBackmatter();
		case OscalPackage.PROFILE__UUID:
			return getUuid();
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
		case OscalPackage.PROFILE__METADATA:
			setMetadata((Metadata) newValue);
			return;
		case OscalPackage.PROFILE__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends Import>) newValue);
			return;
		case OscalPackage.PROFILE__MERGE:
			setMerge((Merge) newValue);
			return;
		case OscalPackage.PROFILE__MODIFY:
			setModify((Modify) newValue);
			return;
		case OscalPackage.PROFILE__BACKMATTER:
			setBackmatter((BackMatter) newValue);
			return;
		case OscalPackage.PROFILE__UUID:
			setUuid((String) newValue);
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
		case OscalPackage.PROFILE__METADATA:
			setMetadata((Metadata) null);
			return;
		case OscalPackage.PROFILE__IMPORTS:
			getImports().clear();
			return;
		case OscalPackage.PROFILE__MERGE:
			setMerge((Merge) null);
			return;
		case OscalPackage.PROFILE__MODIFY:
			setModify((Modify) null);
			return;
		case OscalPackage.PROFILE__BACKMATTER:
			setBackmatter((BackMatter) null);
			return;
		case OscalPackage.PROFILE__UUID:
			setUuid(UUID_EDEFAULT);
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
		case OscalPackage.PROFILE__METADATA:
			return metadata != null;
		case OscalPackage.PROFILE__IMPORTS:
			return imports != null && !imports.isEmpty();
		case OscalPackage.PROFILE__MERGE:
			return merge != null;
		case OscalPackage.PROFILE__MODIFY:
			return modify != null;
		case OscalPackage.PROFILE__BACKMATTER:
			return backmatter != null;
		case OscalPackage.PROFILE__UUID:
			return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
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
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //ProfileImpl
