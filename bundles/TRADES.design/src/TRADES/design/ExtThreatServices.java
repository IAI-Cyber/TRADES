package TRADES.design;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.Session;

import dsm.TRADES.Analysis;
import dsm.TRADES.ExternalThreat;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatType;
import dsm.TRADES.ThreatsOwner;

public class ExtThreatServices {

	public List<Analysis> getAvailableExternalServices(Analysis analysis) {

		ResourceSet rs = Session.of(analysis).get().getTransactionalEditingDomain().getResourceSet();

		List<Analysis> result = new ArrayList<Analysis>();
		for (URI uri : Activator.getDefault().getDatabaseURI()) {
			Resource resource = rs.getResource(uri, true);
			result.add((Analysis) resource.getContents().get(0));
		}

		// Resource resource = rs
		// .getResource(URI.createPlatformPluginURI("/TRADES.design/database/capecToTrades.trades",
		// true), true);
		//
		// Set<String> importedExtThreats = analysis.getThreat().stream()
		// .filter(t -> t instanceof ExternalThreat && (((ExternalThreat) t).getID()) !=
		// null).map(t -> ((ExternalThreat) t).getID())
		// .collect(Collectors.toSet());
		// TreeIterator<EObject> ite = resource.getAllContents();
		// List<ExternalThreat> result = new ArrayList<ExternalThreat>();
		// while (ite.hasNext()) {
		// EObject item = ite.next();
		// if (item instanceof ExternalThreat) {
		// ExternalThreat extThreat = (ExternalThreat) item;
		// if (extThreat.getID() != null &&
		// !importedExtThreats.contains(extThreat.getID())) {
		// result.add(extThreat);
		// }
		// }
		// }
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
	public Threat copy(Analysis analysis, ExternalThreat source) {
		ExternalThreat result = EcoreUtil.copy(source);

		ThreatsOwner threatOwner = analysis.getThreatOwner();
		if (threatOwner == null) {
			threatOwner = TRADESFactory.eINSTANCE.createThreatsOwner();
			analysis.setThreatOwner(threatOwner);
		}

		ThreatType externalThreatFolder = getExternalThreatSubType(threatOwner);

		String threatSource = source.getSource();

		final ThreatType newOwner;
		if (threatSource != null) {
			newOwner = externalThreatFolder.getSubTypes().stream().filter(st -> threatSource.equals(st.getName()))
					.findFirst().orElseGet(() -> {
						ThreatType subType = TRADESFactory.eINSTANCE.createThreatType();
						subType.setName(threatSource);
						externalThreatFolder.getSubTypes().add(subType);
						return subType;
					});

		} else {
			newOwner = externalThreatFolder;
		}

		newOwner.getThreats().add(result);
		return result;
	}

	private ThreatType getExternalThreatSubType(ThreatsOwner threatOwner) {
		ThreatType externalThreatFolder = threatOwner.getExternal();
		if (externalThreatFolder == null) {
			externalThreatFolder = TRADESFactory.eINSTANCE.createThreatType();
			externalThreatFolder.setName("Externals");
			threatOwner.setExternal(externalThreatFolder);
		}
		return externalThreatFolder;
	}

}
