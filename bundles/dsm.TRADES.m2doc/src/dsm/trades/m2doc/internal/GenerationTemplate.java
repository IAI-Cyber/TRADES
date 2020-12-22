package dsm.trades.m2doc.internal;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.acceleo.query.runtime.IQueryEnvironment;
import org.eclipse.acceleo.query.runtime.IReadOnlyQueryEnvironment;
import org.eclipse.acceleo.query.runtime.ServiceUtils;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Shell;
import org.obeonetwork.m2doc.generator.DocumentGenerationException;
import org.obeonetwork.m2doc.parser.DocumentParserException;
import org.obeonetwork.m2doc.parser.ValidationMessageLevel;
import org.obeonetwork.m2doc.sirius.M2DocSiriusUtils;
import org.obeonetwork.m2doc.template.DocumentTemplate;
import org.obeonetwork.m2doc.util.ClassProvider;
import org.obeonetwork.m2doc.util.M2DocUtils;

import dsm.trades.m2doc.Activator;
import dsm.trades.m2doc.IGenerationTemplate;
import dsm.trades.m2doc.LoggingMonitor;

public class GenerationTemplate implements IGenerationTemplate {

	private static final String REPORTS_TEMPLATE = "Reports";

	private static final String FILE_NAME_TIMESTAMP_FORMAT = "MM_dd_yy_HH_mm__ss"; //$NON-NLS-1$

	private final String actionName;
	private final URI templatURI;
	private final EClass type;

	public GenerationTemplate(String actionName, URI templatURI, EClass type) {
		super();
		this.actionName = actionName;
		this.templatURI = templatURI;
		this.type = type;
	}

	@Override
	public URI getTemplateURI() {
		return templatURI;
	}

	@Override
	public String getActionName() {
		return actionName;
	}

	@Override
	public EClass getMainType() {
		return type;
	}

	@Override
	public void generate(EObject selection, Shell shell, boolean open) {
		Optional<Session> optSession = Session.of(selection);
		if (optSession.isPresent()) {
			Session session = optSession.get();

			ResourceSet resourceSet = session.getTransactionalEditingDomain().getResourceSet();
			final IQueryEnvironment queryEnvironment = initQueryEnv(resourceSet, templatURI,
					session.getSessionResource().getURI(), Collections.emptyList());

			final Map<String, Object> variables = new HashMap<String, Object>();
			variables.put("self", selection);

			URI uri = session.getSessionResource().getURI();
			String path = uri.trimSegments(1).toPlatformString(true);
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(path);

			IFolder reportFolder = project.getFolder(REPORTS_TEMPLATE);
			if (!reportFolder.exists()) {
				try {
					reportFolder.create(true, true, new NullProgressMonitor());
				} catch (CoreException e) {
					Activator.logError("Unable to create report folder", e);
					return;
				}
			}

			java.nio.file.Path targetFile = reportFolder.getLocation().toFile().toPath().resolve(buildReportName());
			final URI outputURI = URI.createFileURI(targetFile.toUri().getPath());

			LoggingMonitor monitor = new LoggingMonitor();
			try (DocumentTemplate template = M2DocUtils.parse(resourceSet.getURIConverter(), templatURI,
					queryEnvironment, new ClassProvider(this.getClass().getClassLoader()), monitor)) {

				if (validateTemplate(template, queryEnvironment, monitor)) {
					M2DocUtils.generate(template, queryEnvironment, variables, resourceSet, outputURI, true, monitor);
				} else {
					M2DocUtils.serializeValidatedDocumentTemplate(resourceSet.getURIConverter(), template, outputURI);
					displayError(shell, MessageFormat.format("Error during template validation at {0}", outputURI));
				}
				reportFolder.refreshLocal(1, new NullProgressMonitor());
				File generatedFile = targetFile.toFile();
				if (generatedFile.exists() && open) {
					try {
						java.awt.Desktop.getDesktop().open(targetFile.toFile());
					} catch (IOException e) {
						displayError(shell, MessageFormat.format("Error while opening target file",
								generatedFile.getAbsolutePath()));
					}
				}

			} catch (IOException | DocumentParserException | DocumentGenerationException | CoreException e) {
				Activator.logError(MessageFormat.format("Error during geneartion : {0}", e.getMessage()), e);
				displayError(shell, "Error during generation. See error log view");
			}
		}
	}

	private String buildReportName() {
		return actionName + "_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FILE_NAME_TIMESTAMP_FORMAT))
				+ ".docx";
	}

	private void displayError(Shell shell, String message) {
		MessageDialog.openError(shell, "Generation error", message);
	}

	private boolean validateTemplate(DocumentTemplate template, IReadOnlyQueryEnvironment queryEnvironment,
			Monitor monitor) {
		final ValidationMessageLevel validationLevel = M2DocUtils.validate(template, queryEnvironment, monitor);
		return validationLevel == ValidationMessageLevel.OK;
	}

	private IQueryEnvironment initQueryEnv(ResourceSet resourceSet, URI templateURI, URI sessionURI, List<?> services) {
		final Map<String, String> options = new HashMap<String, String>();
		options.put(M2DocUtils.TEMPLATE_URI_OPTION, templateURI.toString());
		options.put(M2DocSiriusUtils.SIRIUS_SESSION_OPTION, sessionURI.toString());

		final IQueryEnvironment queryEnvironment = M2DocUtils.getQueryEnvironment(resourceSet, templateURI, options);
		for (Object service : services) {
			ServiceUtils.registerServices(queryEnvironment, ServiceUtils.getServices(queryEnvironment, service));
		}
		return queryEnvironment;
	}

}
