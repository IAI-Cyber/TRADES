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

package dsm.oscal.design.m2doc;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.eclipse.acceleo.query.runtime.IReadOnlyQueryEnvironment;
import org.eclipse.acceleo.query.runtime.IService;
import org.eclipse.acceleo.query.runtime.ServiceUtils;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.obeonetwork.m2doc.services.configurator.IServicesConfigurator;

public class OscalM2DocService implements IServicesConfigurator {


	@Override
	public List<String> getOptions() {
		return Collections.emptyList();
	}

	@Override
	public Map<String, String> getInitializedOptions(Map<String, String> options) {
		return Collections.emptyMap();
	}

	@Override
	public Map<String, List<Diagnostic>> validate(IReadOnlyQueryEnvironment queryEnvironment,
			Map<String, String> options) {
		return Collections.emptyMap();
	}

	@Override
	public Set<IService> getServices(IReadOnlyQueryEnvironment queryEnvironment, ResourceSet resourceSetForModels,
			Map<String, String> options) {

		return ServiceUtils.getServices(queryEnvironment, new MarkupServices());
	}

	@Override
	public void startGeneration(IReadOnlyQueryEnvironment queryEnvironment, XWPFDocument destinationDocument) {
		// nothing to do here
	}

	@Override
	public void cleanServices(IReadOnlyQueryEnvironment queryEnvironment, ResourceSet resourceSetForModels) {
	}

	@Override
	public ResourceSet createResourceSetForModels(Object context, Map<String, String> options) {
		return null;
	}

	@Override
	public void cleanResourceSetForModels(Object context) {
		// nothing to do here
	}

}
