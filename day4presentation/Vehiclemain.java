package day4presentation;

public class Vehiclemain {
	
	public static void main(String[] args) {
		Vehicle suzuki = new Vehicle("Avenis",200, 50 );
		Vehicle royalEnfield = new Vehicle("Himalayan",300, 30 );
		int enginPower = suzuki.enginPower;
		System.out.println(suzuki);
		System.out.println(royalEnfield);
		System.out.println("Power of engine:" + enginPower);
		System.out.println(suzuki.performance());
		
	}

}
