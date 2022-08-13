package day3assignment3;

public class StudentGrades {
	public static void main(String[] args) {
		int[] marks = {60,50,40,80};
		int[] marks2= {60,50,30,80};
		
		Student student = new Student("ravi",marks);
		Result result = new Result(student);
		Student student2 = new Student("ravi",marks2);
		Result result2= new Result(student2);

		System.out.println(student.toString() + "\n" + "Garde= "+  result.resultCalculator()); 
		System.out.println(student2.toString() + "\n" +"Garde= " + result2.resultCalculator()); 
	}

}
