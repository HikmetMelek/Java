package lessons_EU7.day36_staticClassMembers;

public class StaticInit {

	static final int NUM_SECOND_PER_HOURS;
	
	static {      // static block run firstly, first of all 
		System.out.println("Static init");
		int numSecondPerMinute=60;
		int numMinutePerHour=60;
		NUM_SECOND_PER_HOURS= numMinutePerHour*numSecondPerMinute;
	}
	
	private static int one;
	private static final int two;
	private static final int three=3; // u can not reassign final value
	//private static final int four;
	
	static {
		one=1;
		two=2;
		//three=4;
		//two=4;;
	}
	
	
	
	
	
}
