package dsm.trades.debug;

import static java.util.stream.Collectors.joining;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.ExternalThreat;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatMitigationRelation;
import dsm.TRADES.ThreatsOwner;
import dsm.trades.debug.mitrebean.DomainAttacks;
import dsm.trades.debug.mitrebean.MitreObject;

/*
 * cmd argument : -os ${target.os} -ws ${target.ws} -arch ${target.arch} -nl ${target.nl} -consoleLog <pathToTargetFile> <pathToInputFile> <folder1,folder2>
 */

public class InitMitre implements IApplication {

	private static final String SITE_PREFIX = "https://capec.mitre.org/data/definitions/";

	private Map<String, Threat> idToThreat = new HashMap<String, Threat>();
	private Map<String, Control> idToControl = new HashMap<String, Control>();

	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] args = (String[]) context.getArguments().get("application.args");

		String targetModelFile = args[0];
		String inputFile = args[1];
		String[] fileNames = args[2].split(",");

		ResourceSet rs = new ResourceSetImpl();

		for (String fileName : fileNames) {

			String modelName = Paths.get(fileName).getFileName().toString().replace(".json", "");

			Resource resource = rs.createResource(URI.createFileURI(targetModelFile + "_" + modelName + ".trades"));

			Analysis analysis = ProjectFactory.createInitialModel("Mitre Att&ck :" + modelName);

			ThreatsOwner threatOwner = analysis.getThreatOwner();
			ControlOwner controlOwnedr = analysis.getControlOwner();

			Path path = Paths.get(inputFile, fileName);

			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			try {
				DomainAttacks attack = mapper.readValue(path.toFile(), DomainAttacks.class);
				for (MitreObject m : attack.getObjects()) {
					if ("attack-pattern".equals(m.getType())) {
						ExternalThreat threat = TRADESFactory.eINSTANCE.createExternalThreat();
						threat.setName(m.getName());
						threat.setDescription(m.getDescription());
						List<String> x_mitre_platforms = m.getX_mitre_platforms();
						if (x_mitre_platforms != null) {
							threat.setApplicability(x_mitre_platforms.stream().collect(joining(",")));
						}
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
						Control control = TRADESFactory.eINSTANCE.createControl();
						control.setName(m.getName());
						control.setDescription(m.getDescription());
						controlOwnedr.getExternals().add(control);
						m.getExternal_references().stream().filter(ext -> "mitre-attack".equals(ext.getSource_name()))
								.findFirst().ifPresent(ext -> {
									control.setID(ext.getExternal_id());
								});

						idToControl.put(m.getId(), control);
					}
				}

				for (MitreObject m : attack.getObjects()) {
					if ("relationship".equals(m.getType())) {
						String sourceRef = m.getSource_ref();
						Control control = idToControl.get(sourceRef);
						if (control != null) {
							String targetRef = m.getTarget_ref();
							Threat targetThreat = idToThreat.get(targetRef);
							if (targetThreat != null) {
								ThreatMitigationRelation rel = TRADESFactory.eINSTANCE.createThreatMitigationRelation();
								rel.setControl(control);
								rel.setThreat(targetThreat);
							} else {
								System.out.println("Unkown threat " + targetRef);
							}
						} else {
							System.out.println("Unkown control " + sourceRef);
						}
					}
				}

				// Iterate on relationships to create the links
			} catch (IOException e) {
				System.err.println("Error while parsong " + path);
				e.printStackTrace();
			}
			resource.getContents().add(analysis);
			resource.save(Collections.emptyMap());
		}

		return 1;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
