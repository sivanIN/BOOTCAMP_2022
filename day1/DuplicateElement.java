
//Assignment 17-04
//Sivanayyan P
//spsivanperumal@gmail.com
//Eliminating repeated number


package day1;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateElement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int [] arr = new int [size];

		System.out.println("Enter Elment to the array");
		for(int i = 0; i < size ;i++) {
			arr[i] = sc.nextInt();
		}

		DuplicateElement duplicateElement = new DuplicateElement();
		System.out.println("output: " + duplicateElement.nonRepeatedElement(arr));
	}

	public String nonRepeatedElement(int[] arr) {


		ArrayList<Integer> nonRepeatedNumber = new ArrayList<Integer>(); 
		int count = 0;
		if (arr.length == 0) {
			return  "-1";
		}


		for (int i = 0; i< arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]){
					count += 1;
				}
			}
			if (count == 1){
				nonRepeatedNumber.add(arr[i]);
			}
			count = 0;
		}
		if (nonRepeatedNumber.size() == arr.length) {
			return "0";
		}

		String uniqueNumber = nonRepeatedNumber.toString();
		return uniqueNumber;

	}

}

