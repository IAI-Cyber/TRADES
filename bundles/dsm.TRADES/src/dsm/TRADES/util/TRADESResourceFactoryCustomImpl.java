package dsm.TRADES.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;

import dsm.TRADES.migration.BaseResourceExtendedMetadata;
import dsm.TRADES.migration.BaseResourceHandler;

public class TRADESResourceFactoryCustomImpl extends TRADESResourceFactoryImpl {
	@Override
	public Resource createResource(URI uri) {
		
		
		BasicExtendedMetaData extendedMetaData = new BaseResourceExtendedMetadata();

		TRADESResourceCustomImpl result = new TRADESResourceCustomImpl(uri);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		XMLResource.ResourceHandler resourceHandler = new BaseResourceHandler();
		result.getDefaultLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_RESOURCE_HANDLER, resourceHandler);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_RESOURCE_HANDLER, resourceHandler);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		
		
		return result;
	}
}
