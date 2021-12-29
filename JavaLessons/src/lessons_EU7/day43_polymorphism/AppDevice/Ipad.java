package lessons_EU7.day43_polymorphism.AppDevice;

public class Ipad extends AppleDevices {
    @Override
    public void use() {
        System.out.println("it is ipad");
    }

    public void draw(){
        System.out.println("drawing shapes using ipad");
    }
}
