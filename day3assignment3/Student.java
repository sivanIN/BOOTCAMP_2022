package day3assignment3;

import java.util.Arrays;

public class Student {

	static int idgen = 100;
	private int Id ;
	private String Stringname ;
	private int marks[];

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student( String stringname, int[] marks) {
		Id = idgen++;
		Stringname = stringname;
		this.marks = marks;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getStringname() {
		return Stringname;
	}
	public void setStringname(String stringname) {
		Stringname = stringname;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Stringname=" + Stringname + ", marks=" + Arrays.toString(marks) + "]";
	}







}
