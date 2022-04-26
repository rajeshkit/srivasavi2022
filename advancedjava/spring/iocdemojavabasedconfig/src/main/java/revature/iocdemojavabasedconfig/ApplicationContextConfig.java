package revature.iocdemojavabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextConfig {
	@Bean(name = "player1")
	public Player getPlayer1() {
		Player p = new Player();
		p.setPlayerId(100);
		p.setPlayerName("Yuvraj Singh");
		p.setTeamName("India");
		return p;
	}
	@Bean(name = "player2")
	public Player getPlayer2() {
		return new Player(7,"Dhoni","Csk");
	}
}
