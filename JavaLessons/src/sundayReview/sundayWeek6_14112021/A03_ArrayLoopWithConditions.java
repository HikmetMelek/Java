package lessons_EU7.sundayReview.sundayWeek6_14112021;

import java.util.Arrays;

public class A03_ArrayLoopWithConditions {

	public static void main(String[] args) {
		
		double[] prices= {22.9,12.4,43.12,65.0,150.9,100.87,90.5,124.9,234.56};
		
		for(double price: prices) {
			System.out.print(price+"  ");
		}
		
		System.out.println("\n-------------------------");
		// first condition: print out prices over 100$
		
		for(double price: prices) {
			if(price>100)
			System.out.print(price+"  ");
		}
		
		System.out.println("\n-------------------------");
		// second cond.: print prices between 40-150
		Arrays.sort(prices);
		System.out.println(Arrays.toString(prices));
		for(double price: prices) {
			if(price>40 && price<150)
			System.out.print(price+"  ");
		}
		
		System.out.println("\n-------------------------");
		// third condition: count the prices which are more than 60, result count
		int count = 0;
		for(double price : prices) {
	        if(price>60) {
	        count++;;
	        }
	    }

	    System.out.println(count);
		
		
	}

}
