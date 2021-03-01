package dsm.trades.m2doc.menu;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.PlatformUI;

import dsm.trades.m2doc.IM2DocTemplate;
import dsm.trades.m2doc.IM2DocTemplateRegistry;
import dsm.trades.m2doc.TradesM2docActivator;
import dsm.trades.m2doc.utils.HandlerUtils;

/**
 * Menu used to add all report generation action from the current selection
 * 
 * @author Arthur Daussy
 *
 */
public class ReportMenu extends ContributionItem {

	public ReportMenu() {
	}

	public ReportMenu(String id) {
		super(id);
	}

	@Override
	public void fill(Menu menu, int index) {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
				.getSelection();

		EObject semanticSelection = HandlerUtils.getTradesSelection(selection);
		if (semanticSelection == null) {
			return;
		}

		Optional<Session> optSession = Session.of(semanticSelection);
		if (optSession.isPresent()) {
			IM2DocTemplateRegistry templateRegistry = TradesM2docActivator.getDefault().getTemplateRegistry();
			EClass type = semanticSelection.eClass();
			List<IM2DocTemplate> availableTemplates = templateRegistry.getTemplates().stream()
					.filter(t -> t.getMainType().isSuperTypeOf(type)).collect(toList());

			for (final IM2DocTemplate template : availableTemplates) {
				MenuItem menuItem = new MenuItem(menu, SWT.PUSH);
				menuItem.setText(template.getTemplateName());
				menuItem.setImage(TradesM2docActivator.getDefault().getImage("icons/m2doc.gif"));
				menuItem.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent event) {
						new GenerateReportAction(menu.getDisplay().getActiveShell(), semanticSelection, template)
								.runGeneration();
					}
				});
			}

		}

	}

}
