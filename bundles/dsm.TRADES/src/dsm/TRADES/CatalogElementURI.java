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

package dsm.TRADES;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;

public class CatalogElementURI {

	private static final String CATALOG_URI_SCHEME = "Catalog:/";
	private static final Pattern CATALOG_URI_PATTERN = Pattern.compile(CATALOG_URI_SCHEME + "(.*)/(.*)#(.*)");

	public enum Type {
		CONTROL, THREAT
	}

	private final Type type;

	private final String calatogIdentifier;

	private final String elementIdentifier;


	public static CatalogElementURI fromString(String uri) {
		if (uri == null) {
			return null;
		}
		Matcher matcher = CATALOG_URI_PATTERN.matcher(uri);
		if (matcher.matches()) {
			String sType = matcher.group(1);
			Type type = Type.valueOf(sType);
			if (type != null) {
				return new CatalogElementURI(type, matcher.group(2), matcher.group(3));

			}
		}
		return null;

	}

	public static CatalogElementURI createCatalogControlURI(String catalogIdentifier, String elementId) {
		return new CatalogElementURI(Type.CONTROL, catalogIdentifier, elementId);
	}

	public static CatalogElementURI createCatalogThreatURI(String catalogIdentifier, String elementId) {
		return new CatalogElementURI(Type.THREAT, catalogIdentifier, elementId);
	}

	public CatalogElementURI(Type type, String calatogIdentifier, String elementIdentifier) {
		super();
		this.type = type;
		this.calatogIdentifier = calatogIdentifier;
		this.elementIdentifier = elementIdentifier;
	}

	@Override
	public String toString() {
		return CATALOG_URI_SCHEME + type.toString() + "/" + calatogIdentifier + "#" + elementIdentifier;
	}

	public List<EObject> resolveElementFromCatalog(List<ICatalogDefinition> calalogs) {

		return calalogs.stream().filter(c -> calatogIdentifier.equals(c.getIdentifier())).map(c -> {
			if (this.type == Type.CONTROL) {
				return c.getControlById(elementIdentifier);
			} else if (this.type == Type.THREAT) {
				return c.getThreatById(elementIdentifier);
			} else {
				return null;
			}
		}).filter(e -> e != null).collect(toList());

	}

}
