package day3assignment1;

public class Order extends Customer {


	private int orderID;
	private String productName;
	private double quantity;
	private float unit_price;



	public Order(String custName, String address, String payment , int orderID, String productName, double quantity, float unit_price) {
		super(custName, address, payment);

		this.orderID = orderID;
		this.productName = productName;
		this.quantity = quantity;
		this.unit_price = unit_price;
	}



	public int getOrderID() {
		return orderID;
	}


	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getQuantity() {
		return quantity;
	}


	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}



	public float getUnit_price() {
		return unit_price;
	}


	public void setUnit_price(float unit_price) {
		this.unit_price = unit_price;
	}



	public double calculateBill(float unit_price,double quantity) {
		double billAmount;
		billAmount = unit_price * quantity ;
		return billAmount;
	}





	@Override
	public String toString() {
		return "Order [custID=" + getCustID() + ", custName=" + getCustName() +", Address=" + getAddress() + ", mode of payment:"+ getPayment() +", orderID=" + orderID + ", productName=" + productName + ", quantity="
				+ quantity + ", unit_price=" + unit_price + "]" ;
	}









}
