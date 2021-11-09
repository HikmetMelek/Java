package lessons_EU7.day25_arrays_Part2;

import java.util.Random;

public class Task_91_RandomArrayNumbers {

	public static void main(String[] args) {
		
		Random rn= new Random();
		
		int [] numbers= new int[10];
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i]= rn.nextInt(100);
			System.out.println(numbers[i]);	
		}

	}

}
