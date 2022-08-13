package day3;

import java.util.Arrays;

public class ClassXISubjects  extends Student{
	String[] subjects ;
	static int idgen = 1101;
	
	public ClassXISubjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassXISubjects(int id, String name, String schoolName ,String[] subjects) {
		super(idgen++, name, schoolName);
		this.subjects = subjects;
	}
	public String[] getSubjects() {
		return subjects;
	}
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	public static int getIdgen() {
		return idgen;
	}
	public static void setIdgen(int idgen) {
		ClassXISubjects.idgen = idgen;
	}
	
	@Override
	public String toString() {
		return "Id:"+ getId() +" " +  "Name= " + getName() + " "  + "SchoolName= " + getschoolName()+ " "+  "Subjects= " + Arrays.toString(subjects) + "]";
	}

}
