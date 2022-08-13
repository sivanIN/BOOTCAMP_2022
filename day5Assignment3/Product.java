package day5Assignment3;

public class Product {

	private static int product_idgen = 100;
	private int product_id; 
	private String product_name; 
	private int quantity; 
	private float price; 
	private String category;

	public Product(String product_name, int quantity, float price, String category)  {





		this.product_id = product_idgen++;
		this.product_name = product_name;
		this.quantity = quantity;
		this.price = price;
		this.category = category;

	}




	public static int getProduct_idgen() {
		return product_idgen;
	}

	public static void setProduct_idgen(int product_idgen) {
		Product.product_idgen = product_idgen;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "[product_id=" + product_id + ", product_name=" + product_name + ", quantity=" + quantity
				+ ", price=" + price + ", Category=" + category + "]";
	}







}
