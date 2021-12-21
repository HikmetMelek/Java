package lessons_EU7.day41_abstraction_abstract_classes;

public abstract class Bird extends Animal{  // Bird Class: first concrete class of Animal; u have to override abstract methods!!!!
/*                        // if we do not override one of the abstract methods , concrete class of Bird has to remaining part of abstract classes
    @Override                                                                 // look at wing and parrot classes, they have eat();
    public void eat() {
        System.out.println("Bird eating");
    }
*/
    @Override
    public void move() {
        System.out.println("Bird moving");
    }

    public abstract void fly();


}
