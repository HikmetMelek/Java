package lessons_EU7.day31_arrayList;

import java.util.ArrayList;

public class ShoppingList {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList= new ArrayList<>();
		
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		//print numbers of items
		int count= shoppingList.size();
		System.out.println(count);
		
		// print all items in single line
		System.out.println(shoppingList.toString());
		
		// print first and last item in sing line
		String firstEnd= shoppingList.get(0)+ " / "+ shoppingList.get(count-1);
		System.out.println(firstEnd);
		
		// remove
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));
		
		System.out.println("-----------------------");
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		
		System.out.println("-----------------------");
		// print each item
		for (String shop: shoppingList) {
			System.out.println(shop);
		}
		
		System.out.println("-----------------------");
		// remove all item at once
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		
		
		
		
		
	}

}
