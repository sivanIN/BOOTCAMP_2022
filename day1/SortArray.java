//Assignment 17-01
//Sivanayyan P
//spsivanperumal@gmail.com
//Sort array descending order

package day1;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Elment to the array");
		for(int i = 0; i < size ;i++) {
			arr[i] = sc.nextInt();
		}
		SortArray sortArray = new SortArray();
		System.out.println(sortArray.sortArrayDescending(arr));
	}

	public String sortArrayDescending(int arr[]) {

		int temp;
		for(int i = 0; i < arr.length ;i++) {
			for(int j = i + 1; j< arr.length; j++) {
				if(arr[i] < arr[j] ) {
					temp =arr[i];
					arr[i] = arr[j];
					arr[j]= temp;

				}
			}
		}

		return Arrays.toString(arr);

	}

}
