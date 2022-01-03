package lessons_EU7.day45_exceptionHandling;

public class CheckedVSUncheckedException {
    public static void main(String[] args) throws InterruptedException {
       //1. solution to handle with checked exception is try/catch
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //2. solution to handle with checked exception is "throws InterruptedException"
        Thread.sleep(1000);
    }
}
