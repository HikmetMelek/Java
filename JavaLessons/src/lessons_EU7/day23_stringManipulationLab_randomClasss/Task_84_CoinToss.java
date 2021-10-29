package lessons_EU7.day23_stringManipulationLab_randomClasss;

import java.util.Random;

public class Task_84_CoinToss {

	public static void main(String[] args) {
		
		Random rn= new Random();
		
		for (int i=1; i<=10; i++) {
			int coinToss= rn.nextInt(2);
			if (coinToss==0) System.out.println("Heads"); // if (rn.nextInt(2)==0) System.out.println("Heads");
			else System.out.println("Tails");
			
		}

	}

}
