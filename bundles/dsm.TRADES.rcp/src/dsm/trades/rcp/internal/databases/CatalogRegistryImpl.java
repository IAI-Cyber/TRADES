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

package dsm.trades.rcp.internal.databases;

import java.util.ArrayList;
import java.util.List;

import dsm.trades.rcp.databases.CatalogDescription;
import dsm.trades.rcp.databases.ICatalogRegistry;

public class CatalogRegistryImpl implements ICatalogRegistry {

	private final List<CatalogDescription> catalogs = new ArrayList<CatalogDescription>();

	@Override
	public List<CatalogDescription> getAvailableCatalogs() {
		return new ArrayList<>(catalogs);
	}

	@Override
	public void addCatalog(CatalogDescription catalogDescription) {
		catalogs.add(catalogDescription);
	}

}
