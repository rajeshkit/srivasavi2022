package revature.iocdemojavabasedconfig;

public class Player {
	private int playerId;
	private String playerName;
	private String teamName;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(int playerId, String playerName, String teamName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.teamName = teamName;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void display() {
		System.out.println("annotation config display method called");
	}
}
