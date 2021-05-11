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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.obeonetwork.m2doc.properties.TemplateCustomProperties;

import dsm.trades.m2doc.IM2DocTemplate;
import dsm.trades.m2doc.IM2DocTemplateRegistry;
import dsm.trades.m2doc.TradesM2docActivator;

/**
 * Registry used to keep tracks of all available {@link IM2DocTemplate}
 * 
 * @author Arthur Daussy
 *
 */
public class M2DocTemplateRegistry implements IM2DocTemplateRegistry {

	private List<IM2DocTemplate> templates = new ArrayList<IM2DocTemplate>();

	@Override
	public List<IM2DocTemplate> getTemplates() {
		return templates;
	}

	@Override
	public IM2DocTemplateRegistry addTemplate(URI newTemplate, String name) {

		try (InputStream input = new ExtensibleURIConverterImpl().createInputStream(newTemplate)) {
			OPCPackage pkg = OPCPackage.open(input);
			try (XWPFDocument res = new XWPFDocument(pkg)) {
				final TemplateCustomProperties customProperties = new TemplateCustomProperties(res);
				String selfType = customProperties.getVariables().get(IM2DocTemplate.SELF_VAR);
				if (selfType == null) {
					TradesM2docActivator.logError("Unkown type of self for the template" + newTemplate);
					return this;
				}

				String[] parts = selfType.split("::");
				if (parts.length != 2) {
					TradesM2docActivator.logError("Unkown type of self for the template" + newTemplate);
					return this;
				}

				EClassifier selfTypeEClass = getTargetEClass(customProperties.getPackagesURIs(), parts[0], parts[1]);
				if (!(selfTypeEClass instanceof EClass)) {
					TradesM2docActivator.logError("Unkown type of self for the template" + newTemplate);
					return this;
				}

				EClass self = (EClass) selfTypeEClass;

				GenerationTemplate gen = new GenerationTemplate(name, newTemplate, self);
				templates.add(gen);
				return this;
			}

		} catch (RuntimeException | IOException | InvalidFormatException e2) {
			TradesM2docActivator.logError("Error while reading template " + newTemplate, e2);
		}
		return this;
	}

	private EClassifier getTargetEClass(List<String> availablePackages, String packageName, String typeName) {
		if (packageName == null || packageName.isBlank() || typeName == null || typeName.isBlank()) {
			return null;
		}
		for (String ePackageURI : availablePackages) {
			EPackage ePack = EPackage.Registry.INSTANCE.getEPackage(ePackageURI);
			if (ePack != null && packageName.equals(ePack.getName())) {
				return ePack.getEClassifier(typeName);
			}
		}
		return null;
	}

	@Override
	public IM2DocTemplateRegistry removeTemplate(URI toRemove) {
		List<IM2DocTemplate> toRemoves = templates.stream()
				.filter(f -> f.getTemplateURI() != null && f.getTemplateURI().equals(toRemove))
				.collect(Collectors.toList());
		templates.removeAll(toRemoves);
		return this;
	}

}
