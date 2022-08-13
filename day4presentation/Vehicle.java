package day4presentation;

public class Vehicle {

	public static int qrIdgen = 100;
	public int qrId;
	public int enginPower ;
	public int mileage;
	public String model;

	public String performance(){
		return "Good in mileage and build quality";
	}




	public Vehicle(String model ,int enginPower, int mileage) {
		
		this.qrId = qrIdgen++;
		this.enginPower = enginPower;
		this.mileage = mileage;
		this.model = model;
	}


	@Override
	public String toString() {
		return "Vehicle [qrId=" + qrId + ", enginPower=" + enginPower + ", mileage=" + mileage + ", model=" + model
				+ "]";
	}


	








}
