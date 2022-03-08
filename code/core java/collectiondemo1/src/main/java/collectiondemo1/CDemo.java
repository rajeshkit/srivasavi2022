package collectiondemo1;

import java.util.ArrayList;
import java.util.Collections;

public class CDemo {
	public static void main(String[] args) {
		ArrayList<Passenger> plist=new ArrayList<Passenger>();
		Passenger p1=new Passenger(Integer.valueOf(500),"abc",7677);
		Passenger p2=new Passenger(Integer.valueOf(1000),"fgh",5677);
		Passenger p3=new Passenger(Integer.valueOf(100),"uhh",17677);
		plist.add(p2);
		plist.add(p1);
		plist.add(p3);
		System.out.println(plist);
		PassengerIdComparator p=new PassengerIdComparator();
		Collections.sort(plist,p);
		System.out.println(plist);
		PassengerCostComparator pc=new PassengerCostComparator();
		Collections.sort(plist,pc);
		System.out.println(plist);
		PassengerNameComparator pn=new PassengerNameComparator();
		Collections.sort(plist,pn);
		System.out.println(plist);
		
	}
}
