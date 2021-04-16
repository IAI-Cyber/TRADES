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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

public class OscalWidgetUtil {

	public static void setMarkupAttribute(EObject owner, String featureName, String value) {
		EStructuralFeature feature = owner.eClass().getEStructuralFeature(featureName);
		if (feature instanceof EAttribute) {
			EAttribute attr = (EAttribute) feature;
			if (!attr.isMany() && attr.getEAttributeType() != null
					&& MarkupLine.class.getName().equals(attr.getEAttributeType().getInstanceClassName())) {
				owner.eSet(feature, MarkupLine.fromMarkdown(value));
			} else if (!attr.isMany() && attr.getEAttributeType() != null
					&& MarkupMultiline.class.getName().equals(attr.getEAttributeType().getInstanceClassName())) {
				owner.eSet(feature, MarkupMultiline.fromMarkdown(value));
			}
		}
	}

	public static String getMarkupAttribute(EObject owner, String featureName) {
		EStructuralFeature feature = owner.eClass().getEStructuralFeature(featureName);
		if (feature instanceof EAttribute) {
			EAttribute attr = (EAttribute) feature;
			if (!attr.isMany() && attr.getEAttributeType() != null
					&& MarkupLine.class.getName().equals(attr.getEAttributeType().getInstanceClassName())) {
				Object value = owner.eGet(feature);
				if (value instanceof MarkupLine) {
					return ((MarkupLine) value).toMarkdown();
				}
			} else if (!attr.isMany() && attr.getEAttributeType() != null
					&& MarkupMultiline.class.getName().equals(attr.getEAttributeType().getInstanceClassName())) {
				Object value = owner.eGet(feature);
				if (value instanceof MarkupMultiline) {
					return ((MarkupMultiline) value).toMarkdown();

				}
			}
		}
		return null;
	}

	public static String getHTML(EObject owner, String featureName) {
		EStructuralFeature feature = owner.eClass().getEStructuralFeature(featureName);
		if (feature instanceof EAttribute) {
			EAttribute attr = (EAttribute) feature;
			if (!attr.isMany() && attr.getEAttributeType() != null
					&& MarkupLine.class.getName().equals(attr.getEAttributeType().getInstanceClassName())) {
				Object value = owner.eGet(feature);
				if (value instanceof MarkupLine) {
					return ((MarkupLine) value).toHtml();
				}
			} else if (!attr.isMany() && attr.getEAttributeType() != null
					&& MarkupMultiline.class.getName().equals(attr.getEAttributeType().getInstanceClassName())) {
				Object value = owner.eGet(feature);
				if (value instanceof MarkupMultiline) {
					return ((MarkupMultiline) value).toHtml();

				}
			}
		}
		return null;
	}

}
