package lessons_EU7.day45_exceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        try{
            String str= "JAVA";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(4)); // i might have problem here
            System.out.println(str.charAt(1)); // will not be EXECUTED

        }catch(Exception e){
           System.out.println("Exception happened in try block and was cought");

        }
        System.out.println("After try catch block");
    }
    /*
    try{
        A
        B
        C
    }catch(Exception e){
        D
    }
    J
1 - There is no any problem/exception : output--> A B C J
2- A triggered exception/error: output--> D J
3- B triggered exception/error: output--> A D J
4- C triggered exception/error: output--> A B D J
     */

}
