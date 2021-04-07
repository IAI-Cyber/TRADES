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


import dsm.oscal.model.OscalMetadata.BackMatterResource;
import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

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
 * This is the item provider adapter for a {@link dsm.oscal.model.OscalMetadata.BackMatterResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BackMatterResourceItemProvider 
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
	public BackMatterResourceItemProvider(AdapterFactory adapterFactory) {
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
			addTitlePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
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
				 getString("_UI_BackMatterResource_uuid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BackMatterResource_uuid_feature", "_UI_BackMatterResource_type"),
				 OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__UUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_BackMatterResource_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BackMatterResource_title_feature", "_UI_BackMatterResource_type"),
				 OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BackMatterResource_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BackMatterResource_description_feature", "_UI_BackMatterResource_type"),
				 OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__DESCRIPTION,
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
				 getString("_UI_BackMatterResource_remarks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BackMatterResource_remarks_feature", "_UI_BackMatterResource_type"),
				 OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__REMARKS,
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
			childrenFeatures.add(OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__ANNOTATIONS);
			childrenFeatures.add(OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__CITATION);
			childrenFeatures.add(OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__RLINKS);
			childrenFeatures.add(OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__PROPS);
			childrenFeatures.add(OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__DOCUMENT_IDS);
			childrenFeatures.add(OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__BASE64);
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
	 * This returns BackMatterResource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BackMatterResource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		UUID labelValue = ((BackMatterResource)object).getUuid();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_BackMatterResource_type") :
			getString("_UI_BackMatterResource_type") + " " + label;
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

		switch (notification.getFeatureID(BackMatterResource.class)) {
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__UUID:
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__TITLE:
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__DESCRIPTION:
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__REMARKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__ANNOTATIONS:
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__CITATION:
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__RLINKS:
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__PROPS:
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__DOCUMENT_IDS:
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__BASE64:
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
				(OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__ANNOTATIONS,
				 OscalMetadataFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__CITATION,
				 OscalMetadataFactory.eINSTANCE.createResourceCitation()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__RLINKS,
				 OscalMetadataFactory.eINSTANCE.createResourceRlink()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__PROPS,
				 OscalMetadataFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__DOCUMENT_IDS,
				 OscalMetadataFactory.eINSTANCE.createDocumentId()));

		newChildDescriptors.add
			(createChildParameter
				(OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE__BASE64,
				 OscalMetadataFactory.eINSTANCE.createBase64()));
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
