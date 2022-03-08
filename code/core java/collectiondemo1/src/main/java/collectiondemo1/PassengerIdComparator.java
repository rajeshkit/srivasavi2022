package collectiondemo1;

import java.util.Comparator;

public class PassengerIdComparator implements Comparator<Passenger>{

	@Override
	public int compare(Passenger o1, Passenger o2) {
		if(o1.getId()>o2.getId()) {
			return 12;
		}
		if(o1.getId()<o2.getId()) {
			return -12;
		}
		return 0;
	}

}
