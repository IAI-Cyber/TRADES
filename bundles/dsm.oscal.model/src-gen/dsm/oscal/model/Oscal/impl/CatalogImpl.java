/**
 */
package dsm.oscal.model.Oscal.impl;

import dsm.oscal.model.Oscal.BackMatter;
import dsm.oscal.model.Oscal.Catalog;
import dsm.oscal.model.Oscal.ControlDefinition;
import dsm.oscal.model.Oscal.Group;
import dsm.oscal.model.Oscal.Metadata;
import dsm.oscal.model.Oscal.OscalPackage;

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
 * An implementation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.CatalogImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.CatalogImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.CatalogImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.CatalogImpl#getBackmatter <em>Backmatter</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.CatalogImpl#getControlsDefinition <em>Controls Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogImpl extends ParameterOwnerImpl implements Catalog {
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
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

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
	 * The cached value of the '{@link #getControlsDefinition() <em>Controls Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlsDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlDefinition> controlsDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.CATALOG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.CATALOG__UUID, oldUuid, uuid));
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
					OscalPackage.CATALOG__METADATA, oldMetadata, newMetadata);
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
						EOPPOSITE_FEATURE_BASE - OscalPackage.CATALOG__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject) newMetadata).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.CATALOG__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.CATALOG__METADATA, newMetadata,
					newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, OscalPackage.CATALOG__GROUPS);
		}
		return groups;
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
					OscalPackage.CATALOG__BACKMATTER, oldBackmatter, newBackmatter);
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
						EOPPOSITE_FEATURE_BASE - OscalPackage.CATALOG__BACKMATTER, null, msgs);
			if (newBackmatter != null)
				msgs = ((InternalEObject) newBackmatter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.CATALOG__BACKMATTER, null, msgs);
			msgs = basicSetBackmatter(newBackmatter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.CATALOG__BACKMATTER, newBackmatter,
					newBackmatter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlDefinition> getControlsDefinition() {
		if (controlsDefinition == null) {
			controlsDefinition = new EObjectContainmentEList<ControlDefinition>(ControlDefinition.class, this,
					OscalPackage.CATALOG__CONTROLS_DEFINITION);
		}
		return controlsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OscalPackage.CATALOG__METADATA:
			return basicSetMetadata(null, msgs);
		case OscalPackage.CATALOG__GROUPS:
			return ((InternalEList<?>) getGroups()).basicRemove(otherEnd, msgs);
		case OscalPackage.CATALOG__BACKMATTER:
			return basicSetBackmatter(null, msgs);
		case OscalPackage.CATALOG__CONTROLS_DEFINITION:
			return ((InternalEList<?>) getControlsDefinition()).basicRemove(otherEnd, msgs);
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
		case OscalPackage.CATALOG__UUID:
			return getUuid();
		case OscalPackage.CATALOG__METADATA:
			return getMetadata();
		case OscalPackage.CATALOG__GROUPS:
			return getGroups();
		case OscalPackage.CATALOG__BACKMATTER:
			return getBackmatter();
		case OscalPackage.CATALOG__CONTROLS_DEFINITION:
			return getControlsDefinition();
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
		case OscalPackage.CATALOG__UUID:
			setUuid((String) newValue);
			return;
		case OscalPackage.CATALOG__METADATA:
			setMetadata((Metadata) newValue);
			return;
		case OscalPackage.CATALOG__GROUPS:
			getGroups().clear();
			getGroups().addAll((Collection<? extends Group>) newValue);
			return;
		case OscalPackage.CATALOG__BACKMATTER:
			setBackmatter((BackMatter) newValue);
			return;
		case OscalPackage.CATALOG__CONTROLS_DEFINITION:
			getControlsDefinition().clear();
			getControlsDefinition().addAll((Collection<? extends ControlDefinition>) newValue);
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
		case OscalPackage.CATALOG__UUID:
			setUuid(UUID_EDEFAULT);
			return;
		case OscalPackage.CATALOG__METADATA:
			setMetadata((Metadata) null);
			return;
		case OscalPackage.CATALOG__GROUPS:
			getGroups().clear();
			return;
		case OscalPackage.CATALOG__BACKMATTER:
			setBackmatter((BackMatter) null);
			return;
		case OscalPackage.CATALOG__CONTROLS_DEFINITION:
			getControlsDefinition().clear();
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
		case OscalPackage.CATALOG__UUID:
			return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
		case OscalPackage.CATALOG__METADATA:
			return metadata != null;
		case OscalPackage.CATALOG__GROUPS:
			return groups != null && !groups.isEmpty();
		case OscalPackage.CATALOG__BACKMATTER:
			return backmatter != null;
		case OscalPackage.CATALOG__CONTROLS_DEFINITION:
			return controlsDefinition != null && !controlsDefinition.isEmpty();
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

} //CatalogImpl
