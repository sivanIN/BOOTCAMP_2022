package day3assignment2;

public class Employee {

	private String name;

	private String emailID;

	private String address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String emailID, String address) {
		super();
		this.name = name;
		this.emailID = emailID;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", emailID=" + emailID + ", address=" + address + "]";
	}



}
