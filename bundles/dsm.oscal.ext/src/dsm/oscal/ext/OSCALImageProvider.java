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

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Provides the images corresponding to OSCAL concepts
 * 
 * @author Arthur Daussy
 *
 */
public class OSCALImageProvider implements BiFunction<String, String, String> {

	private static final Map<String, String> conceptToImage = new HashMap<>();

	static {
		conceptToImage.put("OscalMetadata.Link", "custom/link_obj.png");
		conceptToImage.put("OscalCatalog.Group", "custom/folderType_filter.png");
		conceptToImage.put("OscalCatalog.Control", "custom/Control.png");
		conceptToImage.put("OscalCatalogCommon.Parameter", "custom/EParameter.gif");
		conceptToImage.put("OscalCatalogCommon.Part", "custom/Part.png");
		conceptToImage.put("OscalMetadata.BackMatterResource", "custom/context.png");
		conceptToImage.put("OscalMetadata.BackMatter", "custom/ctxhelp_context_obj.png");
		conceptToImage.put("OscalMetadata.ResourceRlink", "custom/link_obj.png");
		conceptToImage.put("OscalMetadata.ResourceCitation", "custom/quote.png");
	}

	@Override
	public String apply(String packageName, String eClassName) {
		return conceptToImage.get(packageName + "." + eClassName);
	}

}
