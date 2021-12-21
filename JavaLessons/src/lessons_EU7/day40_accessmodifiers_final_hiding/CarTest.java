package lessons_EU7.day40_accessmodifiers_final_hiding;

public class CarTest {
    public static void main(String[] args) {
        Car c= new Car();

        c.model="M3"; // default value --> same package different class
        c.year=2017; // public value --> same package different class
       // c.door=4; // private value
        c.engine=5.3; // protected value --> same package different class

        System.out.println(c.toString()); // Car extends Object class

    }
}
