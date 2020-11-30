package TRADES.design;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.Session;

import dsm.TRADES.Analysis;
import dsm.TRADES.Threat;

public class ExtThreatServices {

	public List<Threat> getAvailableExternalServices(Analysis analysis) {

		ResourceSet rs = Session.of(analysis).get().getTransactionalEditingDomain().getResourceSet();

		Resource resource = rs
				.getResource(URI.createPlatformPluginURI("/TRADES.design/database/capecToTrades.trades", true), true);

		Set<String> importedExtThreats = analysis.getThreat().stream()
				.filter(t -> t instanceof Threat && (((Threat) t).getID()) != null).map(t -> ((Threat) t).getID())
				.collect(Collectors.toSet());
		TreeIterator<EObject> ite = resource.getAllContents();
		List<Threat> result = new ArrayList<Threat>();
		while (ite.hasNext()) {
			EObject item = ite.next();
			if (item instanceof Threat) {
				Threat extThreat = (Threat) item;
				if (extThreat.getID() != null && !importedExtThreats.contains(extThreat.getID())) {
					result.add(extThreat);
				}
			}
		}
		return result;
	}

	/**
	 * Copy an external threat inside my analysis
	 * 
	 * @param analysis current analysis
	 * @param source   the source to copy
	 * @return the result
	 */
	public Threat copy(Analysis analysis, Threat source) {
		Threat result = EcoreUtil.copy(source);
		analysis.getThreat().add(result);
		return result;
	}

}
