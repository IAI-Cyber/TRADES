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

}
