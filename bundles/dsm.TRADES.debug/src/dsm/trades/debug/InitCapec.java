package dsm.trades.debug;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import TRADES.design.ProjectFactory;
import dsm.TRADES.Analysis;
import dsm.TRADES.ControlType;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.ExternalThreat;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.ThreatMitigationRelation;
import dsm.TRADES.ThreatType;

/*
 * cmd argument : -os ${target.os} -ws ${target.ws} -arch ${target.arch} -nl ${target.nl} -consoleLog <pathToTargetFile> <pathToInputFile>
 */

public class InitCapec implements IApplication {

	private static final String SITE_PREFIX = "https://capec.mitre.org/data/definitions/";

	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] args = (String[]) context.getArguments().get("application.args");

		String targetModelFile = args[0];
		String inputFile = args[1];

		ResourceSet rs = new ResourceSetImpl();

		Resource resource = rs.createResource(
				URI.createFileURI(targetModelFile));

		Analysis analysis = ProjectFactory.createInitialModel("CapecMode");



		ThreatType threatOwner = analysis.getThreatOwner().getExternal();

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		try (InputStream input = new FileInputStream(
				Paths.get(inputFile).toFile())) {
			Document doc = builder.parse(input);

			Element root = doc.getDocumentElement();

			// Get the attack patterns tag
			NodeList rootNode = root.getElementsByTagName("Attack_Patterns");
			for (int i = 0; i < rootNode.getLength(); i++) {
				Node attackPatternsNode = rootNode.item(i);
				if (attackPatternsNode instanceof Element) {
					Element attackPatternsElement = (Element) attackPatternsNode;
					NodeList attackPatternList = attackPatternsElement.getElementsByTagName("Attack_Pattern");
					for (int j = 0; j < attackPatternList.getLength(); j++) {
						Node threatNode = attackPatternList.item(j);
						if (threatNode instanceof Element) {

							ExternalThreat threat = createNewThreat((Element) threatNode,
									analysis.getControlOwner().getExternal());
							threatOwner.getThreats().add(threat);
						}
					}

				}
				// System.out.println(subNode);
			}
		} catch (IOException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		resource.getContents().add(analysis);
		resource.save(Collections.emptyMap());
		return 1;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	private static Map<String, ExternalControl> idToControls = new HashMap<>();

	private ExternalThreat createNewThreat(Element parent, ControlType externalControlsOwner) {
		ExternalThreat extPattern = TRADESFactory.eINSTANCE.createExternalThreat();
		extPattern.setName(parent.getAttribute("Name"));
		String oritinalId = parent.getAttribute("ID");
		extPattern.setID("Capec_" + oritinalId);
		extPattern.setSource("Capec");
		extPattern.setLink(SITE_PREFIX + oritinalId + ".html");
		NodeList descriptionNodes = parent.getElementsByTagName("Description");
		for (int j = 0; j < descriptionNodes.getLength(); j++) {
			Element descriptionNode = (Element) descriptionNodes.item(j);
			String description = descriptionNode.getTextContent();
			extPattern.setDescription(description);
		}

		NodeList mitigationsNodes = parent.getElementsByTagName("Mitigations");
		for (int j = 0; j < mitigationsNodes.getLength(); j++) {
			Element mitigationsNode = (Element) mitigationsNodes.item(j);

			NodeList mitigationNodes = mitigationsNode.getElementsByTagName("Mitigation");
			for (int i = 0; i < mitigationNodes.getLength(); i++) {
				Element mitigatioNode = (Element) mitigationNodes.item(i);

				String textContent = mitigatioNode.getTextContent();

				ExternalControl existingControl = idToControls.get(textContent);
				if (existingControl == null) {
					existingControl = TRADESFactory.eINSTANCE.createExternalControl();
					existingControl.setName(textContent);
					existingControl.setSource("Capec");

					externalControlsOwner.getControls().add(existingControl);
					idToControls.put(textContent, existingControl);
				}

				ThreatMitigationRelation mitigation = TRADESFactory.eINSTANCE.createThreatMitigationRelation();
				mitigation.setThreat(extPattern);
				mitigation.setControl(existingControl);


			}
		}
		return extPattern;
	}

}
