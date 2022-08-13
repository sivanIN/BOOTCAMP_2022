package day2;

public class AdittionOfIntegers {
	
	public static void main(String[] args) {
		int num1 =1;
		int num2 =3;
		
		AdittionOfIntegers adittionOfIntegers = new AdittionOfIntegers();
		
		System.out.println(adittionOfIntegers.additionOfInteger(num1, num2)); 
		
	}
	
	public int additionOfInteger(int num1 , int num2) {
		int sum = num1 + num2;
		
		
		return sum;
		
	}
	

}
