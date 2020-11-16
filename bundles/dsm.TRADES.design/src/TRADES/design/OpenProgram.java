package TRADES.design;

/*******************************************************************************
 * Copyright (c) 2011 THALES GLOBAL SERVICES.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.swt.program.Program;

/**
 * An external Java action which opens the Eclipse Helps system at a section
 * specified as a parameter.
 * <p>
 * Action parameters
 * <ul>
 * <li><code>href</code>: the URL of the help resource.</li>
 * </ul>
 * 
 * @author pcdavid
 */
public class OpenProgram extends AbstractExternalJavaAction {
    /**
     * {@inheritDoc}
     */
    public boolean canExecute(Collection<? extends EObject> selections) {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        String href = getParameter(parameters, "href", String.class);
        Program.launch(href);        
    }
}

