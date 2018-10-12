

public class Assassin extends Character {
	
	public Assassin(String name, int pos, int face, String prestige, int speed) {
		Character c = new Character(name, pos, face, prestige, speed);
	}
	
	public void AssassinSpecials() {
		
		if(game.redstock != 0) {
			playerIndex = getPlayerNumber();
			playerList[playerIndex].redstock++;
			game.redstock--;
		}
		if(playerList[playerIndex].redstock == 6) {
			playerList[playerIndex].redstock = 0;
			game.redstock = 6;
		}
		if(playerList[playerIndex].position[getDiceRollValue()].facing.equals("Up")) {
			oppPlayerIndex = getOppPlayerNumber();
			playerList[oppPlayerIndex].setPositionFacing(getDiceRollValue(), "Down");
		}
	}
}