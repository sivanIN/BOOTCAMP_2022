package JDNCAssignment;

import java.sql.Date;

public class Product {


	private int product_id; 
	private String product_name; 
	private String description;
	private int units_in_stock; 
	private float unit_price; 
	private String image_url;
	private java.sql.Date date_created ;
	private java.sql.Date date_last_updated ;
	private int category_id;
	
	private Category category;






	public Product(int product_id, String product_name, String description, int units_in_stock, float unit_price,
			String image_url, java.sql.Date date_created, java.sql.Date date_last_updated, int category_id ) {
		
		this.product_id = product_id;
		this.product_name = product_name;
		this.description = description;
		this.units_in_stock = units_in_stock;
		this.unit_price = unit_price;
		this.image_url = image_url;
		this.date_created = date_created;
		this.date_last_updated = date_last_updated;
		this.category_id = category_id;
	
	}







	public Product(int product_id, String product_name, String description, int units_in_stock, float unit_price,
			String image_url, java.sql.Date date_created, java.sql.Date date_last_updated, int category_id, Category category) {
		
		
	    this(product_id,  product_name, description,  units_in_stock,  unit_price,
			 image_url,  date_created,  date_last_updated,  category_id);
//		this.product_id = product_id;
//		this.product_name = product_name;
//		this.description = description;
//		this.units_in_stock = units_in_stock;
//		this.unit_price = unit_price;
//		this.image_url = image_url;
//		this.date_created = date_created;
//		this.date_last_updated = date_last_updated;
//		this.category_id = category_id;
		this.category = category;
	}







	public int getProduct_id() {
		return product_id;
	}



	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}



	public String getProduct_name() {
		return product_name;
	}



	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getUnits_in_stock() {
		return units_in_stock;
	}



	public void setUnits_in_stock(int units_in_stock) {
		this.units_in_stock = units_in_stock;
	}



	public float getUnit_price() {
		return unit_price;
	}



	public void setUnit_price(float unit_price) {
		this.unit_price = unit_price;
	}



	public String getImage_url() {
		return image_url;
	}



	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}



	public java.sql.Date getDate_created() {
		return date_created;
	}



	public void setDate_created(java.sql.Date date_created) {
		this.date_created = date_created;
	}



	public java.sql.Date getDate_last_updated() {
		return date_last_updated;
	}



	public void setDate_last_updated(java.sql.Date date_last_updated) {
		this.date_last_updated = date_last_updated;
	}



	public int getCategory_id() {
		return category_id;
	}



	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}







	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", description=" + description
				+ ", units_in_stock=" + units_in_stock + ", unit_price=" + unit_price + ", image_url=" + image_url
				+ ", date_created=" + date_created + ", date_last_updated=" + date_last_updated + ", category_id="
				+ category_id + " category_name:" + category.getCategory_name();
	}



//	@Override
//	public String toString() {
//		return "product_id=" + product_id + ", product_name=" + product_name + ", description=" + description
//				+ ", units_in_stock=" + units_in_stock + ", unit_price=" + unit_price + ", image_url=" + image_url
//				+ ", category_id=" + category_id  + " category_name=" + category.getCategory_name();
//	}
	
	





}
