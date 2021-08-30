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
package dsm.oscal.model.transform;

import java.io.FileNotFoundException;
import java.nio.file.Path;

import dsm.oscal.model.OSCALModelActivator;
import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.transform.mappers.CatalogMapper;
import gov.nist.secauto.metaschema.binding.BindingContext;
import gov.nist.secauto.metaschema.binding.io.BindingException;
import gov.nist.secauto.metaschema.binding.io.Feature;
import gov.nist.secauto.metaschema.binding.io.Format;
import gov.nist.secauto.metaschema.binding.io.MutableConfiguration;
import gov.nist.secauto.metaschema.binding.io.Serializer;
import gov.nist.secauto.oscal.java.OscalLoader;

/**
 * Transformer in charge of importing and exporting OSCAL catalog
 * 
 * @author Arthur Daussy
 *
 */
public class OSCALTransformer {

	/**
	 * Imports the catalog located at the given path
	 * 
	 * @param path the xml file path
	 * @return a {@link Catalog} or <code>null</code> if invalid definition
	 */
	public Catalog importCatalog(Path path) {
		if (path == null || !path.toFile().isFile()) {
			throw new IllegalArgumentException("Invalid input file");
		}

		gov.nist.secauto.oscal.lib.model.Catalog catalog;
		try {
			catalog = new OscalLoader().loadCatalog(path.toFile());
		} catch (FileNotFoundException | BindingException e) {
			OSCALModelActivator.logError("Unable to import catalog : " + e.getMessage(), e);
			return null;
		}

		return toTRADES(catalog);

	}

	/**
	 * Export the catalog into an XML file respecting OSCAL format
	 * 
	 * @param catalog    the catalog to export (non <code>null</code>)
	 * @param pathToSave the path to save the file (Its overrides existing file)
	 */
	public void exportCatalog(Catalog catalog, Path pathToSave, Format format) {
		if (catalog == null) {
			throw new IllegalArgumentException("Invalid input 'null'");
		}

		gov.nist.secauto.oscal.lib.model.Catalog oscalCatalog = toOscal(catalog);

		MutableConfiguration config = new MutableConfiguration().enableFeature(Feature.SERIALIZE_ROOT);
		Serializer<gov.nist.secauto.oscal.lib.model.Catalog> serializer = BindingContext.newInstance()
				.newSerializer(format, gov.nist.secauto.oscal.lib.model.Catalog.class, config);

		try {
			serializer.serialize(oscalCatalog, pathToSave.toFile());
		} catch (FileNotFoundException | BindingException e) {
			OSCALModelActivator.logError("Unable to save catalog : " + e.getMessage(), e);
		}

	}

	private Catalog toTRADES(gov.nist.secauto.oscal.lib.model.Catalog catalog) {
		return CatalogMapper.getInstance().toTrades(catalog);
	}

	private gov.nist.secauto.oscal.lib.model.Catalog toOscal(Catalog catalog) {
		return CatalogMapper.getInstance().toOscal(catalog);
	}

}
