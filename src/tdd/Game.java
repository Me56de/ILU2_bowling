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
			if (tableau[curseur] + tableau[curseur + 1] == 10) {
				score += tableau[curseur] + tableau[curseur+ 1] + tableau[curseur + 2];
			} else {
				score += tableau[curseur] + tableau[curseur + 1];
			}
			curseur += 2;
		}

		return score;
	}
}
