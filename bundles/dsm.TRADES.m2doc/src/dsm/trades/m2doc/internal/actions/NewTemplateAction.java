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
package dsm.trades.m2doc.internal.actions;

import static java.util.stream.Collectors.toSet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.sequence.SequencePackage;
import org.eclipse.sirius.table.metamodel.table.TablePackage;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.swt.widgets.Event;
import org.obeonetwork.m2doc.POIServices;
import org.obeonetwork.m2doc.genconf.GenconfFactory;
import org.obeonetwork.m2doc.genconf.GenconfPackage;
import org.obeonetwork.m2doc.genconf.Generation;
import org.obeonetwork.m2doc.genconf.ModelDefinition;
import org.obeonetwork.m2doc.genconf.Option;
import org.obeonetwork.m2doc.properties.TemplateCustomProperties;
import org.obeonetwork.m2doc.sirius.M2DocSiriusUtils;
import org.obeonetwork.m2doc.util.M2DocUtils;

import dsm.trades.m2doc.IM2DocTemplate;
import dsm.trades.m2doc.TradesM2docActivator;
import dsm.trades.m2doc.internal.DynamicTemplateProvider;

/**
 * Action used to create a new M2DOc template from a selection
 * 
 * @author Arthur Daussy
 *
 */
public class NewTemplateAction extends Action {

	private static final String BASE_TEMPLATE_NAME = "/sample-template/sampleTemplate.docx"; //$NON-NLS-1$

	private final EObject selection;

	public NewTemplateAction(EObject selection) {
		super("New report template", TradesM2docActivator.getDefault().getImageDescriptor("icons/Add_16x16.gif"));
		this.selection = selection;
	}

	@Override
	public void runWithEvent(Event event) {
		if (selection != null) {
			EClass eClass = selection.eClass();

			Set<String> existingNames = DynamicTemplateProvider.getLocalTemplates().stream()
					.map(p -> DynamicTemplateProvider.toTemplateName(p).toLowerCase()).collect(toSet());
			IInputValidator inputValidator = new IInputValidator() {

				@Override
				public String isValid(String newText) {
					if (newText == null) {
						return "Empty name";
					} else if (existingNames.contains(newText.toLowerCase().toString())) {
						return "A template already exist with this name";
					}
					return null;
				}
			};
			String initialValue = eClass.getName() + " report";
			String initName = initialValue;
			int nb = 0;
			while (inputValidator.isValid(initName) != null) {
				nb++;
				initName = initialValue + " " + nb;
			}
			InputDialog inputDialog = new InputDialog(event.display.getActiveShell(), "New template",
					"Give a name to new template (it will be available on " + eClass.getName() + ")", initName,
					inputValidator);
			if (IDialogConstants.OK_ID == inputDialog.open()) {
				String baseName = inputDialog.getValue();
				String templateName = baseName + "." + TradesM2docActivator.DOCX;

				Path templateFolder = DynamicTemplateProvider.getLocaTemplateFolder();
				if (templateFolder != null) {
					File folder = templateFolder.toFile();
					if (!folder.exists()) {
						folder.mkdirs();
					}

					Path targetPath = templateFolder.resolve(templateName);
					try (XWPFDocument sampleTemplate = generate(eClass, templateName)) {
						ExtensibleURIConverterImpl uriConverter = new ExtensibleURIConverterImpl();

						URI uri = URI.createFileURI(targetPath.toFile().toURI().getPath());
						POIServices.getInstance().saveFile(uriConverter, sampleTemplate, uri);

						TradesM2docActivator.getDefault().getTemplateRegistry().addTemplate(uri,
								inputDialog.getValue());

						// Then create a GenConfModel
						generateMatchingGenConf(baseName, uri, selection);

						File file = targetPath.toFile();
						if (file.exists()) {
							try {
								java.awt.Desktop.getDesktop().open(file);
							} catch (IOException e) {
								TradesM2docActivator.logError(MessageFormat
										.format("Error while opening target file {0}", targetPath.toString()), e);
							}
						}
					} catch (InvalidFormatException | IOException e) {
						TradesM2docActivator.logError("Error while generating new template", e);
					}
				}

			}
		}
	}

	public void generateMatchingGenConf(String templateName, URI uri, EObject selfValue) throws IOException {
		Session session = Session.of(selection).orElseThrow();
		URI sessionURI = session.getSessionResource().getURI();
		String encodedFileName = templateName;

		URI genConfResourceUIR = sessionURI.trimSegments(1)
				.appendSegment(encodedFileName + "." + GenconfPackage.eNS_PREFIX);
		ResourceSet rs = new ResourceSetImpl();
		Resource genConfResource = rs.createResource(genConfResourceUIR);
		Generation generation = GenconfFactory.eINSTANCE.createGeneration();
		genConfResource.getContents().add(generation);
		generation.setResultFileName(encodedFileName + "-result.docx");
		generation.setValidationFileName(encodedFileName + "-validation.docx");
		generation.setTemplateFileName(URI.decode(uri.toString()));

		ModelDefinition selfDef = GenconfFactory.eINSTANCE.createModelDefinition();
		selfDef.setKey(IM2DocTemplate.SELF_VAR);
		selfDef.setValue(selfValue);

		generation.getDefinitions().add(selfDef);

		Option siriusOpt = GenconfFactory.eINSTANCE.createOption();
		siriusOpt.setName(M2DocSiriusUtils.SIRIUS_SESSION_OPTION);
		siriusOpt.setValue(sessionURI.lastSegment());

		generation.getOptions().add(siriusOpt);

		genConfResource.save(Collections.emptyMap());
	}

	private XWPFDocument generate(EClass eCls, String actionName) throws InvalidFormatException, IOException {

		final InputStream is = getClass().getResourceAsStream(BASE_TEMPLATE_NAME);
		final OPCPackage pkg = OPCPackage.open(is);

		final XWPFDocument res = new XWPFDocument(pkg);

		// Add M2DOC custom props
		final TemplateCustomProperties customProperties = new TemplateCustomProperties(res);
		customProperties.setM2DocVersion(M2DocUtils.VERSION);

		customProperties.getVariables().put(IM2DocTemplate.SELF_VAR, buildType(eCls));

		final Set<String> packages = new LinkedHashSet<>();
		packages.add(eCls.getEPackage().getNsURI());
		for (EClass superCls : eCls.getEAllSuperTypes()) {
			packages.add(superCls.getEPackage().getNsURI());
		}

		packages.add(org.eclipse.sirius.diagram.DiagramPackage.eINSTANCE.getNsURI());
		packages.add(ViewpointPackage.eINSTANCE.getNsURI());
		packages.add(SequencePackage.eINSTANCE.getNsURI());
		packages.add(TablePackage.eINSTANCE.getNsURI());
		customProperties.getPackagesURIs().addAll(packages);
		customProperties.save();

		return res;
	}

	private String buildType(EClass eClass) {
		return eClass.getEPackage().getName() + "::" + eClass.getName();
	}

}
