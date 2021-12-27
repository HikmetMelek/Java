package sundayReview.week11_26122021.carExamples;

public abstract class Car extends Object{
    public String make,model,color;
    public int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public abstract void start();

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
