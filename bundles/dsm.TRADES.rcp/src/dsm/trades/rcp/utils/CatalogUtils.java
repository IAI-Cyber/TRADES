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

package dsm.trades.rcp.utils;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;

import dsm.trades.rcp.TRADESRCPActivator;

public class CatalogUtils {

	private static final String CATALOGS_FOLDER = "Catalogs";

	public static void createCatalogFolder(IProject selectedProject0, IProgressMonitor monitor) {
		IFolder catalogFolder = selectedProject0.getFolder(CATALOGS_FOLDER);
		if (!catalogFolder.exists()) {
			try {
				catalogFolder.create(false, true, monitor);
			} catch (CoreException e) {
				TRADESRCPActivator.logError("Unable to create 'catalogs' fodler " + e.getMessage(), e);
			}
		}
	}

	public static URI getCatalogFolderURI(URI sessionURI) {
		return sessionURI.trimSegments(1).appendSegment(CATALOGS_FOLDER);
	}
}
