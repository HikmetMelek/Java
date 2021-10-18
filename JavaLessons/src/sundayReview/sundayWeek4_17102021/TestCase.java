package lessons_EU7.sundayReview.sundayWeek4_17102021;

public class TestCase {

	// P.I.Q.: How Do You write a Test Case?
	String projectName;
	int sprintNo;
	String testName;
	String testPriority;
	String designer;// created by testTeam
	String dateCreation;
	String dateReview;
	String testSteps;
	String testCaseID;
	String testStepDescription;
//	String inputs;// test data
//	String expectedResult;
//	String actualResult;
	boolean result; //(fail/pass)
	
	
	public String toString() {
		return     "Project Name:            "+ projectName+"\n"+
			   "Sprint No:               "+ sprintNo+"\n"+
			   "Priority(High/Med/Low):  "+ testPriority+"\n"+
			   "Designed by:             "+ designer+"\n"+
			   "Date of creation:        "+ dateCreation+"\n"+
			   "Date of review:          "+ dateReview+"\n"+
			   "\n"+
			   "Test case ID:            "+ testCaseID+"\n"+
			   "Test steps:              "+ testSteps;

				
	}  
	
	 public String isPassed(boolean result) {
		 if (result) return "Pass";
		 else return "Fail";
	 }
	 
	 public String addNewTestStep(String testStep, String newStep) {
		 return  testStep+ "\n" + newStep;
	 }
	
		
		//  HW : create more attributes and some actions 
		// create a class with main method and create objects of TestCases
	
	
	
	
}
