package dsm.TRADES.migration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;

import dsm.TRADES.TRADESPackage;

//import fr.obeo.dsl.ecompat.base.BasePackage;

public class BaseResourceExtendedMetadata extends BasicExtendedMetaData {

	private static final List<Renamer> RENAMERS = new ArrayList<>();

	static {
		RENAMERS.add(new Renamer(TRADESPackage.eINSTANCE.getComponent_AffectRelations(),
				TRADESPackage.eINSTANCE.getComponent(), "affectrelation"));
		RENAMERS.add(new Renamer(TRADESPackage.eINSTANCE.getScoreSystem_ImpactScores(),
				TRADESPackage.eINSTANCE.getScoreSystem(), "impactscore"));
		RENAMERS.add(new Renamer(TRADESPackage.eINSTANCE.getScoreSystem_DifficultyScores(),
				TRADESPackage.eINSTANCE.getScoreSystem(), "difficultyscore"));
		RENAMERS.add(new Renamer(TRADESPackage.eINSTANCE.getComponentOwner_Components(),
				TRADESPackage.eINSTANCE.getComponentOwner(), "component"));
		RENAMERS.add(new Renamer(TRADESPackage.eINSTANCE.getThreat_ThreatAllocations(),
				TRADESPackage.eINSTANCE.getThreat(), "threatallocation"));
		RENAMERS.add(new Renamer(TRADESPackage.eINSTANCE.getThreatMitigationRelation_MitigatedAllocation(),
				TRADESPackage.eINSTANCE.getThreatMitigationRelation(), "mitigates"));
		RENAMERS.add(new Renamer(TRADESPackage.eINSTANCE.getControl_MitigatedThreats(),
				TRADESPackage.eINSTANCE.getControl(), "mitigates"));
		RENAMERS.add(new Renamer(TRADESPackage.eINSTANCE.getThreatAllocationRelation_DifficultyScore(),
				TRADESPackage.eINSTANCE.getThreatAllocationRelation(), "difficultyscore"));
		RENAMERS.add(new Renamer(TRADESPackage.eINSTANCE.getThreatAllocationRelation_ImpactScore(),
				TRADESPackage.eINSTANCE.getThreatAllocationRelation(), "impactscore"));
		RENAMERS.add(new Renamer(TRADESPackage.eINSTANCE.getAnalysis_ScoreSystem(),
				TRADESPackage.eINSTANCE.getAnalysis(), "scoresystem"));
	}


	@Override
	public EStructuralFeature getAttribute(EClass eClass, String namespace, String name) {
		EStructuralFeature found = super.getAttribute(eClass, namespace, name);
		if (found == null) {
			found = findEStructuralFeature(eClass, name);
		}
		return found;
	}

	@Override
	protected EStructuralFeature getLocalElement(EClass eClass, String namespace, String name) {
		EStructuralFeature found = super.getLocalElement(eClass, namespace, name);
		if (found == null) {
			found = findEStructuralFeature(eClass, name);
		}
		return found;
	}

	private EStructuralFeature findEStructuralFeature(EClass eClass, String name) {

		for (Renamer r : RENAMERS) {
			EStructuralFeature feature = r.getNewName(eClass, name);
			if (feature != null) {
				return feature;
			}
		}

		return null;
	}

	private static class Renamer {

		private final EStructuralFeature newfeature;
		private final String expectedOldName;
		private final EClass expectedClass;

		public Renamer(EStructuralFeature newfeature, EClass expectedClass, String expectedOldName) {
			super();
			this.newfeature = newfeature;
			this.expectedOldName = expectedOldName;
			this.expectedClass = expectedClass;
		}

		public EStructuralFeature getNewName(EClass eClass, String name) {

			if (expectedClass.isSuperTypeOf(eClass) && expectedOldName.equals(name)) {
				return newfeature;
			}
			return null;

		}
	}


}
