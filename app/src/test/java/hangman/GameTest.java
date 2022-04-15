package hangman;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

  @Test public void testGetsRandomWordToGuess() {
    WordChoser choser = mock(WordChoser.class);
    when(choser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

    Game game = new Game();
    assertEquals("D________", game.getWordToGuess());
  }

  @Test public void testGetsInitialRemainingAttempts() {
    Game game = new Game();
    assertEquals("Start game with 10 attempts", Integer.valueOf(10), game.getRemainingAttempts());
  }

  // @Test public void testGetsRandomWordFromDictionary() {
  //   Game game = new Game();
  //   assertEquals("Gets random word from dictionary", )
  // }
}
