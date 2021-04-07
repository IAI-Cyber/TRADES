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
package dsm.oscal.ext;

import java.io.IOException;
import java.net.URL;

public class OSCALSchemas {

	public static URL[] getCatalogSchema() throws IOException {
		return new URL[] {
				OSCALSchemas.class.getResource("./schemas/oscal_assessment-plan_schema.xsd"),
				OSCALSchemas.class.getResource("./schemas/oscal_assessment-results_schema.xsd"),
				OSCALSchemas.class.getResource("./schemas/oscal_catalog_schema.xsd"),
				OSCALSchemas.class.getResource("./schemas/oscal_component_schema.xsd"),
				OSCALSchemas.class.getResource("./schemas/oscal_poam_schema.xsd"),
				OSCALSchemas.class.getResource("./schemas/oscal_profile_schema.xsd"),
				OSCALSchemas.class.getResource("./schemas/oscal_ssp_schema.xsd")
		};
	}
}
