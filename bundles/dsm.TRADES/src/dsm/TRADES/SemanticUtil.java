package dsm.TRADES;

public class SemanticUtil {

	public static <T extends Control> T addControl(AbstractControlOwner cmp, T control, boolean internal) {

		ControlOwner owner = cmp.getControlOwner();
		if (owner == null) {
			owner = TRADESFactory.eINSTANCE.createControlOwner();
			cmp.setControlOwner(owner);
		}
		if (internal) {
			owner.getInternals().add(control);
		} else {
			owner.getExternals().add(control);
		}

		return control;
	}

}
