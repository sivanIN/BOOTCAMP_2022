package day1;

import java.util.Scanner;

public class HighestNumberOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] a = new int[size][size];

		for(int i = 0; i < size ;i++) {
			for(int j =0; j< size; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		HighestNumberOfArray highestNumberOfArraynew = new HighestNumberOfArray();
		System.out.println(highestNumberOfArraynew.getsecondlargestNumber(a,size));
	}


	public int getsecondlargestNumber(int[][] a,int size) {
		int max=0;
		int secondmax = 0;

		for(int i = 0; i < size ;i++) {
			for(int j =0; j< size; j++) {
				if(a[i][j]> max ) {
					secondmax = max;
					max = a[i][j];

				}
			}
		}
		return secondmax;

	}
}
