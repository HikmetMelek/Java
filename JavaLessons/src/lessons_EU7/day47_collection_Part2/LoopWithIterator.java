package lessons_EU7.day47_collection_Part2;

import java.util.*;

public class LoopWithIterator {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(50);
        nums.add(543);
        nums.add(1150);
        nums.add(550);
        nums.add(570);
        nums.add(93);
        nums.add(5000);
        nums.add(950);

        //Create Iterator object
        Iterator<Integer> it = nums.iterator();

        //Call hasNext method
        //hasNext return true, if there is still next value
        //returns false when it reaches the end or empty

        System.out.println("it.hasNext() : " + it.hasNext());
        System.out.println("it.next(): " + it.next());
        System.out.println("it.next(): " + it.next());
        System.out.println("it.next(): " + it.next());

        System.out.println("======");

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //System.out.println("it.next(): " + it.next());  //??

        Iterator<Integer> it2 = nums.iterator();

        //What is the difference between for each loop and iterator?
        //we can remove objects while iteration loop

        while(it2.hasNext()) {
            int val = it2.next();
            if(val>1000) {
                it2.remove();
            }
        }

        System.out.print(nums.toString() + "|");

        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Boston");
        cities.add("Virginia");
        cities.add("DC");

        for(String city : cities) {
            if(city.equals("Boston")) {
                cities.remove(city); // you can not remove obj in for each loop. you get exception
            }
        }
        System.out.println(cities);

















    }
}
