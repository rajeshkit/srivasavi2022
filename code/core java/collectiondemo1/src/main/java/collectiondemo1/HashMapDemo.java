package collectiondemo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
			HashMap<Integer,String> hm=new HashMap<Integer,String>();
			hm.put(534204, "Bhemavaram");
			hm.put(600069, "Chennai");
			hm.put(533003, "Kakinada");
			hm.put(532212, "Vizak");
			hm.put(533003, "Telungana");
			hm.put(530011, "Vijayawada");
			
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
			for (String value : hm.values()) {
				System.out.println(value);
			}
			Iterator<String> itr1=hm.values().iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			// entry
			System.out.println("*******************");
			for (Entry<Integer,String> entry : hm.entrySet()) {
				System.out.println(entry.getValue());
				System.out.println(entry.getKey());
			}
			
			Iterator<Entry<Integer,String>> itr2=hm.entrySet().iterator();
			while(itr2.hasNext()) {
				Entry<Integer,String> e=itr2.next();
				System.out.println(e.getKey());
				System.out.println(e.getValue());
			}
			
			
			
			
			
			
			
	}
}