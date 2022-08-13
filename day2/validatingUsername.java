package day2;

import java.util.Scanner;

public class validatingUsername {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String usernames = sc.nextLine();


		validatingUsername obj = new validatingUsername();
		System.out.println(obj.validatePatter(usernames));
	}


	public String validatePatter(String username) {


		String regex = "^[a-zA-Z][a-zA-Z0-9_]{8,30}$";


		if (username.matches(regex)) {
			return "Valid";
		}
		else {
			return "Inavlid";
		}
	}

}
