package tdd;

public class Game {

	int indice = 0;
	int curseur = 0;
	int[] tableau = new int[21];

	public void roll(int quilleTouchees) {
		tableau[indice++] = quilleTouchees;
	}

	public int score() {
		int score = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (isStrike()) {
				score += 10 + tableau[curseur + 1] + tableau[curseur + 2];
				curseur++;
			} else if (isSpare()) {
				score += 10 + tableau[curseur + 2];
				curseur += 2;
			} else {
				score += tableau[curseur] + tableau[curseur + 1];
				curseur += 2;
			}
		}
		return score;
	}

	public boolean isStrike() {
		return tableau[curseur] == 10;
	}

	public boolean isSpare() {
		return tableau[curseur] + tableau[curseur + 1] == 10;
	}
}
