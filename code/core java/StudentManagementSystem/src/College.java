import java.util.Scanner;

public class College {
	public static void main(String[] args) {
		Student s1=new Student(100,"Raghu",6.7f,"raghu@gmail.com");
		Student s2=new Student();
		Scanner s=new Scanner(System.in);
		s2.setStrudentName(s.nextLine());
		s2.setEmail(s.nextLine());
		s2.setCgpa(s.nextFloat());
		s2.setStudentId(s.nextInt());
		Student s3=new Student();
		s3.setStrudentName("Nadhiya");
		s3.setStudentId(300);
		s3.setEmail("nadhiya@gmail.com");
		s3.setCgpa(7.9f);
		
		Student[] students=new Student[] {s1,s2,s3};
		
		for(int i=0;i<3;i++) {
			System.out.println(students[i].getStudentId());
			System.out.println(students[i].getStrudentName());
			System.out.println(students[i].getCgpa());
			System.out.println(students[i].getEmail());
		}
		
	}
}
