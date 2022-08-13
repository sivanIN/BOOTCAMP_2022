import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDEMO {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/NPCI","root","sivan");
	
	if(connect != null)
		System.out.println("Connection Estabilished");
	
      Statement sts = connect.createStatement();
      
      ResultSet r = sts.executeQuery("select * from Employee");
      
      System.out.println("EMp_ID\tName\tDEP\tSalary\tAnnualSalary");
      while(r.next()) {
    	  System.out.println(r.getInt(1) + "\t" + r.getString(2) + "\t" +r.getString(3) + "\t" + r.getInt(4) + "\t" +r.getInt(5));
      }
      r.close();
      sts.close();
      connect.close();
	}

}




