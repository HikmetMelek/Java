package lessons_EU7.day43_polymorphism;

public class AppleStore_Main {
    public static void main(String[] args) {

        AppleDevices mac= new Mac();
        mac.use();
      //  mac.code();  ERROR --> there is not overridden.

        Mac myMac= new Mac();
        myMac.use();
        myMac.code();

        AppleDevices watch= new AppleWatch();
        watch.use();

    }
}
