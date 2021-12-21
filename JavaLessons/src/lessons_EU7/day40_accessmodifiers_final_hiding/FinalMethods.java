package lessons_EU7.day40_accessmodifiers_final_hiding;

public class FinalMethods {
    public  final void method1(){
        System.out.println("method-1");
    }
    public static void staticMethod(String word)
    {
        System.out.println("static method");
    }

    class Sub extends FinalMethods{
/*
        public void method1() {
            System.out.println("method-1 in sub class");
        }

 */    /*
        public static void staticMethod(String word){
            System.out.println("static method in sub class");
        }
        */
    }
}
