package lessons_EU7.day46_collection_Part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayVSArraylist {
    public static void main(String[] args) {

        int[] numsArray = {30,50,100,5,6};

        String[] days = new String [7];
        days[0] = "Monday";

        Object[] obj = {2,"apple",true};

        ArrayList<Integer> numberList = new ArrayList<>();
        List<Integer> numberList2 = new ArrayList<>();
        Collection<Integer> numberList3 = new ArrayList<>();

        numberList.add(40);
        numberList.add(50);
        numberList.add(100);
        numberList2.add(39);
        numberList2.add(79);

        System.out.println(numsArray[0]);
        System.out.println(numberList.get(0));
        System.out.println(numberList2.get(0));
        System.out.println(numberList2.get(1));

    }
}
