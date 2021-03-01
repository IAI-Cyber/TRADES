package dsm.TRADES.testlib;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.tools.api.util.SiriusCrossReferenceAdapter;

import TRADES.design.ProjectFactory;
import dsm.TRADES.Analysis;
import dsm.TRADES.ScoreSystem;
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

		ProjectFactory.createControlOwner(analysis);

		ProjectFactory.createDataOwner(analysis);

		return installCrossRef(analysis);
	}



}
