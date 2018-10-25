package LongLiveTheQueenGame.model;

public class Position {

	private int X;
	private int Y;
	
	public Position(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	// getters and setters
	public int getX() {
		return this.X;
	}
	public void setX(int x) {
		this.X = x;
	}

	public int getY() {
		return this.Y;
	}
	public void setY(int y) {
		this.Y = y;
	}
	
	
}
