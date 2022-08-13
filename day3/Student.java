package day3;

public class Student {

	 private int id;
	 private String name;
	 private String schoolName;
	public Student(int id, String name, String schoolName) {
		
		this.id = id;
		this.name = name;
		this.schoolName = schoolName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getschoolName() {
		return schoolName;
	}
	public void setschoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	
	 
	 
}
