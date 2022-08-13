package day4Assignment3;

public class SavingsAccount  extends Account{

	private double  balance;


	public float deposit(float amount ,float savingbalance) {
		balance = savingbalance  + amount;
		return (float) balance;
	}
	
	public String withdraw(float amount, float savingbalance) {
		if(savingbalance >= amount) {
			balance = savingbalance  - amount;
			return  balance +"";
		}else {
			return "Insufficient balance";
		}
			
	}

	public SavingsAccount(String name, String address) {
		super(name, address);
		
	}



	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = 0;
	} 

}
