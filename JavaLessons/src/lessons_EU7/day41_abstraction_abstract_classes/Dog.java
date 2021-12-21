package lessons_EU7.day41_abstraction_abstract_classes;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override  // i have to override abstract methods in concrete(sub) class from abstract class. i have to implement first sub(concrete) class
    public int eat(String x) {
        return 0;
    }

    @Override
    public void move() {
        System.out.println("Dog is moving");
    }

    // but i do not have to override instance method from abstract class
}
