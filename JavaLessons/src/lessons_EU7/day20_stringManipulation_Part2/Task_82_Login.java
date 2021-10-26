package lessons_EU7.day20_stringManipulation_Part2;

import java.util.Scanner;

public class Task_82_Login {

	public static void main(String[] args) {
		
		String name= "mlk";
		String word= "721";
		
		Scanner login= new Scanner(System.in);
		
		System.out.print("Please enter your username:");
		String userName= login.nextLine();
		
		System.out.print("Enter your password:");
		String passWord= login.nextLine();
		
		if(userName.equals("") && passWord.equals("")) System.out.println("Username and Password Fields cannot be empty");
		else if(userName.equals("") && !passWord.equals("")) System.out.println("Username cannot be empty");
		else if(!userName.equals("") && passWord.equals("")) System.out.println("Password cannot be empty");
		else if(!userName.equals(name) || !passWord.equals(word)) System.out.println("Username or Password is not valid.Please verify");
		else if(userName.equals(name) && passWord.equals(word)) System.out.println("User Logged in successfully");
			
		login.close();
		
		
	}

}
