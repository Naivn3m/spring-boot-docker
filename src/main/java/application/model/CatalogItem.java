package application.model;

public class CatalogItem {

	private String instID;
	private String name;
	private String rating;
	private String info;
	public CatalogItem(String instID, String name, String rating, String info) {
		super();
		this.instID = instID;
		this.name = name;
		this.rating = rating;
		this.info = info;
	}
	public String getInstID() {
		return instID;
	}
	public void setInstID(String instID) {
		this.instID = instID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
