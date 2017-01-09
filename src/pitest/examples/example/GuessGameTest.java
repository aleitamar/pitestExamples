package pitest.examples.example;

import org.junit.Assert;
import org.junit.Test;

public class GuessGameTest {
	GuessGame game;
	
	@Test
	public void defaultSecret() {
		game = new GuessGame();
		Assert.assertFalse(game.guess(87));
	}

	@Test
	public void correctGuess() {
		game = new GuessGame(77);
		Assert.assertTrue(game.guess(77));
		Assert.assertFalse(game.guess(10));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test
//	public void defaultSecret() {
//		int DEFAULT_SECRET = 64;
//		game = new GuessGame();
//		Assert.assertTrue(game.guess(DEFAULT_SECRET));
//		Assert.assertFalse(game.guess(87));
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//		String output;
//		@Test
//		public void testPrinterWin() {
//			game = new GuessGame(66, text -> output = text);
//			game.guess(66);
//			Assert.assertTrue(output.equals("Right Guess. You WIN!!!"));
//		}
//		
//		@Test
//		public void testPrinterLost() {
//			game = new GuessGame(66, text -> output = text);
//			game.guess(43);
//			Assert.assertTrue(output.equals("WRONG. You LOST!!!"));
//		}
}