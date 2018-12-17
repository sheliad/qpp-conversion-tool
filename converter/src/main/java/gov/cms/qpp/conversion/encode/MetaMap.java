package gov.cms.qpp.conversion.encode;

public class MetaMap {

	public String encodeLabel;
	public String nsuri;
	public String template;
	public String path;
	public String line;
	public String column;

	/*
	 * metaMap.put("encodeLabel", encodeLabel);
		metaMap.put("nsuri", node.getDefaultNsUri());
		metaMap.put("template", node.getType().name());
		metaMap.put("path", node.getOrComputePath());
		if (node.getLine() != Node.DEFAULT_LOCATION_NUMBER) {
			metaMap.put("line", String.valueOf(node.getLine()));
		}
		if (node.getColumn() != Node.DEFAULT_LOCATION_NUMBER) {
			metaMap.put("column", String.valueOf(node.getColumn()));
		}
	 */

	public MetaMap() {
	}

	public MetaMap(MetaMap clone) {
		this.encodeLabel = clone.encodeLabel;
		this.nsuri = clone.nsuri;
		this.template = clone.template;
		this.path = clone.path;
		this.line = clone.line;
		this.column = clone.column;
	}

}
