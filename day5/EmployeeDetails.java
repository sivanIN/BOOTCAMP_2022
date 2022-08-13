package day5;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee employee = new Employee(101, "Ravi", 30000);
		Employee employee2 = new Employee(102, "Ram", 10000);
		Employee employee3 = new Employee(102, "Riya", 5000);

		ArrayList<Employee> employee_list = new ArrayList<Employee>();
		ArrayList<Employee> fresh_employee_list = new ArrayList<Employee>();


		employee_list.add(employee);
		employee_list.add(employee2);
		employee_list.add(employee3);


		// We can remove add at time using for or for each loop

		Iterator<Employee> e = employee_list.iterator();
		while(e.hasNext()) {
			Employee i = e.next();
			if(i.getSalary() < 20000) {
				e.remove();
				fresh_employee_list.add((i));
			}
		}

		System.out.println(employee_list);
		System.out.println(fresh_employee_list);

	}

}
