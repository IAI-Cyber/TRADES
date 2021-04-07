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
package dsm.oscal.model;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

/**
 * Custom implementation of {@link OSCALDataTypeHandler}
 * 
 * @author Arthur Daussy
 *
 */
public class OSCALDataTypeHandlerCustomImpl extends OSCALDataTypeHandler {

	@Override
	public String saveMarkupMultilineTypeToString(MarkupMultiline value) {
		return value == null ? null : value.toMarkdown();
	}

	@Override
	public MarkupMultiline loadMarkupMultilineTypeFromString(String value) {
		return value == null ? null : MarkupMultiline.fromMarkdown(value);
	}

	@Override
	public String saveMarkupLineTypeToString(MarkupLine value) {
		return value == null ? null : value.toMarkdown();
	}

	@Override
	public MarkupLine loadMarkupLineTypeFromString(String value) {
		return value == null ? null : MarkupLine.fromMarkdown(value);
	}

}
