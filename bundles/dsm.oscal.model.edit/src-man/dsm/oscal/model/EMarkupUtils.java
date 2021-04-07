package dsm.oscal.model;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

public class EMarkupUtils {

	public static String toSimpleLabel(MarkupLine value) {
		if (value == null) {
			return "";
		}
		return value.toMarkdown();
	}

	public static String toSimpleLabel(MarkupMultiline value) {
		if (value == null) {
			return "";
		}
		return value.toMarkdown();
	}
}
