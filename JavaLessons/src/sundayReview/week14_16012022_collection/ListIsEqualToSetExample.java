package sundayReview.week14_16012022_collection;

import java.util.*;

public class ListIsEqualToSetExample {

    public static void main(String[] args) {

        List<Integer> list =  new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 =  new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Set<Integer> set =  new TreeSet<>(Arrays.asList(1,2,3,4,5));

        System.out.println(list.equals(set));// false
        System.out.println(list.equals(list2)); //true
        System.out.println(list.containsAll(set));// true
    }
}

