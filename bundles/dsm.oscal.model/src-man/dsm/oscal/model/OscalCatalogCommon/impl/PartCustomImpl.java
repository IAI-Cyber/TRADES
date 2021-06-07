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

package dsm.oscal.model.OscalCatalogCommon.impl;

import dsm.oscal.model.OscalCatalogCommon.Part;

public class PartCustomImpl extends PartImpl {
	@Override
	public String computeDocumentation() {

		StringBuilder builder = new StringBuilder();

		if (getTitle() != null) {
			String tmd = getTitle().toMarkdown();
			if (tmd != null && !tmd.isBlank()) {
				builder.append(tmd).append("\n").append("\n");
			}
		}

		if (getProse() != null) {
			String pmd = getProse().toMarkdown();
			if (pmd != null && !pmd.isBlank()) {
				builder.append(pmd).append("\n").append("\n");
			}
		}

		for (Part sub : getParts()) {
			String smd = sub.computeDocumentation();
			if (smd != null && !smd.isBlank()) {
				builder.append(smd);
			}

		}

		return builder.toString();
	}
}
