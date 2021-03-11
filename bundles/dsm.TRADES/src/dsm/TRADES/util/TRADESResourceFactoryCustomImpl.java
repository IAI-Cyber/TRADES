/******************************************************************************************************
* Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
* This program and the accompanying materials
* are made available under the terms of the Eclipse Public License 2.0
* which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-2.0/
* 
* SPDX-License-Identifier: EPL-2.0
* 
* Contributors:
*     ELTA Ltd - initial API and implementation
* 
*******************************************************************************************************/
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
