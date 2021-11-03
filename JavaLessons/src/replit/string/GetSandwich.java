package replit.string;

import java.util.Scanner;

public class GetSandwich {

	public static void main(String[] args) {
		// A sandwich is two pieces of bread with something in between. 
		//Print the string that is between the first and last appearance of "bread" in the given string, 
		//or return string "nothing" if there are not two pieces of bread.
		Scanner scan = new Scanner(System.in);
		System.out.println("write the word");
	    String str = scan.next();
	    String betweenWord="";
		int counter=0;
		
		if (str.contains("bread") && (str.indexOf("bread") != str.lastIndexOf("bread"))) {
			betweenWord= str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread"));
			System.out.println(betweenWord);
		}
	    else System.out.println("nothing");
		  	
		   
//	    if (str.contains("bread")) {
//			  for (int i=0; i<str.length()-4; i++) {
//				if (str.subSequence(i, i+5).equals("bread")) {
//					counter++;
//					if (counter==2) 
//						betweenWord= str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread"));
//					
//				}
//			}
//			System.out.println(betweenWord);
//			
//		}
//	    else System.out.println("nothing");
		  
		
		
		//System.out.println("first bread "+ bread+ " last bread "+ bread2);
		//System.out.println(str.substring(bread+5, bread2));
		
		
		
		
		
		

	}

}
