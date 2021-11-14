package lessons_EU7.sundayReview.sundayWeek6_14112021;

import java.util.Arrays;

public class A06_FindMax {

	public static void main(String[] args) {
	
		String[] items= {"shoes","jacket","gloves","airpods","ipad","iphone 12 case"};
		double[] prices= {99.99, 150.0, 9.99, 179.99, 249.9, 39.99};
		int[] itemIDs= {12345, 12346, 12347, 12348, 12349, 12350};
		
		// when you try to find max or min from Data structure, setting an assumption
		//a point check against
		
		Arrays.sort(prices);
		
		double maxPrice= prices[0];
		int indexOfMaxPrice= 0;
		for (int i=0; i< prices.length; i++) {
			if(prices[i] > maxPrice)
				maxPrice= prices[i];
				indexOfMaxPrice=i;
		}
		System.out.println(items[indexOfMaxPrice]+ "- "+ maxPrice+ " £ - #"+ itemIDs[indexOfMaxPrice]);
		//System.out.println(items[indexOfMaxPrice]+ "- "+ prices[indexOfMaxPrice]+ " £ - #"+ itemIDs[indexOfMaxPrice]);
		
		
	}

}
