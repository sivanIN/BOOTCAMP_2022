package day7;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
	
	public static void main(String[] args) throws IOException {
		
		
		creatStudentsFile("Student.csv");
		
	}
	
	public static void creatStudentsFile(String fileName) throws IOException{
		
		FileWriter fw = new FileWriter(fileName);
		fw.write("Name,Mark1,Mark2,Mark3");
		fw.close();
	}

}
