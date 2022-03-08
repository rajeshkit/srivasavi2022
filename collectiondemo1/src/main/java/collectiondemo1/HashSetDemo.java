package collectiondemo1;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> alist=new HashSet<Integer>();
		alist.add(466);
		alist.add(698);
		alist.add(800);
		alist.add(null);
		alist.add(457);
		alist.add(698);
		alist.add(null);
		alist.add(698);
		System.out.println(alist);
	}
}
