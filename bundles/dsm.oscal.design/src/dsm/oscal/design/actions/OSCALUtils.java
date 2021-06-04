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

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.business.api.session.UserSession;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

import dsm.oscal.design.Activator;

public class OSCALUtils {

	public static void activateOscalViewpointIfMissing(Session session, IProgressMonitor monitor) {
		if (session.getSelectedViewpoints(true).stream()
				.noneMatch(v -> Activator.OSCAL_VIEWPOINT_NAME.equals(v.getName()))) {
			monitor.setTaskName("Activating missing viewpoint");
			List<String> existingViewpoints = session.getSelectedViewpoints(true).stream().map(Viewpoint::getName)
					.collect(toList());
			existingViewpoints.add(Activator.OSCAL_VIEWPOINT_NAME);
			new UserSession(session).selectViewpoints(existingViewpoints);
			monitor.worked(1);
		}
	}

	public static IProject getSelectedProject(IStructuredSelection selection) {
		for (Object o : selection.toArray()) {
			if (o instanceof IProject) {
				Option<ModelingProject> opt = ModelingProject.asModelingProject((IProject) o);
				if (opt.some()) {
					return (IProject) o;
				}

			}
		}

		return null;
	}


}
