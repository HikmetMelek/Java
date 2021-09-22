package replit.statements;

import java.util.Scanner;

public class QuizQuestion {

	public static void main(String[] args) {
		
		String answer;
		Scanner input = new Scanner(System.in);
	    
		System.out.println("what is the farthest planet in the solar system:");
	    System.out.println("a)venus");
	    System.out.println("b)pluto");
	    System.out.println("c)neptune");
	    answer=input.next();
	    switch (answer) {
	    case "a":
	    	System.out.println("a is wrong");
	    	break;
	    case "b":
	    	System.out.println("b is correct");
	    	break;
	    case "c":
	    	 System.out.println("c is wrong");
	    	 break;
	    default:
	    	System.out.println (answer+" is not a valid answer");
	    }
	  
	    
	}

}
