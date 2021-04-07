/**
 * Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 *This program and the accompanying materials
 *are made available under the terms of the Eclipse Public License 2.0
 *which accompanies this distribution, and is available at
 *https://www.eclipse.org/legal/epl-2.0/
 *
 *SPDX-License-Identifier: EPL-2.0
 *
 *Contributors:
 *    ELTA Ltd - initial API and implementation
 *
 */
package dsm.oscal.model.OscalMetadata.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.oscal.model.OscalMetadata.Property;

public class PropertyItemProviderCustomImpl extends PropertyItemProvider {

	public PropertyItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Property property = (Property) object;
		String label = property.getName();
		String value = property.getValue();
		return label + " = " + value;
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custom/property_obj.png"));

	}
}
