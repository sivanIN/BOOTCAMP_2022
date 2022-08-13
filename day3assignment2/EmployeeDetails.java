package day3assignment2;

public class EmployeeDetails {

	public static void main(String[] args) {

		Salaried_Employee salaried_Employee = new Salaried_Employee(10000);
		System.out.println("Annual Salary="+ salaried_Employee.annualSalary()); 

		Hourly_Employee hourly_Employee = new Hourly_Employee("Ravi", "Ravi@gmail.com", "Raviillam", 2, 120);
		System.out.println(hourly_Employee.toString()+"\n"+"Hourly salary= "+hourly_Employee.hourlySalary(hourly_Employee.getPay_per_hour(), hourly_Employee.getNo_of_hours()));

	}

}
