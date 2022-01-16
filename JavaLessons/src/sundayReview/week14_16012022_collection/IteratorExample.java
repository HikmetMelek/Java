package sundayReview.week14_16012022_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample    {
    public static void main(String[] args) {

        List<Integer> nums= new ArrayList<>();
        nums.addAll(Arrays.asList(50,100,10,15,1150,5000));

        // let's iterate or traverse the list with iterator object
        // create an iterator object

        Iterator<Integer> it= nums.iterator(); // polymorphic way : left side is interface right side is ArrayList

        // call hasNext method
        // returns true if there is still a value
        // returns false if it is the end of the list

        System.out.println(it.hasNext());// we put a pointer(at the beginning of list) and moves each time
        System.out.println("without loop: "+ it.next()); // this one moves the cursor to next element and reads it
        System.out.println("without loop: "+ it.next());

        while (it.hasNext()){
            System.out.println(it.next());
        }

    //    System.out.println(it.next());//java.util.NoSuchElementException

        // if you want to loop trough again, create an iterator object again

        Iterator<Integer> it2= nums.iterator();

        //what is difference between for each loop an iterator? we can remove object while looping

        while (it2.hasNext()){
            int value= it2.next();
            if(value>=100){  // for each element: if it is bigger or equal 100, remove this element
                it2.remove();
            }
        }
        System.out.println(nums);

        System.out.println("==================================================");
        System.out.println("with for each loop");
        List<Integer> nums2= new ArrayList<>();
        nums2.addAll(Arrays.asList(50,100,10,15,1150,5000));
       /*

        int i=0;
        for (int value : nums2) {
            if(value>=100){
                nums2.remove(i);
            }
            i++;
        } //java.util.ConcurrentModificationException

       */




    }
}
