package lessons_EU7.practice;

public class Array_FirstUniqueElement {
    public static void main(String[] args) {

        int[] numbers={4,72,5,89,26,89,5};
        System.out.println(firstDuplicatedElement(numbers));
    }

    /*
    write a program that can find the first duplicated element from the array
     */

    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }

        return firstDuplicated;

    }


}
