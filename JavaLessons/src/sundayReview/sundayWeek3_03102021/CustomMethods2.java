package lessons_EU7.sundayReview.sundayWeek3_03102021;

public class CustomMethods2 {

	public static void main(String[] args) {
		
		
		int person1 = 10;
        eligibleOrNot(person1);

        eligibleOrNot(20);

        eligibleOrNot(24);

    }

    public static void eligibleOrNot(int age) {

        int person = age;

        if (person>=21) {
            System.out.println("Eligible to buy");
        }else {
            System.out.println("NOT Eligible to buy");
        }
    }



}
