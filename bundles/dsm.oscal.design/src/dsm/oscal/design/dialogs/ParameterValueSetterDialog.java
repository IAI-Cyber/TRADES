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

package dsm.oscal.design.dialogs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.widgets.WidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import dsm.oscal.design.Activator;
import dsm.oscal.design.m2doc.MarkupServices;
import dsm.oscal.model.ParameterResolver;
import dsm.oscal.model.OscalCatalogCommon.Parameter;
import dsm.oscal.model.OscalMetadata.PartOwner;

/**
 * Dialogs use to given values of all parameters in used in the provider
 * {@link PartOwner}s
 * 
 * @author Arthur Daussy
 *
 */
public class ParameterValueSetterDialog extends Dialog {

	private Map<Parameter, String> paramToValue = new HashMap<>();
	private final List<Parameter> parameters;
	private boolean keepValue = true;
	private Text computedDocumentationText;
	private Function<Map<String, String>, String> textRendererComputer;

	/**
	 * Simple constructor
	 * 
	 * @param parentShell  a shell
	 * @param parameters   the list of parameters that needs a value
	 * @param textRenderer a function that takes a Map of ID to VALUE and renders a
	 *                     text
	 */
	public ParameterValueSetterDialog(Shell parentShell, List<Parameter> parameters,
			Function<Map<String, String>, String> textRenderer) {
		super(parentShell);
		this.parameters = parameters;
		this.textRendererComputer = textRenderer;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	protected Control createDialogArea(Composite parent) {
		Composite cc = (Composite) super.createDialogArea(parent);

		Group valueContainer = new Group(cc, SWT.None);
		valueContainer.setText("Values");
		valueContainer.setLayoutData(new GridData(GridData.FILL_BOTH));
		valueContainer.setLayout(new GridLayout(3, false));

		for (Parameter param : parameters) {
			if (param.getId() != null) {

				WidgetFactory.label(SWT.NONE).layoutData(new GridData(GridData.BEGINNING))
						.text(ParameterResolver.safeToMarkdown(param.getLabel())).create(valueContainer);

				String usage = MarkupServices.toHTML(param.getUsage());

				WidgetFactory.label(SWT.NONE).layoutData(new GridData(GridData.CENTER))
						.image(Activator.getDefault().getImage("icons/help.gif"))
						.tooltip((usage != null ? usage + "\n" : "") + "#" + param.getId()).create(valueContainer);

				Combo combo = new Combo(valueContainer, SWT.BORDER);
				EList<String> values = param.getValues();
				for (String s : values) {
					combo.add(s);
				}
				if (!values.isEmpty()) {
					combo.select(0);
					paramToValue.put(param, values.get(0));
				}

				combo.addModifyListener(e -> {
					String text = combo.getText();
					String value;
					if (text == null) {
						value = "";
					} else {
						value = text;
					}
					paramToValue.put(param, value);
					if (combo != null && !combo.isDisposed()) {
						computedDocumentationText.setText(textRendererComputer.apply(getIdToValueMap()));
					}
				});
			}

		}

		GridData docLayoutData = new GridData(GridData.FILL_BOTH);
		docLayoutData.horizontalSpan = 3;

		Group textGroup = new Group(cc, SWT.None);
		textGroup.setText("Documentation");
		textGroup.setLayoutData(docLayoutData);
		textGroup.setLayout(new FillLayout());

		computedDocumentationText = WidgetFactory.text(SWT.MULTI | SWT.READ_ONLY)
				.background(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE))
				.text(textRendererComputer.apply(getIdToValueMap())).create(textGroup);

		GridData memorizeButtonLayoutData = new GridData(GridData.CENTER);
		memorizeButtonLayoutData.horizontalSpan = 3;

		Button memorizeButton = WidgetFactory.button(SWT.CHECK).layoutData(memorizeButtonLayoutData).onSelect(e -> {
			keepValue = ((Button) e.widget).getSelection();
		}).text("Memorize values").tooltip("Check in order to store entered values for subsequent uses.").create(cc);
		memorizeButton.setSelection(keepValue);

		return cc;
	}

	public Map<String, String> getIdToValueMap() {
		return paramToValue.entrySet().stream().collect(Collectors.toMap(e -> e.getKey().getId(), Map.Entry::getValue));
	}

	public boolean isKeepValue() {
		return keepValue;
	}

	public Map<Parameter, String> getParamToValue() {
		return paramToValue;
	}

}
