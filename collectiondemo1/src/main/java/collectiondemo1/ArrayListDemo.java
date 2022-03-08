package collectiondemo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(466);
		alist.add(698);
		alist.add(800);
		alist.add(457);
		alist.add(457);
		System.out.println(Collections.frequency(alist, 457));
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);
	
		
		
		
	}
}	
