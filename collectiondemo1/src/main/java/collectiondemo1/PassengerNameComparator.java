package collectiondemo1;

import java.util.Comparator;

public class PassengerNameComparator implements Comparator<Passenger> {

	@Override
	public int compare(Passenger o1, Passenger o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
