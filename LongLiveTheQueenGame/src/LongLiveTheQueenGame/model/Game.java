package LongLiveTheQueenGame.model;

import java.io.File;

import javafx.scene.control.Pagination;
import javafx.scene.image.Image;

public class Game {
	
	//ArrayList<Position> positions = new ArrayList<Position>();
	//positions.get(2);
	
	private TokenBank tokenBank;
	private Player p1;
	private Player p2;
	private boolean playerTurn;	// true = p1, false is p2
	private int dice;
	
	public void Game() {
		this.tokenBank = new TokenBank(6, 6, 6);
		this.p1 = new Player();
		this.p2 = new Player();
	}
	
	
	public TokenBank getTokenBank() {
		return this.tokenBank;
	}
	public void setTokenBank(TokenBank tokenBank) {
		this.tokenBank = tokenBank;
	}
	
	
	public Player getP1() {
		return this.p1;
	}
	public void setP1(Player p1) {
		this.p1 = p1;
	}
	
	
	public Player getP2() {
		return this.p2;
	}
	public void setP2(Player p2) {
		this.p2 = p2;
	}


	public boolean getPlayerTurn() {
		return playerTurn;
	}
	public void setPlayerTurn(boolean playerTurn) {
		this.playerTurn = playerTurn;
	}
	
	
	public void loadPicFronts() {
		File files[] = new File("frontImages").listFiles();
		for (File file : files) {
			Image img = new Image(file.getPath());
			String fileNames[] = file.getPath().split("\\.");
			if ( fileNames[0].substring(1, 2).equals("p1") ) {
				
				for ( Character character : p1.getCharacters() ) {
					if ( fileNames[0].substring(3).equals(character.getName()) ) {
						p1.findCharacter( fileNames[0].substring(3) ).setPicFront(img);
						p1.findCharacter( fileNames[0].substring(3) ).setPicBack("PUT THE BACK FILE PATH");
					}
				}
				
			}
			else if ( fileNames[0].substring(1, 2).equals("p2") ) {
				for ( Character character : p2.getCharacters() ) {
					if ( fileNames[0].substring(3).equals(character.getName()) ) {
						p2.findCharacter( fileNames[0].substring(3) ).setPicFront(img);
						p2.findCharacter( fileNames[0].substring(3) ).setPicBack("PUT THE BACK FILE PATH");
					}
				}
			}		
				
		}
		
	}
	
	
	
	
	
}
