package collectiondemo1;

public class Passenger {
	private Integer id;
	private String name;
	private int ticketCost;
	public Passenger() {
		// TODO Auto-generated constructor stub
	}
	public Passenger(Integer id, String name, int ticketCost) {
		super();
		this.id = id;
		this.name = name;
		this.ticketCost = ticketCost;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}
	@Override
	public String toString() {
		return ""+id+"  "+name+"  "+ticketCost;
	}
	
	
	
}
