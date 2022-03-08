package collectiondemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class ArrayListDemo1 {
	public static void main(String[] args) {
	
		ArrayList<Flight> alist=new ArrayList<Flight>();
		
		Flight f1=new Flight(2000, "IndiGo", "chennai", "vijayawada");
		Flight f2=new Flight();
		f2.setFlightId(1000);
		f2.setAirlineName("Air India");
		f2.setFrom("chennai");
		f2.setTo("Hydrabhad");
		Flight f3=new Flight(5000, "abc", "asdf", "sdfsd");
		
		alist.add(f3);
		alist.add(f1);
		alist.add(f2);
		
		System.out.println(alist.toString());
		Collections.sort(alist);
		System.out.println(alist.toString());
		
		
	}
}	
