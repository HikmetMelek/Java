package lessons_EU7.sundayReview.sundayWeek2_live_lesson_190921;

public class Unary {

	public static void main(String[] args) {
		
		System.out.println(10>5);
		System.out.println(!(10>5));
		System.out.println("**************");
		
		int a = 12;

        if(++a>12) {
            System.out.println(" a1 = " + a); }


        else {
            System.out.println("a2 = " + a);

        }
        
        if(a++>13) {
            System.out.println(" a3 = " + a); }


        else {
            System.out.println(" a4 = " + a);

        }

	}
}
