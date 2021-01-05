package dsm.trades.debug.mitrebean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "id", "spec_version", "type" })
public class DomainAttacks {
	private List<MitreObject> objects;

	public void setObjects(List<MitreObject> objects) {
		this.objects = objects;
	}

	public List<MitreObject> getObjects() {
		return objects;
	}

}
