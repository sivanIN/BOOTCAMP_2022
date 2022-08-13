package day2;

import java.util.Scanner;

public class EmailMasking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user EmailId");
		String mailid = sc.nextLine();

		EmailMasking emailMasking = new EmailMasking();
		System.out.println(emailMasking.maskMailID(mailid));
	}

	public String maskMailID(String mailid) {
		String regex = "^[a-z0-9._]+@[a-z]+\\.[a-z]{2,3}$";

		if(mailid.matches(regex)) {
			return mailid.replaceAll("(?<=.{2}).(?=[^@]*?@)", "*");
		}
		else {
			return "Email_Id is invalid";
		}

	}

}
