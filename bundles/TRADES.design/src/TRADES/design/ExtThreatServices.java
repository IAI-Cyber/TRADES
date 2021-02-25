package TRADES.design;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.Session;

import dsm.TRADES.Analysis;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.ExternalThreat;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatMitigationRelation;
import dsm.TRADES.ThreatsOwner;

public class ExtThreatServices {

	public List<Analysis> getAvailableExternalServices(Analysis analysis) {

		List<Analysis> result = new ArrayList<Analysis>();

		ResourceSet rs = Session.of(analysis).get().getTransactionalEditingDomain().getResourceSet();

		for (URI uri : Activator.getDefault().getDatabaseURI()) {
			Resource resource = rs.getResource(uri, true);
			result.add((Analysis) resource.getContents().get(0));
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
	 * Copy an external threat inside my analysis
	 * 
	 * @param analysis current analysis
	 * @param source   the source to copy
	 * @return the result
	 */
	public Threat copyTreat(Analysis analysis, ExternalThreat source) {
		ExternalThreat result = EcoreUtil.copy(source);

		ThreatsOwner threatOwner = analysis.getThreatOwner();
		if (threatOwner == null) {
			threatOwner = TRADESFactory.eINSTANCE.createThreatsOwner();
			analysis.setThreatOwner(threatOwner);
		}

		//String threatSource = source.getSource();

		threatOwner.getExternals().add(result);
		return result;
	}

	/**
	 * Copy an external control inside my analysis
	 * 
	 * @param analysis current analysis
	 * @param source   the source to copy
	 * @return the result
	 */
	public List<Control> copyControl(ExternalThreat threat, List<ExternalControl> sources) {
		List<Control> result = new ArrayList<>();
		for (ExternalControl source : sources) {

			ExternalControl newControl = TRADESFactory.eINSTANCE.createExternalControl();
			newControl.setName(source.getName());
			newControl.setSource(source.getSource());
			newControl.setId(source.getId());
			newControl.setDescription(source.getDescription());

			// Copy all existing mitigation
			source.getMitigationRelations().stream().filter(rel -> rel.getThreat().getId().equals(threat.getId()))
					.forEach(rel -> {
						ThreatMitigationRelation controlMitigation = TRADESFactory.eINSTANCE
								.createThreatMitigationRelation();
						controlMitigation.setControl(newControl);
						controlMitigation.setThreat(threat);
						controlMitigation.setDescription(rel.getDescription());
					});

			EObject analysis = threat.eContainer();
			while (!(analysis instanceof Analysis) && analysis != null) {
				analysis = analysis.eContainer();
			}

			Analysis realAnalysis = ((Analysis) analysis);
			ControlOwner controlOwner = realAnalysis.getControlOwner();
			if (controlOwner == null) {
				controlOwner = TRADESFactory.eINSTANCE.createControlOwner();
				realAnalysis.setControlOwner(controlOwner);
			}

			controlOwner.getExternals().add(newControl);

			result.add(newControl);
		}
		return result;
	}

	public List<ExternalControl> getLinkedControlInDataBases(ExternalThreat ext) {
		ResourceSet rs = Session.of(ext).get().getTransactionalEditingDomain().getResourceSet();

		String source = ext.getSource();
		String id = ext.getId();
		if (id == null) {
			return Collections.emptyList();
		}
		List<ExternalControl> controls = new ArrayList<ExternalControl>();
		for (URI uri : Activator.getDefault().getDatabaseURI()) {
			Resource resource = rs.getResource(uri, true);
			Analysis databaseAnalysis = (Analysis) resource.getContents().get(0);
			if (source != null && source.equals(databaseAnalysis.getName())) {

				TreeIterator<EObject> ite = databaseAnalysis.eAllContents();
				while (ite.hasNext()) {
					EObject eObject = ite.next();
					if (eObject instanceof ThreatMitigationRelation) {
						ThreatMitigationRelation miti = (ThreatMitigationRelation) eObject;
						Threat linkedThreat = miti.getThreat();
						if (id.equals(linkedThreat.getId())) {
							controls.add((ExternalControl) miti.getControl());
						}
					}

				}

			}
		}
		return controls;

	}

}
