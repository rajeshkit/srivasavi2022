package revature.sterotyoeannotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Team {
	private Player p;
	
	public void displayTeam() {
		System.out.println("display team");
		p.displayPlayer();
	}
	@Autowired
	public void setP(Player p) {
		this.p = p;
	}
}
