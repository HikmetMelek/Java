package lessons_EU7.sundayReview.week08_28112021.testEnvoriment;

import java.util.ArrayList;

public class Tests {

	public static void main(String[] args) {
		
		TestEnvironment testOne= new TestEnvironment();
		
		testOne.browser= new Browser("Chrome");// i am calling one parameter constructor to assign browserType
		testOne.os= new OS("Windows");
		System.out.println("My test env. for test one is: "+ testOne.toString());
		
		
		TestEnvironment testTwo= new TestEnvironment();
		
		testTwo.browser= new Browser();
//		testTwo.browser.setBrowserType("Safari");
//		testTwo.os= new OS();
//		testTwo.os.setOs("MacOs");
//		System.out.println("My test env. for test two is: "+ testTwo.toString());
//		
		ArrayList<TestEnvironment> tests= new ArrayList<>();
		tests.add(testOne);
		tests.add(testTwo);
		System.out.println(tests.get(0).toString());
		System.out.println(tests.get(1).browser.getBrowserType());
	}

}
