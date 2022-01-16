package sundayReview.week14_16012022_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ListExamples {
    public static void main(String[] args) {
        List<String> listOne= new ArrayList<>();
        List<String> listTwo= new Stack<>();

        listTwo.add("oscar");
        listTwo.add("enes");
        listTwo.add("zehra");
        listTwo.add("melek");
        //list can have multiple null values, keeps the insertion order, has index
        //listTwo.add(null);
        //listTwo.add(null);
        System.out.println("listTwo = " + listTwo);

        //Stack : LIFO structure
        //peek(): takes a look at the last value. peek is a Stack method

        System.out.println(((Stack<String>) listTwo).peek());

        System.out.println(listOne instanceof List); // true
        System.out.println("listOne = " + listOne); // listOne was empty list

        listOne= listTwo; //assigning operator

        System.out.println("listOne = " + listOne);

        // iteration with stack
        // sort the lists

        if(!listTwo.contains(null)){  // you have to command out null values if you want to sort listTwo
            Collections.sort(listTwo); // I can NOT sort it if it has null values
        }
        System.out.println("after sorting = " + listTwo);


    }
}
