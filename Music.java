public class Music {
  
  
  public Music() {
    
  }
  
  
  public int WordCountToKey(String words) {
    words = words.trim();
    int cycle = 0;
    int wordNumber = 1;
    while(cycle < words.length()) {
      if(Character.isWhitespace(words.charAt(cycle)) && !(Character.isWhitespace(words.charAt(cycle+1)))) {
        wordNumber++;
      }
      cycle++;
    }
    return wordNumber % 12;
  }
  
  
  
  
  
  
}