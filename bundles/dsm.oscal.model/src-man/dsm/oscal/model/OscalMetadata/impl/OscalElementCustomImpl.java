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

package dsm.oscal.model.OscalMetadata.impl;

import java.net.URI;

import org.eclipse.emf.ecore.EObject;

public class OscalElementCustomImpl extends OscalElementImpl {

	@Override
	public EObject resolve(URI uri) {
		if (uri == null) {
			return null;
		} else {
			String fragment = uri.toString();
			if (fragment.startsWith("#")) {
				// TODO improve this to collect all EAttribute tag with an index annotation
				return eResource().getEObject(fragment.substring(1, fragment.length()));
			} else {
				return null;
			}
		}
	}

}
