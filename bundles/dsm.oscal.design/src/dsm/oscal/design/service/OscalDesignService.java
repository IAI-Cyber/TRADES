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
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.PlatformUI;

import TRADES.design.ExtThreatServices;
import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.CatalogElementURI;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.util.EcoreUtils;
import dsm.oscal.design.Activator;
import dsm.oscal.design.dialogs.ParameterValueSetterDialog;
import dsm.oscal.design.wizards.ConvertToOSCALControlWizard;
import dsm.oscal.model.DocumentationComputer;
import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.OscalCatalogCommon.Parameter;
import dsm.oscal.model.OscalMetadata.PartOwner;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

public class OscalDesignService {

	/**
	 * Action used to export the selection {@link Control} into an OSCAL Catalog
	 * 
	 * @param controlToExport the list of control to export
	 */
	public static void exportControlToOSCAL(List<Control> controlToExport) {
		if (!controlToExport.isEmpty()) {
			ConvertToOSCALControlWizard wizard = new ConvertToOSCALControlWizard(controlToExport,
					Session.of(controlToExport.get(0)).get());
			WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					wizard);
			dialog.open();
		}
	}

	public static ExternalControl createControl(dsm.oscal.model.OscalCatalog.Control control,
			AbstractControlOwner owner) {

		Catalog catalog = EcoreUtils.getAncestor(control, Catalog.class);
		String catalogIdentifier = catalog.getIdentifier();
		if (catalogIdentifier == null) {
			Activator.logError("Invalid catalog definition : no catalog UUID");
			return null;
		}
		String controlId = control.getId();
		if (!owner.getExternalControls(controlId, catalogIdentifier).isEmpty()) {
			if (!ExtThreatServices.confirm("Existing External Control", MessageFormat.format(
					"An external control with id ''{1}'' (from ''{0}'') already exist in ''{2}''. Do you want to import a new instance?",
					catalogIdentifier, controlId, ExtThreatServices.getControlOwnerLabel(owner)))) {
				return null;
			}
		}

		ExternalControl extControl = TRADESFactory.eINSTANCE.createExternalControl();
		MarkupLine title = control.getTitle();
		if (title != null) {
			extControl.setName(title.toMarkdown());
		}

		EList<Parameter> usedParameters = control.collectParametersInUse();
		if (usedParameters.isEmpty()) {
			extControl.setDescription(control.computeDocumentation(true));
		} else {
			Map<String, String> idToValue = fillParameterValuesAndUpdate(usedParameters, control);
			if (idToValue == null) {
				// The user canceled the action
				return null;
			}
			extControl.setDescription(DocumentationComputer.computeDocumentation(control, true, idToValue));
			// Keeps the entered value in the OSCAL model for next use
		}

		extControl.setId(control.getId());

		extControl.setSource(catalog.getName());
		extControl.setSourceID(catalogIdentifier);
		extControl.setLink(
				CatalogElementURI.createCatalogControlURI(control.getSourceIdentifier(), control.getId()).toString());

		ControlOwner controlOwner = owner.getControlOwner();
		if (controlOwner == null) {
			controlOwner = TRADESFactory.eINSTANCE.createControlOwner();
			owner.setControlOwner(controlOwner);
		}
		controlOwner.getExternals().add(extControl);
		return extControl;
	}

	/**
	 * Gives a value for each parameter in used in the model
	 * 
	 * @return a map from parameter if to a value
	 */
	private static Map<String, String> fillParameterValuesAndUpdate(List<Parameter> parameters, PartOwner element) {
		ParameterValueSetterDialog dialog = new ParameterValueSetterDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), parameters,
				idToValue -> DocumentationComputer.computeDocumentation(element, true, idToValue));
		if (dialog.open() != IDialogConstants.OK_ID) {
			return null;
		}
		Map<Parameter, String> paramToValue = dialog.getParamToValue();
		// Update OSCAL library to keep entered value for subsequent use
		if (dialog.isKeepValue()) {
			paramToValue.forEach((param, value) -> {
				if (!param.getValues().contains(value)) {
					param.getValues().add(value);
				}
			});
		}
		return dialog.getIdToValueMap();
	}

}
