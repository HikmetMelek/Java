package lessons_EU7.day41_abstraction_abstract_classes;

public abstract class Animal {   // abstract class can have abstract method and instance method at the same time.
                                 // abstract class can only have instance method/  static method too (without abstract method).
                                // if class have an abstract method, class must be abstract class (public abstract class Animal)

    public abstract void  eat(); // abstract method with abstract keyword and without {}  , have not body!

    public abstract void move();

    public void breathe(){  //instance method  // u can override this method or use with super.breathe() in sub class(concrete class);
        System.out.println("breathing");
    }

}
