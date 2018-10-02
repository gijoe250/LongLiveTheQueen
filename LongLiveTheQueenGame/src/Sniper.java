

public class Sniper {
 if(game.redstock != 0) {
	 playerIndex = getPlayerNumber();
	 playerList[playerIndex].redstock++;
	 game.redstock--;
 }
 if(playerList[playerIndex].redstock == 6) {
	 playerList[playerIndex].redstock = 0;
	 game.redstock = 6;
 }
 if(playerList[playerIndex].position[14-getDiceRollValue].facing.equals("Up")) {
	 oppPlayerIndex = getOppPlayerNumber();
	 playerList[oppPlayerIndex].setPositionFacing((14-getDiceRollValue()), "Down");
 }
}
