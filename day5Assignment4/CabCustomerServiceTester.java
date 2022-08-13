package day5Assignment4;

import java.util.Scanner;

public class CabCustomerServiceTester {
	public static void main(String[] args) {
		//		CabCustomer cabCustomer = new CabCustomer(101,"Ravi","Thevara","Highcourt",4,808924150);
		//		CabCustomer cabCustomer2 = new CabCustomer(101,"Ravi","Thevara","Highcourt",4,808924150);
		//		CabCustomer cabCustomer3 = new CabCustomer(101,"Ravi","Thevara","Highcourt",4,974556789);
		//		CabCustomer cabCustomer4 = new CabCustomer(101,"Ravi","Thevara","Highcourt",10,808924150);
		//		cabCustomerService.addCabCustomer(cabCustomer);
		//		cabCustomerService.addCabCustomer(cabCustomer2);

		CabCustomerService cabCustomerService = new CabCustomerService();

		for(int i = 0;i<4;i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter Name= ");
			String name = scanner.nextLine();
			System.out.print("Enter pick up location= ");
			String pickUpLocation = scanner.nextLine();
			System.out.print("Enter drop location= ");
			String dropLocation = scanner.nextLine();
			System.out.print("Enter distance to travel= ");
			int distance = scanner.nextInt();
			System.out.print("Enter phone number= ");
			long phoneNumber = scanner.nextLong();
			CabCustomer cabCustomer = new CabCustomer(name,pickUpLocation,dropLocation,distance,phoneNumber);
			System.out.println(cabCustomerService.printBill(cabCustomer));

		}



	}

}
