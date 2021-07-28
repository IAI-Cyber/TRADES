/**
 * Copyright (c) Israel Aerospace Industries, Eclipse contributors and others 2021.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *
 */

package org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.sirius.properties.provider.Utils;

public class ExtHTMLRendererDescriptionItemProviderSpec extends ExtHTMLRendererDescriptionItemProvider {

	public ExtHTMLRendererDescriptionItemProviderSpec(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Object styledText = this.getStyledText(object);
		if (styledText instanceof StyledString) {
			return ((StyledString) styledText).getString();
		}
		return super.getText(object);
	}

	@Override
	public Object getStyledText(Object object) {
		return Utils.computeLabel(this, object, "_UI_ExtHTMLRendererDescription_type"); //$NON-NLS-1$
	}

	@Override
	protected CommandParameter createChildParameter(Object feature, Object child) {
		Utils.addNoopNavigationOperations(child);
		return super.createChildParameter(feature, child);
	}

	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ExtHTMLRendererDescription.png")); //$NON-NLS-1$
	}

}
