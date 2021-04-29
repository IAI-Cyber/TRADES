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

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dsm.oscal.model.OscalCatalogCommon.Part;
import dsm.oscal.model.OscalMetadata.PartOwner;

public class DocumentationComputer {

	public static Pattern INSET_PATTERN = Pattern.compile("\\{\\{\\s*insert:\\s*param\\s*,\\s*(\\S*)\\s*\\}\\}");

	/**
	 * Computes the documentation of the given {@link PartOwner}. This methods also
	 * replace the <code>{{insert: param ...}}</code> tags by their value (if more
	 * than one only takes the first one)
	 * 
	 * @param owner  the owner
	 * @param params the available parameters value from the given owner
	 * @return
	 */
	public static String computeDocumentation(PartOwner owner, Map<String, String> params) {

		StringBuilder builder = new StringBuilder();
		for (Part p : owner.getParts()) {
			String doc = p.computeDocumentation();
			if (doc != null && !doc.isBlank()) {
				builder.append(doc);
			}
		}
		String doc = builder.toString();

		String newDoc = resolveInsideVariable(params, doc);

		return newDoc;
	}

	public static String resolveInsideVariable(Map<String, String> params, String doc) {
		Matcher match = INSET_PATTERN.matcher(doc);

		String newDoc = match.replaceAll(matchResult -> {
			String id = matchResult.group(1);
			String value = params.get(id);
			if (value != null) {
				return Matcher.quoteReplacement(value);
			}
			return doc.substring(matchResult.start(), matchResult.end());
		});
		return newDoc;
	}

}
