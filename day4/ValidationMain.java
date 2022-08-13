package day4;

import java.util.Scanner;

public class ValidationMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("UserName= ");
		String username = scanner.next();
		System.out.print("Password= ");
		String password = scanner.next();
		Validation validation = new Validation(username,password);
		System.out.println(validation.userValidation()); 
	}

}
