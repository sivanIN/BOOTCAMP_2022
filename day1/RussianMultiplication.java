//Assignment 17-03
//Sivanayyan P
//spsivanperumal@gmail.com
//Russian Multipication


package day1;

import java.util.Scanner;

public class RussianMultiplication {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter first number- ");  
		int num1= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int num2= sc.nextInt();

		RussianMultiplication russianMultiplication = new RussianMultiplication();
		System.out.println(russianMultiplication.russianMul(num1, num2));

	}

	public String russianMul(int num1, int num2) {
		int product = 0;
		String output="";

		if(num1 <= 0 || num2 <= 0 ) {
			return "-1";
		}
		if(num1 > 1000 || num2 > 1000) {
			return "-2";
		}

		while(num1 > 0)
		{

			if(num1%2 != 0) {
				product= product + num2;
				String snum2=String.valueOf(num2);
				output += snum2 + "+";  
			}
			num1 = num1/2;
			num2 = num2*2;

		}

		StringBuffer sumString= new StringBuffer(output);  
		sumString.deleteCharAt(sumString.length()-1);  
		String sproduct=String.valueOf(product);

		return  sumString + " = " + sproduct ;
	}
}
