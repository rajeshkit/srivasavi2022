package collectiondemo1;

public class Flight implements Comparable<Flight> {
	private int flightId;
	private String airlineName;
	private String to;
	private String from;
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	public Flight(int flightId, String airlineName, String to, String from) {
		super();
		this.flightId = flightId;
		this.airlineName = airlineName;
		this.to = to;
		this.from = from;
	}

	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	@Override
	public String toString() {
		return " "+airlineName+" "+flightId+" "+from+" "+to;
	}
	@Override
	public int compareTo(Flight o) {
		
		return o.airlineName.compareTo(this.airlineName);
	}
	
}
