package lessons_EU7.day43_polymorphism.AppDevice;

public class AppleWatch extends AppleDevices {
    @Override
    public void use() {
        System.out.println("it is watch");
    }

    public void wear(){
        System.out.println("wearing apple watch");
    }


}
