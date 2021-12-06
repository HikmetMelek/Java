package replit.arrays;

import java.util.*;

public class ReverseSentence2 {

	 public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    //TODO: start your code here
	    
	    String[] str= sentence.split(" "); 
	    reversed= str[str.length-1];
	    for(int i=str.length-2; i>=0; i--) {
	    	reversed+= " "+str[i];
	    }   
		    //End your code here. do not modify below statement
		System.out.println(reversed);
		    
	 }

}
