package day4Assignment3;

public class Account {
	
	 private static int accountNumbergen = 999567812;
	 private int accountNumber;
	 private String name;
	 private String address;
	 
	 
	public Account( String name, String address) {
       
		this.accountNumber = accountNumbergen++;
		this.name = name;
		this.address = address;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static long getAccountNumbergen() {
		return accountNumbergen;
	}
	public static void setAccountNumbergen(int accountNumbergen) {
		Account.accountNumbergen = accountNumbergen;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", address=" + address + "]";
	}
	 
	 
	 
	  

}
