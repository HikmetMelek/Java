package lessons_EU7.day26_arrays_Part3;

import java.util.Scanner;

public class MethodArray2 {

	public static void main(String[] args) {
	System.out.println(findCar(3,"Honda"));	

	}

	public static String[] creatArray(int size) {
		String[] carArray= new String[size];
		Scanner sc= new Scanner(System.in);
		for (int i=0; i< carArray.length; i++) {
			System.out.println("Enter car type"+ (i+1)+": ");
			carArray[i]= sc.next();
		}
		return carArray;
	}
	
	public static boolean findCar(int value, String toFind) {
	
		for(String car: creatArray(value)) {
			if(car.equalsIgnoreCase(toFind)) return true;
		}
		return false;
	}
	
	
}
