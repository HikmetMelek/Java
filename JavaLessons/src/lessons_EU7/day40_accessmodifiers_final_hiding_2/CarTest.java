package lessons_EU7.day40_accessmodifiers_final_hiding_2;

import lessons_EU7.day40_accessmodifiers_final_hiding.Car;

public class CarTest {
    public static void main(String[] args) {
        Car c = new Car();

      //c.model="M3"; // default value --> different package different class
        c.year=2017; // public value --> different package different class
     // c.door=4; // private value
     // c.engine=5.3; // protected value --> different package different class





    }
}
