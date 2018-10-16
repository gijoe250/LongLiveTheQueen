package LongLiveTheQueenGame.model;

import java.io.*;
import javafx.scene.image.Image;

public abstract class Character {

	private String name;
	private int face;			// 0 down, up 1
	private String prestige;	// red yellow or blue
	private int speed;			// order for players to take their turn
	private Position position;
	private Image picFront;
	private Image picBack;
	
	public Character(String name, Position position, int face, String prestige, int speed, String picFrontLoc, String picBackLoc) {
		try {
			this.name = name;
			this.position = position;
			this.face = face;
			this.prestige = prestige;
			this.speed = speed;
			this.picFront = new Image(new FileInputStream(picFrontLoc));
			this.picBack = new Image(new FileInputStream(picBackLoc));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getPrestige() {
		return this.prestige;
	}
	public void setPrestige(String prestige) {
		this.prestige = prestige;
	}


	public int getFace() {
		return this.face;
	}
	public void setFace(int face) {
		this.face = face;
	}


	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public Position getPosition() {
		return this.position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	
	public void setCharacterPosition(int a, int b) {
		this.position.setX(a);
		this.position.setY(b);
	}
}
