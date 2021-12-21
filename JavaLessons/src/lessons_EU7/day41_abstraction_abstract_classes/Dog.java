package lessons_EU7.day41_abstraction_abstract_classes;

public class Dog extends Animal{

    @Override  // i have to override abstract methods in concrete(sub) class from abstract class. i have to implement first sub(concrete) class
    public void eat() {
        System.out.println("Dog is eating dog food");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving");
    }

    // but i do not have to override instance method from abstract class
}
