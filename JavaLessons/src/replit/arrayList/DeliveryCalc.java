package replit.arrayList;

import java.util.*;

public class DeliveryCalc {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    int fuel = in.nextInt();
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.nextInt());
	    }

	    System.out.println(refuel_times(list, fuel));

	  } 
	
	public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {
		int times=0;
		int sum=0;
		for(int i: deliveries) {
			sum+=i;
		}
		int a= (sum%max_fuel>0)? 1 : 0; 
		times= sum/max_fuel + a;
		return times;
	}
}
