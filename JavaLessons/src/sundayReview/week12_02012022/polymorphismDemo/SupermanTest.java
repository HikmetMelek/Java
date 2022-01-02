package sundayReview.week12_02012022.polymorphismDemo;

public class SupermanTest {
    public static void main(String[] args) {
        Father spman1= new Superman();
        spman1.playWithKid();
        spman1.feedKid();
        spman1.raiseKid();
        ((Superman)spman1).work("QA");

        System.out.println("===========================");

        Worker spman2= new Superman();
        spman2.getPaid();
        spman2.work("SDET");
        ((Father)spman2).feedKid();

        System.out.println("===========================");
        Superman spman3= new Superman();
        spman3.work("DA");
        spman3.feedKid();
    }
}
