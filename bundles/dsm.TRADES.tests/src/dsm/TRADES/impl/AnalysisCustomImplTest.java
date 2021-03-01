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
