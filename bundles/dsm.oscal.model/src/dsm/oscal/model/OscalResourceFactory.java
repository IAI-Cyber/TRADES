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

package dsm.oscal.model;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class OscalResourceFactory extends ResourceFactoryImpl {

	public OscalResourceFactory() {
		super();
	}

	@Override
	public Resource createResource(URI uri) {
		OscalResource oscalResource = new OscalResource(uri);
		oscalResource.setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
		return oscalResource;
	}


}
