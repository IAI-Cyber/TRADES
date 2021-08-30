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

package dsm.oscal.ext;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class DeleteMetaschemaAnnotApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] args = (String[]) context.getArguments().get("application.args");
		if (args.length == 0) {
			throw new IllegalArgumentException("Expecting one argument that target the model plugin");
		}

		ResourceSet rs = new ResourceSetImpl();

		Files.walk(Path.of(args[0])).filter(p -> p.getFileName().toString().endsWith("ecore"))
				.forEach(p -> removeAnnot(rs, p));

		for (Resource r : rs.getResources()) {
			if (r.getURI().isFile() || r.getURI().isPlatformResource()) {
				try {
					r.save(Collections.emptyMap());
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println(e.getMessage());
				}
			}
		}
		return IApplication.EXIT_OK;
	}

	private void removeAnnot(ResourceSet rs, Path p) {
		Resource r = rs.getResource(URI.createFileURI(p.toAbsolutePath().toString()), true);

		TreeIterator<EObject> contentIte = r.getAllContents();

		while (contentIte.hasNext()) {

			EObject next = contentIte.next();
			List<EAnnotation> annots = new ArrayList<>();
			if (next instanceof EAnnotation) {
				EAnnotation annot = (EAnnotation) next;
				if("Metaschema".equals(annot.getSource()) ) {
					annots.add(annot);
				}
			}

			annots.forEach(a -> EcoreUtil.delete(a));
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
