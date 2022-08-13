package day5Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayModificationA {

	public static void main(String[] args) {
		System.out.println("Enter number of element");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Enter Element of the array");
		ArrayList<Integer> mainarraylist = new ArrayList<>();

		for(int i = 0 ; i < size;i++) {
			mainarraylist.add(scanner.nextInt());
		}

		System.out.println("Enter number of query");
		int numberOfQuery = scanner.nextInt();
		
		ArrayModificationA arrayModificationA = new ArrayModificationA();
		System.out.println(arrayModificationA.modifyArray(mainarraylist,size,numberOfQuery));


	}

	public ArrayList<Integer> modifyArray(ArrayList<Integer> mainarraylist ,int size ,int numberOfQuery) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0 ; i < numberOfQuery;i++) {
			System.out.println("Enter Query");
			String query = scanner.next();

			if(query.matches("Insert")) {
				System.out.println("Enter Index and value");
				int index = scanner.nextInt();
				int newvalue = scanner.nextInt();
				if(index >=0 ) {
					mainarraylist.add(index,newvalue);
					
				}
				else {
					System.out.println("Index Out of range");
				}
			}
			else if(query.matches("Delete")) {
				System.out.println("Enter Index ");
				int delIndex = scanner.nextInt();
				if( delIndex >=0 ) {
					mainarraylist.remove(delIndex);
				}else {
					System.out.println("Index out of range");
				}
			}

		}
		return mainarraylist;
	}

}
