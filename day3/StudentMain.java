package day3;

public class StudentMain {
	public static void main(String[] args) {
		String[] subjects1 = {"Maths" , "Pyhsics","Chemistry","Biology","English","Hindi"};
		ClassXSubjects classXSubjects = new ClassXSubjects("ABC","ABCSchool" ,subjects1);
		System.out.println(classXSubjects);
	}

}
