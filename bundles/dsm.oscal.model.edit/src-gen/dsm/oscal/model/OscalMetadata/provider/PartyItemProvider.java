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


import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import dsm.oscal.model.OscalMetadata.Party;

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
 * This is the item provider adapter for a {@link dsm.oscal.model.OscalMetadata.Party} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartyItemProvider 
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
	public PartyItemProvider(AdapterFactory adapterFactory) {
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

			addUuidPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addShortNamePropertyDescriptor(object);
			addEmailAddressesPropertyDescriptor(object);
			addLocationUuidsPropertyDescriptor(object);
			addMemberOfOrganizationsPropertyDescriptor(object);
			addRemarksPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uuid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Party_uuid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Party_uuid_feature", "_UI_Party_type"),
				 OscalMetadataPackage.Literals.PARTY__UUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Party_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Party_type_feature", "_UI_Party_type"),
				 OscalMetadataPackage.Literals.PARTY__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Party_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Party_name_feature", "_UI_Party_type"),
				 OscalMetadataPackage.Literals.PARTY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Short Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Party_shortName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Party_shortName_feature", "_UI_Party_type"),
				 OscalMetadataPackage.Literals.PARTY__SHORT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Addresses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailAddressesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Party_emailAddresses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Party_emailAddresses_feature", "_UI_Party_type"),
				 OscalMetadataPackage.Literals.PARTY__EMAIL_ADDRESSES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location Uuids feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationUuidsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Party_locationUuids_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Party_locationUuids_feature", "_UI_Party_type"),
				 OscalMetadataPackage.Literals.PARTY__LOCATION_UUIDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Member Of Organizations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemberOfOrganizationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Party_memberOfOrganizations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Party_memberOfOrganizations_feature", "_UI_Party_type"),
				 OscalMetadataPackage.Literals.PARTY__MEMBER_OF_ORGANIZATIONS,
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
				 getString("_UI_Party_remarks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Party_remarks_feature", "_UI_Party_type"),
				 OscalMetadataPackage.Literals.PARTY__REMARKS,
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
			childrenFeatures.add(OscalMetadataPackage.Literals.PARTY__ANNOTATIONS);
			childrenFeatures.add(OscalMetadataPackage.Literals.PARTY__ADDRESSES);
			childrenFeatures.add(OscalMetadataPackage.Literals.PARTY__LINKS);
			childrenFeatures.add(OscalMetadataPackage.Literals.PARTY__EXTERNAL_IDS);
			childrenFeatures.add(OscalMetadataPackage.Literals.PARTY__PROPS);
			childrenFeatures.add(OscalMetadataPackage.Literals.PARTY__TELEPHONE_NUMBERS);
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
	 * This returns Party.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Party"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Party)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Party_type") :
			getString("_UI_Party_type") + " " + label;
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

		switch (notification.getFeatureID(Party.class)) {
			case OscalMetadataPackage.PARTY__UUID:
			case OscalMetadataPackage.PARTY__TYPE:
			case OscalMetadataPackage.PARTY__NAME:
			case OscalMetadataPackage.PARTY__SHORT_NAME:
			case OscalMetadataPackage.PARTY__EMAIL_ADDRESSES:
			case OscalMetadataPackage.PARTY__LOCATION_UUIDS:
			case OscalMetadataPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
			case OscalMetadataPackage.PARTY__REMARKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OscalMetadataPackage.PARTY__ANNOTATIONS:
			case OscalMetadataPackage.PARTY__ADDRESSES:
			case OscalMetadataPackage.PARTY__LINKS:
			case OscalMetadataPackage.PARTY__EXTERNAL_IDS:
			case OscalMetadataPackage.PARTY__PROPS:
			case OscalMetadataPackage.PARTY__TELEPHONE_NUMBERS:
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
				(OscalMetadataPackage.Literals.PARTY__ANNOTATIONS,
				 OscalMetadataFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.PARTY__ADDRESSES,
				 OscalMetadataFactory.eINSTANCE.createAddress()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.PARTY__LINKS,
				 OscalMetadataFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.PARTY__EXTERNAL_IDS,
				 OscalMetadataFactory.eINSTANCE.createExternalId()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.PARTY__PROPS,
				 OscalMetadataFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.PARTY__TELEPHONE_NUMBERS,
				 OscalMetadataFactory.eINSTANCE.createTelephoneNumber()));
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
