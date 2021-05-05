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

import java.nio.file.Path;
import java.util.List;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class MetaschemaToEcoreApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] args = (String[]) context.getArguments().get("application.args");
		if (args.length == 0) {
			throw new IllegalArgumentException("Expecting one argument that target the model plugin");
		}

		/**
		 * TODO Add the resource set to the refactor to be able to create link from
		 * oscal to trades MM
		 */
		new MetaschemaToEcoreTransformer(new OSCALImageProvider(), new OscalSemanticRefactorer())
				.transform(List.of(//
//				"metaschema/oscal_assessment-common_metaschema.xml", //
//				"metaschema/oscal_assessment-plan_metaschema.xml", //
//				"metaschema/oscal_assessment-results_metaschema.xml", //
				"metaschema/oscal_catalog_metaschema.xml", //
//				"metaschema/oscal_component_metaschema.xml", //
				"metaschema/oscal_control-common_metaschema.xml", //
//				"metaschema/oscal_implementation-common_metaschema.xml", //
				"metaschema/oscal_metadata_metaschema.xml" //
//				"metaschema/oscal_poam_metaschema.xml", //
//				"metaschema/oscal_profile_metaschema.xml" //
//				"metaschema/oscal_ssp_metaschema.xml"//
		), Path.of(args[0]));
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
