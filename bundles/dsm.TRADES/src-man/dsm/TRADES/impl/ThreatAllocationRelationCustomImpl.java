package dsm.TRADES.impl;

import java.text.MessageFormat;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import dsm.TRADES.AttackChain;
import dsm.TRADES.DifficultyScore;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.util.TRADESValidator;

public class ThreatAllocationRelationCustomImpl extends ThreatAllocationRelationImpl {

	@Override
	public boolean checkComputedDifficultyConstraint(DiagnosticChain chain, @SuppressWarnings("rawtypes") Map context) {
		AttackChain attackChain = getAttackChain();
		if (attackChain != null) {
			DifficultyScore diffElement = getDifficultyscore();
			int diff = diffElement != null ? diffElement.getDifficulty() : 0;
			int cmpDiff = attackChain.getComputedDifficulty();
			if (diff != cmpDiff) {
				chain.add(new BasicDiagnostic(Diagnostic.WARNING, TRADESValidator.DIAGNOSTIC_SOURCE,
						TRADESValidator.THREAT_ALLOCATION_RELATION__CHECK_COMPUTED_DIFFICULTY_CONSTRAINT,
						MessageFormat.format(
								"Linked attack chain defines a difficulty ({0}) which is different from the one defined for this ThreatAllocationRelation ({1})",
								cmpDiff, diff),
						new Object[] { this, TRADESPackage.eINSTANCE.getThreatAllocationRelation_Difficultyscore() }));
				return false;
			}
		}
		return true;
	}
}
