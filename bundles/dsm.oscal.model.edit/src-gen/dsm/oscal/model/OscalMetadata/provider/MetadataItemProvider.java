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


import dsm.oscal.model.OscalMetadata.Metadata;
import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dsm.oscal.model.OscalMetadata.Metadata} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetadataItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTitlePropertyDescriptor(object);
			addPublishedPropertyDescriptor(object);
			addLastModifiedPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addOscalVersionPropertyDescriptor(object);
			addRemarksPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Metadata_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Metadata_title_feature", "_UI_Metadata_type"),
				 OscalMetadataPackage.Literals.METADATA__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Published feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Metadata_published_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Metadata_published_feature", "_UI_Metadata_type"),
				 OscalMetadataPackage.Literals.METADATA__PUBLISHED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Modified feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastModifiedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Metadata_lastModified_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Metadata_lastModified_feature", "_UI_Metadata_type"),
				 OscalMetadataPackage.Literals.METADATA__LAST_MODIFIED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Metadata_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Metadata_version_feature", "_UI_Metadata_type"),
				 OscalMetadataPackage.Literals.METADATA__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Oscal Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOscalVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Metadata_oscalVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Metadata_oscalVersion_feature", "_UI_Metadata_type"),
				 OscalMetadataPackage.Literals.METADATA__OSCAL_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remarks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemarksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Metadata_remarks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Metadata_remarks_feature", "_UI_Metadata_type"),
				 OscalMetadataPackage.Literals.METADATA__REMARKS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OscalMetadataPackage.Literals.METADATA__ANNOTATIONS);
			childrenFeatures.add(OscalMetadataPackage.Literals.METADATA__ROLES);
			childrenFeatures.add(OscalMetadataPackage.Literals.METADATA__LINKS);
			childrenFeatures.add(OscalMetadataPackage.Literals.METADATA__LOCATIONS);
			childrenFeatures.add(OscalMetadataPackage.Literals.METADATA__RESPONSIBLE_PARTIES);
			childrenFeatures.add(OscalMetadataPackage.Literals.METADATA__PARTIES);
			childrenFeatures.add(OscalMetadataPackage.Literals.METADATA__REVISIONS);
			childrenFeatures.add(OscalMetadataPackage.Literals.METADATA__DOCUMENT_IDS);
			childrenFeatures.add(OscalMetadataPackage.Literals.METADATA__PROPS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Metadata.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Metadata"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		MarkupLine labelValue = ((Metadata)object).getTitle();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Metadata_type") :
			getString("_UI_Metadata_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Metadata.class)) {
			case OscalMetadataPackage.METADATA__TITLE:
			case OscalMetadataPackage.METADATA__PUBLISHED:
			case OscalMetadataPackage.METADATA__LAST_MODIFIED:
			case OscalMetadataPackage.METADATA__VERSION:
			case OscalMetadataPackage.METADATA__OSCAL_VERSION:
			case OscalMetadataPackage.METADATA__REMARKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OscalMetadataPackage.METADATA__ANNOTATIONS:
			case OscalMetadataPackage.METADATA__ROLES:
			case OscalMetadataPackage.METADATA__LINKS:
			case OscalMetadataPackage.METADATA__LOCATIONS:
			case OscalMetadataPackage.METADATA__RESPONSIBLE_PARTIES:
			case OscalMetadataPackage.METADATA__PARTIES:
			case OscalMetadataPackage.METADATA__REVISIONS:
			case OscalMetadataPackage.METADATA__DOCUMENT_IDS:
			case OscalMetadataPackage.METADATA__PROPS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.METADATA__ANNOTATIONS,
				 OscalMetadataFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.METADATA__ROLES,
				 OscalMetadataFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.METADATA__LINKS,
				 OscalMetadataFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.METADATA__LOCATIONS,
				 OscalMetadataFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.METADATA__RESPONSIBLE_PARTIES,
				 OscalMetadataFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.METADATA__PARTIES,
				 OscalMetadataFactory.eINSTANCE.createParty()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.METADATA__REVISIONS,
				 OscalMetadataFactory.eINSTANCE.createRevision()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.METADATA__DOCUMENT_IDS,
				 OscalMetadataFactory.eINSTANCE.createDocumentId()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.METADATA__PROPS,
				 OscalMetadataFactory.eINSTANCE.createProperty()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OscalEditPlugin.INSTANCE;
	}

}
