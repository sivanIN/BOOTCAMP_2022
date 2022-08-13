package day4Assignment3;

import java.sql.SQLException;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Account account = new Account("Sivan","Thevra");
		LoanAccount loanAccount = new LoanAccount("Ramya", "Palakadd");
		JdbcConnection jdbcConnection = new JdbcConnection();
		jdbcConnection.addLoanAccount(loanAccount);

		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the account number: ");
	    int loanaccountnumber = scanner.nextInt();
	    float loanAmount = jdbcConnection.getloanAmount(loanaccountnumber); 
	    System.out.println(loanAmount);
	    System.out.println("Amount  to Borrow");
	    float amountBorrow = scanner.nextFloat();
	    float loanamountbalance = loanAccount.borrow(amountBorrow, loanAmount);
	    jdbcConnection.updateLoanAccount(loanamountbalance, loanaccountnumber);
	    System.out.println("amount borrow successfuly");

	    System.out.println("Amount  to repay");
	    float amountRepay = scanner.nextFloat();
	    System.out.println("Enter the account number: ");
	    loanaccountnumber = scanner.nextInt();
	    loanAmount = jdbcConnection.getloanAmount(loanaccountnumber); //2000
	    String loanamountrepaybalance = loanAccount.repay(amountRepay, loanAmount);
	    jdbcConnection.updateLoanAccount(Float.parseFloat(loanamountrepaybalance), loanaccountnumber);
	    
	    System.out.println("amount repay successfuly");
	    

//		SavingsAccount savingsAccount = new SavingsAccount("Rahul","tvm");
//		jdbcConnection.addSavingsAccount(savingsAccount);
//	    
//	    System.out.println("Enter the account number: ");
//	    int savingaccountnumber = scanner.nextInt();
//	    float savingBalance = jdbcConnection.getSavingBalance(savingaccountnumber);
//	    System.out.println("Amount  to Deposit");
//	    float amountDeposit = scanner.nextFloat();
//	    savingBalance = savingsAccount.deposit(amountDeposit,savingBalance);
//	    jdbcConnection.updateSavingsAccount(savingBalance, savingaccountnumber);
//	    
//	    System.out.println("amount deposit successfuly");
//	    
//	    System.out.println("Enter the account number: ");
//	    savingaccountnumber = scanner.nextInt();
//	    savingBalance = jdbcConnection.getSavingBalance(savingaccountnumber);
//	    System.out.println("Amount  to withdraw");
//	    float amountwithdraw = scanner.nextFloat();
//	    String savingBalanceafterwitdraw = savingsAccount.withdraw(amountwithdraw,savingBalance);
//	    jdbcConnection.updateSavingsAccount(Float.parseFloat(savingBalanceafterwitdraw), savingaccountnumber);
//	    
//	    System.out.println("amount withdraw successfuly");
//	  
		
	    
		
		
		
	}

}
