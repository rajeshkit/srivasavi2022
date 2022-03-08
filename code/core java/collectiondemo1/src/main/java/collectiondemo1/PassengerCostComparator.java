package collectiondemo1;

import java.util.Comparator;

public class PassengerCostComparator implements Comparator<Passenger>{

	@Override
	public int compare(Passenger o1, Passenger o2) {
		if(o1.getTicketCost()>o2.getTicketCost()) {
			return 1;
		}
		if(o1.getTicketCost()<o2.getTicketCost()) {
			return -1;
		}
		return 0;
	}

}
