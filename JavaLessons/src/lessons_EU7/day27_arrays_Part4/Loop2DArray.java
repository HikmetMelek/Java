package lessons_EU7.day27_arrays_Part4;

import java.util.Arrays;

public class Loop2DArray {

	public static void main(String[] args) {
		
		int[][] numbers = {{1,2,30},{4,50},{7,8,9}};
		
		for (int i=0; i< numbers.length; i++) {
			for (int num: numbers[i]) { // numbers[i]--> give me column
				System.out.print(num+"  ");
			}
		}
		System.out.println("\n-----------------------");
		
		for(int[] num: numbers) {
			System.out.println(Arrays.toString(num));
		}
		
		System.out.println("-----------------------");
		
		for(int row=0;row<numbers.length;row++) {
			
			for(int column=0;column<numbers[row].length;column++) {
				
				
				System.out.println(numbers[row][column]);
				
			}
		}
	
		
		
		
		
	}

}
