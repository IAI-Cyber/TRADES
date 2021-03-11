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
package dsm.TRADES.testlib;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.tools.api.util.SiriusCrossReferenceAdapter;

import dsm.TRADES.Analysis;
import dsm.TRADES.ScoreSystem;
import dsm.TRADES.SemanticUtil;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.ThreatsOwner;

public class AbstractTest {

	protected TRADESFactory fact = TRADESFactory.eINSTANCE;

	protected <T extends EObject> T installCrossRef(T eObject) {
		SiriusCrossReferenceAdapter crossRef = new SiriusCrossReferenceAdapter();
		crossRef.setTarget(eObject);
		eObject.eAdapters().add(crossRef);
		return eObject;
		
	}

	protected Analysis createEmptyModel() {
		Analysis analysis = TRADESFactory.eINSTANCE.createAnalysis();
		analysis.setName("TestModel");

		ScoreSystem scoreSystem = TRADESFactory.eINSTANCE.createScoreSystem();
		analysis.setScoreSystem(scoreSystem);

		ThreatsOwner threatOwner = TRADESFactory.eINSTANCE.createThreatsOwner();
		analysis.setThreatOwner(threatOwner);

		SemanticUtil.createControlOwner(analysis);

		SemanticUtil.createDataOwner(analysis);

		return installCrossRef(analysis);
	}



}
