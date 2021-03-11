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

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import dsm.TRADES.Analysis;
import dsm.TRADES.Data;
import dsm.TRADES.DataOwner;
import dsm.TRADES.testlib.AbstractTest;

public class AnalysisCustomImplTest extends AbstractTest {

	@Test
	public void checkGetData() {

		Analysis analysis = fact.createAnalysis();
		assertThat(analysis.getDatas()).isEmpty();
		assertThat(analysis.getAllDatas()).isEmpty();
		assertThat(analysis.getInheritedDatas()).isEmpty();

		DataOwner dataOwner = fact.createDataOwner();
		analysis.setDataOwner(dataOwner);
		assertThat(analysis.getDatas()).isEmpty();
		assertThat(analysis.getAllDatas()).isEmpty();
		assertThat(analysis.getInheritedDatas()).isEmpty();

		Data data1 = fact.createData();
		dataOwner.getData().add(data1);

		assertThat(analysis.getDatas()).containsExactly(data1);
		assertThat(analysis.getAllDatas()).containsExactly(data1);
		assertThat(analysis.getInheritedDatas()).isEmpty();

	}

}
