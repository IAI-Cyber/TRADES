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
package dsm.TRADES.impl;

import static java.util.stream.Collectors.toSet;

import java.text.MessageFormat;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import dsm.TRADES.Component;
import dsm.TRADES.Data;
import dsm.TRADES.util.TRADESValidator;

public class AffectRelationCustomImpl extends AffectRelationImpl {

	@Override
	public boolean checkDataScope(DiagnosticChain chain, Map context) {
		final boolean isValid;
		Component source = getSourceComponent();
		EList<Data> datas = getData();
		if (source != null) {
			boolean valid = true;
			Set<Data> availableData = source.getAllDatas().stream().collect(toSet());
			for (Data d : datas) {
				if (!availableData.contains(d)) {
					valid = false;
					chain.add(new BasicDiagnostic(Diagnostic.WARNING, TRADESValidator.DIAGNOSTIC_SOURCE,
							TRADESValidator.AFFECT_RELATION__CHECK_DATA_SCOPE,
							MessageFormat.format("''{0}'' does not belong to available data of ''{1}''", d.getName(),
									source.getName()),
							new Object[] { this }));
				}
			}
			isValid = valid;

		} else if (!datas.isEmpty()) {
			chain.add(new BasicDiagnostic(Diagnostic.WARNING, TRADESValidator.DIAGNOSTIC_SOURCE,
					TRADESValidator.AFFECT_RELATION__CHECK_DATA_SCOPE,
					MessageFormat.format("[{0}] has no source. It should not reference any data", name),
					new Object[] { this }));
			isValid = false;
		} else {
			isValid = true;
		}

		return isValid;
	}

}
