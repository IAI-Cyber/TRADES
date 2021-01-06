package dsm.TRADES.util;

import org.eclipse.emf.common.util.URI;

public class TRADESResourceCustomImpl extends TRADESResourceImpl {

	public TRADESResourceCustomImpl(URI uri) {
		super(uri);
	}

	@Override
	protected boolean useUUIDs() {
		return true;
	}

}
