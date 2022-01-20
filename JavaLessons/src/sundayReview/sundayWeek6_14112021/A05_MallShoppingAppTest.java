package sundayReview.sundayWeek6_14112021;

import java.util.Arrays;

public class A05_MallShoppingAppTest {

	public static void main(String[] args) {
		
		String[] items= {"shoes","jacket","gloves","airpods","ipad","iphone 12 case"};
		double[] prices= {99.99, 150.0, 9.99, 179.99, 249.9, 39.99};
		int[] itemIDs= {12345, 12346, 12347, 12348, 12349, 12350};
		
		System.out.println("------------find index of gloves--------------");
		System.out.println(Arrays.binarySearch(items, "gloves"));
		int j=0;
		for(String i: items) {
			if(i.equals("gloves")) {
				System.out.println("index of the item : "+j);
			}
		j++;
		}
		
		for(int i=0; i<items.length; i++) {
			if(items[i].equals("gloves")) {
				System.out.println("index of the item : "+ i);
			}
		}
		boolean ip=false;
		for(int i=0; i<items.length; i++) {
			if(items[i].equalsIgnoreCase("ipad")) {
				ip= true;
				break;
			}
		}
		System.out.println(ip);	
		//System.out.println(Arrays.toString(items).contains("ipad"));
		System.out.println("---------------");
		
		for (int i=0; i<items.length; i++) {
			
			System.out.println(items[i]+" - "+ prices[i]+ "£ -#"+itemIDs[i] );
		}
		
		System.out.println("---------------");
		
		for (int i=0; i<items.length; i++) {
			if (items[i].equalsIgnoreCase("jacket")) 
			System.out.println(items[i]+" - "+ prices[i]+ "£ - #"+itemIDs[i] );
			
		}
		
		
		
		
		
		
		
		
	}

}
