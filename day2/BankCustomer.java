package day2;

public class BankCustomer {

	private String bankName;
	private double amountDeposited;
	private String accountType;
	private int age;
	public BankCustomer(String bankName, double amountDeposited, String accountType, int age) {
		super();
		this.bankName = bankName;
		this.amountDeposited = amountDeposited;
		this.accountType = accountType;
		this.age = age;
	}
	public BankCustomer() {
		super();
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public double getAmountDeposited() {
		return amountDeposited;
	}
	public void setAmountDeposited(double amountDeposited) {
		this.amountDeposited = amountDeposited;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "BankCustomer [bankName=" + bankName + ", amountDeposited=" + amountDeposited + ", accountType="
				+ accountType + ", age=" + age + "]";
	}

}
