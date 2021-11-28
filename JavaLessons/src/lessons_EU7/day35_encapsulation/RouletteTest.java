package lessons_EU7.day35_encapsulation;

import java.util.Scanner;

public class RouletteTest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a pocket number ");
		int num=sc.nextInt();
		
		RoulettePocket roulette= new RoulettePocket(num);
		
		while(roulette.getPocketColor().equalsIgnoreCase("invalid")) {
			System.out.println("Change your number!\nEnter your pocket number:");
			roulette.setPocketNumber(sc.nextInt());
		}
		
		System.out.println(roulette.getPocketColor());
	}
	
}
