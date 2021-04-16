/**
 * 
 *  Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *      ELTA Ltd - initial API and implementation
 *  
 * 
 */
package dsm.oscal.ext.sirius.lib;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import gov.nist.secauto.metaschema.datatypes.Date;
import gov.nist.secauto.metaschema.datatypes.DateTime;

public class DateService {

	private static final DateTimeFormatter ISO_DATE_TIME = DateTimeFormatter.ISO_DATE_TIME;

	public String getDate(EObject owner, String featureName) {

		EStructuralFeature feature = owner.eClass().getEStructuralFeature(featureName);
		if (feature instanceof EAttribute) {
			EAttribute attr = (EAttribute) feature;
			EDataType type = attr.getEAttributeType();
			if (!attr.isMany() && type != null) {
				Object value = owner.eGet(feature);
				if (value == null) {
					return "";
				}
				String instanceClassName = type.getInstanceClassName();
				if (DateTime.class.getName().equals(instanceClassName)) {
					ZonedDateTime zdt = ((DateTime) value).getValue();
					if (zdt != null) {
						return zdt.format(ISO_DATE_TIME);
					}
				} else if (ZonedDateTime.class.getName().equals(instanceClassName)) {
					return ((ZonedDateTime) value).format(ISO_DATE_TIME);
				} else if (Date.class.getName().equals(instanceClassName)) {
					ZonedDateTime zdt = ((Date) value).getValue();
					if (zdt != null) {
						return zdt.format(ISO_DATE_TIME);
					}
				}
			}
			return "";
		} else {
			throw new IllegalStateException("Invalid feature " + featureName + " on " + owner.eClass().getName());
		}
	}

	public void setDate(EObject owner, String featureName, String value) {
		EStructuralFeature feature = owner.eClass().getEStructuralFeature(featureName);
		if (feature instanceof EAttribute) {
			EAttribute attr = (EAttribute) feature;
			if (value == null || value.isBlank()) {
				owner.eSet(feature, null);
			} else {
				EDataType type = attr.getEAttributeType();
				String instanceClassName = type.getInstanceClassName();
				ZonedDateTime date = ZonedDateTime.parse(value, ISO_DATE_TIME);
				if (DateTime.class.getName().equals(instanceClassName)) {
					owner.eSet(feature, new DateTime(date, true));
				} else if (ZonedDateTime.class.getName().equals(instanceClassName)) {
					owner.eSet(feature, date);
				} else if (Date.class.getName().equals(instanceClassName)) {
					owner.eSet(feature, new Date(date, true));
				}
			}
		} else {
			throw new IllegalStateException("Invalid feature " + featureName + " on " + owner.eClass().getName());
		}
	}

}
