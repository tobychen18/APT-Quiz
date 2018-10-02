//Toby Chen tc248
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class SetAside {
      public String common(String[] list) {
    	  ArrayList<String> duplicateWords = new ArrayList<String>();
    	  HashMap<String, Integer> commonWords = new HashMap<>();
          for(int i=0; i < list.length; i++) {
        	  HashSet<String> splitMessages = new HashSet<String>(Arrays.asList(list[i].split(" ")));
        	  
        	  for(String str: splitMessages) {
        		  if(!commonWords.containsKey(str)) {
        			  commonWords.put(str, 1);
        		  }
        		  else {
        			  commonWords.put(str, commonWords.get(str)+1);
        		  }
        	  }
          }
          for(String s: commonWords.keySet()) {
        	  if(commonWords.get(s)==list.length) {
        		  duplicateWords.add(s);
        	  }
          }
        		  Collections.sort(duplicateWords);
         	 return String.join(" ",duplicateWords);
      }
  }