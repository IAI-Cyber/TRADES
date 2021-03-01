package dsm.trades.m2doc.menu;

import static java.util.stream.Collectors.toList;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.swt.widgets.Shell;

import dsm.trades.m2doc.IM2DocTemplate;
import dsm.trades.m2doc.TradesM2docActivator;

/**
 * 
 * Action that generate a M2Doc report from a given selection
 * 
 * @author Arthur Daussy
 *
 */
public class GenerateReportAction {

	private final Shell shell;
	private final EObject selection;
	private final IM2DocTemplate template;

	public GenerateReportAction(Shell shell, EObject selection, IM2DocTemplate template) {
		super();
		this.shell = shell;
		this.selection = selection;
		this.template = template;
	}

	public void runGeneration() {
		ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);
		try {
			List<IStatus> results = new ArrayList<IStatus>();
			progressDialog.run(true, true, monitor -> {
				monitor.beginTask("Generation report", IProgressMonitor.UNKNOWN);
				results.add(template.generate(selection, monitor, true));
				monitor.done();
			});

			List<IStatus> errors = results.stream().filter(s -> !s.isOK()).collect(toList());
			if (!errors.isEmpty()) {
				displayError(shell,
						errors.stream().map(s -> s.getMessage()).collect(Collectors.joining(System.lineSeparator())));
			}
		} catch (InvocationTargetException | InterruptedException e) {
			TradesM2docActivator.logError("Generation error " + e.getMessage(), e);
			displayError(shell, "Generation error " + e.getMessage());
		}
	}

	private void displayError(Shell shell, String message) {
		MessageDialog.openError(shell, "Generation error", message);
	}

}
