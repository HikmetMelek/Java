package lessons_EU7.day45_exceptionHandling;

public class RuntimeError {
    public static void main(String[] args) {
        go();
    }
    public static void go(){
        System.out.println("Going");
    //   go(); // --> runtime error
    }
}
