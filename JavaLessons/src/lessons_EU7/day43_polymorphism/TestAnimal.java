package lessons_EU7.day43_polymorphism;

public class TestAnimal {
    public static void main(String[] args) {

        Animal a= new Animal();
        Animal b= new Dog();
        Animal c= new Bird();


        Animal animal= new Animal();
        animal= new Dog();
        animal= new Bird();

    //    Bird b1= new Dog(); left side should be parented of right side, there should be inheritance between classes

    }
}

class Animal{}

class Dog extends Animal{}

class Bird extends Animal{}