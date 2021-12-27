package sundayReview.week11_26122021.exercise;

public class Swimming extends Exercise{
    @Override
    public int getCaloriesCount(int minutes) {

        return minutes*8;
    }

    @Override
    public void perform() {

    }
}
