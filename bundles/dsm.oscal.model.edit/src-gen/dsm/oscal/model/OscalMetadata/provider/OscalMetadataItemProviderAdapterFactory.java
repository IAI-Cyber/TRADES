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
package dsm.oscal.model.OscalMetadata.provider;

import dsm.oscal.model.OscalMetadata.util.OscalMetadataAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OscalMetadataItemProviderAdapterFactory extends OscalMetadataAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscalMetadataItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.Address} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressItemProviderCustomImpl addressItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddressAdapter() {
		if (addressItemProvider == null) {
			addressItemProvider = new AddressItemProviderCustomImpl(this);
		}

		return addressItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.Annotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationItemProviderCustomImpl annotationItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationAdapter() {
		if (annotationItemProvider == null) {
			annotationItemProvider = new AnnotationItemProviderCustomImpl(this);
		}

		return annotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.BackMatter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackMatterItemProviderCustomImpl backMatterItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.BackMatter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBackMatterAdapter() {
		if (backMatterItemProvider == null) {
			backMatterItemProvider = new BackMatterItemProviderCustomImpl(this);
		}

		return backMatterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.BackMatterResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackMatterResourceItemProviderCustomImpl backMatterResourceItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.BackMatterResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBackMatterResourceAdapter() {
		if (backMatterResourceItemProvider == null) {
			backMatterResourceItemProvider = new BackMatterResourceItemProviderCustomImpl(this);
		}

		return backMatterResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.Base64} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Base64ItemProvider base64ItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.Base64}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBase64Adapter() {
		if (base64ItemProvider == null) {
			base64ItemProvider = new Base64ItemProvider(this);
		}

		return base64ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.DocumentId} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentIdItemProvider documentIdItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.DocumentId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentIdAdapter() {
		if (documentIdItemProvider == null) {
			documentIdItemProvider = new DocumentIdItemProvider(this);
		}

		return documentIdItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.ExternalId} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalIdItemProvider externalIdItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.ExternalId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalIdAdapter() {
		if (externalIdItemProvider == null) {
			externalIdItemProvider = new ExternalIdItemProvider(this);
		}

		return externalIdItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.Hash} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashItemProvider hashItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.Hash}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHashAdapter() {
		if (hashItemProvider == null) {
			hashItemProvider = new HashItemProvider(this);
		}

		return hashItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProviderCustomImpl linkItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProviderCustomImpl(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.Location} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationItemProviderCustomImpl locationItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocationAdapter() {
		if (locationItemProvider == null) {
			locationItemProvider = new LocationItemProviderCustomImpl(this);
		}

		return locationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.Metadata} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataItemProviderCustomImpl metadataItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.Metadata}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetadataAdapter() {
		if (metadataItemProvider == null) {
			metadataItemProvider = new MetadataItemProviderCustomImpl(this);
		}

		return metadataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.Party} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyItemProviderCustomImpl partyItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.Party}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartyAdapter() {
		if (partyItemProvider == null) {
			partyItemProvider = new PartyItemProviderCustomImpl(this);
		}

		return partyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProviderCustomImpl propertyItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProviderCustomImpl(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.ResourceCitation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceCitationItemProviderCustomImpl resourceCitationItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.ResourceCitation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceCitationAdapter() {
		if (resourceCitationItemProvider == null) {
			resourceCitationItemProvider = new ResourceCitationItemProviderCustomImpl(this);
		}

		return resourceCitationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.ResourceRlink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRlinkItemProviderCustomImpl resourceRlinkItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.ResourceRlink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceRlinkAdapter() {
		if (resourceRlinkItemProvider == null) {
			resourceRlinkItemProvider = new ResourceRlinkItemProviderCustomImpl(this);
		}

		return resourceRlinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.ResponsibleParty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsiblePartyItemProviderCustomImpl responsiblePartyItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.ResponsibleParty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponsiblePartyAdapter() {
		if (responsiblePartyItemProvider == null) {
			responsiblePartyItemProvider = new ResponsiblePartyItemProviderCustomImpl(this);
		}

		return responsiblePartyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.ResponsibleRole} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsibleRoleItemProvider responsibleRoleItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.ResponsibleRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponsibleRoleAdapter() {
		if (responsibleRoleItemProvider == null) {
			responsibleRoleItemProvider = new ResponsibleRoleItemProvider(this);
		}

		return responsibleRoleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.Revision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionItemProviderCustomImpl revisionItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.Revision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRevisionAdapter() {
		if (revisionItemProvider == null) {
			revisionItemProvider = new RevisionItemProviderCustomImpl(this);
		}

		return revisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProviderCustomImpl roleItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProviderCustomImpl(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.TelephoneNumber} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelephoneNumberItemProvider telephoneNumberItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.TelephoneNumber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTelephoneNumberAdapter() {
		if (telephoneNumberItemProvider == null) {
			telephoneNumberItemProvider = new TelephoneNumberItemProvider(this);
		}

		return telephoneNumberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.UUIDElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UUIDElementItemProvider uuidElementItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.UUIDElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUUIDElementAdapter() {
		if (uuidElementItemProvider == null) {
			uuidElementItemProvider = new UUIDElementItemProvider(this);
		}

		return uuidElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dsm.oscal.model.OscalMetadata.AnnotationOwner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationOwnerItemProvider annotationOwnerItemProvider;

	/**
	 * This creates an adapter for a {@link dsm.oscal.model.OscalMetadata.AnnotationOwner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationOwnerAdapter() {
		if (annotationOwnerItemProvider == null) {
			annotationOwnerItemProvider = new AnnotationOwnerItemProvider(this);
		}

		return annotationOwnerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (addressItemProvider != null) addressItemProvider.dispose();
		if (annotationItemProvider != null) annotationItemProvider.dispose();
		if (backMatterItemProvider != null) backMatterItemProvider.dispose();
		if (backMatterResourceItemProvider != null) backMatterResourceItemProvider.dispose();
		if (base64ItemProvider != null) base64ItemProvider.dispose();
		if (documentIdItemProvider != null) documentIdItemProvider.dispose();
		if (externalIdItemProvider != null) externalIdItemProvider.dispose();
		if (hashItemProvider != null) hashItemProvider.dispose();
		if (linkItemProvider != null) linkItemProvider.dispose();
		if (locationItemProvider != null) locationItemProvider.dispose();
		if (metadataItemProvider != null) metadataItemProvider.dispose();
		if (partyItemProvider != null) partyItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (resourceCitationItemProvider != null) resourceCitationItemProvider.dispose();
		if (resourceRlinkItemProvider != null) resourceRlinkItemProvider.dispose();
		if (responsiblePartyItemProvider != null) responsiblePartyItemProvider.dispose();
		if (responsibleRoleItemProvider != null) responsibleRoleItemProvider.dispose();
		if (revisionItemProvider != null) revisionItemProvider.dispose();
		if (roleItemProvider != null) roleItemProvider.dispose();
		if (telephoneNumberItemProvider != null) telephoneNumberItemProvider.dispose();
		if (uuidElementItemProvider != null) uuidElementItemProvider.dispose();
		if (annotationOwnerItemProvider != null) annotationOwnerItemProvider.dispose();
	}

}
