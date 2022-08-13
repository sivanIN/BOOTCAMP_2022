//Assignment 17-02
//Sivanayyan P
//spsivanperumal@gmail.com
//search index of element in array


package day1;

import java.util.Scanner;

public class SearchArrayElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int [] a = new int [size];

		System.out.println("Enter Elment to the array");
		for(int i = 0; i < size ;i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Please enter number to find index");
		int number = sc.nextInt();
		SearchArrayElement searchArrayElement = new SearchArrayElement();
		System.out.println("index of the number: "  + searchArrayElement.findIndex(a, number));
	}

	public int findIndex(int[] a, int number ){

		for (int i = 0; i < a.length; i++) {
			if(a[i] == number) {
				return i;
			}
		}
		return -1;

	}
}
