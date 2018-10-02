import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class DonorStats {
      public String[] calculate(String[] donations) {
    	  
    	  HashMap<String, Integer> candidatesAndDonations = new HashMap<>();
    	  HashMap<String, Integer> candidatesAndNumberOfDonations = new HashMap<>();
    	  
    	  for(int i=0; i < donations.length; i++) {
    		  String[] candidateAndDonations = donations[i].split(":");
    		  String candidate = candidateAndDonations[0];
    		  String[] stringOfCandidateDonations = candidateAndDonations[1].split(",");
    		  for(String integer: stringOfCandidateDonations)
    		  {
    			  if(!candidatesAndDonations.containsKey(candidate)) {
    				  candidatesAndDonations.put(candidate, Integer.parseInt(integer));
    				  candidatesAndNumberOfDonations.put(candidate, 1);
        		  }
        		  else {
        			  candidatesAndDonations.put(candidate, candidatesAndDonations.get(candidate)+Integer.parseInt(integer));
        			  candidatesAndNumberOfDonations.put(candidate, candidatesAndNumberOfDonations.get(candidate)+1);
        		  }
    		  }
    	  }
    	  ArrayList<String> alphabeticOrder = new ArrayList<String>(candidatesAndDonations.keySet());
    	  Collections.sort(alphabeticOrder); 
    	  String[] candidatesAndTheirDonations = new String[candidatesAndNumberOfDonations.size()];
    	  for(int i = 0; i<candidatesAndTheirDonations.length; i++)
    	  {
    		 String candidate = alphabeticOrder.get(i);
    		 
    			  candidatesAndTheirDonations[i] = String.format("%s:%d:%d",candidate,candidatesAndNumberOfDonations.get(candidate),candidatesAndDonations.get(candidate));
    		  
    	  }
    	 
    	  return candidatesAndTheirDonations;
    	  
      }
}
    	  
    	  