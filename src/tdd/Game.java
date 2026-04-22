package tdd;

public class Game {

	int score = 0;
	
	public int score() {
		return score;
	}

	public void roll(int quilleTouchees) {
		score += quilleTouchees;
	}

}
