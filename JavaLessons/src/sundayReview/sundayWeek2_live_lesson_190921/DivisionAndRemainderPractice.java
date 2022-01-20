package sundayReview.sundayWeek2_live_lesson_190921;

public class DivisionAndRemainderPractice {

	public static void main(String[] args) {
		
		int seconds=3910;
		int hour,minute,second;
		
		//converted XX hours XX minute XX seconds.
		second=seconds%60;
		System.out.println("second "+second);
		minute= seconds/60%60;
		System.out.println("minute "+minute);
		hour=seconds/3600;
		System.out.println("hour "+hour);
		System.out.println(hour +":"+ minute+ ":"+ second);
		
		
	
		
	}

}
