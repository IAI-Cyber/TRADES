package dsm.trades.m2doc.handler;

import static java.util.stream.Collectors.toList;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import dsm.TRADES.TRADESPackage;
import dsm.trades.m2doc.Activator;
import dsm.trades.m2doc.IM2DocTemplate;
import dsm.trades.m2doc.IM2DocTemplateRegistry;

/**
 * Handler that launch the generation of templates depending on the current
 * selection
 * 
 * @author Arthur Daussy
 *
 */
public class GenerationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		EObject selection = getTradesSection(event);
		if (selection != null) {
			Optional<Session> optSession = Session.of(selection);
			if (optSession.isPresent()) {
				IM2DocTemplateRegistry templateRegistry = Activator.getDefault().getTemplateRegistry();
				EClass type = selection.eClass();
				List<IM2DocTemplate> availableTemplate = templateRegistry.getTemplates().stream()
						.filter(t -> t.getMainType().isSuperTypeOf(type)).collect(toList());
				if (!availableTemplate.isEmpty()) {

					ListSelectionDialog dialog = new ListSelectionDialog(HandlerUtil.getActiveShell(event),
							availableTemplate, ArrayContentProvider.getInstance(), new LabelProvider() {
								@Override
								public String getText(Object element) {
									return ((IM2DocTemplate) element).getTemplateName();
								};
							}, "Select a template");
					dialog.setInitialSelections(availableTemplate.get(0));
					if (dialog.open() == IDialogConstants.OK_ID) {
						runGeneration(event, selection, dialog);
					}
				} else {
					displayInfo(event, "No template available for this selection");
				}
			}
		} else {
			displayInfo(event, "No current selection");
		}
		return null;
	}

	private void runGeneration(ExecutionEvent event, EObject selection, ListSelectionDialog dialog) {
		ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(
				HandlerUtil.getActiveShell(event));
		try {
			List<IStatus> results = new ArrayList<IStatus>();
			progressDialog.run(true, true, monitor -> {
				Object[] result = dialog.getResult();
				monitor.beginTask("Generation report", IProgressMonitor.UNKNOWN);
				for (int i = 0; i < result.length; i++) {
					IM2DocTemplate template = (IM2DocTemplate) result[i];
					results.add(template.generate(selection, monitor, true));
				}
			});

			List<IStatus> errors = results.stream().filter(s -> !s.isOK()).collect(toList());
			if (!errors.isEmpty()) {
				displayError(event, errors.stream().map(s -> s.getMessage())
						.collect(Collectors.joining(System.lineSeparator())));
			}
		} catch (InvocationTargetException | InterruptedException e) {
			Activator.logError("Generation error " + e.getMessage(), e);
			displayError(event, "Generation error " + e.getMessage());
		}
	}

	private void displayError(ExecutionEvent event, String message) {
		MessageDialog.openError(HandlerUtil.getActiveShell(event), "Generation error", message);
	}

	private void displayInfo(ExecutionEvent event, String message) {
		MessageDialog.openInformation(HandlerUtil.getActiveShell(event), "Generation info", message);
	}

	private EObject getTradesSection(ExecutionEvent event) {
		final ISelection selection = HandlerUtil.getCurrentSelection(event);

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;

			if (strucSelection.size() == 1) {
				Object first = strucSelection.getFirstElement();
				if (first instanceof EObject) {
					EObject eObject = (EObject) first;
					if (eObject.eClass().getEPackage() == TRADESPackage.eINSTANCE) {
						return eObject;
					}
				}
			}

		}
		return null;
	}

}
