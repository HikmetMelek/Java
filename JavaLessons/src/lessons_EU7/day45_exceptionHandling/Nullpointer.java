package lessons_EU7.day45_exceptionHandling;

import java.util.Locale;

public class Nullpointer {
    static String name;

    public static void main(String[] args) {
        try{
            System.out.println(name.toUpperCase(Locale.ROOT));
        }catch (NullPointerException e){ //(Exception e)
            System.out.println("Nullpointerexception happened");
            System.out.println("Here is the message: " + e.getMessage());
            System.out.println("Here is the stack trace: ");
            e.printStackTrace();

        }

    }

}
