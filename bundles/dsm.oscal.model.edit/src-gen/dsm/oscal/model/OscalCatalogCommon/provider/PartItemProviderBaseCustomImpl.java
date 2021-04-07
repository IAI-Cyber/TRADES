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
package dsm.oscal.model.OscalCatalogCommon.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import dsm.oscal.model.OscalCatalogCommon.Part;

public class PartItemProviderBaseCustomImpl extends PartItemProvider {
	
	public PartItemProviderBaseCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	/**
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Part element = (Part) object;
		return element.getName();
	}
	
	/**
	   * @generated
	   */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custom/Part.png"));
	}
	
}
