package lessons_EU7.day31_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tester_ConvertArrayToArrayList {
    public static void main(String args[]) {
        String[] array = {"a", "b", "c", "d", "e"};

        //Method 1
        List<String> list = Arrays.asList(array);
        System.out.println(list);

        //Method 2
        List<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, array);
        System.out.println(list1);

        //Method 3
        List<String> list2 = new ArrayList<String>();
        for(String text:array) {
            list2.add(text);
        }
        System.out.println(list2);
    }
}
