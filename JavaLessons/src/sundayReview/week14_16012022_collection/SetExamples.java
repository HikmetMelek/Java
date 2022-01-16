package sundayReview.week14_16012022_collection;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        // HashSet: no duplicates, does not care about insertion order, no index
        Set<Integer> set =  new HashSet<>();
        set.addAll(Arrays.asList(100,1,28,8,100,59,null,null));
        System.out.println("set = " + set); // it does not keep the insertion order //set = [null, 1, 100, 8, 59, 28]

        // LinkedHashSet:no duplicates, has null values, keeps the insertion order
        Set<Integer> set2 =  new LinkedHashSet<>();
        set2.addAll(Arrays.asList(100,1,28,8,100,59,null,null));
        System.out.println("set2 = " + set2); //set2 = [100, 1, 28, 8, 59, null]

        // TreeSet: does NOT accept null, sorts the list, no duplicates.
        Set<Integer> set3 =  new TreeSet<>();
        set3.addAll(Arrays.asList(100,1,28,8,100,59)); // if there is null value in list you get exception
        System.out.println("set3 = " + set3); //set3 = [1, 8, 28, 59, 100]


        // if i want to use .sort() with HashSet (without null values), can i use it? --> NO

        /* in order to use Collections.sort method, our class has to implement Comparable interface

         */




    }
}
