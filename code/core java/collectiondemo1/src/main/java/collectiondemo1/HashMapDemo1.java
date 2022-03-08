package collectiondemo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo1 {
	public static void main(String[] args) {
			HashMap<Integer,Place> hm=new HashMap<Integer,Place>();
			hm.put(534204, new Place("Bemavaram", 343434, 30));
			hm.put(600069, new Place("Chennai",567766,45));
			hm.put(533003, new Place("Kakinada",6868767,45));
			
			System.out.println(hm.entrySet());
			System.out.println(hm.keySet());
			System.out.println(hm.values());
			System.out.println("*******************");
			// keyset
			for (Integer key : hm.keySet()) {
				System.out.println(key);
			}
			Iterator<Integer> itr =hm.keySet().iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			// values
			System.out.println("*******************");
			for (Place value : hm.values()) {
				System.out.println(value);
			}
			Iterator<Place> itr1=hm.values().iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			// entry
			System.out.println("*******************");
			for (Entry<Integer,Place> entry : hm.entrySet()) {
				System.out.println(entry.getValue());
				System.out.println(entry.getKey());
			}
			
			Iterator<Entry<Integer,Place>> itr2=hm.entrySet().iterator();
			while(itr2.hasNext()) {
				Entry<Integer,Place> e=itr2.next();
				System.out.println(e.getKey());
				System.out.println(e.getValue());
			}
			
			
			
			
			
			
			
	}
}