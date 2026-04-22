package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class GameTest {
	
	@Test
	public void creerJeu()  {
		new Game();
	}
	
	@Test
	public void allMiss() {
		Game game = new Game();
		assertEquals(0, game.score());
	}
}
