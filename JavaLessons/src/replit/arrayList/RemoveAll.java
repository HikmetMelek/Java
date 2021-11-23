package replit.arrayList;

import java.util.*;

public class RemoveAll {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		    int size = in.nextInt();
		    String target = in.next();
		    ArrayList<String> list = new ArrayList<>();
		    for(int i=0; i < size; i++) {
		      list.add(in.next());
		    }

		    System.out.println(removeAll(list, target));

	} 

	public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord){
	   
	    for (int i=0; i< wordList.size(); i++) {
	    	if(wordList.get(i).contains(targetWord)) {
	    		wordList.remove(targetWord);
	    		i--;  /* If two targets are written consecutively, the index of the other is shifted 
	    				when one is deleted. "i" is reduced by one to come back to the same index */
	    	}
	    }
	    
	    return wordList;
	}

}
