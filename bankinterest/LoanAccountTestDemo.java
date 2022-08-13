package bankinterest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanAccountTestDemo {

	@Test
	void repaytest() {
		LoanAccount loanAccount = new LoanAccount();
		
		
		LoanAccount loanAccounttest = new LoanAccount("siva","ayyan",808910254);
		LoanAccount loanAccounttest2 = new LoanAccount("ram","ravi",808910254);
		loanAccount.loanAccount_list.add(loanAccounttest);
		loanAccount.loanAccount_list.add(loanAccounttest2);
		System.out.println(loanAccount.loanAccount_list.size());
		
		
//		loanAccount.createAccount(loanAccounttest);
		System.out.println(loanAccounttest2.getLoanAmount());
        long accountNumber = loanAccounttest2.getAccountNumber();
        System.out.println(accountNumber);
		boolean loanamount = loanAccounttest.repay(100,12456789651134l,"12-08-2020");
//		System.out.println(loanamount);
		assertEquals(true, loanamount);

	}
	

	
	
	


}
