package day3assignment1;

public class Customer {
	static int custIdgen = 100;
	private int custID; 
	private String  custName;
	private String address;
	private String payment;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer( String custName, String address, String payment) {
		this.custID = custIdgen++;
		this.custName = custName;
		this.address = address;
		this.payment = payment;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", address=" + address + ", payment=" + payment
				+ "]";
	}




}
