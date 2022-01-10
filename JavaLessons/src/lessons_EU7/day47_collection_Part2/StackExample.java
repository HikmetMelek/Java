package lessons_EU7.day47_collection_Part2;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // Stack: last in first out (LIFO)

        Stack<Integer> numsStack= new Stack<>();
        numsStack.add(45);
        numsStack.add(47);
        numsStack.add(45);
        numsStack.add(42);
        numsStack.add(41);
        System.out.println(numsStack);

        // check value on top of Stack
        System.out.println(numsStack.peek());

        //read value on top of stack then remove it
        numsStack.pop();
        System.out.println(numsStack);

        System.out.println(numsStack.peek());

        System.out.println(numsStack.get(0));

    }
}
