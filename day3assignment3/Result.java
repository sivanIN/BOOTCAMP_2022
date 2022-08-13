package day3assignment3;

public class Result {


	Student student;
	

	public Result(Student student) {
		super();
		this.student = student;
	}

	public String resultCalculator() {
		int[] marks = student.getMarks();
		int sum = 0;
		int percentage;
		for(int n : marks) {
			if (n < 40) {
				return "fail";
			}
			else {
				sum = sum + n ;

			}
		}

		percentage =  sum / marks.length;

		if(percentage >= 70) {
			return "A";
		}
		else if(percentage >= 55 && percentage < 70) {
			return "B";
		}

		else if(percentage >= 40 && percentage < 55) {
			return "C";
		}
		else {
			return "F";
		}
	}

	@Override
	public String toString() {
		return "Result [student=" + student + "]";
	}
	
	
}
