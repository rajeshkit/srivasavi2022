package collectiondemo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class collectioniterationdemo {
	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(466);
		alist.add(698);
		alist.add(800);
		alist.add(457);
		alist.add(457);
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		System.out.println("******************");
		for (Integer integer : alist) {
			System.out.println(integer);
		}
		System.out.println("******************");
		Iterator<Integer> itr=alist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("******************");
		alist.forEach(e->System.out.println(e));
	}
}	
