package LongLiveTheQueenGame.model;

public class TokenBank {
	
	private int numRed;	// number of tokens in either game or owned by player
	private int numYellow;
	private int numBlue;
	

	public TokenBank(int numRed, int numYellow, int numBlue) {
		this.setNumRed(numRed);
		this.setNumYellow(numYellow);
		this.setNumBlue(numBlue);
	}


	public int getNumRed() {
		return this.numRed;
	}
	public void setNumRed(int numRed) {
		this.numRed = numRed;
	}


	public int getNumYellow() {
		return this.numYellow;
	}
	public void setNumYellow(int numYellow) {
		this.numYellow = numYellow;
	}


	public int getNumBlue() {
		return numBlue;
	}


	public void setNumBlue(int numBlue) {
		this.numBlue = numBlue;
	}

	
	public void tokenCheck() {
		
	}

}

