import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudOperations {

	public Connection createConections() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/NPCI","root","sivan");
		
		return connect;
	}
	
	public String  insertEmployeeDetails(Employee e) throws ClassNotFoundException, SQLException {
		
		Connection connect = createConections();
		
		PreparedStatement p = connect.prepareStatement("Insert into Employee values(?,?,?,?,?)");
		p.setInt(1, e.getEmp_id());
		p.setString(2, e.getEmp_name());
		p.setString(3, e.getEmp_dep());
		p.setInt(4, e.getSalary());
		p.setInt(5, e.getAnnualSalary());
		
		int executeUpdate = p.executeUpdate();
		return executeUpdate + "row inserted";
	}
	
	public String  updateEmployeeName(int Emp_ID,String  name) throws ClassNotFoundException, SQLException {
		
		Connection connect = createConections();
		
		PreparedStatement p = connect.prepareStatement("update Employee set Emp_Name = ? where Emp_ID = ?");
		
		
		
		p.setString(1, name);
	
		p.setInt(2, Emp_ID);
		
		int i = p.executeUpdate();
		return i + "row inserted";
	}
}
