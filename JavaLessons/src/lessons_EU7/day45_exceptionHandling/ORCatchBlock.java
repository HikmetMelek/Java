package lessons_EU7.day45_exceptionHandling;

public class ORCatchBlock {

    static String str;

    public static void main(String[] args) {

        try {
            System.out.println(str.toUpperCase());

        }catch(IllegalArgumentException | NullPointerException e){//Exception types can NOT be sub-parent types/relationship to write this way ( | )
            e.printStackTrace();
        }

    }
}
