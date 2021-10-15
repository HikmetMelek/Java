package replit.methods;

import java.util.Scanner;

public class MethodWithReturn_Max {

	public static void main(String[] args) {
//		Finish the method max which has two parameters, x and max.
//		if x is bigger than max return x
//		if max is bigger than x return max
//		all other cases return x	
//		
		Scanner in = new Scanner(System.in);
		System.out.println(max(in.nextInt(), in.nextInt()));
		in.close();
		
	}
	
	public static int max(int x, int max) {
		
		if (x>max) return x;
		else if (max>x) return max;
		else return x;
		
	}
	
}
