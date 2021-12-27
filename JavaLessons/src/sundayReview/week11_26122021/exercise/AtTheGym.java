package sundayReview.week11_26122021.exercise;

public class AtTheGym {
    public static void main(String[] args) {

        FreeWeight free= new FreeWeight();
        free.start();
        System.out.println("I lifted weight for 30 minutes: "+ free.getCaloriesCount(30)+ " calories");


    }
}
