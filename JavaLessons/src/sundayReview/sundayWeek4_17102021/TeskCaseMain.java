package lessons_EU7.sundayReview.sundayWeek4_17102021;

public class TeskCaseMain {

	public static void main(String[] args) {
		
		TestCase test1= new TestCase() ;
		
		test1.projectName="Canvas";
		test1.sprintNo=3;
		test1.testPriority="High";
		test1.designer= "Test Team_2";
		test1.dateCreation="18.10.2021";
		test1.dateReview="29.10.2021";
		test1.testCaseID="TC_HI_01";
		test1.testSteps="";
		test1.testSteps=test1.addNewTestStep(test1.testSteps, "1.go to URL");
		test1.testSteps=test1.addNewTestStep(test1.testSteps, "2.enter unvalid user name");
		test1.testSteps=test1.addNewTestStep(test1.testSteps, "3.enter password");
		test1.testSteps=test1.addNewTestStep(test1.testSteps, "4.click login button");
		
		System.out.println(test1.toString());
		System.out.println(test1.isPassed(true));
		
		System.out.println("**********************************");
		
		TestCase test2= new TestCase();
		
		test2.projectName="Canvas";
		test2.sprintNo=3;
		test2.testPriority="Medium";
		test2.designer= "Test Team_2";
		test2.dateCreation="18.10.2021";
		test2.dateReview="29.10.2021";
		test2.testCaseID="TC_ME_02";
		test2.testSteps="";
		test2.testSteps=test2.addNewTestStep(test2.testSteps, "1.go to URL");
		test2.testSteps=test2.addNewTestStep(test2.testSteps, "2.enter user name");
		test2.testSteps=test2.addNewTestStep(test2.testSteps, "3.enter unvalid password");
		test2.testSteps=test2.addNewTestStep(test2.testSteps, "4.click enter");
		
		System.out.println(test2.toString());
		System.out.println(test2.isPassed(false));
		
		
		
	}
		
}	
