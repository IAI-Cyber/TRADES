/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.DocumentId;
import dsm.TRADES.Link;
import dsm.TRADES.LinkOwner;
import dsm.TRADES.Location;
import dsm.TRADES.Metadata;
import dsm.TRADES.Party;
import dsm.TRADES.Property;
import dsm.TRADES.Remark;
import dsm.TRADES.ResponsibleParty;
import dsm.TRADES.Revisions;
import dsm.TRADES.Role;
import dsm.TRADES.TRADESPackage;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getPublished <em>Published</em>}</li>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getOscalVersion <em>Oscal Version</em>}</li>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getParties <em>Parties</em>}</li>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getResponsibleParties <em>Responsible Parties</em>}</li>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link dsm.TRADES.impl.MetadataImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataImpl extends AnnotationOwnerImpl implements Metadata {
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
	 * The default value of the '{@link #getPublished() <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublished()
	 * @generated
	 * @ordered
	 */
	protected static final Date PUBLISHED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublished() <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublished()
	 * @generated
	 * @ordered
	 */
	protected Date published = PUBLISHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected Date lastModified = LAST_MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOscalVersion() <em>Oscal Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscalVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OSCAL_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOscalVersion() <em>Oscal Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscalVersion()
	 * @generated
	 * @ordered
	 */
	protected String oscalVersion = OSCAL_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentId() <em>Document Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentId()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentId> documentId;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected Revisions revision;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getParties() <em>Parties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParties()
	 * @generated
	 * @ordered
	 */
	protected EList<Party> parties;

	/**
	 * The cached value of the '{@link #getResponsibleParties() <em>Responsible Parties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleParties()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibleParty> responsibleParties;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, TRADESPackage.METADATA__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPublished() {
		return published;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublished(Date newPublished) {
		Date oldPublished = published;
		published = newPublished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.METADATA__PUBLISHED, oldPublished,
					published));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModified(Date newLastModified) {
		Date oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.METADATA__LAST_MODIFIED,
					oldLastModified, lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.METADATA__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOscalVersion() {
		return oscalVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOscalVersion(String newOscalVersion) {
		String oldOscalVersion = oscalVersion;
		oscalVersion = newOscalVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.METADATA__OSCAL_VERSION,
					oldOscalVersion, oscalVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentId> getDocumentId() {
		if (documentId == null) {
			documentId = new EObjectContainmentEList<DocumentId>(DocumentId.class, this,
					TRADESPackage.METADATA__DOCUMENT_ID);
		}
		return documentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this,
					TRADESPackage.METADATA__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, TRADESPackage.METADATA__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Revisions getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevision(Revisions newRevision, NotificationChain msgs) {
		Revisions oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.METADATA__REVISION, oldRevision, newRevision);
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
	public void setRevision(Revisions newRevision) {
		if (newRevision != revision) {
			NotificationChain msgs = null;
			if (revision != null)
				msgs = ((InternalEObject) revision).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.METADATA__REVISION, null, msgs);
			if (newRevision != null)
				msgs = ((InternalEObject) newRevision).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.METADATA__REVISION, null, msgs);
			msgs = basicSetRevision(newRevision, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.METADATA__REVISION, newRevision,
					newRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, TRADESPackage.METADATA__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Party> getParties() {
		if (parties == null) {
			parties = new EObjectContainmentEList<Party>(Party.class, this, TRADESPackage.METADATA__PARTIES);
		}
		return parties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponsibleParty> getResponsibleParties() {
		if (responsibleParties == null) {
			responsibleParties = new EObjectContainmentEList<ResponsibleParty>(ResponsibleParty.class, this,
					TRADESPackage.METADATA__RESPONSIBLE_PARTIES);
		}
		return responsibleParties;
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
					TRADESPackage.METADATA__REMARK, oldRemark, newRemark);
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
						EOPPOSITE_FEATURE_BASE - TRADESPackage.METADATA__REMARK, null, msgs);
			if (newRemark != null)
				msgs = ((InternalEObject) newRemark).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.METADATA__REMARK, null, msgs);
			msgs = basicSetRemark(newRemark, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.METADATA__REMARK, newRemark,
					newRemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.METADATA__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.METADATA__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case TRADESPackage.METADATA__DOCUMENT_ID:
			return ((InternalEList<?>) getDocumentId()).basicRemove(otherEnd, msgs);
		case TRADESPackage.METADATA__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case TRADESPackage.METADATA__ROLES:
			return ((InternalEList<?>) getRoles()).basicRemove(otherEnd, msgs);
		case TRADESPackage.METADATA__REVISION:
			return basicSetRevision(null, msgs);
		case TRADESPackage.METADATA__LOCATIONS:
			return ((InternalEList<?>) getLocations()).basicRemove(otherEnd, msgs);
		case TRADESPackage.METADATA__PARTIES:
			return ((InternalEList<?>) getParties()).basicRemove(otherEnd, msgs);
		case TRADESPackage.METADATA__RESPONSIBLE_PARTIES:
			return ((InternalEList<?>) getResponsibleParties()).basicRemove(otherEnd, msgs);
		case TRADESPackage.METADATA__REMARK:
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
		case TRADESPackage.METADATA__LINKS:
			return getLinks();
		case TRADESPackage.METADATA__PUBLISHED:
			return getPublished();
		case TRADESPackage.METADATA__LAST_MODIFIED:
			return getLastModified();
		case TRADESPackage.METADATA__VERSION:
			return getVersion();
		case TRADESPackage.METADATA__OSCAL_VERSION:
			return getOscalVersion();
		case TRADESPackage.METADATA__DOCUMENT_ID:
			return getDocumentId();
		case TRADESPackage.METADATA__PROPERTIES:
			return getProperties();
		case TRADESPackage.METADATA__ROLES:
			return getRoles();
		case TRADESPackage.METADATA__REVISION:
			return getRevision();
		case TRADESPackage.METADATA__LOCATIONS:
			return getLocations();
		case TRADESPackage.METADATA__PARTIES:
			return getParties();
		case TRADESPackage.METADATA__RESPONSIBLE_PARTIES:
			return getResponsibleParties();
		case TRADESPackage.METADATA__REMARK:
			return getRemark();
		case TRADESPackage.METADATA__TITLE:
			return getTitle();
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
		case TRADESPackage.METADATA__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case TRADESPackage.METADATA__PUBLISHED:
			setPublished((Date) newValue);
			return;
		case TRADESPackage.METADATA__LAST_MODIFIED:
			setLastModified((Date) newValue);
			return;
		case TRADESPackage.METADATA__VERSION:
			setVersion((String) newValue);
			return;
		case TRADESPackage.METADATA__OSCAL_VERSION:
			setOscalVersion((String) newValue);
			return;
		case TRADESPackage.METADATA__DOCUMENT_ID:
			getDocumentId().clear();
			getDocumentId().addAll((Collection<? extends DocumentId>) newValue);
			return;
		case TRADESPackage.METADATA__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case TRADESPackage.METADATA__ROLES:
			getRoles().clear();
			getRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case TRADESPackage.METADATA__REVISION:
			setRevision((Revisions) newValue);
			return;
		case TRADESPackage.METADATA__LOCATIONS:
			getLocations().clear();
			getLocations().addAll((Collection<? extends Location>) newValue);
			return;
		case TRADESPackage.METADATA__PARTIES:
			getParties().clear();
			getParties().addAll((Collection<? extends Party>) newValue);
			return;
		case TRADESPackage.METADATA__RESPONSIBLE_PARTIES:
			getResponsibleParties().clear();
			getResponsibleParties().addAll((Collection<? extends ResponsibleParty>) newValue);
			return;
		case TRADESPackage.METADATA__REMARK:
			setRemark((Remark) newValue);
			return;
		case TRADESPackage.METADATA__TITLE:
			setTitle((String) newValue);
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
		case TRADESPackage.METADATA__LINKS:
			getLinks().clear();
			return;
		case TRADESPackage.METADATA__PUBLISHED:
			setPublished(PUBLISHED_EDEFAULT);
			return;
		case TRADESPackage.METADATA__LAST_MODIFIED:
			setLastModified(LAST_MODIFIED_EDEFAULT);
			return;
		case TRADESPackage.METADATA__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case TRADESPackage.METADATA__OSCAL_VERSION:
			setOscalVersion(OSCAL_VERSION_EDEFAULT);
			return;
		case TRADESPackage.METADATA__DOCUMENT_ID:
			getDocumentId().clear();
			return;
		case TRADESPackage.METADATA__PROPERTIES:
			getProperties().clear();
			return;
		case TRADESPackage.METADATA__ROLES:
			getRoles().clear();
			return;
		case TRADESPackage.METADATA__REVISION:
			setRevision((Revisions) null);
			return;
		case TRADESPackage.METADATA__LOCATIONS:
			getLocations().clear();
			return;
		case TRADESPackage.METADATA__PARTIES:
			getParties().clear();
			return;
		case TRADESPackage.METADATA__RESPONSIBLE_PARTIES:
			getResponsibleParties().clear();
			return;
		case TRADESPackage.METADATA__REMARK:
			setRemark((Remark) null);
			return;
		case TRADESPackage.METADATA__TITLE:
			setTitle(TITLE_EDEFAULT);
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
		case TRADESPackage.METADATA__LINKS:
			return links != null && !links.isEmpty();
		case TRADESPackage.METADATA__PUBLISHED:
			return PUBLISHED_EDEFAULT == null ? published != null : !PUBLISHED_EDEFAULT.equals(published);
		case TRADESPackage.METADATA__LAST_MODIFIED:
			return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
		case TRADESPackage.METADATA__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case TRADESPackage.METADATA__OSCAL_VERSION:
			return OSCAL_VERSION_EDEFAULT == null ? oscalVersion != null : !OSCAL_VERSION_EDEFAULT.equals(oscalVersion);
		case TRADESPackage.METADATA__DOCUMENT_ID:
			return documentId != null && !documentId.isEmpty();
		case TRADESPackage.METADATA__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case TRADESPackage.METADATA__ROLES:
			return roles != null && !roles.isEmpty();
		case TRADESPackage.METADATA__REVISION:
			return revision != null;
		case TRADESPackage.METADATA__LOCATIONS:
			return locations != null && !locations.isEmpty();
		case TRADESPackage.METADATA__PARTIES:
			return parties != null && !parties.isEmpty();
		case TRADESPackage.METADATA__RESPONSIBLE_PARTIES:
			return responsibleParties != null && !responsibleParties.isEmpty();
		case TRADESPackage.METADATA__REMARK:
			return remark != null;
		case TRADESPackage.METADATA__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		if (baseClass == LinkOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.METADATA__LINKS:
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
		if (baseClass == LinkOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.LINK_OWNER__LINKS:
				return TRADESPackage.METADATA__LINKS;
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
		result.append(" (published: ");
		result.append(published);
		result.append(", lastModified: ");
		result.append(lastModified);
		result.append(", version: ");
		result.append(version);
		result.append(", oscalVersion: ");
		result.append(oscalVersion);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //MetadataImpl
