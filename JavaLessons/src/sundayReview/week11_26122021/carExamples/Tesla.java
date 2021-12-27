package sundayReview.week11_26122021.carExamples;

public final class Tesla extends Car{
    public Tesla(String make, String model, String color, int year) {
        super(model, color, year);
        super.make="Tesla";
    }

    @Override
    public void start() {
        System.out.println("say start");
    }

    public void autoPilot(){

    }
}
