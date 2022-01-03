package lessons_EU7.day45_exceptionHandling;

public class TryCatch2 {
    public static void main(String[] args) {
        int[] num= {36,6,32,12};
      //  System.out.println(num{0]); // compile error

        try{
            System.out.println(num[6]);
        }catch(Exception e){
           // System.out.println("wrong index");
            e.printStackTrace();
            System.out.println("==============");
            System.out.println(e.getMessage());
        }

        System.out.println("******************************");

        try{
            int j=100;
            int n=j/0;
        }catch (ArithmeticException e){ // you can use (Exception e)
            e.printStackTrace(); // even if u write (Exception e)  this method already gives u output with "java.lang.ArithmeticException: / by zero"
            System.out.println(e.getMessage());
        }


    }
}
