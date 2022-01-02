package sundayReview.week12_02012022.polymorphismDemo;

public class Superman extends Father implements Worker{
    @Override
    public void work(String job) {
        System.out.println("superman is working as "+ job);
    }

    @Override
    public double getPaid() {
        return 8000;
    }
}
