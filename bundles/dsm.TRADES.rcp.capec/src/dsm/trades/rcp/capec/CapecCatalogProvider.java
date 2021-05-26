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

package dsm.trades.rcp.capec;

import org.eclipse.emf.common.util.URI;
import org.osgi.service.component.annotations.Component;

import dsm.trades.rcp.databases.CatalogDescription;
import dsm.trades.rcp.databases.ICatalogRegistry;
import dsm.trades.rcp.databases.ICatalogRegistryConfigurator;

@Component(immediate = true, property = { "type=CAPEC" })
public class CapecCatalogProvider implements ICatalogRegistryConfigurator {

	@Override
	public void configure(ICatalogRegistry registry) {
		registry.addCatalog(new CatalogDescription(//
				URI.createPlatformPluginURI("dsm.TRADES.rcp.capec/databases/capec.trades", false)//
				, "Capec", "", "https://capec.mitre.org/about/termsofuse.html"));

	}

}
