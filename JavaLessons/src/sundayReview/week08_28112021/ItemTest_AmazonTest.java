package lessons_EU7.sundayReview.week08_28112021;

import java.util.ArrayList;
import java.util.Collections;

public class ItemTest_AmazonTest {

	public static void main(String[] args) {
		
		ArrayList<Item> items= new ArrayList<>();
		
		items.add(new Item("Sony Vaio i7", 950.0, 10));
		items.add(new Item("Lenova"	,800.0, 20));
		items.add(new Item("LG monitor", 450.0, 13));
		items.add(new Item("HP Laptop", 750.0, 24));
		
		// the value of my inventory
		double valueOfInventory=0;
		int largestQuantity=0;
		String nameOfLargest="";
		
		ArrayList<Integer> quantities= new ArrayList<>();
		for (Item each: items) {
			valueOfInventory+=each.calCost();
			if(each.quantity> largestQuantity) {
				largestQuantity= each.quantity;
				nameOfLargest= each.name;
			}
			quantities.add(each.quantity);
		}
		
		System.out.println("Value of inventory: "+ valueOfInventory);
		System.out.println("Item with largest amount: "+ nameOfLargest+ " and quantity: "+ largestQuantity);
		
		System.out.println(Collections.max(quantities));
	}

}
