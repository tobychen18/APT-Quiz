//Toby Chen tc248
import java.util.LinkedHashSet;


public class StringCuts {
     public String[] filter(String[] list, int minLength) {
    	  LinkedHashSet<String> wordsAndLetterCount = new LinkedHashSet<>();
    	  for(int i = 0; i < list.length; i++) {
    		  String word = list[i];
    		  if(word.length() >= minLength){
    		  wordsAndLetterCount.add(word);
    		  }
    	  }
    	  
    	  String[] returnedWords = wordsAndLetterCount.toArray(new String[wordsAndLetterCount.size()]);
         return returnedWords;
     }
 }