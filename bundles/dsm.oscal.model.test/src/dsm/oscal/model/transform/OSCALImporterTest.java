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
package dsm.oscal.model.transform;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Collections;
import java.util.UUID;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.Comparison;
import org.xmlunit.diff.ComparisonListener;
import org.xmlunit.diff.ComparisonResult;
import org.xmlunit.diff.ComparisonType;
import org.xmlunit.diff.DOMDifferenceEngine;
import org.xmlunit.diff.DifferenceEngine;
import org.xmlunit.input.WhitespaceStrippedSource;
import org.xmlunit.validation.ValidationProblem;

import dsm.oscal.model.OSCALModelActivator;
import dsm.oscal.model.OscalCatalog.Catalog;
import gov.nist.secauto.metaschema.binding.BindingContext;
import gov.nist.secauto.metaschema.binding.io.BindingException;
import gov.nist.secauto.metaschema.binding.io.Feature;
import gov.nist.secauto.metaschema.binding.io.Format;
import gov.nist.secauto.metaschema.binding.io.MutableConfiguration;
import gov.nist.secauto.metaschema.binding.io.Serializer;
import gov.nist.secauto.oscal.java.OscalLoader;

public class OSCALImporterTest {

	private OSCALTransformer transformer = new OSCALTransformer();

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	private File inputFile;
	private File saveInputFile;
	private File resultFile;

	@Before
	public void setUp() throws IOException {
		folder.create();
		inputFile = folder.newFile("oscal-input.xml");
		resultFile = folder.newFile("oscal-loop.xml");
		saveInputFile = folder.newFile("oscal-input-saved.xml");
	}

//	private void assertIsValidXML(Path p) throws IOException, ParserConfigurationException, SAXException {
//
//		Validator v = Validator.forLanguage(Languages.W3C_XML_SCHEMA_NS_URI);
//		URL[] schemaUrls = OSCALSchemas.getCatalogSchema();
//		v.setSchemaSources(Stream.of(schemaUrls).map(s -> Input.fromURL(s).build()).toArray(Source[]::new));
//		ValidationResult result = v.validateSchema();
//		assertTrue("Invalid XSD file " + validationMsg(result.getProblems()), result.isValid());
//
//		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//		DocumentBuilder builder = factory.newDocumentBuilder();
//		Document document = builder.parse(p.toFile());
////		Attr attribute = document.createAttribute("xsi:schemaLocation");
////		attribute.setValue(Stream.of(schemaUrls).map(t -> t.toString()).collect(joining(",")));
////		document.setAttributeNode(attribute);
////		Element element = document.getDocumentElement();
////		element.setAttribute("xsi:schemaLocation", Stream.of(schemaUrls).map(t -> t.toString()+" "+t.getPath().substring(t.getPath().lastIndexOf("/")+1)).collect(joining(" ")));
////		result = v.validateInstance(Input.fromDocument(document).build());
//		assertTrue("Invalid XML file " + validationMsg(result.getProblems()), result.isValid());
//	}

	private String validationMsg(Iterable<ValidationProblem> problems) {
		if (problems == null) {
			return "";
		}
		StringBuilder builder = new StringBuilder();
		for (ValidationProblem p : problems) {
			builder.append(p.getLine()).append("-").append(p.getColumn()).append(":").append(p.getMessage());
		}
		return builder.toString();
	}

	@org.junit.Test
	public void checkAgainstNistCatalog()
			throws IOException, BindingException, ParserConfigurationException, SAXException {

		Files.copy(this.getClass().getResourceAsStream("catalog/NIST_SP-800-53_rev5_catalog.xml"), inputFile.toPath(),
				StandardCopyOption.REPLACE_EXISTING);

		// TODO Provider XSD are not valid yet
//		assertIsValidXML(inputFile.toPath());

		Catalog tradesCatalog = transformer.importCatalog(inputFile.toPath());

		// Save the mode to a file for investigation
		XMIResourceImpl resource = new XMIResourceImpl(URI.createFileURI("./result/checkAgainstNistCatalog.oscal"));
		resource.getContents().add(tradesCatalog);
		resource.save(Collections.emptyMap());

		// Simple check on UUID
		assertThat(tradesCatalog.getUuid()).isEqualTo(UUID.fromString("30ab38d6-586a-4d38-9881-c9367ba5267a"));

		// Export the catalog back to XML
		transformer.exportCatalog(tradesCatalog, resultFile.toPath());

		// Save the input file with default serializer to see only semantic changes
		saveInputFileUsingJavaLib();

		// TODO Provider XSD are not valid yet
		// Validate it is still valid
		// assertIsValidXML(resultFile.toPath());

		Source control = new WhitespaceStrippedSource(Input.fromFile(saveInputFile).build());
		Source test = new WhitespaceStrippedSource(Input.fromFile(resultFile).build());
		DifferenceEngine diff = new DOMDifferenceEngine();
		diff.addDifferenceListener(new ComparisonListener() {
			public void comparisonPerformed(Comparison comparison, ComparisonResult outcome) {
				if (isNewUUIDDiff(comparison)) {
					return;
				}
				try {
					Files.copy(saveInputFile.toPath(), Path.of("./result/oscal-input.xml"),
							StandardCopyOption.REPLACE_EXISTING);
					Files.copy(resultFile.toPath(), Path.of("./result/oscal-loop.xml"),
							StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println(e.getLocalizedMessage());
				}
				Assert.fail("found a difference: " + comparison);
			}
		});
		diff.compare(control, test);

	}

	/**
	 * TRADES force some UUID to be set whereas is oscal they are not mandatory
	 * Ignore those differences
	 * 
	 * @param comparison
	 * @return
	 */
	private boolean isNewUUIDDiff(Comparison comparison) {
		if (comparison.getType() == ComparisonType.ELEMENT_NUM_ATTRIBUTES) {
			Node controlUuidItem = comparison.getControlDetails().getTarget().getAttributes().getNamedItem("uuid");
			Node testUuidItem = comparison.getTestDetails().getTarget().getAttributes().getNamedItem("uuid");
			if (controlUuidItem == null && testUuidItem != null) {
				// TRADES force some UUID to be set whereas is oscal they are not mandatory
				// Ignore those differences
				return true;
			}
		} else if (comparison.getType() == ComparisonType.ATTR_NAME_LOOKUP
				&& comparison.getTestDetails().getValue() instanceof javax.xml.namespace.QName
				&& "uuid".equals(((javax.xml.namespace.QName) comparison.getTestDetails().getValue()).getLocalPart())) {
			return true;

		}

		return false;
	}

	public void saveInputFileUsingJavaLib() {
		try {
			gov.nist.secauto.oscal.lib.Catalog catalog = new OscalLoader().loadCatalog(inputFile);
			MutableConfiguration config = new MutableConfiguration().enableFeature(Feature.SERIALIZE_ROOT);
			Serializer<gov.nist.secauto.oscal.lib.Catalog> serializer = BindingContext.newInstance()
					.newSerializer(Format.XML, gov.nist.secauto.oscal.lib.Catalog.class, config);

			try {
				serializer.serialize(catalog, saveInputFile);
			} catch (FileNotFoundException | BindingException e) {
				OSCALModelActivator.logError("Unable to save catalog : " + e.getMessage(), e);
			}
		} catch (FileNotFoundException | BindingException e) {
			OSCALModelActivator.logError("Unable to import catalog : " + e.getMessage(), e);
			fail("Unable to save input file");
		}
	}

	private static class SuppressEmptyElements implements org.xmlunit.util.Predicate<Node> {
		@Override
		public boolean test(Node n) {
			if (n instanceof Node) {
				return !isEmpty((Node) n);
			}
			// not an element - a commment, nested text and so on
			return true;
		}

		private boolean isEmpty(Node e) {
			boolean isEmpty = (e.getAttributes() == null || e.getAttributes().getLength() == 0)
					&& (e.getChildNodes() == null || e.getChildNodes().getLength() == 0);
			if (isEmpty) {
				System.out.println("Empty node " + e.getNodeName());
			}
			return isEmpty;
		}
	}

}
