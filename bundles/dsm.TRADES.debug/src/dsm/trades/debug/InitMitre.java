package dsm.trades.debug;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import TRADES.design.ProjectFactory;
import dsm.TRADES.Analysis;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatsOwner;
import dsm.trades.debug.mitrebean.DomainAttacks;
import dsm.trades.debug.mitrebean.MitreObject;

/*
 * cmd argument : -os ${target.os} -ws ${target.ws} -arch ${target.arch} -nl ${target.nl} -consoleLog <pathToTargetFile> <pathToInputFile> <folder1,folder2>
 */

public class InitMitre implements IApplication {

	private static final String SITE_PREFIX = "https://capec.mitre.org/data/definitions/";

	private Map<String, Threat> idToThreat = new HashMap<String, Threat>();

	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] args = (String[]) context.getArguments().get("application.args");

		String targetModelFile = args[0];
		String inputFile = args[1];
		String[] fileNames = args[2].split(",");

		ResourceSet rs = new ResourceSetImpl();

		Resource resource = rs.createResource(URI.createFileURI(targetModelFile));

		Analysis analysis = ProjectFactory.createInitialModel("Mitre Att&ck");

		ThreatsOwner threatOwner = analysis.getThreatOwner();

		for (String fileName : fileNames) {
			Path path = Paths.get(inputFile, fileName);

			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			try {
				DomainAttacks attack = mapper.readValue(path.toFile(), DomainAttacks.class);
				for (MitreObject m : attack.getObjects()) {
					if ("attack-pattern".equals(m.getType())) {
						Threat threat = TRADESFactory.eINSTANCE.createThreat();
						threat.setName(m.getName());
						threat.setDescription(m.getDescription());
						threatOwner.getExternals().add(threat);

						m.getExternal_references().stream().filter(ext -> "mitre-attack".equals(ext.getSource_name()))
								.findFirst().ifPresent(ext -> {
									threat.setID(ext.getExternal_id());
								});

						idToThreat.put(m.getId(), threat);

					}
				}
				for (MitreObject m : attack.getObjects()) {
					if ("course-of-action".equals(m.getType())) {
						// TODO create the mitigation
					}
				}

				// Iterate on relationships to create the links
			} catch (IOException e) {
				System.err.println("Error while parsong " + path);
				e.printStackTrace();
			}
		}

		resource.getContents().add(analysis);
		resource.save(Collections.emptyMap());
		return 1;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
