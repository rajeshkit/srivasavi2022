package collectiondemo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<Integer> alist=new TreeSet<Integer>();
		alist.add(466);
		alist.add(698);
		alist.add(800);
		alist.add(457);
		alist.add(800);
		System.out.println(alist);
	}
}
