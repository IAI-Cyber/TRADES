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

package dsm.TRADES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SemanticHelper {

	private SemanticHelper() {
	}

	public static List<Control> getAllControls(AbstractControlOwner owner) {
		ControlOwner cOwner = owner.getControlOwner();
		if (cOwner == null) {
			return Collections.emptyList();
		}

		List<Control> result = new ArrayList<Control>();
		result.addAll(cOwner.getInternals());
		result.addAll(cOwner.getExternals());
		return result;
	}
}
