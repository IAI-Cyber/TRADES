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

package dsm.TRADES.rcp.mitre;

import org.eclipse.emf.common.util.URI;
import org.osgi.service.component.annotations.Component;

import dsm.trades.rcp.databases.CatalogDescription;
import dsm.trades.rcp.databases.ICatalogRegistry;
import dsm.trades.rcp.databases.ICatalogRegistryConfigurator;

@Component(immediate = true, property = { "type=MITRE" })
public class MitreCatalogProvider implements ICatalogRegistryConfigurator {

	@Override
	public void configure(ICatalogRegistry registry) {
		registry.addCatalog(new CatalogDescription(//
				URI.createPlatformPluginURI("dsm.TRADES.rcp.mitre/databases/mitre_enterprise-attack.trades", false)//
				, "Mitre ATT&ACK Entreprise", "", "https://attack.mitre.org/resources/terms-of-use/"));
		registry.addCatalog(new CatalogDescription(//
				URI.createPlatformPluginURI("dsm.TRADES.rcp.mitre/databases/mitre_ics-attack.trades", false)//
				, "Mitre ATT&ACK ICS", "", "https://attack.mitre.org/resources/terms-of-use/"));
		registry.addCatalog(new CatalogDescription(//
				URI.createPlatformPluginURI("dsm.TRADES.rcp.mitre/databases/mitre_mobile-attack.trades", false)//
				, "Mitre ATT&ACK Mobile", "", "https://attack.mitre.org/resources/terms-of-use/"));
		registry.addCatalog(new CatalogDescription(//
				URI.createPlatformPluginURI("dsm.TRADES.rcp.mitre/databases/mitre_pre-attack.trades", false)//
				, "Mitre ATT&ACK Pre-Attack", "", "https://attack.mitre.org/resources/terms-of-use/"));

	}

}
