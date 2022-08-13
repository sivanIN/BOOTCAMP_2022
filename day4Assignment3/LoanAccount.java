package day4Assignment3;

public class LoanAccount extends Account {
	
	private double loanAmount;
	

	public LoanAccount(String name, String address) {
		super(name, address);
		
	}
	

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = 0;
	}
	
	
	public float borrow(float amount , float loanamount) {
		
			loanAmount =  loanamount + amount ;
			return (float) loanAmount;
	
		}
		
	
	
	public String repay(float amount,float loanamount) {
		if(loanamount > amount) {
			loanAmount = loanamount - amount;
			return loanAmount + "";
		}else {
			return "Repayment amount is more than currentloanamount";
		}
	}

	@Override
	public String toString() {
		return "LoanAccount [loanAmount=" + loanAmount + "]";
	}
	
	
	
	

}
