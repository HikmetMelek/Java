package lessons_EU7.day40_accessmodifiers_final_hiding_2;

import lessons_EU7.day40_accessmodifiers_final_hiding.Car;

public class Car2 extends Car {

    public Car2(){
      //  model="M3"; // default value --> different package with subclass
        year=2017; // public value --> different package with subclass
     //   door=4; // private value
        engine=5.3; // protected value --> different package with subclass
    }


}
