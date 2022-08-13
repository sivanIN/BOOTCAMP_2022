package day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
//		File file = new File("Employee.txt");
//		file.createNewFile();
//		
//		Scanner scanner = new Scanner(file);
//		
//		while(scanner.hasNext()) {
//			System.out.println(scanner.nextLine());
//		}
//		
//		FileReader fileReader = new FileReader("Employee.txt");
//		
////		System.out.println((char)fileReader.read());
//		
//		int ascii = (char)fileReader.read();
//		
//		while(ascii != -1) {
//			System.out.print((char)ascii);
//			ascii = fileReader.read();
//		}
		
		FileDemo fileDemo = new FileDemo();
		fileDemo.getEmployeDetails("Employee.txt");
		
	}
	
	public static void getEmployeDetails(String fileName) throws IOException {
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String line = bufferedReader.readLine();
		while(line != null ) {
			System.out.println(line);
			line = bufferedReader.readLine();
			
		}
		bufferedReader.close();
		fileReader.close();
		
	}

}
