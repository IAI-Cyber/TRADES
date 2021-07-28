/**
 *  Copyright (c) Obeo, Eclipse contributors and others 2021.
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *  Contributors:
 *     Obeo and Israel Aerospace Industries - initial API and implementation
 * 
 */
package org.eclipse.eef.ext.widgets.markup.MarkupWidgets.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage;

import org.eclipse.eef.provider.EEFWidgetDescriptionItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EEFExtHTMLRendererDescriptionItemProvider extends EEFWidgetDescriptionItemProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) Obeo, Eclipse contributors and others 2021.\n This program and the accompanying materials\n are made available under the terms of the Eclipse Public License 2.0\n which accompanies this distribution, and is available at\n https://www.eclipse.org/legal/epl-2.0/\n\n SPDX-License-Identifier: EPL-2.0\n\n Contributors:\n    Obeo and Israel Aerospace Industries - initial API and implementation\n";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFExtHTMLRendererDescriptionItemProvider(AdapterFactory adapterFactory) {
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

			addToHtmlExpressionPropertyDescriptor(object);
			addValueExpressionPropertyDescriptor(object);
			addNumberOfLinePropertyDescriptor(object);
			addEditExpressionPropertyDescriptor(object);
			addEditionToolExpressionPropertyDescriptor(object);
			addCssExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the To Html Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToHtmlExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_EEFExtHTMLRendererDescription_toHtmlExpression_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_EEFExtHTMLRendererDescription_toHtmlExpression_feature",
						"_UI_EEFExtHTMLRendererDescription_type"),
				MarkupWidgetsPackage.Literals.EEF_EXT_HTML_RENDERER_DESCRIPTION__TO_HTML_EXPRESSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Value Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_EEFExtHTMLRendererDescription_valueExpression_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_EEFExtHTMLRendererDescription_valueExpression_feature",
						"_UI_EEFExtHTMLRendererDescription_type"),
				MarkupWidgetsPackage.Literals.EEF_EXT_HTML_RENDERER_DESCRIPTION__VALUE_EXPRESSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Number Of Line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfLinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_EEFExtHTMLRendererDescription_numberOfLine_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_EEFExtHTMLRendererDescription_numberOfLine_feature",
						"_UI_EEFExtHTMLRendererDescription_type"),
				MarkupWidgetsPackage.Literals.EEF_EXT_HTML_RENDERER_DESCRIPTION__NUMBER_OF_LINE, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Edit Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_EEFExtHTMLRendererDescription_editExpression_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_EEFExtHTMLRendererDescription_editExpression_feature",
						"_UI_EEFExtHTMLRendererDescription_type"),
				MarkupWidgetsPackage.Literals.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDIT_EXPRESSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Edition Tool Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditionToolExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_EEFExtHTMLRendererDescription_editionToolExpression_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_EEFExtHTMLRendererDescription_editionToolExpression_feature",
						"_UI_EEFExtHTMLRendererDescription_type"),
				MarkupWidgetsPackage.Literals.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDITION_TOOL_EXPRESSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Css Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCssExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_EEFExtHTMLRendererDescription_cssExpression_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_EEFExtHTMLRendererDescription_cssExpression_feature",
						"_UI_EEFExtHTMLRendererDescription_type"),
				MarkupWidgetsPackage.Literals.EEF_EXT_HTML_RENDERER_DESCRIPTION__CSS_EXPRESSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns EEFExtHTMLRendererDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EEFExtHTMLRendererDescription"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EEFExtHTMLRendererDescription) object).getIdentifier();
		return label == null || label.length() == 0 ? getString("_UI_EEFExtHTMLRendererDescription_type")
				: getString("_UI_EEFExtHTMLRendererDescription_type") + " " + label;
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

		switch (notification.getFeatureID(EEFExtHTMLRendererDescription.class)) {
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__TO_HTML_EXPRESSION:
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__VALUE_EXPRESSION:
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__NUMBER_OF_LINE:
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDIT_EXPRESSION:
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDITION_TOOL_EXPRESSION:
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__CSS_EXPRESSION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		default:
			super.notifyChanged(notification);
			return;
		}
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MarkupWidgetsEditPlugin.INSTANCE;
	}

}
