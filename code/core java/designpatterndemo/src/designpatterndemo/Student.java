package designpatterndemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

class Teacher{
	
}
interface College{
	
}
public class Student extends Teacher{
	public static void main(String[] args) {
		Teacher t = new Student();
		Student s =(Student) new Teacher();
	}
}
class DayScholar implements College{
	public static void main(String[] args) {
		College c = new DayScholar();
	}
}
class Hosteller implements College{
	public static void main(String[] args) {
		College c=new Hosteller();
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1=new LinkedList<Integer>();
		List<Integer> list2=new Vector<Integer>();
		
		Set<Integer> s;
		s=new HashSet<Integer>();
		s=new LinkedHashSet<Integer>();
		s=new TreeSet<Integer>();
		
		
		
	}
}
