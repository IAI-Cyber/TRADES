package dsm.trades.debug.mitrebean;

import java.util.List;

public class MitreObject {

	private String type;
	private String id;
	private String name;
	private boolean revoked;
	private String description;
	private List<String> x_mitre_platforms;
	private String target_ref;
	private String source_ref;
	private String relationship_type;

	private List<ExternalReference> external_references;

	public String getType() {
		return type;
	}

	public String getRelationship_type() {
		return relationship_type;
	}

	public void setRelationship_type(String relationship_type) {
		this.relationship_type = relationship_type;
	}

	public String getTarget_ref() {
		return target_ref;
	}

	public void setTarget_ref(String target_ref) {
		this.target_ref = target_ref;
	}

	public String getSource_ref() {
		return source_ref;
	}

	public void setSource_ref(String source_ref) {
		this.source_ref = source_ref;
	}

	public String getDescription() {
		return description;
	}

	public List<String> getX_mitre_platforms() {
		return x_mitre_platforms;
	}

	public void setX_mitre_platforms(List<String> x_mitre_platforms) {
		this.x_mitre_platforms = x_mitre_platforms;
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
