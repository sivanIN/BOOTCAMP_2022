package day3assignment2;

public class Salaried_Employee extends Employee {
	
	private int montlySalary;

	public Salaried_Employee(int montlySalary) {
		this.montlySalary = montlySalary;
	}
	
	
	public int annualSalary() {
		
		int annualSalary = montlySalary * 12;
		return annualSalary;
	}


	@Override
	public String toString() {
		return "Salaried_Employee [montlySalary=" + montlySalary + "]";
	}
	
	
	

}
