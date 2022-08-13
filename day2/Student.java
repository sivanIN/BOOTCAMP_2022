package day2;

public class Student  {
	 static int count = 100;
     int id ;
     String name;
     String collegeName;
     String courseName;
     String address;
     
     public Student( String name, String collegeName, String courseName, String address) {
    	 this.id = ++count;
    	 this.name = name;
    	 this.collegeName = collegeName;
    	 this.courseName = courseName;
    	 this.address = address;
    	 
     }
     
     public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
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

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	void incrementCount() {
    	 id++;
     }
     
     public String toString() {
//    	 return "ID:" + id + ", Name= " + name + ", collegeName=" + collegeName + ", courseName"  + courseName + ", address" + address;
    	 return "["+"Name= " + name + ", collegeName= " + collegeName + ", courseName= "  + courseName + ", address= " + address + "]";
     }
     }
