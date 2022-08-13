import java.sql.SQLException;

public class MainClass {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	CrudOperations crudOperations = new CrudOperations();
	Employee employee = new Employee(101,"Rahul","admin",10000,120000);
	
//	System.out.println(crudOperations.insertEmployeeDetails(employee));
	System.out.println(crudOperations.updateEmployeeName(101,"Ravi"));
}
}
