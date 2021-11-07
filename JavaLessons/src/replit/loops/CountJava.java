package replit.loops;

import java.util.Scanner;

public class CountJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner scan= new Scanner(System.in);
	 String word = scan.next();
	 int counter=0;
	 for (int i=0; i<word.length()-3; i++){
	 if (word.substring(i,i+4).contains("java"))
		      counter++;
		    } 
		    System.out.println(counter);
	}

}
