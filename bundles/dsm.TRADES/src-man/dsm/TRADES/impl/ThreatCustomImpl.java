package dsm.TRADES.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import dsm.TRADES.TRADESPackage;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.util.EcoreUtils;
import dsm.TRADES.util.TRADESValidator;

public class ThreatCustomImpl extends ThreatImpl {

	@Override
	public boolean checkIsUsed(DiagnosticChain chain, Map context) {
		if (EcoreUtils.getInverse(this, ThreatAllocationRelation.class,
				TRADESPackage.eINSTANCE.getThreatAllocationRelation_Threat()).isEmpty()) {
			chain.add(new BasicDiagnostic(Diagnostic.WARNING, TRADESValidator.DIAGNOSTIC_SOURCE,
					TRADESValidator.THREAT__CHECK_IS_USED, "This threat is not allocated",
					new Object[] { this, TRADESPackage.eINSTANCE.getThreatAllocationRelation_Threat() }));
			return false;
		}
		return true;
	}

}
