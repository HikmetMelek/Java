package sundayReview.week11_26122021.carExamples;

public class ParkingLot {
    public static void main(String[] args) {

        //    Car car= new Car(...) --> abstract class cannot be instantiated
        Toyota camry= new Toyota("Camry","white",2020);
        camry.start();
        System.out.println(camry.toString());

        BMW m5= new BMW("BMW","M5","black",2019);
        m5.start();
        System.out.println(m5.toString());

    }

}
