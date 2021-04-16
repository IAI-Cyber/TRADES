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

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import dsm.oscal.model.OscalCatalog.Catalog;

public class OscalElementCustomImpl extends OscalElementImpl {

	@Override
	public EObject resolve(URI uri) {
		if (uri == null) {
			return null;
		} else {
			String fragment = uri.toString();
			if (fragment.startsWith("#")) {
				// TODO improve this to collect all EAttribute tag with an index annotation
				String searchID = fragment.substring(1, fragment.length());
				EObject target = eResource().getEObject(searchID);
				if (target == null) {
					// Search in all the model
					// TODO improve and add a cache somewhere
					// Will do the trick for a first version
					Catalog catalog = getAncestor(this, Catalog.class);
					if (catalog != null) {
						TreeIterator<EObject> contentIte = catalog.eAllContents();
						while (contentIte.hasNext()) {
							EObject next = contentIte.next();
							String id = getId(next);
							if (id != null && searchID.equals(id)) {
								return next;
							}
						}
					}
				}
				return target;
			} else {
				return null;
			}
		}
	}

	private <T extends EObject> T getAncestor(EObject self, Class<T> type) {
		EObject current = self;
		while (current != null && !(type.isInstance(current))) {
			current = current.eContainer();
		}
		if (current != null && type.isInstance(current)) {
			return type.cast(current);
		} else {
			return null;
		}

	}

	private String getId(EObject o) {
		if (o == null) {
			return null;
		}
		EClass oEClass = o.eClass();
		Object value = oEClass.getEAllAttributes().stream().filter(f -> {
			String fName = f.getName();
			return "id".equalsIgnoreCase(fName) || "uuid".equalsIgnoreCase(fName);
		}).findFirst().map(a -> o.eGet(a)).orElse(null);

		if (value instanceof String) {
			return (String) value;

		}
		return null;
	}

}
