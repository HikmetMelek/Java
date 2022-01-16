package sundayReview.week14_16012022_collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10,100,50,5000));
        System.out.println(((LinkedList<Integer>) list).getFirst());

        //Queue: FIFO
        System.out.println(((LinkedList<Integer>) list).peek());

        ((LinkedList<Integer>) list).addFirst(1); // addFirst() comes from queue interface
        System.out.println(((LinkedList<Integer>) list).peek());


        ((LinkedList<Integer>) list).addLast(10000); // addLast() comes from queue interface
        System.out.println(list);

        System.out.println("list.get(0) = " + list.get(0)); // coming from List interface
        System.out.println("list.get(5) = " + list.get(list.size()-1));
    }
}
