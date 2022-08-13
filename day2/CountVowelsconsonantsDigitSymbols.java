package day2;

import java.util.Scanner;

public class CountVowelsconsonantsDigitSymbols {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence");
		String str = sc.nextLine();
		CountVowelsconsonantsDigitSymbols countVowelsconsonantsDigitSymbols = new CountVowelsconsonantsDigitSymbols();
		System.out.println(countVowelsconsonantsDigitSymbols.countVowels(str));
		System.out.println(countVowelsconsonantsDigitSymbols.countConsonant(str));
		System.out.println(countVowelsconsonantsDigitSymbols.countDigits(str));
		System.out.println(countVowelsconsonantsDigitSymbols.countSymbols(str));
		
	}
	
	public String countVowels(String str) {
		String sentence = str.toLowerCase();
//		int vowelCount = 0;
		String vowels = "";
		
		for (int i = 0; i<str.length(); i++) {
			
			if( sentence.charAt(i) == 'a' ||sentence.charAt(i) == 'e' ||sentence.charAt(i) == 'i' ||sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
//				vowelCount++;
				vowels +=  sentence.charAt(i);
			}
		}
		 return vowels.length() + " " + vowels;
	}
	
	public String countConsonant(String str) {
		String sentence = str.toLowerCase();
//		int consonantCount = 0;
		String consonant = "";
		
		for (int i = 0; i<str.length(); i++) {
			
			if( sentence.charAt(i) >= 'a' && sentence.charAt(i) <='z' ) {
//				consonantCount++;
				consonant += sentence.charAt(i);
			}
		}
		 return consonant.length() + "" +  consonant;
	}
	
	public String countDigits(String str) {
		String sentence = str.toLowerCase();
//		int digitCount = 0;
		String digits = "";
		
		for (int i = 0; i<str.length(); i++) {
			
			if( sentence.charAt(i) >= '0' && sentence.charAt(i) <='9' ) {
//				digitCount++;
				digits += sentence.charAt(i) ;
			}
		}
		 return digits.length() +" " + digits;
	}
	
	public String countSymbols(String str) {
		String sentence = str.toLowerCase();

		String symbols = "";
		
		for (int i = 0; i<str.length(); i++) {
			
			if( sentence.charAt(i) == ' ') {

				symbols += sentence.charAt(i) ;
			}
		}
		 return symbols.length() +" " + symbols;
	}
	



}
