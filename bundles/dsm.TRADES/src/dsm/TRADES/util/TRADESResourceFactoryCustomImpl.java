package dsm.TRADES.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class TRADESResourceFactoryCustomImpl extends TRADESResourceFactoryImpl {
	@Override
	public Resource createResource(URI uri) {
		return new TRADESResourceCustomImpl(uri);
	}
}
