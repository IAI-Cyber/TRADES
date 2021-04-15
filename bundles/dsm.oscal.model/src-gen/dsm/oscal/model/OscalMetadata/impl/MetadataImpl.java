/**
 * 
 *  Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *      ELTA Ltd - initial API and implementation
 *  
 * 
 */
package dsm.oscal.model.OscalMetadata.impl;

import dsm.oscal.model.OscalMetadata.Annotation;
import dsm.oscal.model.OscalMetadata.AnnotationOwner;
import dsm.oscal.model.OscalMetadata.DocumentId;
import dsm.oscal.model.OscalMetadata.ElementWithRemarks;
import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.OscalMetadata.LinkOwner;
import dsm.oscal.model.OscalMetadata.Location;
import dsm.oscal.model.OscalMetadata.Metadata;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import dsm.oscal.model.OscalMetadata.Party;
import dsm.oscal.model.OscalMetadata.Property;
import dsm.oscal.model.OscalMetadata.PropertyOwner;
import dsm.oscal.model.OscalMetadata.ResponsibleParty;
import dsm.oscal.model.OscalMetadata.Revision;
import dsm.oscal.model.OscalMetadata.Role;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

import java.time.ZonedDateTime;

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
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getProps <em>Props</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getDocumentIds <em>Document Ids</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getOscalVersion <em>Oscal Version</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getParties <em>Parties</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getPublished <em>Published</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getResponsibleParties <em>Responsible Parties</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataImpl extends MinimalEObjectImpl.Container implements Metadata {
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
	 * The cached value of the '{@link #getProps() <em>Props</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> props;

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
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final MarkupMultiline REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultiline remarks = REMARKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentIds() <em>Document Ids</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentIds()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentId> documentIds;

	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime lastModified = LAST_MODIFIED_EDEFAULT;

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
	 * The cached value of the '{@link #getParties() <em>Parties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParties()
	 * @generated
	 * @ordered
	 */
	protected EList<Party> parties;

	/**
	 * The default value of the '{@link #getPublished() <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublished()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime PUBLISHED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublished() <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublished()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime published = PUBLISHED_EDEFAULT;

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
	 * The cached value of the '{@link #getRevisions() <em>Revisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision> revisions;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final MarkupLine TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected MarkupLine title = TITLE_EDEFAULT;

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
		return OscalMetadataPackage.Literals.METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupLine getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(MarkupLine newTitle) {
		MarkupLine oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.METADATA__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZonedDateTime getPublished() {
		return published;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublished(ZonedDateTime newPublished) {
		ZonedDateTime oldPublished = published;
		published = newPublished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.METADATA__PUBLISHED, oldPublished, published));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZonedDateTime getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModified(ZonedDateTime newLastModified) {
		ZonedDateTime oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.METADATA__LAST_MODIFIED, oldLastModified, lastModified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.METADATA__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.METADATA__OSCAL_VERSION, oldOscalVersion, oscalVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultiline getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(MarkupMultiline newRemarks) {
		MarkupMultiline oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.METADATA__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, OscalMetadataPackage.METADATA__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, OscalMetadataPackage.METADATA__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, OscalMetadataPackage.METADATA__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, OscalMetadataPackage.METADATA__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponsibleParty> getResponsibleParties() {
		if (responsibleParties == null) {
			responsibleParties = new EObjectContainmentEList<ResponsibleParty>(ResponsibleParty.class, this, OscalMetadataPackage.METADATA__RESPONSIBLE_PARTIES);
		}
		return responsibleParties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Party> getParties() {
		if (parties == null) {
			parties = new EObjectContainmentEList<Party>(Party.class, this, OscalMetadataPackage.METADATA__PARTIES);
		}
		return parties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Revision> getRevisions() {
		if (revisions == null) {
			revisions = new EObjectContainmentEList<Revision>(Revision.class, this, OscalMetadataPackage.METADATA__REVISIONS);
		}
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentId> getDocumentIds() {
		if (documentIds == null) {
			documentIds = new EObjectContainmentEList<DocumentId>(DocumentId.class, this, OscalMetadataPackage.METADATA__DOCUMENT_IDS);
		}
		return documentIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProps() {
		if (props == null) {
			props = new EObjectContainmentEList<Property>(Property.class, this, OscalMetadataPackage.METADATA__PROPS);
		}
		return props;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OscalMetadataPackage.METADATA__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.METADATA__PROPS:
				return ((InternalEList<?>)getProps()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.METADATA__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.METADATA__DOCUMENT_IDS:
				return ((InternalEList<?>)getDocumentIds()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.METADATA__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.METADATA__PARTIES:
				return ((InternalEList<?>)getParties()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.METADATA__RESPONSIBLE_PARTIES:
				return ((InternalEList<?>)getResponsibleParties()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.METADATA__REVISIONS:
				return ((InternalEList<?>)getRevisions()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.METADATA__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case OscalMetadataPackage.METADATA__ANNOTATIONS:
				return getAnnotations();
			case OscalMetadataPackage.METADATA__PROPS:
				return getProps();
			case OscalMetadataPackage.METADATA__LINKS:
				return getLinks();
			case OscalMetadataPackage.METADATA__REMARKS:
				return getRemarks();
			case OscalMetadataPackage.METADATA__DOCUMENT_IDS:
				return getDocumentIds();
			case OscalMetadataPackage.METADATA__LAST_MODIFIED:
				return getLastModified();
			case OscalMetadataPackage.METADATA__LOCATIONS:
				return getLocations();
			case OscalMetadataPackage.METADATA__OSCAL_VERSION:
				return getOscalVersion();
			case OscalMetadataPackage.METADATA__PARTIES:
				return getParties();
			case OscalMetadataPackage.METADATA__PUBLISHED:
				return getPublished();
			case OscalMetadataPackage.METADATA__RESPONSIBLE_PARTIES:
				return getResponsibleParties();
			case OscalMetadataPackage.METADATA__REVISIONS:
				return getRevisions();
			case OscalMetadataPackage.METADATA__ROLES:
				return getRoles();
			case OscalMetadataPackage.METADATA__TITLE:
				return getTitle();
			case OscalMetadataPackage.METADATA__VERSION:
				return getVersion();
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
			case OscalMetadataPackage.METADATA__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OscalMetadataPackage.METADATA__PROPS:
				getProps().clear();
				getProps().addAll((Collection<? extends Property>)newValue);
				return;
			case OscalMetadataPackage.METADATA__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case OscalMetadataPackage.METADATA__REMARKS:
				setRemarks((MarkupMultiline)newValue);
				return;
			case OscalMetadataPackage.METADATA__DOCUMENT_IDS:
				getDocumentIds().clear();
				getDocumentIds().addAll((Collection<? extends DocumentId>)newValue);
				return;
			case OscalMetadataPackage.METADATA__LAST_MODIFIED:
				setLastModified((ZonedDateTime)newValue);
				return;
			case OscalMetadataPackage.METADATA__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case OscalMetadataPackage.METADATA__OSCAL_VERSION:
				setOscalVersion((String)newValue);
				return;
			case OscalMetadataPackage.METADATA__PARTIES:
				getParties().clear();
				getParties().addAll((Collection<? extends Party>)newValue);
				return;
			case OscalMetadataPackage.METADATA__PUBLISHED:
				setPublished((ZonedDateTime)newValue);
				return;
			case OscalMetadataPackage.METADATA__RESPONSIBLE_PARTIES:
				getResponsibleParties().clear();
				getResponsibleParties().addAll((Collection<? extends ResponsibleParty>)newValue);
				return;
			case OscalMetadataPackage.METADATA__REVISIONS:
				getRevisions().clear();
				getRevisions().addAll((Collection<? extends Revision>)newValue);
				return;
			case OscalMetadataPackage.METADATA__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case OscalMetadataPackage.METADATA__TITLE:
				setTitle((MarkupLine)newValue);
				return;
			case OscalMetadataPackage.METADATA__VERSION:
				setVersion((String)newValue);
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
			case OscalMetadataPackage.METADATA__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case OscalMetadataPackage.METADATA__PROPS:
				getProps().clear();
				return;
			case OscalMetadataPackage.METADATA__LINKS:
				getLinks().clear();
				return;
			case OscalMetadataPackage.METADATA__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OscalMetadataPackage.METADATA__DOCUMENT_IDS:
				getDocumentIds().clear();
				return;
			case OscalMetadataPackage.METADATA__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case OscalMetadataPackage.METADATA__LOCATIONS:
				getLocations().clear();
				return;
			case OscalMetadataPackage.METADATA__OSCAL_VERSION:
				setOscalVersion(OSCAL_VERSION_EDEFAULT);
				return;
			case OscalMetadataPackage.METADATA__PARTIES:
				getParties().clear();
				return;
			case OscalMetadataPackage.METADATA__PUBLISHED:
				setPublished(PUBLISHED_EDEFAULT);
				return;
			case OscalMetadataPackage.METADATA__RESPONSIBLE_PARTIES:
				getResponsibleParties().clear();
				return;
			case OscalMetadataPackage.METADATA__REVISIONS:
				getRevisions().clear();
				return;
			case OscalMetadataPackage.METADATA__ROLES:
				getRoles().clear();
				return;
			case OscalMetadataPackage.METADATA__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OscalMetadataPackage.METADATA__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case OscalMetadataPackage.METADATA__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case OscalMetadataPackage.METADATA__PROPS:
				return props != null && !props.isEmpty();
			case OscalMetadataPackage.METADATA__LINKS:
				return links != null && !links.isEmpty();
			case OscalMetadataPackage.METADATA__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OscalMetadataPackage.METADATA__DOCUMENT_IDS:
				return documentIds != null && !documentIds.isEmpty();
			case OscalMetadataPackage.METADATA__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case OscalMetadataPackage.METADATA__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case OscalMetadataPackage.METADATA__OSCAL_VERSION:
				return OSCAL_VERSION_EDEFAULT == null ? oscalVersion != null : !OSCAL_VERSION_EDEFAULT.equals(oscalVersion);
			case OscalMetadataPackage.METADATA__PARTIES:
				return parties != null && !parties.isEmpty();
			case OscalMetadataPackage.METADATA__PUBLISHED:
				return PUBLISHED_EDEFAULT == null ? published != null : !PUBLISHED_EDEFAULT.equals(published);
			case OscalMetadataPackage.METADATA__RESPONSIBLE_PARTIES:
				return responsibleParties != null && !responsibleParties.isEmpty();
			case OscalMetadataPackage.METADATA__REVISIONS:
				return revisions != null && !revisions.isEmpty();
			case OscalMetadataPackage.METADATA__ROLES:
				return roles != null && !roles.isEmpty();
			case OscalMetadataPackage.METADATA__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OscalMetadataPackage.METADATA__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
				case OscalMetadataPackage.METADATA__ANNOTATIONS: return OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == PropertyOwner.class) {
			switch (derivedFeatureID) {
				case OscalMetadataPackage.METADATA__PROPS: return OscalMetadataPackage.PROPERTY_OWNER__PROPS;
				default: return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (derivedFeatureID) {
				case OscalMetadataPackage.METADATA__LINKS: return OscalMetadataPackage.LINK_OWNER__LINKS;
				default: return -1;
			}
		}
		if (baseClass == ElementWithRemarks.class) {
			switch (derivedFeatureID) {
				case OscalMetadataPackage.METADATA__REMARKS: return OscalMetadataPackage.ELEMENT_WITH_REMARKS__REMARKS;
				default: return -1;
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
				case OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS: return OscalMetadataPackage.METADATA__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == PropertyOwner.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.PROPERTY_OWNER__PROPS: return OscalMetadataPackage.METADATA__PROPS;
				default: return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.LINK_OWNER__LINKS: return OscalMetadataPackage.METADATA__LINKS;
				default: return -1;
			}
		}
		if (baseClass == ElementWithRemarks.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.ELEMENT_WITH_REMARKS__REMARKS: return OscalMetadataPackage.METADATA__REMARKS;
				default: return -1;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (remarks: ");
		result.append(remarks);
		result.append(", lastModified: ");
		result.append(lastModified);
		result.append(", oscalVersion: ");
		result.append(oscalVersion);
		result.append(", published: ");
		result.append(published);
		result.append(", title: ");
		result.append(title);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //MetadataImpl
