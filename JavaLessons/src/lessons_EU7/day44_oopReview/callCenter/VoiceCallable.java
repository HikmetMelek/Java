package lessons_EU7.day44_oopReview.callCenter;

public interface VoiceCallable {
    
    boolean CAN_CALL = true; // value is: public static final boolean

    //abstract method
    void call(String contact); // = public abstract void call(String contact);

    //static method
    public static void decline() {
        System.out.println("Mike decline voice call..");
    }

    // default method
    public default void accept(){
        System.out.println("Mike finally accepted voice call..");
    }
}
