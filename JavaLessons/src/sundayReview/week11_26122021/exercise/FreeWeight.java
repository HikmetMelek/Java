package sundayReview.week11_26122021.exercise;

public class FreeWeight extends Lifting{
    @Override
    public int getCaloriesCount(int minutes) {

        return minutes*6;
    }

    @Override
    public void perform() {
        System.out.println("lifting free weight");
    }

    @Override
    public void endLift() {
        System.out.println("carefully placing the weight");
    }
}
