package dsm.trades.rcp.internal;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

public class TradesPerspectiveFactory implements IPerspectiveFactory {

	private static String LEFT_FOLDER_ID = "left.folder";
	private static String BOTTOM_FOLDER_ID = "bottom.folder";
	private static String MODEL_EXPLORER_VIEW_ID = "org.eclipse.sirius.ui.tools.views.model.explorer";
	private static String ERROR_LOG_VIEW = "org.eclipse.pde.runtime.LogView";

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);

		IFolderLayout leftFolder = layout.createFolder(LEFT_FOLDER_ID, IPageLayout.LEFT, 0.25f,
				IPageLayout.ID_EDITOR_AREA);
		leftFolder.addView(MODEL_EXPLORER_VIEW_ID);
		leftFolder.addView(IPageLayout.ID_OUTLINE);

		IFolderLayout bottomFolder = layout.createFolder(BOTTOM_FOLDER_ID, IPageLayout.BOTTOM, 0.75f,
				IPageLayout.ID_EDITOR_AREA);
		bottomFolder.addView(IConsoleConstants.ID_CONSOLE_VIEW);
		bottomFolder.addView(IPageLayout.ID_PROP_SHEET);
		bottomFolder.addView(IPageLayout.ID_PROBLEM_VIEW);
		bottomFolder.addView(ERROR_LOG_VIEW);

		layout.addShowViewShortcut(MODEL_EXPLORER_VIEW_ID);
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
		layout.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
		layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
		layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
		layout.addShowViewShortcut(ERROR_LOG_VIEW);

		layout.addNewWizardShortcut("TRADES.design.newProject");

	}

}
