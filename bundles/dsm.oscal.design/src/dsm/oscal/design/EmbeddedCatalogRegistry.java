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

package dsm.oscal.design;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;

/**
 * Registry that give access to all the embedded OSCAL catalogs
 * 
 * @author Arthur Daussy
 *
 */
public class EmbeddedCatalogRegistry {

	private Map<String, String> nameToPath = new HashMap<>();

	private EmbeddedCatalogRegistry() {
		nameToPath.put("NIST_SP-800-53_rev5_catalog", "catalog/NIST_SP-800-53_rev5_catalog.xml");
	}

	/** Holder */
	private static class SingletonHolder {

		private final static EmbeddedCatalogRegistry instance = new EmbeddedCatalogRegistry();
	}

	/** Get unique instance of EmbeddedCatalogRegistry */
	public static EmbeddedCatalogRegistry getInstance() {
		return SingletonHolder.instance;
	}

	public List<String> getAvailableLibraries() {
		return nameToPath.keySet().stream().sorted().collect(toList());
	}

	public InputStream getCatalog(String name) throws IOException {
		String path = nameToPath.get(name);
		if (path != null) {
			return FileLocator.openStream(Activator.getDefault().getBundle(), new Path(path), false);
		}
		return null;
	}

}
