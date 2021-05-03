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

package dsm.trades.rcp.internal.wizards;

import java.nio.file.Path;
import java.util.function.Function;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

public class TradesLoadingPage extends WizardPage {

	private Path path;
	private Text fileSelectionLabel;
	private String extension;
	private Function<Path, Boolean> fileConsumer;

	protected TradesLoadingPage(String extension, Function<Path, Boolean> fileConsumer) {
		super("File selection");
		this.extension = extension;
		this.fileConsumer = fileConsumer;
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.None);
		composite.setLayout(new GridLayout(1, true));

		Group browseGroup = new Group(composite, SWT.NONE);
		browseGroup.setText("External catalog selection :");
		browseGroup.setLayout(new GridLayout(2, false));
		browseGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		this.fileSelectionLabel = new Text(browseGroup, SWT.BORDER);
		fileSelectionLabel.addModifyListener(e -> {
			String text = fileSelectionLabel.getText();
			if (text != null && !text.isBlank()) {
				path = Path.of(text);
			} else {
				path = null;
			}
			getContainer().updateButtons();
			updatePath();

		});
		fileSelectionLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Button browseButton = new Button(browseGroup, SWT.PUSH);
		browseButton.setLayoutData(new GridData(GridData.END));
		browseButton.setText("Browse");
		browseButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(getShell());
				dialog.setFilterExtensions(new String[] { extension });
				String targetFile = dialog.open();
				if (targetFile != null) {
					path = Path.of(targetFile);
					fileSelectionLabel.setText(targetFile);
				}
				getContainer().updateButtons();
				updatePath();
			}
		});

		setControl(composite);

	}

	private void updatePath() {
		if (path != null && path.toFile().exists()) {
			if (!fileConsumer.apply(path)) {
				setErrorMessage("Invalid model");
			} else {
				setErrorMessage(null);
			}
		} else {
			setErrorMessage("Invalid path");
		}
	}

	@Override
	public boolean canFlipToNextPage() {
		return path != null && path.toFile().exists();
	}

	public Path getPath() {
		return path;
	}

}
