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

import java.util.UUID;

import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.OscalCatalog.OscalCatalogFactory;
import dsm.oscal.model.OscalMetadata.Metadata;
import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

public class SemanticUtil {

	public static Catalog createCatalog(String name) {
		Catalog catalog = OscalCatalogFactory.eINSTANCE.createCatalog();
		catalog.setUuid(UUID.randomUUID());
		Metadata metadata = OscalMetadataFactory.eINSTANCE.createMetadata();
		catalog.setMetadata(metadata);
		metadata.setTitle(name != null ? MarkupLine.fromMarkdown(name) : null);
		return catalog;
	}

}
