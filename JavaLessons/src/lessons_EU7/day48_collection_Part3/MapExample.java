package lessons_EU7.day48_collection_Part3;

import java.util.HashMap;
import java.util.*;

public class MapExample {
    public static void main(String[] args) { // pairs:key+value
        List<Integer> items2 = new ArrayList<>();
        items2.add(10);

        Map<String, Double> items = new HashMap<>();
        items.put("Apple", 3.49); //put(): add()
        items.put("Flowers", 10.99);
        items.put("Eggs", 4.99);
        items.put("Milk", 6.0);
        items.put("Cherries", 4.99);
        items.put("Apple",5.49); // duplicates are not allowed

        System.out.println(items.size());
        System.out.println(items);
        System.out.println(items.isEmpty());
        System.out.println(items.get("Eggs"));// get() key's value
        System.out.println(items.get("Milk"));

        items.remove("Apple");
        System.out.println(items);

        System.out.println("Is Flower there? "+ items.containsKey("Flowers"));
        System.out.println("Is Apple there? "+ items.containsKey("Apple"));

        items.replace("Eggs", 3.5); // replace Eggs' price value
        System.out.println("Price of Eggs: " + items.get("Eggs"));

        items.put("Milk", 2.6);
        System.out.println("Price of Milk: " + items.get("Milk"));

        //increase price of cherries by $2
        items.replace("Cherries", items.get("Cherries")+2);
        System.out.println("Price of Cherries: " + items.get("Cherries"));



    }
}
