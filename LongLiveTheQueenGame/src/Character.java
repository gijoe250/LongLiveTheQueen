
public class Character {

	protected String name;
	private int position;		// location on board number line. 1 is master class
	private int face;			// 0 down, up 1
	private String prestige;	// red yellow or blue
	private int speed;			// order for players to take their turn
	
	public Character(String name, int position, int face, String prestige, int speed) {
		this.name = name;
		this.position = position;
		this.face = face;
		this.prestige = prestige;
		this.speed = speed;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPosition() {
		return position;
	}


	public void setPosition(int position) {
		this.position = position;
	}


	public String getPrestige() {
		return prestige;
	}


	public void setPrestige(String prestige) {
		this.prestige = prestige;
	}


	public int getFace() {
		return face;
	}


	public void setFace(int face) {
		this.face = face;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getPlayer() {
		return player;
	}


	public void setPlayer(int player) {
		this.player = player;
	}

}
