/* Matthew And Drew
 * 
 * The following is an experiment to see if words in the English language, when
 * arranged in sentences, make music. The program will assign a note and an
 * amount of time to each word based on its character make-up, and length. It will
 * assign a key based on the length of the sentence.
 * 
 */ 

                                         // Imports
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
import java.util.ArrayList;

public class MusicalWords {
  
  
  
  public static void main(String [] args) {
    
                                             // Scanner
    Scanner scan = new Scanner(System.in);
                                             // Declaring and assigning variables
    System.out.print("Enter a sentence: ");
    String sentence = scan.nextLine();
    ArrayList<Integer> notesArr;
    int key;
    Music music = new Music();
    
                                             /* Method that takes a string and turns each
                                              * word into a number. It will do this based on
                                              * the sum of the ASCII values of each letter, mod
                                              * the number of notes in the key.
                                              * Input: String
                                              * Output: Integer ArrayList
                                              */
    notesArr = music.WordsToNotesVal(sentence);
    
                                             /* Method that takes a string and turns each
                                              * word into a number. It will do this based on
                                              * the length of each word.
                                              * Input: String
                                              * Output: Integer ArrayList
                                              */
    // rhythmArr = music.WordsToRhythmVal(sentence);
    
                                             /* Method that takes a string and counts all of the words
                                              * and then mods by 12. This number correlates to a musical key.
                                              * Input: String
                                              * Output: Integer
                                              */                                         
    key = music.WordCountToKey(sentence);
    
                                             /* Method that uses the rhythm and tone array lists and the 
                                              * key integer to produce music.
                                              * Input: Two ArrayList, one Integer
                                              */                                         
    // key = music.createTune(notesArr, rhythmArr, key);

    // Testing print statements
    System.out.println("Key: " + key);
    System.out.println("Note values for words:" + notesArr);
    
  }
}