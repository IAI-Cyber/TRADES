/**
 * Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     ELTA Ltd - initial API and implementation
 * 
 */
package dsm.oscal.model.Oscal.provider;

import dsm.oscal.model.Oscal.OscalFactory;
import dsm.oscal.model.Oscal.OscalPackage;
import dsm.oscal.model.Oscal.SetParameter;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dsm.oscal.model.Oscal.SetParameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SetParameterItemProvider extends PropertyOwnerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetParameterItemProvider(AdapterFactory adapterFactory) {
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

			addParamIdPropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addDependsOnPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addUsagePropertyDescriptor(object);
			addGuidelinePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Param Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParamIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SetParameter_paramId_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SetParameter_paramId_feature",
								"_UI_SetParameter_type"),
						OscalPackage.Literals.SET_PARAMETER__PARAM_ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SetParameter_class_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SetParameter_class_feature",
								"_UI_SetParameter_type"),
						OscalPackage.Literals.SET_PARAMETER__CLASS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Depends On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependsOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SetParameter_dependsOn_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SetParameter_dependsOn_feature",
								"_UI_SetParameter_type"),
						OscalPackage.Literals.SET_PARAMETER__DEPENDS_ON, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SetParameter_label_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SetParameter_label_feature",
								"_UI_SetParameter_type"),
						OscalPackage.Literals.SET_PARAMETER__LABEL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Usage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SetParameter_usage_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SetParameter_usage_feature",
								"_UI_SetParameter_type"),
						OscalPackage.Literals.SET_PARAMETER__USAGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Guideline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuidelinePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SetParameter_guideline_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SetParameter_guideline_feature",
								"_UI_SetParameter_type"),
						OscalPackage.Literals.SET_PARAMETER__GUIDELINE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SetParameter_value_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SetParameter_value_feature",
								"_UI_SetParameter_type"),
						OscalPackage.Literals.SET_PARAMETER__VALUE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(OscalPackage.Literals.ANNOTATION_OWNER__ANNOTATIONS);
			childrenFeatures.add(OscalPackage.Literals.LINK_OWNER__LINKS);
			childrenFeatures.add(OscalPackage.Literals.SET_PARAMETER__CONSTRAINTS);
			childrenFeatures.add(OscalPackage.Literals.SET_PARAMETER__SELECT);
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
	 * This returns SetParameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SetParameter"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SetParameter) object).getParamId();
		return label == null || label.length() == 0 ? getString("_UI_SetParameter_type")
				: getString("_UI_SetParameter_type") + " " + label;
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

		switch (notification.getFeatureID(SetParameter.class)) {
		case OscalPackage.SET_PARAMETER__PARAM_ID:
		case OscalPackage.SET_PARAMETER__CLASS:
		case OscalPackage.SET_PARAMETER__DEPENDS_ON:
		case OscalPackage.SET_PARAMETER__LABEL:
		case OscalPackage.SET_PARAMETER__USAGE:
		case OscalPackage.SET_PARAMETER__GUIDELINE:
		case OscalPackage.SET_PARAMETER__VALUE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case OscalPackage.SET_PARAMETER__ANNOTATIONS:
		case OscalPackage.SET_PARAMETER__LINKS:
		case OscalPackage.SET_PARAMETER__CONSTRAINTS:
		case OscalPackage.SET_PARAMETER__SELECT:
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

		newChildDescriptors.add(createChildParameter(OscalPackage.Literals.ANNOTATION_OWNER__ANNOTATIONS,
				OscalFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add(
				createChildParameter(OscalPackage.Literals.LINK_OWNER__LINKS, OscalFactory.eINSTANCE.createLink()));

		newChildDescriptors.add(createChildParameter(OscalPackage.Literals.SET_PARAMETER__CONSTRAINTS,
				OscalFactory.eINSTANCE.createOSCALConstraint()));

		newChildDescriptors.add(createChildParameter(OscalPackage.Literals.SET_PARAMETER__SELECT,
				OscalFactory.eINSTANCE.createSelect()));
	}

}
