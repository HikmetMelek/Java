package lessons_EU7.day31_arrayList;

import java.util.ArrayList;

public class arrayListIntro {

	public static void main(String[] args) {
		//Creating an arraylist
		ArrayList<String> names= new ArrayList<>();
		ArrayList<Integer> nums= new ArrayList<>();
		
		// Assigning values to arraylist
		names.add("Mike");
		names.add("Smith");
		names.add("John");
		names.add("Emmy");
		names.add("Evan");
		names.add("Mary");
		
		nums.add(99); // 99: an object
		nums.add(656);
		nums.add(100);
		nums.add(new Integer("100"));
		
		//Reading from arraylist
		
		System.out.println(names.get(0));
		System.out.println(names.get(5));
		System.out.println(nums.get(2));
		
		System.out.println("Names count: "+ names.size()); 
		System.out.println("Nums count: "+ nums.size());
		
	}

}
