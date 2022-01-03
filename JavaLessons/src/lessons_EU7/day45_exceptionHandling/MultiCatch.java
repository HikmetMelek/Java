package lessons_EU7.day45_exceptionHandling;

import java.util.Locale;

public class MultiCatch {
    public static void main(String[] args) {

        try{
       //     System.out.println(4/0);
        //    String str=null;
        //    System.out.println(str.toUpperCase(Locale.ROOT));

            int[] ints = {10,4};
            System.out.println(ints[2]);

        }catch(ArithmeticException e) { //ArithmeticException extends RuntimeException
            System.out.println("Arithmetic Exception Happened");

        }catch(NullPointerException e) { //NullPointerException extends RuntimeException
            System.out.println("Nullpointer Exception Happened");

        }catch(RuntimeException e) { // ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
                                     // IndexOutOfBoundsException extends RuntimeException
                                    //  RuntimeException extends Exception
            e.printStackTrace(); // output is: java.lang.ArrayIndexOutOfBoundsException

        }catch(Exception e) {

        }
    }
}
