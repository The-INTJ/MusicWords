// imports
import java.util.ArrayList;


public class Music {
  
  
  public Music() {
    
  }

  /* Method that takes a string and counts all of the words
   * and then mods by 12. This number correlates to a musical key.
   * Input: String
   * Output: Integer
   */
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


  /* Method that takes a string and turns each
   * word into a number. It will do this based on
   * the sum of the ASCII values of each letter, mod
   * the number of notes in the key.
   * Input: String
   * Output: Integer ArrayList
   */
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

  /*
  This method takes an array list of note values from 0-7 representing the
  diatonic scale, and asigns the corresponding solfege to them.
   */
  public ArrayList<String> noteValsToSolfege(ArrayList<Integer> arrL) {
    ArrayList<String> solfege = new ArrayList<>();
    String [] solfegeList = {"do ", "re", "mi", "fa", "so", "la", "ti", "do"};

    //Loops through given array front to back
    for(int i = 0; i < arrL.size(); i++) {
      // First the note value is retrieved based on i,
      // then that value is used to obtain the correct solfege
      solfege.add(solfegeList[arrL.get(i)]);
    }
    return solfege;
  }
  
  
  
}