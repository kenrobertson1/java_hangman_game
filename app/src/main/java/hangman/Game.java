package hangman;

public class Game {

  public void main() {

  }

  String wordToGuess;
  int attempts;
  WordChoser choser;
    
  Game() {
    choser = new WordChoser();
    wordToGuess = choser.getRandomWordFromDictionary();
    attempts = 10;
  }

  public String getWordToGuess() {
    StringBuilder builder = new StringBuilder(wordToGuess);
    int i = wordToGuess.length();
    String hidden_chars = "_".repeat(i - 1);
    builder.replace(1, i, hidden_chars);
    String hidden_word = builder.toString();
    return hidden_word;
  }

  public Integer getRemainingAttempts() {
    return attempts;
  }

}
