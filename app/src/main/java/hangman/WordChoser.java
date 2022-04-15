package hangman;
import java.util.Random;

public class WordChoser {

  private static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
  String randomWord;

  public void main() {
  }

  WordChoser() {
    randomWord = getRandomWordFromDictionary();
  }

  public String getRandomWordFromDictionary() {
    Random rand = new Random();
    Integer len = DICTIONARY.length;
    return DICTIONARY[rand.nextInt(len)];
  }
}
