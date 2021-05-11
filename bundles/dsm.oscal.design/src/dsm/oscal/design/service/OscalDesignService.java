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

package dsm.oscal.design.service;

import java.text.MessageFormat;

import org.eclipse.emf.ecore.EObject;

import TRADES.design.ExtThreatServices;
import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.util.EcoreUtils;
import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.OscalMetadata.Metadata;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

public class OscalDesignService {

	public static ExternalControl createControl(dsm.oscal.model.OscalCatalog.Control control,
			AbstractControlOwner owner) {

		String catalogTitle = getCatalogTitle(control);
		String controlId = control.getId();
		if (!owner.getExternalControls(controlId, catalogTitle).isEmpty()) {
			if (!ExtThreatServices.confirm("Existing External Control", MessageFormat.format(
					"An external control with id ''{1}'' (from ''{0}'') already exist in ''{2}''. Do you want to import a new instance?",
					catalogTitle, controlId, ExtThreatServices.getControlOwnerLabel(owner)))) {
				return null;
			}
		}

		ExternalControl extControl = TRADESFactory.eINSTANCE.createExternalControl();
		MarkupLine title = control.getTitle();
		if (title != null) {
			extControl.setName(title.toMarkdown());
		}
		extControl.setDescription(control.computeDocumentation());
		extControl.setId(control.getId());

		extControl.setSource(catalogTitle);
		extControl.setLink(ExtThreatServices.createURIRepresentation(control));

		ControlOwner controlOwner = owner.getControlOwner();
		if (controlOwner == null) {
			controlOwner = TRADESFactory.eINSTANCE.createControlOwner();
			owner.setControlOwner(controlOwner);
		}
		controlOwner.getExternals().add(extControl);
		return extControl;
	}

	private static String getCatalogTitle(EObject source) {
		Catalog ancestor = EcoreUtils.getAncestor(source, Catalog.class);
		if (ancestor != null) {
			Metadata metadata = ancestor.getMetadata();
			if (metadata != null) {
				MarkupLine title = metadata.getTitle();
				if (title != null) {
					return title.toMarkdown();
				}
			}
		}
		return null;
	}

}
