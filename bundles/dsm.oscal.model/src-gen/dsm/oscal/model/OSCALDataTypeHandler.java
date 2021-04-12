	
/**
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
 */

package dsm.oscal.model;

import gov.nist.secauto.metaschema.datatypes.adapter.types.DateTimeWithTZAdapter;
import gov.nist.secauto.metaschema.datatypes.adapter.types.MarkupLineAdapter;
import gov.nist.secauto.metaschema.datatypes.adapter.types.UriAdapter;
import gov.nist.secauto.metaschema.datatypes.adapter.types.DateTimeAdapter;
import gov.nist.secauto.metaschema.datatypes.adapter.types.DateAdapter;
import gov.nist.secauto.metaschema.datatypes.adapter.types.UuidAdapter;
import gov.nist.secauto.metaschema.datatypes.adapter.types.UriReferenceAdapter;
import gov.nist.secauto.metaschema.datatypes.adapter.types.DateWithTZAdapter;
import gov.nist.secauto.metaschema.datatypes.adapter.types.Base64Adapter;
import gov.nist.secauto.metaschema.datatypes.adapter.types.MarkupMultilineAdapter;
import gov.nist.secauto.metaschema.datatypes.adapter.types.Ipv4AddressAdapter;
import gov.nist.secauto.metaschema.datatypes.adapter.types.IPv6AddressAdapter;
import java.lang.String;

public class OSCALDataTypeHandler {
	
	public static final OSCALDataTypeHandler INSTANCE = new dsm.oscal.model.OSCALDataTypeHandlerCustomImpl();
	
	private static DateTimeWithTZAdapter adapterDateTimeWithTzType = new DateTimeWithTZAdapter();
	private static MarkupLineAdapter adapterMarkupLineType = new MarkupLineAdapter();
	private static UriAdapter adapterUriType = new UriAdapter();
	private static DateTimeAdapter adapterDateTimeType = new DateTimeAdapter();
	private static DateAdapter adapterDateType = new DateAdapter();
	private static UuidAdapter adapterUuidType = new UuidAdapter();
	private static UriReferenceAdapter adapterUriReferenceType = new UriReferenceAdapter();
	private static DateWithTZAdapter adapterDateWithTzType = new DateWithTZAdapter();
	private static Base64Adapter adapterBase64Type = new Base64Adapter();
	private static MarkupMultilineAdapter adapterMarkupMultilineType = new MarkupMultilineAdapter();
	private static Ipv4AddressAdapter adapterIpV4AddressType = new Ipv4AddressAdapter();
	private static IPv6AddressAdapter adapterIpV6AddressType = new IPv6AddressAdapter();
	
	
	/**
	* @generated
	*/
	public String saveDateTimeWithTzTypeToString(java.time.ZonedDateTime value){
		return adapterDateTimeWithTzType.asString(value);
	}
	
	/**
	* @generated
	*/
	public java.time.ZonedDateTime loadDateTimeWithTzTypeFromString(String value){
		if(value == null){
			return null;
		}
		try {
			return adapterDateTimeWithTzType.parse(value);
		} catch (java.lang.Exception e){
			dsm.oscal.model.OSCALModelActivator.logError("Unable to parse data type DateTimeWithTzType", e);
			return null;
		}
	}
	
	/**
	* @generated
	*/
	public String saveMarkupLineTypeToString(gov.nist.secauto.metaschema.datatypes.markup.MarkupLine value){
		return adapterMarkupLineType.asString(value);
	}
	
	/**
	* @generated
	*/
	public gov.nist.secauto.metaschema.datatypes.markup.MarkupLine loadMarkupLineTypeFromString(String value){
		if(value == null){
			return null;
		}
		try {
			return adapterMarkupLineType.parse(value);
		} catch (java.lang.Exception e){
			dsm.oscal.model.OSCALModelActivator.logError("Unable to parse data type MarkupLineType", e);
			return null;
		}
	}
	
	
	
	/**
	* @generated
	*/
	public String saveUriTypeToString(java.net.URI value){
		return adapterUriType.asString(value);
	}
	
	/**
	* @generated
	*/
	public java.net.URI loadUriTypeFromString(String value){
		if(value == null){
			return null;
		}
		try {
			return adapterUriType.parse(value);
		} catch (java.lang.Exception e){
			dsm.oscal.model.OSCALModelActivator.logError("Unable to parse data type UriType", e);
			return null;
		}
	}
	
	/**
	* @generated
	*/
	public String saveDateTimeTypeToString(gov.nist.secauto.metaschema.datatypes.DateTime value){
		return adapterDateTimeType.asString(value);
	}
	
	/**
	* @generated
	*/
	public gov.nist.secauto.metaschema.datatypes.DateTime loadDateTimeTypeFromString(String value){
		if(value == null){
			return null;
		}
		try {
			return adapterDateTimeType.parse(value);
		} catch (java.lang.Exception e){
			dsm.oscal.model.OSCALModelActivator.logError("Unable to parse data type DateTimeType", e);
			return null;
		}
	}
	
	/**
	* @generated
	*/
	public String saveDateTypeToString(gov.nist.secauto.metaschema.datatypes.Date value){
		return adapterDateType.asString(value);
	}
	
	/**
	* @generated
	*/
	public gov.nist.secauto.metaschema.datatypes.Date loadDateTypeFromString(String value){
		if(value == null){
			return null;
		}
		try {
			return adapterDateType.parse(value);
		} catch (java.lang.Exception e){
			dsm.oscal.model.OSCALModelActivator.logError("Unable to parse data type DateType", e);
			return null;
		}
	}
	
	/**
	* @generated
	*/
	public String saveUuidTypeToString(java.util.UUID value){
		return adapterUuidType.asString(value);
	}
	
	/**
	* @generated
	*/
	public java.util.UUID loadUuidTypeFromString(String value){
		if(value == null){
			return null;
		}
		try {
			return adapterUuidType.parse(value);
		} catch (java.lang.Exception e){
			dsm.oscal.model.OSCALModelActivator.logError("Unable to parse data type UuidType", e);
			return null;
		}
	}
	
	/**
	* @generated
	*/
	public String saveUriReferenceTypeToString(java.net.URI value){
		return adapterUriReferenceType.asString(value);
	}
	
	/**
	* @generated
	*/
	public java.net.URI loadUriReferenceTypeFromString(String value){
		if(value == null){
			return null;
		}
		try {
			return adapterUriReferenceType.parse(value);
		} catch (java.lang.Exception e){
			dsm.oscal.model.OSCALModelActivator.logError("Unable to parse data type UriReferenceType", e);
			return null;
		}
	}
	
	/**
	* @generated
	*/
	public String saveDateWithTzTypeToString(java.time.ZonedDateTime value){
		return adapterDateWithTzType.asString(value);
	}
	
	/**
	* @generated
	*/
	public java.time.ZonedDateTime loadDateWithTzTypeFromString(String value){
		if(value == null){
			return null;
		}
		try {
			return adapterDateWithTzType.parse(value);
		} catch (java.lang.Exception e){
			dsm.oscal.model.OSCALModelActivator.logError("Unable to parse data type DateWithTzType", e);
			return null;
		}
	}
	
	/**
	* @generated
	*/
	public String saveBase64TypeToString(gov.nist.secauto.metaschema.datatypes.Base64 value){
		return adapterBase64Type.asString(value);
	}
	
	/**
	* @generated
	*/
	public gov.nist.secauto.metaschema.datatypes.Base64 loadBase64TypeFromString(String value){
		if(value == null){
			return null;
		}
		try {
			return adapterBase64Type.parse(value);
		} catch (java.lang.Exception e){
			dsm.oscal.model.OSCALModelActivator.logError("Unable to parse data type Base64Type", e);
			return null;
		}
	}
	
	/**
	* @generated
	*/
	public String saveMarkupMultilineTypeToString(gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline value){
		return adapterMarkupMultilineType.asString(value);
	}
	
	/**
	* @generated
	*/
	public gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline loadMarkupMultilineTypeFromString(String value){
		if(value == null){
			return null;
		}
		try {
			return adapterMarkupMultilineType.parse(value);
		} catch (java.lang.Exception e){
			dsm.oscal.model.OSCALModelActivator.logError("Unable to parse data type MarkupMultilineType", e);
			return null;
		}
	}
	
	/**
	* @generated
	*/
	public String saveIpV4AddressTypeToString(gov.nist.secauto.metaschema.datatypes.IPv4 value){
		return adapterIpV4AddressType.asString(value);
	}
	
	/**
	* @generated
	*/
	public gov.nist.secauto.metaschema.datatypes.IPv4 loadIpV4AddressTypeFromString(String value){
		if(value == null){
			return null;
		}
		try {
			return adapterIpV4AddressType.parse(value);
		} catch (java.lang.Exception e){
			dsm.oscal.model.OSCALModelActivator.logError("Unable to parse data type IpV4AddressType", e);
			return null;
		}
	}
	
	/**
	* @generated
	*/
	public String saveIpV6AddressTypeToString(gov.nist.secauto.metaschema.datatypes.IPv6 value){
		return adapterIpV6AddressType.asString(value);
	}
	
	/**
	* @generated
	*/
	public gov.nist.secauto.metaschema.datatypes.IPv6 loadIpV6AddressTypeFromString(String value){
		if(value == null){
			return null;
		}
		try {
			return adapterIpV6AddressType.parse(value);
		} catch (java.lang.Exception e){
			dsm.oscal.model.OSCALModelActivator.logError("Unable to parse data type IpV6AddressType", e);
			return null;
		}
	}
	
}
