package lessons_EU7.day19_stringManipulation_Part1;

import java.util.Scanner;

public class Task_77_Emoji {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Write your emoji: ");
		String emoji= sc.nextLine();
		
		if (emoji.length()!=2) System.out.println("invalid emoji");
	
		else if (emoji.charAt(0)==':') {
				if (emoji.equals(":)")) System.out.println("Smile");
				else if (emoji.equals(":(")) System.out.println("Sad");
				else if (emoji.equals(":/")) System.out.println("Upset");
				else if (emoji.equals(":p")) System.out.println("Playful");
				else System.out.println("unknown emoji");	
			}
		
		else if (emoji.charAt(0)==';') {
			if (emoji.equals(";)")) System.out.println("Wink");
			else if (emoji.equals(";O")) System.out.println("Surprised");
			else System.out.println("unknown emoji");		
		}
		
	//  OZZY RESULT;
//		String emoji = ":)";      
//		
//		//check if it does not equal to 2 chars
//		
//		if(emoji.length() != 2) {
//			System.out.println("Invalid Emoji");
//			return; //stop execution
//		}
//		
//		//if code reaches this point, then emoji is 2 chars
//		//get first and second chars and assign to variables
//		
//		char first = emoji.charAt(0);
//		char second = emoji.charAt(1);
//		
//		if(first==':') {
//			if(second==')') {
//				System.out.println("Smile");
//			}else if(second=='(') {
//				System.out.println("Sad");
//			}else if(second=='/') {
//				System.out.println("Upset");
//			}else {
//				System.out.println("Unknown emoji");
//			}
//			
//		}else if(first==';') {
//			if(second==')') {
//				System.out.println("Wink");
//			}else if(second=='0') {
//				System.out.println("Suprised");
//			}else {
//				System.out.println("Unknown emoji");
//			}
//		}else {
//			System.out.println("Invalid");   //   ))
//		}
		

		
		
		
		
		
		
		
		
		
	}

}
