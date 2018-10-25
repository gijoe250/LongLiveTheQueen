import java.util.Random;

public class Dice {
	
	private int value;
	private int sides;
	
	/**
	 * Constructor
	 * 
	 * @param value
	 */
	public Dice (int sides) {
		setSides (sides);
		
	}
	
	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * Method to calculate random dice roll
	 * 
	 * @return
	 */
	public int roll() {
		Random diceRoller = new Random();
		this.value = diceRoller.nextInt(getSides())+1;
		return value;
	}
}
