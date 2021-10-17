package replit.methods;

import java.util.Scanner;

public class MethodWithReturn_SimpleRoomBooking {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Is room avaible?");
		System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
		
		in.close();
	}
	
	public static boolean simpleRoomBook(boolean isAvailable,int day, int month, int year){
		
		if (year!=2018) return false;
		else if ((month==1 && day>=7) || (month==8 && day<=7)) return false;
		else if (month>1 && month<8) return false;
		else if (!isAvailable) return false;
		else return true;
			
		
			 
			
	}
		
		
}
	
