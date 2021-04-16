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

import dsm.oscal.model.OscalCatalogCommon.Part;
import dsm.oscal.model.OscalMetadata.PartOwner;

public class DocumentationComputer {
	public static String computeDocumentation(PartOwner owner) {

		StringBuilder builder = new StringBuilder();
		for (Part p : owner.getParts()) {
			String doc = p.computeDocumentation();
			if (doc != null && !doc.isBlank()) {
				builder.append(doc);
			}
		}
		return builder.toString();
	}
}
