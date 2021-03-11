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

package dsm.trades.debug.mitrebean;

import java.util.List;

public class CourseOfAction {

	private List<MitreObject> objects;

	private String type;

	public CourseOfAction() {
	}

	public CourseOfAction(List<MitreObject> objects, String type) {
		super();
		this.objects = objects;
		this.type = type;
	}

	public List<MitreObject> getObjects() {
		return objects;
	}

	public void setObjects(List<MitreObject> objects) {
		this.objects = objects;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
