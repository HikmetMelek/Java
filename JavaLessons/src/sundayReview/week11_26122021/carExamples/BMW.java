package sundayReview.week11_26122021.carExamples;

public class BMW extends Car{

    public BMW(String make, String model, String color, int year) {
        super(model, color, year);
        super.make=make;
    }

    @Override
    public void start() {
        System.out.println("push the start button");
    }
}
