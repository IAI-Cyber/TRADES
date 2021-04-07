package dsm.oscal.model.transform;

import java.util.UUID;

import dsm.oscal.model.OscalMetadata.UUIDElement;

public class MigrationUtils {

	public static void setUUID(UUID id, UUIDElement element) {
		if (id != null) {
			element.setUuid(id);
		} else {
			element.setUuid(UUID.randomUUID());
		}
	}

}
