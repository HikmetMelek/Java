package replit.string;

import java.util.Scanner;

public class Alejandro_I_II {

	public static void main(String[] args) {
	//REPLIT: Alejandro I
		// Alejandro has many emails and only has time to read the emails that refer to him. 
		// Check if his name is found in the email and if it does print "read", 
		// but if his name is not in the email print "don't read"
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		
		if (a.contains("alejandro")) System.out.println("read");
		else System.out.println("don't read");
		
	// REPLIT: Alejandro II
		// Alejandro has many emails and only has time to read the emails that refer to him and a project. 
		// Check if his name is found in the email and if project is also included and if it does print "read",
		// but if his name is not in the email print "don't read"		
		if (a.contains("alejandro") && a.contains("project")) System.out.println("read");
		else System.out.println("don't read");
		
	
		
	}

}
