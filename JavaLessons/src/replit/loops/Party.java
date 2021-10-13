package replit.loops;

import java.util.Scanner;

public class Party {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String answer;
		String list="";
		String name;
	
	
		do {
			
			System.out.println("Please enter guest name:");
			name= input.next();
			System.out.println("Do you want to enter new guest name:");
			answer=input.next();
			if (answer.equals("no")) list+= name;
			else list+= name+", ";
			
		}while(answer.equals("yes"));
		
		System.out.println("Guest's list: "+ list);
		

	}

}
