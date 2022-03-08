package collectiondemo;

import java.util.ArrayList;

public class MarkManagement {
	public static void main(String[] args) {
		int[] a=new int[5];
		ArrayList<Integer> list=new ArrayList<Integer>();
			// predefined objects - 6 objects
		list.add(577);// auto - boxing
		list.add(465);
		list.add(677);
		list.add(523);
		list.add(123);
		list.add(777);
		System.out.println(list);
		
		for (Integer element : list) {
			System.out.println(element);
		}
		
		
		ArrayList<String> cityList=new ArrayList<String>();
		//predfeined objects - 3 objects
		cityList.add("chennai");
		cityList.add("Andhra Pradesh");
		cityList.add("Tadepalligudam");
		System.out.println(cityList);
		for (String city : cityList) {
			System.out.println(city);
		}
		
		Student s1=new Student(100, "Rajesh", 9.0f, "rajesh.kit@gmail.com");
		Student s2=new Student(101, "stephen", 5.0f, "stephen.kit@gmail.com");
		Student s3=new Student(102, "ragav", 7.0f, "ragav.kit@gmail.com");
		Student s4=new Student(103, "hari babu", 6.0f, "babu.kit@gmail.com");
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		System.out.println(studentList.toString());
		for (Student student : studentList) {
			System.out.println(student.getStudentId()+student.getStrudentName());
			System.out.println(student.getEmail()+" "+student.getCgpa());
		}
	
	}
}
