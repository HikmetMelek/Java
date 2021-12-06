package replit.arrays;

import java.util.Scanner;

public class Printing02 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] arr = new String[8];
		for(int i=0; i<4; i++){
			arr[i]=input.nextLine();
			arr[i+1]=input.nextLine(); 
			System.out.println(arr[i]+", "+arr[i+1]);
		}
		
	}

}
