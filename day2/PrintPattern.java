package day2;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = scanner.nextInt();
		
		PrintPattern printPattern = new PrintPattern();
		printPattern.ptintPatter(rows);

	}
	public void ptintPatter(int rows) {

		for (int i = 1; i <= rows; i++) {
			if(i == 1 || i == rows) {
				for (int j = 1; j <= rows; j++)  
				{  
					System.out.print("# ");  
				} 
			}
			else {
				for(int j = 1 ; j <= rows ; j++) {
					if(j == 1 || j == rows) {
						System.out.print("# "); 
					}
					else {
						System.out.print("$ "); 
					}
				}
			}
			System.out.println(); 
		}

	}
}

