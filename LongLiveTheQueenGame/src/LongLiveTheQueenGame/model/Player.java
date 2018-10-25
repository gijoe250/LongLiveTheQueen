package LongLiveTheQueenGame.model;

import java.io.File;
import java.util.*;

import javafx.scene.image.Image;

public class Player {
	
	private ArrayList<Character> characters;	// order in list is order they are on the board
	private TokenBank tokenBank;


	public Player() {
		// 0 is the temp swap position, 1 is master class
		this.characters = new ArrayList<Character>(12);
		this.setTokenBank(new TokenBank(0,0,0));
	}

	public ArrayList<Character> getCharacters() {
		return this.characters;
	}
	public void setCharacters(ArrayList<Character> characters) {
		this.characters = characters;
	}

	
	public TokenBank getTokenBank() {
		return this.tokenBank;
	}
	public void setTokenBank(TokenBank tokenBank) {
		this.tokenBank = tokenBank;
	}

	
	public void addCharacter(Character character) {
		this.characters.add(character);
	}
	public void removeCharacter(Character character) {
		for (Character c : this.characters) {
			if (character.equals(c)) {
				this.characters.remove(character);
			}
		}
	}
	
	
	public Character findCharacter(String name) {
		for(Character c : this.characters) {
			if ( c.getName().equals(name) ) {
				return c;
			}
		}
		return null;
	}
	
	
	public void addAllCharacters() {
		//Character(String name, Position position, boolean face, String prestige, int speed, String picFrontLoc, String picBackLoc)
		Character sniper = new Character("Sniper", POSITION, false, "red", 1, picFrontLoc, picBackLoc);
		Character assassin = new Character("Assassin", POSITION, false, "red", 2, picFrontLoc, picFrontLoc);
		Character schemer = new Character("Schemer", POSITION, false, "yellow", 3, picFrontLoc, picFrontLoc);
		Character noble = new Character("Noble", POSITION, false, "yellow", 4, picFrontLoc, picFrontLoc);
		Character gambler = new Character("Gambler", POSITION, false, null, 5, picFrontLoc, picFrontLoc);
		Character princess = new Character("Princess", POSITION, true, null, 6, picFrontLoc, picFrontLoc);
		Character pilot = new Character("Pilot", POSITION, false, "blue", 7, picFrontLoc, picFrontLoc);
		Character entertainer = new Character("Entertainer", POSITION, false, "blue", 8, picFrontLoc, picFrontLoc);
		Character spy = new Character("Spy", POSITION, false, "blue", 9, picFrontLoc, picFrontLoc);
		Character guard = new Character("Guard", POSITION, false, null, 10, picFrontLoc, picFrontLoc);
		Character recruit1 = new Character("Recruit", POSITION, false, "any", any, picFrontLoc, picFrontLoc);
		Character recruit2 = new Character("Recruit", POSITION, false, "any", any, picFrontLoc, picFrontLoc);
		
		
		
	}
	

	

}