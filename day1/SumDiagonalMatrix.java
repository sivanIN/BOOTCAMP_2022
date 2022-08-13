
//Assignment 17-05
//Sivanayyan P
//spsivanperumal@gmail.com
//Sum of diagonal of 2d array


package day1;

import java.util.Scanner;

public class SumDiagonalMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		System.out.println("Enter Elment to the array");
		for(int i = 0; i < size ;i++) {
			for(int j =0; j< size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}


		SumDiagonalMatrix sumDiagonalMatrix =	new SumDiagonalMatrix();
		System.out.println("Sum of left diagonal elements: " + sumDiagonalMatrix.leftDiagnol(arr));
		System.out.println("Sum of right diagonal elements: " + sumDiagonalMatrix.rightDiagnol(arr));

	}
	public int  leftDiagnol(int arr[][]){
		int leftDiagnolSum= 0;
		for(int i = 0; i < arr.length ;i++) {
			for(int j =0; j< arr.length; j++) {
				if(i == j) {
					leftDiagnolSum +=arr[i][j];
				}
			}
		} 
		return leftDiagnolSum;
	}


	public int  rightDiagnol(int arr[][]){
		int rightDiagnolSum= 0;
		for(int i = 0; i < arr.length ;i++) {
			for(int j =0; j< arr.length; j++) {
				if((i + j) == (arr.length - 1)) {
					rightDiagnolSum +=arr[i][j];
				}
			}
		} 
		return rightDiagnolSum;
	}
}
