package lessons_EU7.day31_arrayList;

import java.util.ArrayList;

public class Cities {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString());
		
		// print each city by using for-each loop seperated by space
		
		for(String city: cities) {
			System.out.print(city+" ");
		}
		
		System.out.println("\n");
		// print each city by using for-iteration loop
		for (int i=0; i< cities.size(); i++) {
			System.out.println(cities.get(i));
		}
		
		System.out.println("\n--------------");
		System.out.println("Removing Baku");
		cities.remove("Baku"); // remove only first baku
		
		System.out.println(cities.toString());
		
		System.out.println("\n--------------");
		cities.add(0, "Arligton");
		cities.add(1, "Istanbul");
		
		
		System.out.println(cities.toString());
		cities.add(2, "Ankara");
		System.out.println(cities.toString());

		System.out.println("\n--------------");
		
		int idx= cities.indexOf("Istanbul");
		System.out.println(idx);
		
		System.out.println(cities.indexOf("Bursa"));
		
		System.out.println("\n--------------");
		
		cities.clear();
		boolean empty= cities.isEmpty(); // isEmpty() --> cities is empty or not!!!! true/false
		System.out.println(empty);
		
		
		
	}

}
