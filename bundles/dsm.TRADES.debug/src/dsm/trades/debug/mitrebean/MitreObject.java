package dsm.trades.debug.mitrebean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "spec_version", "modified", "created", "object_marking_refs", "created_by_ref",
		"kill_chain_phases", "x_mitre_version" })
public class MitreObject {

	private String type;
	private String id;
	private String name;
	private boolean revoked;
	private String description;

	private List<ExternalReference> external_references;

	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isRevoked() {
		return revoked;
	}

	public void setRevoked(boolean revoked) {
		this.revoked = revoked;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ExternalReference> getExternal_references() {
		return external_references;
	}

	public void setExternal_references(List<ExternalReference> external_references) {
		this.external_references = external_references;
	}

}
