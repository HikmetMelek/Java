package lessons_EU7.day47_collection_Part2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        //Queue: first in first out(FIFO)
        Queue<String> queue= new LinkedList<>();
        queue.add("Mike");
        queue.add("ozzy");
        queue.add("jamal");
        queue.add("asia");
        System.out.println(queue);

        String name= queue.remove();
        System.out.println(name);
        System.out.println(queue);

        // removing an element from Queue using poll()
        // the poll() method is similar to remove() except that it returns null if the queue is empty
        name= queue.poll();
        System.out.println(name);
        System.out.println(queue);

        //get the element at the front of the queue without removing it using peek()
        name = queue.peek();// only give first element but not remove
        System.out.println(name);
        System.out.println(queue.toString());


    }
}
