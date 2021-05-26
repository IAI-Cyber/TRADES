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

package dsm.trades.rcp.databases;

import org.eclipse.emf.common.util.URI;

public class CatalogDescription {

	private final URI uri;

	private final String catalogName;

	private final String description;

	private final String license;

	public CatalogDescription(URI uri, String catalogName, String description, String license) {
		super();
		this.uri = uri;
		this.catalogName = catalogName;
		this.description = description;
		this.license = license;
	}

	public URI getUri() {
		return uri;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public String getDescription() {
		return description;
	}

	public String getLicense() {
		return license;
	}

}
