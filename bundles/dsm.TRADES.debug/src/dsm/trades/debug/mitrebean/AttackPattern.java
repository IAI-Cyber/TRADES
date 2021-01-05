package dsm.trades.debug.mitrebean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "id", "spec_version" })
public class AttackPattern {

	private List<MitreObject> objects;

	private String type;

	public List<MitreObject> getObjects() {
		return objects;
	}

	public void setObjects(List<MitreObject> objects) {
		this.objects = objects;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
