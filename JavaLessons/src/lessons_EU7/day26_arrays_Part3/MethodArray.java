package lessons_EU7.day26_arrays_Part3;

import java.util.Random;

public class MethodArray {

	public static void main(String[] args) {
		
	printArray(5);	

	}
	public static int[] createArray(int arraySize) {
		
		Random rn= new Random();
		int[] myArray= new int [arraySize];
		for(int i=0; i<arraySize;i++) {
			myArray[i]= rn.nextInt(100);
		}
		
		return myArray;
		
	}
	public static void printArray(int number) {
		
		for(int value : createArray(number)){
			System.out.println(value);
		}
		
	}
}
