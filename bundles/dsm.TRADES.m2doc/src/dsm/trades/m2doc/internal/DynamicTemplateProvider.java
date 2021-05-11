/******************************************************************************************************
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
*******************************************************************************************************/
package dsm.trades.m2doc.internal;

import static java.util.stream.Collectors.toList;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.osgi.service.component.annotations.Component;

import dsm.trades.m2doc.IM2DocTemplateRegistry;
import dsm.trades.m2doc.IM2docTemplateRegistryConfigurator;
import dsm.trades.m2doc.TradesM2docActivator;

/**
 * A {@link IM2docTemplateRegistryConfigurator} that add all reports found in
 * ${user.home}/{@value#TEMPLATE_LOCATION}
 * 
 * @author Arthur Daussy
 *
 */
@Component(immediate = true)
public class DynamicTemplateProvider implements IM2docTemplateRegistryConfigurator {

	private static final String TEMPLATE_LOCATION = ".TRADES/m2Doc-templates";

	public static String toTemplateName(Path path) {
		return path.getFileName().toString().replace("." + TradesM2docActivator.DOCX, "");
	}

	public static Path getLocaTemplateFolder() {
		String userHome = System.getProperty("user.home");
		if (userHome != null) {
			Path tempalteFolder = Paths.get(userHome, TEMPLATE_LOCATION);
			return tempalteFolder;
		}
		return null;
	}

	public static List<Path> getLocalTemplates() {
		Path tempalteFolder = getLocaTemplateFolder();
		if (tempalteFolder != null) {
			File folder = tempalteFolder.toFile();
			if (folder.exists() && folder.isDirectory()) {
				try {
					return Files.walk(tempalteFolder, 1)
							.filter(p -> p.toFile().isFile()
									&& p.getFileName().toString().endsWith(TradesM2docActivator.DOCX)
									&& !p.getFileName().toString().startsWith("~"))
							.collect(toList());
				} catch (IOException e) {
					TradesM2docActivator.logError("Error while reading dynamic templates", e);
				}
			}
		}
		return Collections.emptyList();
	}

	@Override
	public void configure(IM2DocTemplateRegistry registry) {
		for (Path t : getLocalTemplates()) {
			URI uri = URI.createFileURI(t.toUri().getPath());
			registry.addTemplate(uri, toTemplateName(t));
		}
	}

}
