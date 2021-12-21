package lessons_EU7.day40_accessmodifiers_final_hiding;

public class Car {
    String model;
    public int year;
    private int door;
    protected double engine;

    @Override  // Car extends Object
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }
}


