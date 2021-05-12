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
package TRADES.design;

import static java.util.stream.Collectors.toList;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.PlatformUI;

import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.Analysis;
import dsm.TRADES.Catalog;
import dsm.TRADES.Component;
import dsm.TRADES.Control;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.ExternalThreat;
import dsm.TRADES.ICatalogDefinition;
import dsm.TRADES.IControlDefinition;
import dsm.TRADES.IMitigationLink;
import dsm.TRADES.IThreatDefinition;
import dsm.TRADES.SemanticUtil;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatMitigationRelation;
import dsm.TRADES.ThreatsOwner;
import dsm.TRADES.util.EcoreUtils;

public class ExtThreatServices {

	public static List<ICatalogDefinition> getAvailableExternalServices(EObject any) {

		List<ICatalogDefinition> result = new ArrayList<ICatalogDefinition>();

		Session session = Session.of(any).get();

		// Local catalogs
		for (Resource r : session.getSemanticResources()) {
			EList<EObject> contents = r.getContents();
			if (!contents.isEmpty()) {
				EObject root = contents.get(0);
				if (root instanceof ICatalogDefinition) {
					ICatalogDefinition catalog = (ICatalogDefinition) root;
					result.add(catalog);
				}
			}
		}

		ResourceSet rs = session.getTransactionalEditingDomain().getResourceSet();
		// Embedded catalogs
		for (URI uri : Activator.getDefault().getDatabaseURI()) {
			Resource resource = rs.getResource(uri, true);

			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof ICatalogDefinition) {
				ICatalogDefinition catalog = (ICatalogDefinition) eObject;
				result.add(catalog);
			}
		}

		return result;
	}

	public String[] getDatabaseList() {

		String[] databaseList;
		File f = new File("/TRADES.design/database");
		databaseList = f.list();
		return databaseList;

	}

	/**
	 * Creates a nice String representation of a Platfome Resource URI
	 * 
	 * @param o
	 * @return
	 */
	public static String createURIRepresentation(EObject o) {
		Resource eResource = o.eResource();
		if (eResource.getURI().isPlatformResource()) {
			URI uri = eResource.getURI().appendFragment(eResource.getURIFragment(o));
			return URI.decode(uri.toString());
		} else {
			return null;
		}

	}

	/**
	 * Copy an external threat inside my analysis
	 * 
	 * @param analysis current analysis
	 * @param source   the source to copy
	 * @return the result
	 */
	public Threat copyTreat(Analysis analysis, ExternalThreat source) {

		if (!analysis.getExternalThreats(source.getId(), source.getSource()).isEmpty()) {
			if (!confirm("Existing External Threat", MessageFormat.format(
					"An external threat with id ''{1}'' (from ''{0}'') already exist. Do you want to import a new instance?",
					source.getSource(), source.getId()))) {
				return null;
			}
		}

		ExternalThreat result = EcoreUtil.copy(source);

		ThreatsOwner threatOwner = analysis.getThreatOwner();
		if (threatOwner == null) {
			threatOwner = TRADESFactory.eINSTANCE.createThreatsOwner();
			analysis.setThreatOwner(threatOwner);
		}

		ICatalogDefinition catalog = EcoreUtils.getAncestor(source, ICatalogDefinition.class);
		result.setSource(catalog.getIdentifier());

		if (source.eResource().getURI().isPlatformResource()) {
			result.setLink(createURIRepresentation(source));
		}

		threatOwner.getExternals().add(result);

		for (IControlDefinition def : catalog.getControlDefinitions()) {
			for (IMitigationLink link : def.getMitigatedThreatDefinitions()) {
				if (link.getThreat().getId().equals(source.getId())) {

					List<ExternalControl> connectedControls = EcoreUtils
							.allContainedObjectOfType(analysis, AbstractControlOwner.class)
							.flatMap(owner -> owner.getExternalControls(def.getId(), catalog.getIdentifier()).stream())
							.filter(control -> control != null).collect(toList());
					for (ExternalControl connectedControl : connectedControls) {
						createMigitationLink(connectedControl, link, result);
					}

				}
			}
		}

		return result;
	}

	public Control copyControl(EObject analysisProvider, IControlDefinition source) {
		List<Control> result = copyControl(analysisProvider, Collections.singletonList(source));
		if (result.isEmpty()) {
			return null;
		} else {
			return result.get(0);
		}
	}

	public static boolean confirm(String title, String message) {
		return MessageDialog.openConfirm(PlatformUI.getWorkbench().getModalDialogShellProvider().getShell(), title,
				message);
	}

	public static String getControlOwnerLabel(AbstractControlOwner owner) {
		if (owner instanceof Analysis) {
			return ((Analysis) owner).getName();
		} else if (owner instanceof Catalog) {
			return ((Catalog) owner).getName();
		} else if (owner instanceof Component) {
			return ((Component) owner).getName();
		} else {
			return "??";
		}
	}

	/**
	 * Copy an external control inside my analysis
	 * 
	 * @param analysis current analysis
	 * @param source   the source to copy
	 * @return the result
	 */
	public List<Control> copyControl(EObject analysisProvider, List<IControlDefinition> sources) {
		List<Control> result = new ArrayList<>();
		Analysis currentAnalysis = EcoreUtils.getAncestor(analysisProvider, Analysis.class);
		AbstractControlOwner controlOwner = EcoreUtils.getAncestor(analysisProvider, AbstractControlOwner.class);

		for (IControlDefinition source : sources) {

			ICatalogDefinition catalogDef = EcoreUtils.getAncestor(source, ICatalogDefinition.class);

			if (!controlOwner.getExternalControls(source.getId(), catalogDef.getIdentifier()).isEmpty()) {
				if (!confirm("Existing External Control", MessageFormat.format(
						"An external control with id ''{1}'' (from ''{0}'') already exist in ''{2}''. Do you want to import a new instance?",
						catalogDef.getIdentifier(), source.getId(), getControlOwnerLabel(controlOwner)))) {
					return null;
				}
			}

			ExternalControl matchingControl = TRADESFactory.eINSTANCE.createExternalControl();
			matchingControl.setName(source.getName());
			matchingControl.setSource(catalogDef.getIdentifier());
			String id = source.getId();
			matchingControl.setId(id);
			matchingControl.setDescription(source.getDescription());

			if (source.eResource().getURI().isPlatformResource()) {
				matchingControl.setLink(createURIRepresentation(source));
			}

			SemanticUtil.addControl(controlOwner, matchingControl);

			// Copy all existing mitigation
			for (IMitigationLink link : source.getMitigatedThreatDefinitions()) {
				IThreatDefinition linkedThreat = link.getThreat();

				if (linkedThreat != null) {
					String linkedThreatId = linkedThreat.getId();
					List<ExternalThreat> matchingThreats = currentAnalysis.getExternalThreats(linkedThreatId,
							catalogDef.getIdentifier());

					for (ExternalThreat matchingThreat : matchingThreats) {
//						if (!isExistingLink(matchingControl, link)) {
						createMigitationLink(matchingControl, link, matchingThreat);
//						}
					}
				}
			}

			result.add(matchingControl);
		}
		return result;
	}

	public void createMigitationLink(final ExternalControl matchingControl, IMitigationLink link,
			ExternalThreat matchingThreat) {
		ThreatMitigationRelation controlMitigation = TRADESFactory.eINSTANCE.createThreatMitigationRelation();
		controlMitigation.setControl(matchingControl);
		controlMitigation.setThreat(matchingThreat);
		controlMitigation.setDescription(link.getDescription());
		matchingControl.getMitigationRelations().add(controlMitigation);
	}

	public List<IControlDefinition> getLinkedControlInDataBases(ExternalThreat ext) {

		String source = ext.getSource();
		String id = ext.getId();
		if (id == null || source == null) {
			return Collections.emptyList();
		}

		List<IControlDefinition> controls = new ArrayList<IControlDefinition>();
		for (ICatalogDefinition c : getAvailableExternalServices(ext)) {
			if (source.equals(c.getIdentifier())) {
				for (IControlDefinition controlDef : c.getControlDefinitions()) {
					for (IMitigationLink link : controlDef.getMitigatedThreatDefinitions()) {
						IThreatDefinition linkedThreat = link.getThreat();
						if (linkedThreat != null && id.equals(linkedThreat.getId())) {
							controls.add(controlDef);
						}
					}
				}
			}
		}

		return controls;

	}

	public static void displayLink(EObject any, String s) {

		if (s != null && !s.isBlank()) {
			try {

				EObject target = getResovledTarget(any, s);
				if (target != null) {
					DiagramService.revealInModelExplorer(target);
					return;
				}
			} catch (IllegalArgumentException e) {
				// Nothing to do use fallback

			}
		}

		try {
			Desktop.getDesktop().browse(java.net.URI.create(s));
		} catch (IOException e2) {
			Activator.logError("Problem while open link " + s, e2);
		}

	}

	public static EObject getResovledTarget(EObject any, String s) {
		URI uri = URI.createURI(s, false);
		EObject target = Session.of(any).get().getTransactionalEditingDomain().getResourceSet().getEObject(uri, false);
		return target;
	}

}
