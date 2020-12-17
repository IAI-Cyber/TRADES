package dsm.TRADES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public final class SemanticHelper {

	private SemanticHelper() {
	}

	public static List<Control> getAllControls(AbstractControlOwner owner) {
		ControlOwner cOwner = owner.getControlOwner();
		if (cOwner == null) {
			return Collections.emptyList();
		}

		List<Control> result = new ArrayList<Control>();

		Optional.ofNullable(cOwner.getInternal()).ifPresent(t -> result.addAll(t.getControls()));
		Optional.ofNullable(cOwner.getExternal()).ifPresent(t -> result.addAll(t.getControls()));
		return result;
	}
}
