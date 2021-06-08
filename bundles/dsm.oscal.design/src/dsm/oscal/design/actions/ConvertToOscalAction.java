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

package dsm.oscal.design.actions;

import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;

import dsm.TRADES.Control;
import dsm.oscal.design.wizards.ConvertToOSCALControlWizard;

/**
 * Action used to convert some {@link Control} into OSCAL
 * {@link dsm.oscal.model.OscalCatalog.Control}
 * 
 * @author Arthur Daussy
 *
 */
public class ConvertToOscalAction extends Action {

	private final List<Control> sourceControls;

	public ConvertToOscalAction(List<Control> sourceControls) {
		super("Export to OSCAL Catalog");
		this.sourceControls = sourceControls;
	}

	@Override
	public void runWithEvent(Event e) {
		if (!sourceControls.isEmpty()) {
			ConvertToOSCALControlWizard wizard = new ConvertToOSCALControlWizard(sourceControls,
					Session.of(sourceControls.get(0)).get());
			WizardDialog dialog = new WizardDialog(e.display.getActiveShell(), wizard);
			dialog.open();
		}
	}

}
