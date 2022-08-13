
public class Employee {

	
	   private int emp_id;
	   private String emp_name;
	   private String emp_dep;
	   private int salary;
	   private int annualSalary;
	   
	   
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int emp_id, String emp_name, String emp_dep, int salary, int annualSalary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_dep = emp_dep;
		this.salary = salary;
		this.annualSalary = annualSalary;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public String getEmp_dep() {
		return emp_dep;
	}


	public void setEmp_dep(String emp_dep) {
		this.emp_dep = emp_dep;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getAnnualSalary() {
		return annualSalary;
	}


	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_dep=" + emp_dep + ", salary=" + salary
				+ ", annualSalary=" + annualSalary + "]";
	}
	
	
	   
	   
	   
}
