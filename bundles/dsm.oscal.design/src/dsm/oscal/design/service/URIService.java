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
package dsm.oscal.design.service;

import java.net.URI;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.ext.emf.edit.EditingDomainServices;

import dsm.oscal.model.OscalMetadata.OscalElement;

public class URIService {

	private static EditingDomainServices editServices = new EditingDomainServices();

	public static String getURILabel(OscalElement context, URI uri) {

		if (uri == null) {
			return "";
		} else {
			EObject target = context.resolve(uri);
			if (target != null) {
				return editServices.getLabelProviderText(target);
			} else {
				return uri.toString();
			}

		}
	}

}
