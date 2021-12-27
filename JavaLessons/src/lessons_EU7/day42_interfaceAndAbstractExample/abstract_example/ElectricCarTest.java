package lessons_EU7.day42_interfaceAndAbstractExample.abstract_example;

public class ElectricCarTest {
    public static void main(String[] args) {

        //ElectricCar ec = new ElectricCar(); ERROR- can not be instantiated

        Tesla modelS = new Tesla("Model S", 45000, "White");
        modelS.charge();
        modelS.start();
        modelS.drive();
        modelS.stop();

        System.out.println("===========");

        Ford fusion = new Ford("Fusion", 30000, "Black", 2017);
        fusion.charge();
        fusion.start();
        fusion.drive();
        fusion.stop();

        System.out.println("===========");

        TeslaSemi semi = new TeslaSemi("Semi", 50000, "Brown", 3.5);
        semi.charge();
        semi.start();
        semi.load("Oranges");
        semi.drive();
        semi.stop();

        System.out.println("===========");

        TeslaTruck tr = new TeslaTruck("CyberTruck", 100000, "White", 6.5);
        tr.charge();
        tr.start();
        tr.load("Java Books");
        tr.drive();
        tr.stop();

        System.out.println("===========");
        System.out.println(modelS.toString());
        System.out.println(fusion.toString());
        System.out.println(semi.toString());
        System.out.println(tr.toString());


    }
}
