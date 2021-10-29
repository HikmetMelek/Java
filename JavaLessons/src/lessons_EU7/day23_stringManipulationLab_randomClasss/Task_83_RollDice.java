package lessons_EU7.day23_stringManipulationLab_randomClasss;

import java.util.Random;
import java.util.Scanner;

public class Task_83_RollDice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran= new Random();
		String roll="";
		
		do{
			
			System.out.println("rolling the dice...");
			int num1= ran.nextInt(6)+1;
			int num2= ran.nextInt(6)+1;
			System.out.println("Their values are: "+num1+" "+num2);
			System.out.println("Roll them again (y=yes) ?");
			roll= sc.next();
			
		}while (roll.equalsIgnoreCase("y"));
		

	}

}
