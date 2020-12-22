package dsm.trades.m2doc.handler;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Optional;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import dsm.TRADES.TRADESPackage;
import dsm.trades.m2doc.Activator;
import dsm.trades.m2doc.IGenerationTemplate;
import dsm.trades.m2doc.IM2DocTemplateRegistry;

public class GenerationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		EObject selection = getTradesSection(event);
		if (selection != null) {
			Optional<Session> optSession = Session.of(selection);
			if (optSession.isPresent()) {
				IM2DocTemplateRegistry templateRegistry = Activator.getDefault().getTemplateRegistry();
				EClass type = selection.eClass();
				List<IGenerationTemplate> availableTemaplte = templateRegistry.getTemplates().stream()
						.filter(t -> t.getMainType().isSuperTypeOf(type)).collect(toList());
				if (!availableTemaplte.isEmpty()) {

					ListSelectionDialog dialog = new ListSelectionDialog(HandlerUtil.getActiveShell(event),
							availableTemaplte, ArrayContentProvider.getInstance(), new LabelProvider() {
								@Override
								public String getText(Object element) {
									return ((IGenerationTemplate) element).getActionName();
								};
							}, "Select a template");
					dialog.setInitialSelections(availableTemaplte.get(0));
					if (dialog.open() == IDialogConstants.OK_ID) {
						Object[] result = dialog.getResult();
						for (int i = 0; i < result.length; i++) {
							IGenerationTemplate template = (IGenerationTemplate) result[i];
							template.generate(selection, HandlerUtil.getActiveShell(event), true);
						}
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

	private void displayInfo(ExecutionEvent event, String message) {
		MessageDialog.openInformation(HandlerUtil.getActiveShell(event), "Generation error", message);
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
