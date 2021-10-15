package replit.methods;

import java.util.Scanner;

public class MethodsWithReturn_Hamlet {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("\"to be or not to be\"");
		 System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
		
		in.close();
	}
	
	public static boolean hamletQuote(boolean toBe,boolean notToBe){
		
		if (!toBe && !notToBe) return false;
		else return true;
		
	}

}

