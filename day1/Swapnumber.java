package day1;

import java.util.Scanner;

public class Swapnumber {
	
	 public static void main(String[] args) {  
	       int  temp;

	       Scanner sc = new Scanner(System.in);  
	       int num1 = sc.nextInt();  
	       int num2 = sc.nextInt();  
	       
	       System.out.println("Before swapping: "+num1 +"   " + num2);    

	       temp = num1;  
	       num1 = num2;  
	       num2 = temp;  
	       System.out.println("After swapping: "+num1+"   " + num2);  
	        
	    }    

}
