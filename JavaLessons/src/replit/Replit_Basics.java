package replit;

import java.util.Scanner;

public class Replit_Basics {

	public static void main(String[] args) {
		int num1 = 2;
	    double cost1 =5;
	    System.out.println("num= "+ num1 + "\ncost= "+ cost1);
	    
	    System.out.println("===========================");
	    
	    String word= "Java";
	    System.out.println("Today's word of the day is: "+ word);
	    
	    System.out.println("===========================");
	    
	    int first= -124, second= -500;
	    System.out.println("first is "+ first + " and second is "+ second);
	    
	    System.out.println("===========================");
	    
	    // Print Variable_7
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("What do you learn");
	    String topic1 = scan.nextLine();
	    String topic2 = scan.nextLine();

	    if (topic1.equals("Java") && topic2.equals("SQL"))
	    
	    System.out.println("I will learn \""+ topic1+"\" and \""+ topic2+"\" at CybertekSchool.");  
	   
	    
	   
	    
	   


	}

}
