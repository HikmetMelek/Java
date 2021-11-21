package replit.arrays;

import java.util.*;

public class CopyCertainValues {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
	    System.out.println(Arrays.toString(getWithE(arr)));
	    

	}
	public static String[] getWithE(String[] arr) {
		 
		String s="";
		for (String str: arr) {
			if(str.contains(Character.toString('e')))
				
				s+=str+" ";
		}
		String[] fewValues= s.split(" "); 
			  
		return fewValues;
	}
		  

}
