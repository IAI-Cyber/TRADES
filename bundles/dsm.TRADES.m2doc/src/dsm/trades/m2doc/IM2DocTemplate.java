/******************************************************************************************************
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
*******************************************************************************************************/
package dsm.trades.m2doc;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public interface IM2DocTemplate {

	static final String SELF_VAR = "self";

	/**
	 * URI to the word template
	 * 
	 * @return a valid {@link URI}
	 */
	URI getTemplateURI();

	/**
	 * User readable name to identify the template
	 * 
	 * @return a String
	 */
	String getTemplateName();

	/**
	 * Gets the type of selection this template react to
	 * 
	 * @return an {@link EClass}
	 */
	EClass getMainType();

	/**
	 * Generates the reports
	 * 
	 * @param selection       the current selection (of the expected type)
	 * @param progressMonitor a {@link IProgressMonitor}
	 * @param open            hold <code>true</code> to open the file on success
	 * @return {@link Status#OK_STATUS} on success another status on error
	 */
	IStatus generate(EObject selection, IProgressMonitor progressMonitor, boolean open);

}
