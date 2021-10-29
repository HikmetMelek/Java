package lessons_EU7.day23_stringManipulationLab_randomClasss;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random rn= new Random(); // always give you random number every run the code
		System.out.println(rn.nextInt());
		System.out.println(rn.nextDouble());
		System.out.println(rn.nextBoolean());
		
		System.out.println(rn.nextInt(50)); // generate 0-49 (last number not including)
		
		System.out.println(rn.nextInt(10)+5); // generate 5-14 

	}

}
