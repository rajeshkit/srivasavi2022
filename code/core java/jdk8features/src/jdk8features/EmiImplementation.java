package jdk8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmiImplementation  {
	
	
	
	public static void main(String[] args) {
		EMI emi=(pr,ir,te)-> pr+ir*te;
		System.out.println(emi.caculateEmi(34,6.5f,7));
		
		Comparable<Integer> c=(e)->23-e;
		System.out.println(c.compareTo(23));
		
		Comparator<Float> com=(e1,e2)->Math.round(e1-e2);
		
		System.out.println(com.compare(25.4f, 50.3f));
		
		Predicate<String> p=(e)->e.equals("vasavi");  // test return true or false
		System.out.println(p.test("vasavi24"));
		
		Predicate<Integer> p1=(e)->e>25;
		System.out.println(p1.test(11));
		
		Function<Character,Integer> f1=(e)->{return Character.getNumericValue(e);};
		System.out.println(f1.apply('t'));
		
		Function<Integer,Integer> f2=(e)->{return e*e;};
		System.out.println(f2.apply(10));
		
		Consumer<Long> cons=(e)->{System.out.println(e);};
		cons.accept(46557777L);
		
	
		
	}

	
	
	
}
