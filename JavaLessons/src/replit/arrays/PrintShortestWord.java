package replit.arrays;

import java.util.*;

public class PrintShortestWord {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
	    
	    int min=Integer.MAX_VALUE;
	    String dummy="";
	    for(int i=0; i<str.length; i++) { 
	    	if(str[i].length()<min) {
	    	min= str[i].length();
	    	dummy=str[i];
	    	}
	    }
	    System.out.println(dummy);
	    
	    
	    
	    
	  }
}
