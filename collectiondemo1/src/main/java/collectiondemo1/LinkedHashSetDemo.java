package collectiondemo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> alist=new LinkedHashSet<Integer>();
		alist.add(466);
		alist.add(698);
		alist.add(800);
		alist.add(null);
		alist.add(457);
		alist.add(800);
		alist.add(null);
		System.out.println(alist);
	}
}
