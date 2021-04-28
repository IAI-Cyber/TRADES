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
package dsm.oscal.model.edit;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

public class LabelUtils {

	public static String toSimpleLabel(MarkupLine value) {
		if (value == null) {
			return "";
		}
		String markdown = value.toMarkdown();
		String oneLine = markdown.replaceAll("\\n", " ");
		return getShorten(oneLine, 20);
	}

	public static String toSimpleLabel(MarkupMultiline value) {
		if (value == null) {
			return "";
		}
		String markdown = value.toMarkdown();
		String oneLine = markdown.replaceAll("\\n", " ");
		return getShorten(oneLine, 20);
	}

	public static String getShorten(String msg, int size) {
		if (msg == null) {
			return null;
		}
		if (msg.length() < size || size <= 3) {
			return msg;
		} else {
			return msg.substring(0, msg.length() - 3) + "...";
		}
	}
}
