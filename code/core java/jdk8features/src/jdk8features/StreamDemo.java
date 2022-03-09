package jdk8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(466);
		alist.add(698);
		alist.add(800);
		alist.add(457);
		alist.add(768);
		alist.add(565);
		

		
		alist.stream().map(t->t*t).forEach(e->System.out.println(e));
		
		System.out.println("*************************");
	
		
		alist.stream().filter(e->e>700).forEach(e->System.out.println(e));
		
		System.out.println("*************************");
		
		alist.stream().sorted().forEach(e->System.out.println(e));
		
		System.out.println("*************************");
		
		alist.stream().map(t->t*t).sorted().filter(e->e>319225).forEach(e->System.out.println(e));
		
		Integer m = alist.stream().map(t->t*t).max((e1,e2)->e1-e2).get();
		System.out.println(m);
	}
}









