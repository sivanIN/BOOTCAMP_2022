package day3assignment2;

public class Hourly_Employee extends Employee {

	private int no_of_hours;

	private int pay_per_hour;




	public Hourly_Employee(String name, String emailID, String address ,int no_of_hours, int pay_per_hour) {
		super(name, emailID, address);
		this.no_of_hours = no_of_hours;
		this.pay_per_hour = pay_per_hour;
	}



	public int getNo_of_hours() {
		return no_of_hours;
	}

	public void setNo_of_hours(int no_of_hours) {
		this.no_of_hours = no_of_hours;
	}

	public int getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(int pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}


	public int hourlySalary(int pay_per_hour, int no_of_hour) {

		int salary = pay_per_hour * no_of_hour ;
		return salary;
	}


	@Override
	public String toString() {
		return "Hourly_Employee [Name="+ getName() + ", Email="+ getEmailID() +", Address="+ getAddress() +", no_of_hours=" + no_of_hours + ", pay_per_hour=" + pay_per_hour + "]";
	}




}
