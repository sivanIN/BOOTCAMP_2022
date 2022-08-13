package day2;

public class BankCustomerDetails {

	public static void main(String[] args) {
		
		BankCustomer bankCustomer = new BankCustomer("icic",10000000,"current" ,61);
		System.out.println(bankCustomer);
		BankCustomerDetails bankCustomerDetails = new BankCustomerDetails();
		System.out.println("Interest per annum: "+ bankCustomerDetails.calculateInterestRate(bankCustomer)); 

	}

	public double calculateInterestRate(BankCustomer bankCustomer) {

		double simpleInterest = 0;

		if(bankCustomer.getAccountType() == "saving") {
			if(bankCustomer.getAmountDeposited() < 5000000) {
				simpleInterest = (bankCustomer.getAmountDeposited() * 1 * 3.00) / 100;
			}else {
				simpleInterest = (bankCustomer.getAmountDeposited() * 1 * 3.50) / 100;
			}
		}else {
			if(bankCustomer.getAmountDeposited() < 20000000 && bankCustomer.getAge() >= 60) {
				simpleInterest = (bankCustomer.getAmountDeposited() * 1 * 3.25) / 100;
			}else {
				simpleInterest = (bankCustomer.getAmountDeposited() * 1 * 3.50) / 100;
			}

		}
		return simpleInterest;
	}
}
