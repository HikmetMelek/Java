package replit.methods;

import java.util.Scanner;

public class MethodsWithReturn_Profit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter buy price and sell price :");
		System.out.println(profits(in.nextInt(), in.nextInt()));
		
		in.close();
	}
	
	public static String profits(int buyPrice,int sellPrice){
		
		if (buyPrice < sellPrice) return "profit";
		else if (buyPrice> sellPrice) return "loss";
		else return "no loss";
		
	}

}

