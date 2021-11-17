package assignments.assingmentOnArray;

import java.util.*;

public class Q3_Char {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a letter");
		char arr [] = {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
	
		String letter= scan.next().toUpperCase();
		
		boolean isFound= false;
		for (int i=0; i< arr.length;i++) {
			
			if(Character.toString(arr[i]).equals(letter)) {
				isFound= true;
				break;
			}
		}	
		if(isFound)	System.out.println(letter + " found!");	
		else System.out.println(letter + " Not found!");
				
			
		scan.close();
		
	}

}
