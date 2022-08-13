package day5;

import java.util.HashMap;
import java.util.Map;

import day2.Student;

public class StudentsDetail {
 
	public static void main(String[] args) {
		
		Student s1 = new Student( "sivan","scm","ECE","kochi");
		Student s2 = new Student( "Ramya","UST","ECE","Palakad");
		
		 HashMap<Integer,Student> map=new HashMap<Integer,Student>();
		 
		 map.put(s1.getId(), s1);
		 map.put(s2.getId(), s2);
		 
//		 System.out.println(map);
		 
		 for(Map.Entry<Integer,Student> entry: map.entrySet() ) {
			 System.out.println(entry);
		 }
	}
}
