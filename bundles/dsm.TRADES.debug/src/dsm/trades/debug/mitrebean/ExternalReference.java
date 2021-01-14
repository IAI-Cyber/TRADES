package dsm.trades.debug.mitrebean;

public class ExternalReference {

	private String source_name;

	private String url;

	private String external_id;

	public ExternalReference() {
	}

	public ExternalReference(String source_name, String url, String external_id) {
		super();
		this.source_name = source_name;
		this.url = url;
		this.external_id = external_id;
	}

	public String getSource_name() {
		return source_name;
	}

	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getExternal_id() {
		return external_id;
	}

	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}

}
