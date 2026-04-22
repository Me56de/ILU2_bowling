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
	
	@Test
	public void miss20fois() {
		Game game = new Game(); 
		for (int i=0;i<20;i++)
		{
			game.roll(0);
		}
		assertEquals(0, game.score());
	}
}
