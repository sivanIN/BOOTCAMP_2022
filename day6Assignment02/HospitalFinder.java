package day6Assignment02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HospitalService hospitalService = new HospitalService();
		List<String> listOfTreatments = new ArrayList<>(6);


		System.out.println("Enter Number of treatment in hospital");
		int numberOfTreatments = scanner.nextInt();
		System.out.println("Enter the treatment (each treatment by space)");
		for (int i = 0; i < numberOfTreatments; i++) {
			listOfTreatments.add(i,scanner.next());
		}
		System.out.println("Number of hospital to be added in database)");
		int numberOfHospitals = scanner.nextInt();
		scanner.nextLine();  
		for(int i = 0; i< numberOfHospitals; i++) {
			System.out.println("Enter name of the hospital");
			String hospital_name = scanner.nextLine();


			System.out.println("Enter contact person name");
			String contact_person_name = scanner.nextLine();

			System.out.println("Enter Phone number of hospital");
			String phone_number = scanner.nextLine();

			System.out.println("Enter location of hospital");
			String hospital_loction = scanner.nextLine();
			hospitalService.addHospital(new Hospital(hospital_name,listOfTreatments,contact_person_name,phone_number,hospital_loction));
		}

		System.out.println("list of hospitals: " + hospitalService.getHospitals());

		try {
			System.out.print("Enter hospital code to get details of hospital: ");
			int hsopital_code = scanner.nextInt();
			System.out.println(hospitalService.getHospitalDetails(hsopital_code));

		}catch(HosiptalDetailsNotFoundException e) {
			e.printStackTrace();
		}

	}

}
