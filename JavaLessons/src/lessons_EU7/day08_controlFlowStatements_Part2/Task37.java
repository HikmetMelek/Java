package lessons_EU7.day08_controlFlowStatements_Part2;

import java.util.Scanner;

public class Task37 {

	public static void main(String[] args) {
		
//		String m1="Apple";
//		String m2="Dell";
//		String m3="Acer";
//		
		Scanner scan= new Scanner(System.in);
		System.out.println("Select the laptop model= Apple/Acer/Dell");
		String model= scan.nextLine();
		
		switch (model){
			
		case "Apple":
			System.out.println("Apple-no virus");
			break;
		case "Dell":
			System.out.println("Tough one");
			break;
		case "Acer":
			System.out.println("Not recommended");
			break;
		default:
			System.out.println("Do not buy that one");
			
		}
		
	}

}
