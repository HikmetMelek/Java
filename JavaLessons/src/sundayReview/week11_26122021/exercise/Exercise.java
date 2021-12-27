package sundayReview.week11_26122021.exercise;

public abstract class Exercise {

    public abstract int getCaloriesCount(int minutes);

    public abstract void perform();

    public void start(){
        System.out.println("warming up and starting the exercise");
    }

}
