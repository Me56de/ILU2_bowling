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

	public void plusieursLancer(int nb_lancer, int nb_quille) {
		for (int i = 0; i < nb_lancer; i++) {
			game.roll(nb_quille);
		}
	}

	@Test
	public void seulementUneQuille() {
		plusieursLancer(20, 1);
		assertEquals(20, game.score());
	}
	
	@Test
	public void miss20fois() {
		plusieursLancer(20, 0);
		assertEquals(0, game.score());
	}
	
	@Test 
	public void joueurDebutant() {
		plusieursLancer(10, 1);
		plusieursLancer(10, 2);
		assertEquals(30, game.score());
	}
}
