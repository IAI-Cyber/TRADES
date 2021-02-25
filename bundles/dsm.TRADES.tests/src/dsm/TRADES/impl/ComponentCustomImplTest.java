package dsm.TRADES.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import dsm.TRADES.Analysis;
import dsm.TRADES.Component;
import dsm.TRADES.Data;
import dsm.TRADES.DataOwner;
import dsm.TRADES.testlib.AbstractTest;

public class ComponentCustomImplTest extends AbstractTest {

	@Test
	public void checkGetData() {

		Component cmp = fact.createComponent();
		assertThat(cmp.getDatas()).isEmpty();
		assertThat(cmp.getAllDatas()).isEmpty();
		assertThat(cmp.getInheritedDatas()).isEmpty();

		DataOwner dataOwner = fact.createDataOwner();
		cmp.setDataOwner(dataOwner);
		assertThat(cmp.getDatas()).isEmpty();
		assertThat(cmp.getAllDatas()).isEmpty();
		assertThat(cmp.getInheritedDatas()).isEmpty();

		Data data1 = fact.createData();
		dataOwner.getData().add(data1);

		assertThat(cmp.getDatas()).containsExactly(data1);
		assertThat(cmp.getAllDatas()).containsExactly(data1);
		assertThat(cmp.getInheritedDatas()).isEmpty();

		// Add sub components
		Component subCmp = fact.createComponent();
		cmp.getComponents().add(subCmp);

		assertThat(subCmp.getDatas()).isEmpty();
		assertThat(subCmp.getAllDatas()).containsExactly(data1);
		assertThat(subCmp.getInheritedDatas()).containsExactly(data1);

		DataOwner subDataOwner = fact.createDataOwner();
		Data data2 = fact.createData();
		subDataOwner.getData().add(data2);
		subCmp.setDataOwner(subDataOwner);

		assertThat(subCmp.getDatas()).containsExactly(data2);
		assertThat(subCmp.getAllDatas()).containsExactly(data2, data1);
		assertThat(subCmp.getInheritedDatas()).containsExactly(data1);

		// Put inside a analysis

		Analysis analysis = fact.createAnalysis();
		DataOwner anDataOwner = fact.createDataOwner();
		analysis.setDataOwner(anDataOwner);
		Data data3 = fact.createData();
		anDataOwner.getData().add(data3);
		analysis.getComponents().add(cmp);

		assertThat(cmp.getDatas()).containsExactly(data1);
		assertThat(cmp.getAllDatas()).containsExactly(data1, data3);
		assertThat(cmp.getInheritedDatas()).containsExactly(data3);

	}
}
