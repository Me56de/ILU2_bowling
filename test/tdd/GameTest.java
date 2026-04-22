package tdd;

import org.junit.Test;

public class GameTest {
	
	@Test
	public void creerJeu()  {
		new Game();
	}
	
	@Test
	public void allMiss() {
		Game game = new Game();
		game.lancer(0);
	}
}
