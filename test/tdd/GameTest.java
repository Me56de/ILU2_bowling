package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class GameTest {
	Game game;

	@BeforeEach
	void setup() {
		game = new Game();
	}

	public void plusieursLancer(int... nb_lancers) {
		for (int nb_quille : nb_lancers) {
			game.roll(nb_quille);
		}
	}

	@Test
	public void seulementUneQuille() {
		plusieursLancer(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
		assertEquals(20, game.score());
	}

	@Test
	public void miss20fois() {
		plusieursLancer(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertEquals(0, game.score());
	}

	@Test
	public void joueurDebutant() {
		plusieursLancer(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
		assertEquals(30, game.score());
	}

	@Test
	public void premierSpare() {
		plusieursLancer(7, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		assertEquals(18, game.score());
	}
}
