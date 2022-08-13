package day4Assignment2;

import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Convert From= ");
		String ConvertFrom = scanner.nextLine().trim();
		System.out.print("Convert TO= ");
		String ConvertTo = scanner.nextLine().trim();
		System.out.print("Amount to Convert= ");
		float ConvertAmount = scanner.nextFloat();
		Money money = new Money(ConvertFrom,ConvertAmount);
		ConverterFactory converterFactory = new ConverterFactory(money);
		System.out.println( ConvertAmount + " " + ConvertFrom + " = " +  converterFactory.convertedValue(ConvertTo) + " " + ConvertTo); 
		
	}

}
