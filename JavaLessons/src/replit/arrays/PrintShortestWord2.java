package replit.arrays;

import java.util.*;

public class PrintShortestWord2 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    String[] arr= str.replace(" ", "").split(",");
	    
	    int min=Integer.MAX_VALUE;
	    for(int i=0; i<arr.length; i++) { 
	    	if(arr[i].length()<=min) {
	    	min= arr[i].length();
	    	}
	    }
	    Arrays.sort(arr);
	    ArrayList<String> last= new ArrayList<>();
	    for(int i=0; i<arr.length; i++) { 
	    	if(arr[i].length()==min) 
	    		last.add(arr[i]);
	    	
	    }

	    System.out.println(last);
	    
	 }
	
}
