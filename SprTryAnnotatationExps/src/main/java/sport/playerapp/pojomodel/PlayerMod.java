package sport.playerapp.pojomodel;

public class PlayerMod {
	
	private int playId;
	private String playerName;
	
	public PlayerMod() {
	}
	
	public PlayerMod(int playId, String playerName) {
		this.playId = playId;
		this.playerName = playerName;
	}

	public int getPlayId() {
		return playId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayId(int playId) {
		this.playId = playId;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
}