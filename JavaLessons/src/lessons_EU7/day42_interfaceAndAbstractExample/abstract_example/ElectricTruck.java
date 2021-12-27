package lessons_EU7.day42_interfaceAndAbstractExample.abstract_example;

public abstract class ElectricTruck extends ElectricCar {

    public ElectricTruck(String model, double price, String color) {
        super(model, price, color);
    }

   abstract void load(String item);


}
