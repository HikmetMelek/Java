package lessons_EU7.day45_exceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        String str="Selenium";

        try{
            System.out.println(str.length());
            System.out.println(str.charAt(100));
        }catch (Exception e){
            System.out.println("enter correct index");
        }finally {
            System.out.println("finally block");
        }

        System.out.println("Bye...");
    }
    /*
    A
    try{
        B
        C
    }catch(Exception e){
        D
        E
    }finally{
        F
    }
    K
1 - No error: output--> A B C F K
2- A has error : output--> nothing // stop running at A
3- C has a problem: output--> A B D E F K
4- C and D has error: output-- >A B F and execution stops at D, show error
     */

}
