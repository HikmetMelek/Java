package sundayReview.week11_26122021.carExamples;

public class Toyota extends Car{
    public Toyota(String model, String color, int year) {
        super(model, color, year);
        super.make="Toyoya";
    }

    @Override
    public void start() {
        System.out.println("twist the key");
    }
}
