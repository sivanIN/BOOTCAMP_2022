package day4Assignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JdbcConnection {

	public Connection createConections() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/NPCI","root","sivan");

		return connect;
	}

	public void addNewAccount(long accountNumber,String name,String address ) throws ClassNotFoundException, SQLException {


		Connection connect = createConections();
		PreparedStatement p = connect.prepareStatement("Insert into Accounts values(?,?,?)");
		p.setInt(1,(int) accountNumber);
		p.setString(2,name);
		p.setString(3, address);
		int executeQuery = p.executeUpdate();



		p.close();
		connect.close();




	}

	public String addLoanAccount(LoanAccount loanaccount) throws SQLException, ClassNotFoundException {

		Connection connect = createConections();
		PreparedStatement p = connect.prepareStatement("Insert into LoanAccount values(?,?)");

		long accountNumber = loanaccount.getAccountNumber();
		addNewAccount(accountNumber,loanaccount.getName(),loanaccount.getAddress());

		p.setInt(1,(int) accountNumber);
		p.setFloat(2,(float) loanaccount.getLoanAmount());


		int executeQuery = p.executeUpdate();


		p.close();
		connect.close();

		return executeQuery + " row is inserted";
	}

	public String addSavingsAccount(SavingsAccount savingsAccount) throws ClassNotFoundException, SQLException {
		Connection connect = createConections();
		PreparedStatement p = connect.prepareStatement("Insert into SavingsAccount values(?,?)");

		long accountNumber = savingsAccount.getAccountNumber();
		addNewAccount(accountNumber,savingsAccount.getName(),savingsAccount.getAddress());

		p.setInt(1,(int) accountNumber);
		p.setFloat(2,(float) savingsAccount.getBalance());


		int executeQuery = p.executeUpdate();


		p.close();
		connect.close();

		return executeQuery + " row is inserted";
	}

	public String updateLoanAccount(float amount, int accountnumber) throws SQLException, ClassNotFoundException {

		Connection connect = createConections();

		PreparedStatement p = connect.prepareStatement("update LoanAccount set loanAmount = ? where loanAccountNumber = ?");



		p.setFloat(1, amount);

		p.setInt(2, accountnumber);

		int i = p.executeUpdate();
		return i + "row inserted";


	}

	public float getloanAmount(int accountnumber) throws SQLException, ClassNotFoundException, InvalidAccountNumberException {
	
		float loanAmount =0;
		try {
		if(isvalidAccount(accountnumber) ) {
		Connection connect = createConections();
		Statement stmt = connect.createStatement();
		PreparedStatement p = connect.prepareStatement("select loanAmount from LoanAccount where loanAccountNumber = ?" );
		p.setInt(1, accountnumber);

		ResultSet r = p.executeQuery();
		


		while (r.next()) {
			loanAmount = r.getFloat(1);

		}
		p.close();
		r.close();

		connect.close();
		
		}
		}catch(InvalidAccountNumberException e) {
			e.printStackTrace();
		}
		return loanAmount;
	}
	
	public boolean isvalidAccount(int accountnumber) throws ClassNotFoundException, SQLException, InvalidAccountNumberException {
		Connection connect = createConections();
		Statement stmt = connect.createStatement();

		PreparedStatement p = connect.prepareStatement("select * from LoanAccount where loanAccountNumber = ?" );
		p.setInt(1, accountnumber);
		ResultSet r = p.executeQuery();
		
		
		while (r.next()) {
			if(accountnumber == r.getFloat(1)) {
				System.out.println(r.getFloat(1));
				return true;
			}

		}
		throw new InvalidAccountNumberException("Invalid Account number");
		
	}



	public String updateSavingsAccount(float amount, int accountnumber) throws SQLException, ClassNotFoundException {

		Connection connect = createConections();

		PreparedStatement p = connect.prepareStatement("update SavingsAccount set savingsbalance = ? where savingsAccountNumber = ?");



		p.setFloat(1, amount);

		p.setInt(2, accountnumber);

		int i = p.executeUpdate();
		return i + "row inserted";


	}

	public float getSavingBalance(int accountnumber) throws SQLException, ClassNotFoundException {
		Connection connect = createConections();

		PreparedStatement p = connect.prepareStatement("select savingsbalance from SavingsAccount where savingsAccountNumber = ?" );
		p.setInt(1, accountnumber);

		ResultSet r = p.executeQuery();
		float savingsbalance =0;


		while (r.next()) {
			savingsbalance = r.getFloat(1);

		}
		p.close();
		r.close();

		connect.close();
		return savingsbalance;
	}

}
