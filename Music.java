// imports
import java.util.ArrayList;


public class Music {
  
  
  public Music() {
    
  }
  
  
  public int WordCountToKey(String words) {
    words = words.trim(); // eliminates white space
    int cycle = 0;
    int wordNumber = 1;
    // Checks for spaces
    while(cycle < words.length()) {
      if(Character.isWhitespace(words.charAt(cycle)) && !(Character.isWhitespace(words.charAt(cycle+1)))) {
        wordNumber++;
      }
      cycle++;
    }
    return wordNumber % 12; // there are 12 musical keys
  }
  
  public ArrayList<Integer> WordsToNotesVal(String sentence) {
    sentence = sentence.trim();
    ArrayList<Integer> noteVals = new ArrayList<>();
    int currentWordVal = 0;
    int cycle = 0;
    boolean newWordFlag = true;
    // While loop cycles through each character of the string
    while(cycle < sentence.length()) {
      currentWordVal = currentWordVal + ((int) sentence.charAt(cycle)); // Adds the ascii value of the character to a variable
      // Checks for spaces
      if (Character.isWhitespace(sentence.charAt(cycle)) && !(Character.isWhitespace(sentence.charAt(cycle + 1)))) {
        newWordFlag = true;
      }
      // If the space check is true, it will add the word value to the arraylist, then reset the variables for the start
      // of a new word
      if (newWordFlag) {
        currentWordVal = currentWordVal % 8; // there are 8 diatonic note values
        noteVals.add(currentWordVal);
        currentWordVal = 0;
        newWordFlag = false;
      }
      cycle++;
    }
    return noteVals;
  }

  
  
  
  
}