package sundayReview.sundayWeek4_17102021;

public class AmazonTest2 {

	public static void main(String[] args) {
		
		System.out.println("--Starting Amazon Search Functional Test--");
		AmazonTest.openBrowser();
		AmazonTest.navigateToAmazonPage();
		AmazonTest.searchForAnItem("Selenium");
		AmazonTest.verifyResultsAreDisplayed();
		System.out.println("Amazon Search Functional Test compeleted-PASS-");
		
	}

	
}

