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
